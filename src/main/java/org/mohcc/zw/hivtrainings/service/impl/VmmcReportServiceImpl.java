package org.mohcc.zw.hivtrainings.service.impl;

import org.mohcc.zw.hivtrainings.model.*;
import org.mohcc.zw.hivtrainings.repository.*;
import org.mohcc.zw.hivtrainings.service.VmmcReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

@Service
public class VmmcReportServiceImpl implements VmmcReportService {
    private final VmmcReportRepository vmmcReportRepository;

    private final BasicInformationRepository basicInformationRepository;

    private final FacilitatorRepository facilitatorRepository;

    private final TrainingMethodRepository trainingMethodRepository;

    private final FacilityRepository facilityRepository;

    private final DistrictRepository districtRepository;

    private final ProvinceRepository provinceRepository;

    private final ProgramAreaRepository programAreaRepository;

    private final ProgramAreaTrainingRepository programAreaTrainingRepository;

    private final TrainingDataRepository trainingDataRepository;

    private final DesignationRepository designationRepository;

    private final TitleRepository titleRepository;

    private final FundingRepository fundingRepository;

    @Autowired
    public VmmcReportServiceImpl(VmmcReportRepository vmmcReportRepository, BasicInformationRepository basicInformationRepository,
                                 FacilitatorRepository facilitatorRepository, TrainingMethodRepository trainingMethodRepository,
                                 FacilityRepository facilityRepository, DistrictRepository districtRepository,
                                 ProvinceRepository provinceRepository, ProgramAreaRepository programAreaRepository,
                                 ProgramAreaTrainingRepository programAreaTrainingRepository, TrainingDataRepository trainingDataRepository,
                                 DesignationRepository designationRepository, TitleRepository titleRepository, FundingRepository fundingRepository) {
        this.vmmcReportRepository = vmmcReportRepository;
        this.basicInformationRepository = basicInformationRepository;
        this.facilitatorRepository = facilitatorRepository;
        this.trainingMethodRepository = trainingMethodRepository;
        this.facilityRepository = facilityRepository;
        this.districtRepository = districtRepository;
        this.provinceRepository = provinceRepository;
        this.programAreaRepository = programAreaRepository;
        this.programAreaTrainingRepository = programAreaTrainingRepository;
        this.trainingDataRepository = trainingDataRepository;
        this.designationRepository = designationRepository;
        this.titleRepository = titleRepository;
        this.fundingRepository = fundingRepository;
    }

    @Override
    public List<VmmcReport> generateVmmcReport() {
        List<VmmcReport> vmmcReportList = new ArrayList<>();

        // Fetch all TrainingData along with facilitator ids
        List<TrainingData> trainingDataWithFacilitators = trainingDataRepository.findAllWithDataAndFacilitators();
        // Fetch all TrainingData along with method ids
        List<TrainingData> trainingDataWithMethods = trainingDataRepository.findAllWithDataAndMethods();

        // Process TrainingData with facilitators

        for (TrainingData trainingData : trainingDataWithFacilitators) {
            VmmcReport vmmcReport = processTrainingData(trainingData);
            // Add vmmcReport to the list
            vmmcReportList.add(vmmcReport);
        }
      /*
        // Process TrainingData with methods
        for (TrainingData trainingData : trainingDataWithMethods) {
            VmmcReport vmmcReport = processTrainingData(trainingData);
            // Add vmmcReport to the list
            vmmcReportList.add(vmmcReport);
        }
        */

        return vmmcReportList;
    }

    @Override
    public Map<String, Map<String, Map<String, Object>>> processVmmcReportData() {
        return processedVmmcReportData(generateVmmcReport());
    }

    // Helper method to process TrainingData and create VmmcReport
    private VmmcReport processTrainingData(TrainingData trainingData) {
        // Create VmmcReport and set common fields
        VmmcReport vmmcReport = new VmmcReport();
        vmmcReport.setTraining_id(trainingData.getTraining_id());
        vmmcReport.setBasic_information_id(trainingData.getBasic_information_id());
        vmmcReport.setNumber_of_days(trainingData.getNumber_of_days());
        vmmcReport.setStart_date(trainingData.getStart_date());
        vmmcReport.setEnd_date(trainingData.getEnd_date());
        vmmcReport.setCertified_date(trainingData.getCertified_date());

        // Fetch BasicInformation using basic_information_id
        BasicInformation basicInformation = basicInformationRepository.findById(trainingData.getBasic_information_id()).orElse(null);
        if (basicInformation != null) {
            // Set basic information fields to vmmcReport
            vmmcReport.setName(basicInformation.getName());
            vmmcReport.setSurname(basicInformation.getSurname());
            vmmcReport.setSex(basicInformation.getSex());
            vmmcReport.setPhone_number(basicInformation.getPhone_number());

            // Fetch and set designation name
            Designation designation = designationRepository.findById(basicInformation.getDesignation_id()).orElse(null);
            if (designation != null) {
                vmmcReport.setDesignation(designation.getDesignation());
            }

            // Fetch and set title name
            Title title = titleRepository.findById(basicInformation.getTitle_id()).orElse(null);
            if (title != null) {
                vmmcReport.setTitle(title.getTitle());
            }

            // Fetch and set facility name
            Facility facility = facilityRepository.findById(basicInformation.getFacility_id()).orElse(null);
            if (facility != null) {
                vmmcReport.setFacilityName(facility.getFacilityName());
            }

            // Fetch and set district name
            District district = districtRepository.findById(basicInformation.getDistrict_id()).orElse(null);
            if (district != null) {
                vmmcReport.setDistrictName(district.getDistrictName());
            }

            // Fetch and set province name
            Province province = provinceRepository.findById(basicInformation.getProvince_id()).orElse(null);
            if (province != null) {
                vmmcReport.setProvinceName(province.getProvinceName());
            }
        }

        // Fetch and set facilitator names
        List<String> facilitatorNames = trainingData.getFacilitator_id().stream()
                .map(basicInfoId -> {
                    // Retrieve BasicInformation object using basic_information_id
                    BasicInformation facilitatorBasicInformation = basicInformationRepository.findById(basicInfoId).orElse(null);
                    if (facilitatorBasicInformation != null) {
                        // Return facilitator name
                        return facilitatorBasicInformation.getName();
                    }
                    return null;
                })
                .collect(Collectors.toList());
        vmmcReport.setFacilitator_name(facilitatorNames);

        // Fetch and set additional information from related entities
        ProgramArea programArea = programAreaRepository.findById(trainingData.getProgram_id()).orElse(null);
        if (programArea != null) {
            vmmcReport.setProgramName(programArea.getProgramName());
        }

        Funding funding = fundingRepository.findById(trainingData.getFunder_id()).orElse(null);
        if (funding != null) {
            vmmcReport.setFunderName(funding.getFunderName());
        }

        ProgramAreaTraining programAreaTraining = programAreaTrainingRepository.findById(trainingData.getProgram_area_training_id()).orElse(null);
        if (programAreaTraining != null) {
            vmmcReport.setProgramAreaTrainingName(programAreaTraining.getProgramAreaTrainingName());
        }

        List<String> methodNames = trainingData.getMethod_id().stream()
                .map(methodId -> trainingMethodRepository.findById(methodId).map(TrainingMethod::getMethodName).orElse(null))
                .collect(Collectors.toList());
        vmmcReport.setMethod_name(methodNames);
        return vmmcReport;
    }

    private Map<String, Map<String, Map<String, Object>>> processedVmmcReportData(List<VmmcReport> reports) {
        Map<String, Map<String, Map<String, Object>>> processedData = new HashMap<>();

        for (VmmcReport report : reports) {
            String basicInformationId = report.getBasic_information_id();
            String programAreaTrainingName = report.getProgramAreaTrainingName();

            // Get or create the map for the current basicInformationId
            Map<String, Map<String, Object>> basicInformationData = processedData.computeIfAbsent(basicInformationId, k -> new HashMap<>());

            // Get or create the map for static fields under basicInformationId
            Map<String, Object> basicInformation = basicInformationData.computeIfAbsent("Basic Information", k -> new HashMap<>());
            basicInformation.put("basic_information_id", report.getBasic_information_id());
            basicInformation.put("name", report.getName());
            basicInformation.put("surname", report.getSurname());
            basicInformation.put("sex", report.getSex());
            basicInformation.put("phone_number", report.getPhone_number());
            basicInformation.put("designation", report.getDesignation());
            basicInformation.put("title", report.getTitle());
            basicInformation.put("facility", report.getFacilityName());
            basicInformation.put("district", report.getDistrictName());
            basicInformation.put("province", report.getProvinceName());

            // Get or create the map for "Training Type" under static fields
            Map<String, Map<String, Object>> trainingTypeData = (Map<String, Map<String, Object>>) basicInformation.computeIfAbsent("Training Type", k -> new HashMap<>());

            // Add the dynamic fields to the programAreaData under "Training Type"
            Map<String, Object> programAreaData = trainingTypeData.computeIfAbsent(programAreaTrainingName, k -> new HashMap<>());
            programAreaData.put("number_of_days", report.getNumber_of_days());
            programAreaData.put("start_date", report.getStart_date());
            programAreaData.put("end_date", report.getEnd_date());
            programAreaData.put("certified_date", report.getCertified_date());
            programAreaData.put("funderName", report.getFunderName());
            programAreaData.put("facilitator_name", report.getFacilitator_name());
            programAreaData.put("method_name", report.getMethod_name());
        }

        return processedData;
    }



}
