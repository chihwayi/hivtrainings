package org.mohcc.zw.hivtrainings.service.impl;

import org.mohcc.zw.hivtrainings.model.Training;
import org.mohcc.zw.hivtrainings.repository.TrainingRepository;
import org.mohcc.zw.hivtrainings.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {

    private final TrainingRepository trainingRepository;

    @Autowired
    public TrainingServiceImpl(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @Override
    public Training saveTraining(Training training) {
        // Add any business logic before saving
        return trainingRepository.save(training);
    }

    @Override
    public Training getTrainingById(String id) {
        return trainingRepository.findById(id).orElse(null);
    }

    /*
    @Override
    public Training getTrainingByBasicInformationId(String id){
        return trainingRepository.findTrainingByBasic_information_id(id);
    }
    */

    @Override
    public List<Training> getAllTrainings() {
        return trainingRepository.findAll();
    }

    // Additional methods for business logic can be added here

}
