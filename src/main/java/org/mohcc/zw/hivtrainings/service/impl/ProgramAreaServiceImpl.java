package org.mohcc.zw.hivtrainings.service.impl;

import java.util.List;

import org.mohcc.zw.hivtrainings.model.ProgramArea;
import org.mohcc.zw.hivtrainings.repository.ProgramAreaRepository;
import org.mohcc.zw.hivtrainings.service.ProgramAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramAreaServiceImpl implements ProgramAreaService{

	private ProgramAreaRepository programAreaRepository;

	@Autowired
	public ProgramAreaServiceImpl(ProgramAreaRepository programAreaRepository) {
		this.programAreaRepository = programAreaRepository;
	}

	@Override
	public ProgramArea saveProgramArea(ProgramArea programArea) {
		return programAreaRepository.save(programArea);
	}

	@Override
	public ProgramArea getProgramAreaById(String id) {
		return programAreaRepository.findById(id).orElse(null);
	}

	@Override
	public List<ProgramArea> getAllProgramArea() {
		return programAreaRepository.findAll();
	}

}
