package com.designpattern.prototype;

public abstract class Toy{
    
    String manufacturingCompany;
    boolean isRechargeable;
    boolean isWithRemoteControl;
    
    public Toy(String manufacturingCompany, boolean isRechargeable, boolean isWithRemoteControl) {
        super();
        this.manufacturingCompany = manufacturingCompany;
        this.isRechargeable = isRechargeable;
        this.isWithRemoteControl = isWithRemoteControl;
    }

    public String getManufacturingCompany() {
        return manufacturingCompany;
    }

    public boolean isRechargeable() {
        return isRechargeable;
    }

    public boolean isWithRemoteControl() {
        return isWithRemoteControl;
    }

    public abstract Toy copy();
    
    @Override
    public String toString() {
        return "CarToy [manufacturingCompany=" + manufacturingCompany + ", isRechargeable=" + isRechargeable + ", isWithRemoteControl=" + isWithRemoteControl + "]";
    }
}
