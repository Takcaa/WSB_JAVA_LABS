package com.company.devices;

public class Application implements Comparable<Application>{
    public String appname;
    private double price;
    private double version;

    public Application(String appname, double price, double version) {
        this.appname = appname;
        this.price = price;
        this.version = version;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public int compareTo(Application o) {
        if (o.getPrice() > 0)
            return 1;
        if (o.getPrice() <= 0)
            return -1;
        return 0;
    };

    @Override
    public String toString() {
        return "Application{" +
                "appname='" + appname + '\'' +
                ", price=" + price +
                ", version=" + version +
                '}';
    }
}
