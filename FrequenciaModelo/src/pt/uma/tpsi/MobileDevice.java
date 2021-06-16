package pt.uma.tpsi;

public class MobileDevice implements Comparable<MobileDevice> {

    private CPU cpu;
    private String brand;
    private String model;
    private int year;
    private int serialNumber;

    public MobileDevice(){
        this.brand = "";
        this.model = "";
        this.year = 0;
        this.serialNumber = 0;
        this.cpu = new CPU();
    }

    public MobileDevice(String brand, String model, int year, int serialNumber, CPU cpu) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.serialNumber = serialNumber;
        this.cpu = cpu;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public CPU getCpu() {
        return cpu;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MobileDevice{" +
                "cpu=" + cpu +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", serialNumber=" + serialNumber +
                '}';
    }

    @Override
    public int compareTo(MobileDevice other) {
        return this.year - other.year;
    }
}
