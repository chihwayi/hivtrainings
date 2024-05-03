package org.mohcc.zw.hivtrainings.service.impl;
import org.mohcc.zw.hivtrainings.model.TrainingMethod;
import org.mohcc.zw.hivtrainings.repository.TrainingMethodRepository;
import org.mohcc.zw.hivtrainings.service.TrainingMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingMethodServiceImpl implements TrainingMethodService {

    private final TrainingMethodRepository trainingMethodRepository;

    @Autowired
    public TrainingMethodServiceImpl(TrainingMethodRepository trainingMethodRepository) {
        this.trainingMethodRepository = trainingMethodRepository;
    }

    @Override
    public List<TrainingMethod> getAllTrainingMethod() {
        return trainingMethodRepository.findAll();
    }
}
