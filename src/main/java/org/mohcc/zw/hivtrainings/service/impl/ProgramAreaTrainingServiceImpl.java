package org.mohcc.zw.hivtrainings.service.impl;

import org.mohcc.zw.hivtrainings.model.ProgramAreaTraining;
import org.mohcc.zw.hivtrainings.repository.ProgramAreaTrainingRepository;
import org.mohcc.zw.hivtrainings.service.ProgramAreaTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramAreaTrainingServiceImpl implements ProgramAreaTrainingService {

    private final ProgramAreaTrainingRepository programAreaTrainingRepository;

    @Autowired
    public ProgramAreaTrainingServiceImpl(ProgramAreaTrainingRepository programAreaTrainingRepository) {
        this.programAreaTrainingRepository = programAreaTrainingRepository;
    }

    @Override
    public List<ProgramAreaTraining> getAllProgramAreaTraining() {
        return programAreaTrainingRepository.findAll();
    }

    @Override
    public List<ProgramAreaTraining> getProgramAreaTrainingByProgramId(String programId) {
        return programAreaTrainingRepository.findByProgramId(programId);
    }
}
