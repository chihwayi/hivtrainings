package org.mohcc.zw.hivtrainings.repository;
import org.mohcc.zw.hivtrainings.model.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisteredRepository extends JpaRepository<Registered, String> {
    @Query("SELECT new Registered(a.basic_information_id, a.name, a.surname, a.sex, a.phone_number, b.designation, c.facilityName, d.districtName, e.provinceName) " +
            "FROM BasicInformation a JOIN Facility c ON a.facility_id = c.facilityId " +
            "JOIN Designation b ON a.title_id = b.title_id AND a.designation_id = b.designation_id " +
            "JOIN District d ON a.district_id = d.districtId " +
            "JOIN Province e ON a.province_id = e.provinceId")
    List<Registered> getRegisteredData();
}
