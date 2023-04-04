package com.sanjoo.androidlearning;

public class Flat {

    String landlordName;
    int flatNo;
    int towerNo;
    int noOfVehicle;

    public Flat(String landlordName, int flatNo, int towerNo, int noOfVehicle) {
        this.landlordName = landlordName;
        this.flatNo = flatNo;
        this.towerNo = towerNo;
        this.noOfVehicle = noOfVehicle;
    }

    public String getLandlordName() {
        return landlordName;
    }

    public void setLandlordName(String landlordName) {
        this.landlordName = landlordName;
    }

    public int getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public int getTowerNo() {
        return towerNo;
    }

    public void setTowerNo(int towerNo) {
        this.towerNo = towerNo;
    }

    public int getNoOfVehicle() {
        return noOfVehicle;
    }

    public void setNoOfVehicle(int noOfVehicle) {
        noOfVehicle = noOfVehicle;
    }
}
