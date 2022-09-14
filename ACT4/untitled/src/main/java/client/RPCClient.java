package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;


public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {      //psvm y tab.......... mi funcion
        Scanner obj = new Scanner(System.in); //no olvides agregar el scanner !!
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));    //aqui es donde vamos a configurar nuesto request
        XmlRpcClient client = new XmlRpcClient();     //a nuestro cliente le estamos pasando la configuracion antes realizada
        client.setConfig(config);

        //aqui empiezo con mi sistema :)
        System.out.println("Enter the 1st value: ");
        int num1= obj.nextInt();
        System.out.println("Enter the 2nd value: ");
        int num2= obj.nextInt();
        System.out.println("Enter the 3rd value: ");
        int num3= obj.nextInt();
        System.out.println("Enter the 4th value: ");
        int num4= obj.nextInt();
        System.out.println("Enter the 5th value: ");
        int num5= obj.nextInt();
        Object[] op = {num1, num2, num3, num4, num5};   //variables que utilizo en este arreglo de mi objeto
        String response = (String) client.execute("Methods.ascendent", op); //nuestra clase.meotodo "adicion"..... aqui es methods.miMetodoName, como puse el nombre de mi objeto array
        System.out.println(response);












    }
}
