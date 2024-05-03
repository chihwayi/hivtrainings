package org.mohcc.zw.hivtrainings.service.impl;

import org.mohcc.zw.hivtrainings.model.TrainingData;
import org.mohcc.zw.hivtrainings.repository.TrainingDataRepository;
import org.mohcc.zw.hivtrainings.service.TrainingDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingDataServiceImpl implements TrainingDataService {

    private final TrainingDataRepository trainingDataRepository;

    @Autowired
    public TrainingDataServiceImpl(TrainingDataRepository trainingDataRepository) {
        this.trainingDataRepository = trainingDataRepository;
    }

    @Override
    public TrainingData saveTrainingData(TrainingData trainingData) {
        return trainingDataRepository.save(trainingData);
    }

    @Override
    public List<TrainingData> getAllTrainingData() {
        return trainingDataRepository.findAll();
    }
}
