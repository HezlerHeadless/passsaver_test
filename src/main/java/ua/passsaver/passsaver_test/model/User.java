package ua.passsaver.passsaver_test.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "login")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "date_registr")
    private Date dateRegistr;

    @Column(name = "date_update")
    private Date dateUpdate;

    @Column(name = "payed_till")
    private Date payedTill;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateRegistr() {
        return dateRegistr;
    }

    public void setDateRegistr(Date dateRegistr) {
        this.dateRegistr = dateRegistr;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Date getPayedTill() {
        return payedTill;
    }

    public void setPayedTill(Date payedTill) {
        this.payedTill = payedTill;
    }

    public User(String name, String lastName, String username, String password, Date dateRegistr, Date dateUpdate,
            Date payedTill) {
        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.dateRegistr = dateRegistr;
        this.dateUpdate = dateUpdate;
        this.payedTill = payedTill;
    }

}
