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
//aqui empiezo con mi sistema :)
        System.out.println("Enter the 1st value: ");
        double num1= obj.nextDouble();
        System.out.println("Enter the 2nd value: ");
        double num2= obj.nextDouble();
        System.out.println("Enter the 3rd value: ");
        double num3= obj.nextDouble();
        System.out.println("Enter the 4th value: ");
        double num4= obj.nextDouble();
        Object[] op = {num1, num2, num3, num4};   //variables que utilizo en este arreglo de mi objeto
        String response = (String) client.execute("Methods.operations", op); //nuestra clase.meotodo "adicion"..... aqui es methods.miMetodoName, como puse el nombre de mi objeto array
        System.out.println(response);

    }
}
