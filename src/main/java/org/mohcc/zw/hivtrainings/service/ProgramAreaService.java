package org.mohcc.zw.hivtrainings.service;

import java.util.List;

import org.mohcc.zw.hivtrainings.model.ProgramArea;

public interface ProgramAreaService {
	ProgramArea saveProgramArea(ProgramArea programArea);
	ProgramArea getProgramAreaById(String id);
	List<ProgramArea> getAllProgramArea();

}
