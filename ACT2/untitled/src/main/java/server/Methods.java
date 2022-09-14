package server;

public class Methods {


    public String operations(double num1, double num2, double num3, double num4){   //como seria si es que quiero ponerlos por separado? mis product, sum y average
        double product = num1*num2*num3*num4;
        double adition = num1+num2+num3+num4;
        double average = adition/4;
        return ("Hey!, the product is: " +product+ ", the total adition is: "+adition+ ", and the average is: " +average);
    }

}

