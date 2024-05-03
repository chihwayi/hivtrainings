package org.mohcc.zw.hivtrainings.service;

import org.mohcc.zw.hivtrainings.model.ProgramAreaTraining;

import java.util.List;

public interface ProgramAreaTrainingService {

    List<ProgramAreaTraining> getAllProgramAreaTraining();
    List<ProgramAreaTraining> getProgramAreaTrainingByProgramId(String id);
}
