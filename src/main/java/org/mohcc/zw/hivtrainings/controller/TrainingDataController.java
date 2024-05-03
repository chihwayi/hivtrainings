package org.mohcc.zw.hivtrainings.controller;

import org.mohcc.zw.hivtrainings.model.TrainingData;
import org.mohcc.zw.hivtrainings.service.TrainingDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-data")
public class TrainingDataController {

    private final TrainingDataService trainingDataService;

    @Autowired
    public TrainingDataController(TrainingDataService trainingDataService) {
        this.trainingDataService = trainingDataService;
    }

    @PostMapping("/save")
    public ResponseEntity<TrainingData> saveTrainingData(@RequestBody TrainingData trainingData) {
        TrainingData savedTrainingData = trainingDataService.saveTrainingData(trainingData);
        return ResponseEntity.ok(savedTrainingData);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<TrainingData>> getAllTrainingData() {
        List<TrainingData> trainingDataList = trainingDataService.getAllTrainingData();
        return ResponseEntity.ok(trainingDataList);
    }
}
