package org.mohcc.zw.hivtrainings.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Registered {
    @Id
    private String basic_information_id;
    private String name;
    private String surname;
    private String sex;
    private String phone_number;
    private String designation;
    private String facilityName;
    private String districtName;
    private String provinceName;

    public Registered() {
    }

    public Registered(String basic_information_id, String name, String surname, String sex, String phone_number, String designation, String facilityName, String districtName, String provinceName) {
        this.basic_information_id = basic_information_id;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.phone_number = phone_number;
        this.designation = designation;
        this.facilityName = facilityName;
        this.districtName = districtName;
        this.provinceName = provinceName;
    }
}
