package org.mohcc.zw.hivtrainings.service.impl;

import java.util.List;

import org.mohcc.zw.hivtrainings.model.Facilitator;
import org.mohcc.zw.hivtrainings.repository.FacilitatorRepository;
import org.mohcc.zw.hivtrainings.service.FacilitatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacilitatorServiceImpl implements FacilitatorService{

	private final FacilitatorRepository facilitatorRepository;

	@Autowired
	public FacilitatorServiceImpl(FacilitatorRepository facilitatorRepository) {
		super();
		this.facilitatorRepository = facilitatorRepository;
	}

	@Override
	public Facilitator saveFacilitator(Facilitator facilitator) {
		return facilitatorRepository.saveAndFlush(facilitator);
	}

	@Override
	public Facilitator getFacilitatorById(String id) {
		return facilitatorRepository.findById(id).orElse(null);
	}

	@Override
	public List<Facilitator> getAllFacilitator() {
		return facilitatorRepository.findAll();
	}

	@Override
	public List<Facilitator> getFacilitatorByProgramAreaId(String program_area_id) {
		return facilitatorRepository.getAllByProgram_area_id(program_area_id);
	}

	@Override
	public boolean existsById(String id) {
		return facilitatorRepository.existsById(id);
	}

}
