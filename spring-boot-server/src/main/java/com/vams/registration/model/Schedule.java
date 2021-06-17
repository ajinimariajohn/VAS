package com.vams.registration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Schedule {
    @Id
    private int id;
    private String scheduledDateTime;
    private int userId;
    private int hospitalId;
    private int vaccineId;
    private int clinicianId;
    private int status;
    private int dose;

    public Schedule() {
    }

    public Schedule(int id, String scheduledDateTime, int userId, int hospitalId, int vaccineId, int clinicianId, int status, int dose) {
        this.id = id;
        this.scheduledDateTime = scheduledDateTime;
        this.userId = userId;
        this.hospitalId = hospitalId;
        this.vaccineId = vaccineId;
        this.clinicianId = clinicianId;
        this.status = status;
        this.dose = dose;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScheduledDateTime() {
        return scheduledDateTime;
    }

    public void setScheduledDateTime(String scheduledDateTime) {
        this.scheduledDateTime = scheduledDateTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(int vaccineId) {
        this.vaccineId = vaccineId;
    }

    public int getClinicianId() {
        return clinicianId;
    }

    public void setClinicianId(int clinicianId) {
        this.clinicianId = clinicianId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }
}
