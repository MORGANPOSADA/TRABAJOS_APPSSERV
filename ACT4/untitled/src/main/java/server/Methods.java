package server;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Methods {

    public String ascendent(int num1, int num2, int num3, int num4, int num5){
        Object[] values={num1, num2, num3, num4, num5};
        Arrays.sort(values);
        return ("The number order is: "+Arrays.toString(values));
    }



    /*public int bubble(int[] A){
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
        return ;
    }*/


}

