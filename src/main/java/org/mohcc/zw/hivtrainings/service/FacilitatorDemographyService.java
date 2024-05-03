package org.mohcc.zw.hivtrainings.service;

import org.mohcc.zw.hivtrainings.model.FacilitatorDemography;

import java.util.List;

public interface FacilitatorDemographyService {

    List<FacilitatorDemography> getAllFacilitatorDemographyDataByProgramId(String program_area_id);
}
