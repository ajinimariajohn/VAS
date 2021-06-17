package com.vams.registration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clinician {
    @Id
    private int id;
    private String clinicianName;
    private String clinicianEmailId;
    private String clinicianCode;
    private String password;

    public Clinician() {
    }

    public Clinician(int id, String clinicianName, String clinicianEmailId, String clinicianCode, String password) {
        this.id = id;
        this.clinicianName = clinicianName;
        this.clinicianEmailId = clinicianEmailId;
        this.clinicianCode = clinicianCode;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClinicianName() {
        return clinicianName;
    }

    public void setClinicianName(String clinicianName) {
        this.clinicianName = clinicianName;
    }

    public String getClinicianEmailId() {
        return clinicianEmailId;
    }

    public void setClinicianEmailId(String clinicianEmailId) {
        this.clinicianEmailId = clinicianEmailId;
    }

    public String getClinicianCode() {
        return clinicianCode;
    }

    public void setClinicianCode(String clinicianCode) {
        this.clinicianCode = clinicianCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
