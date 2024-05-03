package org.mohcc.zw.hivtrainings.repository;

import org.mohcc.zw.hivtrainings.model.FacilityDistrictProvince;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacilityDistrictProvinceRepository extends JpaRepository<FacilityDistrictProvince, String> {

    @Query("SELECT new FacilityDistrictProvince(a.facilityId, a.districtId, a.provinceId, a.facilityName, b.districtName, c.provinceName) " +
            "FROM Facility a " +
            "JOIN District b ON a.districtId = b.districtId AND a.provinceId = b.provinceId " +
            "JOIN Province c ON b.provinceId = c.provinceId")
    List<FacilityDistrictProvince> getFacilityDistrictProvinceData();
}
