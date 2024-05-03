package org.mohcc.zw.hivtrainings.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Training {
    @Id
    private String training_id;

    @Column(name = "basic_information_id", nullable = false, unique = true)
    private String basic_information_id;

    private String basic;
    private String fg_conversion;
    private String ds_conversion;
    private String certification;
    private String emergency;
    private String shangring;
    private String tot;
    private String refresher;
}
