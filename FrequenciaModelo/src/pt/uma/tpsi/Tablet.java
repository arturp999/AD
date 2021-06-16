package pt.uma.tpsi;

public class Tablet extends MobileDevice{

    private Boolean supportsPen;

    public Tablet(){
        super();
        this.supportsPen = false;
    }

    public Tablet(String brand, String model, int year, int serialNumber, CPU cpu, boolean supportsPen) {
        super(brand,model,year,serialNumber,cpu); //invoca o contrutor da classe principal
        this.supportsPen = supportsPen;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "supportsPen=" + supportsPen +
                '}';
    }
}
