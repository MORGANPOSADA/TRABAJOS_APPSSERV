package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {      //psvm y tab.......... mi funcion
        Scanner obj = new Scanner(System.in);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));    //aqui es donde vamos a configurar nuesto request
        XmlRpcClient client = new XmlRpcClient();     //a nuestro cliente le estamos pasando la configuracion antes realizada
        client.setConfig(config);

        System.out.println("Enter your name here: ");
        String name = obj.nextLine();
        System.out.println("Enter your weight: ");
        double weight = obj.nextDouble();
        System.out.println("Enter your height: ");
        double height = obj.nextDouble();
        Object[] imc = {weight, height};    //el nombre de mis variables bro hacemos aqiu un arreglo de objetos
        Double response = (Double) client.execute("Methods.getData", imc); //nuestra clase.meotodo "adicion"..... aqui es methods.miMetodoName, como puse el nombre de mi objeto array
        System.out.println("Hi " +name+ " your IMC value is: " + (response=  Math.round(response * 100) / 100d));

    }
}
