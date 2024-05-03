package org.mohcc.zw.hivtrainings.controller;

import org.mohcc.zw.hivtrainings.model.ProgramAreaTraining;
import org.mohcc.zw.hivtrainings.service.ProgramAreaTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/program-area-training")
public class ProgramAreaTrainingController {

    private final ProgramAreaTrainingService programAreaTrainingService;

    @Autowired
    public ProgramAreaTrainingController(ProgramAreaTrainingService programAreaTrainingService) {
        this.programAreaTrainingService = programAreaTrainingService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<ProgramAreaTraining>> getAllProgramAreaTraining() {
        List<ProgramAreaTraining> programAreaTrainingList = programAreaTrainingService.getAllProgramAreaTraining();
        return ResponseEntity.ok(programAreaTrainingList);
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<List<ProgramAreaTraining>> getProgramAreaTrainingByProgramId(@PathVariable String id){
        List<ProgramAreaTraining> programAreaTraining = programAreaTrainingService.getProgramAreaTrainingByProgramId(id);
        return  ResponseEntity.ok(programAreaTraining);
    }
}
