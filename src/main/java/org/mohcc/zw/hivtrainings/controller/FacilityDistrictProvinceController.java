package org.mohcc.zw.hivtrainings.controller;

import org.mohcc.zw.hivtrainings.model.FacilityDistrictProvince;
import org.mohcc.zw.hivtrainings.service.FacilityDistrictProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/facility-district-province")
public class FacilityDistrictProvinceController {

    private FacilityDistrictProvinceService facilityDistrictProvinceService;

    @Autowired
    public void setFacilityDistrictProvinceService(FacilityDistrictProvinceService facilityDistrictProvinceService) {
        this.facilityDistrictProvinceService = facilityDistrictProvinceService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<FacilityDistrictProvince>> getFacilityDistrictProvince() {
        List<FacilityDistrictProvince> facilityDistrictProvinceList = facilityDistrictProvinceService.getFacilityDistrictProvinceData();
        return ResponseEntity.ok(facilityDistrictProvinceList);
    }

    @GetMapping("/get-facility{id}")
    public ResponseEntity<FacilityDistrictProvince> getFacilityDistrictProvinceById(@PathVariable String id){
        FacilityDistrictProvince facilityDistrictProvinces = facilityDistrictProvinceService.getFacilityDistrictProvinceById(id);
        return ResponseEntity.ok(facilityDistrictProvinces);
    }
}
