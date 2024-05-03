package org.mohcc.zw.hivtrainings.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class District {
    @Id
    private String districtId;
    private String districtName;
    private String provinceId;
}
