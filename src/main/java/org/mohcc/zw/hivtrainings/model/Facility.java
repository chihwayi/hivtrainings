package org.mohcc.zw.hivtrainings.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Facility {
    @Id
    private String facilityId;
    private String districtId;
    private String facilityName;
    private String provinceId;
    private String dhisCode;
    private Double longitude;
    private Double latitude;

}
