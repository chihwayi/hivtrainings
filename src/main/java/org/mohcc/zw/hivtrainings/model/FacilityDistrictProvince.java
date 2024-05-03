package org.mohcc.zw.hivtrainings.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class FacilityDistrictProvince {
    @Id
    private String facility_id;
    private String district_id;
    private String province_id;
    private String facilityName;
    private String districtName;
    private String provinceName;

    public FacilityDistrictProvince() {

    }

	public FacilityDistrictProvince(String facility_id, String district_id, String province_id, String facilityName,
			String districtName, String provinceName) {
		super();
		this.facility_id = facility_id;
		this.district_id = district_id;
		this.province_id = province_id;
		this.facilityName = facilityName;
		this.districtName = districtName;
		this.provinceName = provinceName;
	}
}
