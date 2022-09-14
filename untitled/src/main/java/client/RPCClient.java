package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;

public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {      //psvm y tab.......... mi funcion
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));    //aqui es donde vamos a configurar nuesto request
        XmlRpcClient client = new XmlRpcClient();     //a nuestro cliente le estamos pasando la configuracion antes realizada
        client.setConfig(config);
        Object[] numbers = {5.0,5D};    //el 5D es para que lea que especifiques en un double
        Double response = (Double) client.execute("Methods.addition", numbers); //nuestra clase.meotodo "adicion"
        System.out.println("Result -> " + response);

    }
}
