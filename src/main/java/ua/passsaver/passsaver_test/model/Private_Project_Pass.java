package ua.passsaver.passsaver_test.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "private_project_pass")
public class Private_Project_Pass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @NotEmpty
    @Column(name = "owner_id")
    private int owner;

    @NotEmpty
    @Column(name = "service_id")
    private int service_id;

    @NotEmpty
    @Column(name = "date_create")
    private Date createDate;

    @NotEmpty
    @Column(name = "date_update")
    private Date updateDate;

}
