package server;

public class Methods {

    public int between(int num1, int num2){
        int max=0, min=0,sum=0;
        if (num1>=num2) {
            min=num2;
            max=num1;
        }else{
            min=num1;
            max=num2;

        }
        for(int x=min+1; x<max; x++){
            sum=sum+x;
        }
        return sum;

    }


}

