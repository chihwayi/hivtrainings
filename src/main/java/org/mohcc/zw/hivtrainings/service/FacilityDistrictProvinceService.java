package org.mohcc.zw.hivtrainings.service;

import org.mohcc.zw.hivtrainings.model.FacilityDistrictProvince;

import java.util.List;

public interface FacilityDistrictProvinceService {
    List<FacilityDistrictProvince> getFacilityDistrictProvinceData();
    FacilityDistrictProvince getFacilityDistrictProvinceById(String id);
}
