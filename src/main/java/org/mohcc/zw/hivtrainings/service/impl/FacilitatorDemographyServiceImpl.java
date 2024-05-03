package org.mohcc.zw.hivtrainings.service.impl;

import org.mohcc.zw.hivtrainings.model.FacilitatorDemography;
import org.mohcc.zw.hivtrainings.repository.FacilitatorDemographyRepository;
import org.mohcc.zw.hivtrainings.service.FacilitatorDemographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilitatorDemographyServiceImpl implements FacilitatorDemographyService {

    private final FacilitatorDemographyRepository facilitatorDemographyRepository;

    @Autowired
    public FacilitatorDemographyServiceImpl(FacilitatorDemographyRepository facilitatorDemographyRepository) {
        this.facilitatorDemographyRepository = facilitatorDemographyRepository;
    }

    @Override
    public List<FacilitatorDemography> getAllFacilitatorDemographyDataByProgramId(String program_area_id) {
        return facilitatorDemographyRepository.getAllFacilitatorDemographyDataByProgramId(program_area_id);
    }
}
