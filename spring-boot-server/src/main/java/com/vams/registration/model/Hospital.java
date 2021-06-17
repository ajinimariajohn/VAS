package com.vams.registration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {

    @Id
    private int id;
    private String hospitalName;
    private String hospitalPincode;

    public Hospital() {
    }

    public Hospital(int id, String hospitalName, String hospitalPincode) {
        this.id = id;
        this.hospitalName = hospitalName;
        this.hospitalPincode = hospitalPincode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalPincode() {
        return hospitalPincode;
    }

    public void setHospitalPincode(String hospitalPincode) {
        this.hospitalPincode = hospitalPincode;
    }
}
