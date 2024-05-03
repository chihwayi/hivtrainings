package org.mohcc.zw.hivtrainings.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Province {
    @Id
    private String provinceId;
    private String provinceName;
}
