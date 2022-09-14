package server;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;

import java.io.IOException;

public class RPCServer {

    public static void main(String[] args) throws XmlRpcException, IOException {    //psvm y tab aqui vamos a hacer un metodo ............. el throws se agrega para que el methods no me marque en rojo
        System.out.println("Iniciando servidor...");
        PropertyHandlerMapping mapping = new PropertyHandlerMapping();      // en mi servidor , va a apuntar a mi clase metodos ... me esta especificando donde
        mapping.addHandler("Methods",Methods.class);
        WebServer server = new WebServer(1200);             //vanos a configurar nuestro server
        server.getXmlRpcServer().setHandlerMapping(mapping);  //nuestra clase mapping
        server.start();             //agregamos el ioexception
        System.out.println("Esperando peticiones...");     //imprimimos el mensaje
    }
}
