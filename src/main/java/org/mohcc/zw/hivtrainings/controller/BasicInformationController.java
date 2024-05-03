package org.mohcc.zw.hivtrainings.controller;

import org.mohcc.zw.hivtrainings.model.BasicInformation;
import org.mohcc.zw.hivtrainings.model.Facilitator;
import org.mohcc.zw.hivtrainings.service.BasicInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/basic-information")
public class BasicInformationController {

    private final BasicInformationService basicInformationService;

    @Autowired
    public BasicInformationController(BasicInformationService basicInformationService) {
        this.basicInformationService = basicInformationService;
    }

    @PostMapping("/save")
    public ResponseEntity<BasicInformation> saveBasicInformation(@RequestBody BasicInformation basicInformation) {
        BasicInformation savedBasicInfo = basicInformationService.saveBasicInformation(basicInformation);
        return ResponseEntity.ok(savedBasicInfo);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<BasicInformation> getBasicInformationById(@PathVariable String id) {
        BasicInformation basicInfo = basicInformationService.getBasicInformationById(id);
        return ResponseEntity.ok(basicInfo);
    }

    @GetMapping("/get-facilitator/{facilitators}")
    public ResponseEntity<List<BasicInformation>> getFacilitatorDetails(@RequestBody List<Facilitator> facilitators) {
        List<BasicInformation> basicInfo = basicInformationService.getFacilitatorDetails(facilitators);
        return ResponseEntity.ok(basicInfo);
    }

    @GetMapping("/get-serialized-facilitator/{facilitators}")
    public ResponseEntity<List<BasicInformation>> getSerializedFacilitatorDetails(@PathVariable String facilitators) {
        List<BasicInformation> basicInfo = basicInformationService.getDeserializedFacilitatorDetails(facilitators);
        return ResponseEntity.ok(basicInfo);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<BasicInformation>> getAllBasicInformation() {
        List<BasicInformation> basicInfoList = basicInformationService.getAllBasicInformation();
        return ResponseEntity.ok(basicInfoList);
    }

    @GetMapping("/get-all-data")
    public ResponseEntity<List<BasicInformation>> getAllData() {
        List<BasicInformation> allData = basicInformationService.getAllBasicInformation();
        return ResponseEntity.ok(allData);
    }
    
    @GetMapping("/check/{id}")
    public boolean checkBasicInformationIdExists(@PathVariable String id) {
        return basicInformationService.existsById(id);
    }

}
