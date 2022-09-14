package server;

public class Methods {


    public String information (String name){
        return (name);
    }
    public double getData (double weight, double height ){
        return (weight/(height*height));   //IMC = Peso (kg) / altura (m)2
    }

}

