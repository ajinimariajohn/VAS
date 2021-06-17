package com.vams.registration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vaccine {
    @Id
    private int id;
    private String vaccineName;
    private String dosesAvailable;

    public Vaccine() {
    }

    public Vaccine(int id, String vaccineName, String dosesAvailable) {
        this.id = id;
        this.vaccineName = vaccineName;
        this.dosesAvailable = dosesAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getDosesAvailable() {
        return dosesAvailable;
    }

    public void setDosesAvailable(String dosesAvailable) {
        this.dosesAvailable = dosesAvailable;
    }
}
