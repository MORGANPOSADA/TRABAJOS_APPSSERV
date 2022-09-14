package client;

import java.util.Scanner;

public class ClientRPC {

    private static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        String opcion = "", num1 = "", num2= "";  //declaracion de mis variables

        do{   //aqui inicia mi menu y que se ira haciendo conforme un ciclo
            System.out.println("1. Suma"); //lista de opciones
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Exponente");
            System.out.println("6. Raíz");
            System.out.println("7. Salir");
            opcion = sc.next();  //leo la opcion

            if(isNumber(opcion)){   //si mi opcion que elegi pasa por la validacion de isNumber y me retorna el true..
                switch (Integer.parseInt(opcion)){//va a ahcer mi switch de casos
                    case 1:
                    do {
                        System.out.println("Enter the first value: ");
                        num1 = sc.next();
                        if(!isNumber(num1)){
                            System.out.println("Error, you need to put a number value");
                        }
                    }while(!isNumber(num1));
                    //puede ejecutar el servidor y enviar los datos
                        do {
                            System.out.println("Enter the second value: ");
                            num2 = sc.next();
                            if(!isNumber(num2)){
                                System.out.println("Error, you need to put a number value");
                            }
                        }while(!isNumber(num2));
                        //llamada al servicio web
                        break ;
                    case 2:
                    
                    break ;
                    default:
                        System.out.println("Ingresa una opción válida :D");
                }
            }else{
                System.out.println("Ingresa un valor válido");
            }
        }while (!opcion.equals("7"));   //aqui se rompe mi switch .....compara objetos , en este caso el contenido que es "7" mientras opcion sea diferente de 7
    }
    //equals compara el hash ...
    /*String es especial
    * stringPool = funciona como una bd cualquier variable que se haga va a apuntar a ese string*/

    //aqui vamos a hacer mi validacion :
    public static boolean isNumber(String number){    //aqui solo quiero saber si lo que escribe un usuario es un numero
        try{
            int num= Integer.parseInt(number);   //parseo ese nuumber y si si pues me retorna un true
            return true;
        }catch (NumberFormatException e){  //si no lo es me va a dar un false
            return false;
        }
    }


}
