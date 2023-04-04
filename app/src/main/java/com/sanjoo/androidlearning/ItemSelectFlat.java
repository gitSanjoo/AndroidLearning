package com.sanjoo.androidlearning;

public class ItemSelectFlat {
    int flatNo;
    String ownerName;

    public ItemSelectFlat(int flatNo, String ownerName) {
        this.flatNo = flatNo;
        this.ownerName = ownerName;
    }

    public int getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
