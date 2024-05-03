package org.mohcc.zw.hivtrainings.service;

import java.util.List;

import org.mohcc.zw.hivtrainings.model.Facilitator;

public interface FacilitatorService {
	
	Facilitator saveFacilitator(Facilitator facilitator);
	Facilitator getFacilitatorById(String id);
	List<Facilitator> getAllFacilitator();
	List<Facilitator> getFacilitatorByProgramAreaId(String program_area_id);
	boolean existsById(String id);

}
