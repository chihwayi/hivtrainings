package org.mohcc.zw.hivtrainings.controller;

import org.mohcc.zw.hivtrainings.model.Training;
import org.mohcc.zw.hivtrainings.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training")
public class TrainingController {

    private final TrainingService trainingService;

    @Autowired
    public TrainingController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    @PostMapping("/save")
    public ResponseEntity<Training> saveTraining(@RequestBody Training training) {
        Training savedTraining = trainingService.saveTraining(training);
        return ResponseEntity.ok(savedTraining);
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<Training> getTrainingById(@PathVariable String id) {
        Training training = trainingService.getTrainingById(id);
        return ResponseEntity.ok(training);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Training>> getAllTrainings() {
        List<Training> trainingList = trainingService.getAllTrainings();
        return ResponseEntity.ok(trainingList);
    }

    @GetMapping("/by-basic-information-id/{basicInformationId}")
    public ResponseEntity<Training> getTrainingByBasicInformationId(@PathVariable String basicInformationId) {
        //Training training =  trainingService.getTrainingByBasicInformationId(basicInformationId);
        return null;
    }


}
