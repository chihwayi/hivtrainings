package org.mohcc.zw.hivtrainings.controller;

import org.mohcc.zw.hivtrainings.model.FacilitatorDemography;
import org.mohcc.zw.hivtrainings.service.FacilitatorDemographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facilitator-demography")
public class FacilitatorDemographyController {

    private final FacilitatorDemographyService facilitatorDemographyService;

    @Autowired
    public FacilitatorDemographyController(FacilitatorDemographyService facilitatorDemographyService) {
        this.facilitatorDemographyService = facilitatorDemographyService;
    }

    @GetMapping("/get/{program_id}")
    ResponseEntity<List<FacilitatorDemography>> getFacilitatorDemographyDataByProgramId(@PathVariable String program_id){
        List<FacilitatorDemography> facilitatorDemographyList = facilitatorDemographyService.getAllFacilitatorDemographyDataByProgramId(program_id);
        return ResponseEntity.ok(facilitatorDemographyList);
    }
}
