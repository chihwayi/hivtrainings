package org.mohcc.zw.hivtrainings.service.impl;

import org.mohcc.zw.hivtrainings.model.FacilityDistrictProvince;
import org.mohcc.zw.hivtrainings.repository.FacilityDistrictProvinceRepository;
import org.mohcc.zw.hivtrainings.service.FacilityDistrictProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityDistrictProvinceServiceImpl implements FacilityDistrictProvinceService {

    private final FacilityDistrictProvinceRepository facilityDistrictProvinceRepository;

    @Autowired
    public FacilityDistrictProvinceServiceImpl(FacilityDistrictProvinceRepository facilityDistrictProvinceRepository) {
        this.facilityDistrictProvinceRepository = facilityDistrictProvinceRepository;
    }

    @Override
    public List<FacilityDistrictProvince> getFacilityDistrictProvinceData() {
        return facilityDistrictProvinceRepository.getFacilityDistrictProvinceData();
    }

    @Override
    public FacilityDistrictProvince getFacilityDistrictProvinceById(String id) {
        return facilityDistrictProvinceRepository.findById(id).orElse(null);
    }

}
