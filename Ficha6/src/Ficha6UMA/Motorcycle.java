package Ficha6UMA;

public class Motorcycle extends Vehicle{

    //construtor por omissao
    public Motorcycle(){
        super();
    }

    //construtor por parametros
    public Motorcycle(int year,String brand,String model, double price, String color){
        super(year, brand,model,price,color);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
