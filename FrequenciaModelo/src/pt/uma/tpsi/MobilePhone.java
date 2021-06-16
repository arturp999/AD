package pt.uma.tpsi;

public class MobilePhone extends MobileDevice{

    private String network;


    public MobilePhone(){
        super();
        this.network = "";
    }


    public MobilePhone(String brand, String model, int year, int serialNumber, CPU cpu, String network) {
        super(brand,model,year,serialNumber,cpu); //invoca o contrutor da classe principal
        this.network = network;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "network='" + network + '\'' +
                '}';
    }
}
