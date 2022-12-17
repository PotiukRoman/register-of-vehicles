package com.example.registerofvehicles.domain;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Column(name = "PERSON")
    private String PERSON;

    @Column(name = "REG_ADDR_KOATUU")
    private String REG_ADDR_KOATUU;

    @Column(name = "OPER_CODE")
    private int OPER_CODE;

    @Column(name = "OPER_NAME")
    private String OPER_NAME;

    @Column(name = "D_REG")
    private String D_REG;

    @Column(name = "DEP_CODE")
    private int DEP_CODE;

    @Column(name = "DEP")
    private String  DEP;

    @Column(name = "BRAND")
    private String BRAND;

    @Column(name = "MODEL")
    private String MODEL;

    @Column(name = "VIN")
    private String VIN;

    @Column(name = "MAKE_YEAR")
    private int MAKE_YEAR;

    @Column(name = "COLOR")
    private String COLOR;

    @Column(name = "KIND")
    private String KIND;

    @Column(name = "BODY")
    private String BODY;

    @Column(name = "PURPOSE")
    private String PURPOSE;

    @Column(name = "FUEL")
    private String FUEL;

    @Column(name = "CAPACITY")
    private int CAPACITY;

    @Column(name = "OWN_WEIGHT")
    private int OWN_WEIGHT;

    @Column(name = "TOTAL_WEIGHT")
    private int TOTAL_WEIGHT;

    @Id
    @Column(name = "N_REG_NEW")
    private String N_REG_NEW;

    public Vehicle() {}

    public String getPERSON() {
        return PERSON;
    }

    public void setPERSON(String PERSON) {
        this.PERSON = PERSON;
    }

    public String getREG_ADDR_KOATUU() {
        return REG_ADDR_KOATUU;
    }

    public void setREG_ADDR_KOATUU(String REG_ADDR_KOATUU) {
        this.REG_ADDR_KOATUU = REG_ADDR_KOATUU;
    }

    public int getOPER_CODE() {
        return OPER_CODE;
    }

    public void setOPER_CODE(int OPER_CODE) {
        this.OPER_CODE = OPER_CODE;
    }

    public String getOPER_NAME() {
        return OPER_NAME;
    }

    public void setOPER_NAME(String OPER_NAME) {
        this.OPER_NAME = OPER_NAME;
    }

    public String getD_REG() {
        return D_REG;
    }

    public void setD_REG(String d_REG) {
        D_REG = d_REG;
    }

    public int getDEP_CODE() {
        return DEP_CODE;
    }

    public void setDEP_CODE(int DEP_CODE) {
        this.DEP_CODE = DEP_CODE;
    }

    public String getDEP() {
        return DEP;
    }

    public void setDEP(String DEP) {
        this.DEP = DEP;
    }

    public String getBRAND() {
        return BRAND;
    }

    public void setBRAND(String BRAND) {
        this.BRAND = BRAND;
    }

    public String getMODEL() {
        return MODEL;
    }

    public void setMODEL(String MODEL) {
        this.MODEL = MODEL;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public int getMAKE_YEAR() {
        return MAKE_YEAR;
    }

    public void setMAKE_YEAR(int MAKE_YEAR) {
        this.MAKE_YEAR = MAKE_YEAR;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }

    public String getKIND() {
        return KIND;
    }

    public void setKIND(String KIND) {
        this.KIND = KIND;
    }

    public String getBODY() {
        return BODY;
    }

    public void setBODY(String BODY) {
        this.BODY = BODY;
    }

    public String getPURPOSE() {
        return PURPOSE;
    }

    public void setPURPOSE(String PURPOSE) {
        this.PURPOSE = PURPOSE;
    }

    public String getFUEL() {
        return FUEL;
    }

    public void setFUEL(String FUEL) {
        this.FUEL = FUEL;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public void setCAPACITY(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    public int getOWN_WEIGHT() {
        return OWN_WEIGHT;
    }

    public void setOWN_WEIGHT(int OWN_WEIGHT) {
        this.OWN_WEIGHT = OWN_WEIGHT;
    }

    public int getTOTAL_WEIGHT() {
        return TOTAL_WEIGHT;
    }

    public void setTOTAL_WEIGHT(int TOTAL_WEIGHT) {
        this.TOTAL_WEIGHT = TOTAL_WEIGHT;
    }

    public String getN_REG_NEW() {
        return N_REG_NEW;
    }

    public void setN_REG_NEW(String n_REG_NEW) {
        N_REG_NEW = n_REG_NEW;
    }
}

