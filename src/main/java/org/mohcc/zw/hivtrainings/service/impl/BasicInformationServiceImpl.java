package org.mohcc.zw.hivtrainings.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.mohcc.zw.hivtrainings.model.BasicInformation;
import org.mohcc.zw.hivtrainings.model.Facilitator;
import org.mohcc.zw.hivtrainings.repository.BasicInformationRepository;
import org.mohcc.zw.hivtrainings.service.BasicInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicInformationServiceImpl implements BasicInformationService {

    private final BasicInformationRepository basicInformationRepository;

    @Autowired
    public BasicInformationServiceImpl(BasicInformationRepository basicInformationRepository) {
        this.basicInformationRepository = basicInformationRepository;
    }

    @Override
    public BasicInformation saveBasicInformation(BasicInformation basicInformation) {
        return basicInformationRepository.save(basicInformation);
    }

    @Override
    public BasicInformation getBasicInformationById(String id) {
        return basicInformationRepository.findById(id).orElse(null);
    }

    @Override
    public List<BasicInformation> getAllBasicInformation() {
        return basicInformationRepository.findAll();
    }

    @Override
    public boolean existsById(String basicInformationId) {
        return basicInformationRepository.existsById(basicInformationId);
    }

    @Override
    public List<BasicInformation> getFacilitatorDetails(List<Facilitator> facilitators) {
        List<BasicInformation> basicInformationList = new ArrayList<>();

        for(Facilitator facilitator : facilitators){
            BasicInformation basicInformation = getBasicInformationById(facilitator.getBasic_information_id());
            basicInformationList.add(basicInformation);
        }
        return basicInformationList;
    }

    @Override
    public List<BasicInformation> getDeserializedFacilitatorDetails(String serializedFacilitator) {
        List<BasicInformation> basicInformationList = new ArrayList<>();
        List<Facilitator> facilitatorListObject = new ArrayList<>();
        try {
            facilitatorListObject = (List<Facilitator>) new ObjectMapper().readValue(serializedFacilitator, Facilitator.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        for(Facilitator facilitator : facilitatorListObject){
            BasicInformation basicInformation = getBasicInformationById(facilitator.getBasic_information_id());
            basicInformationList.add(basicInformation);
        }

        return basicInformationList;
    }


}
