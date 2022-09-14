package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {      //psvm y tab.......... mi funcion
        Scanner obj = new Scanner(System.in); //no olvides agregar el scanner !!
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));    //aqui es donde vamos a configurar nuesto request
        XmlRpcClient client = new XmlRpcClient();     //a nuestro cliente le estamos pasando la configuracion antes realizada
        client.setConfig(config);

        System.out.println("Enter the 1st number: ");
        int num1= obj.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2= obj.nextInt();
        Object[] bw = {num1, num2};   //variables que utilizo en este arreglo de mi objeto
        int response = (int) client.execute("Methods.between", bw); //nuestra clase.meotodo "adicion"..... aqui es methods.miMetodoName, como puse el nombre de mi objeto array
        System.out.println(response);


    }
}
