package org.mohcc.zw.hivtrainings.model;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class RemarksComments {
    @Id
    private String remarks_comments_id;

    @Column(name = "basic_information_id", nullable = false, unique = true)
    private String basic_information_id;

    private String remarks;
    private String comments;

}
