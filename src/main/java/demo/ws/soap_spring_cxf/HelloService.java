
package demo.ws.soap_spring_cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloService", targetNamespace = "http://soap_spring_cxf.ws.demo/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "say", targetNamespace = "http://soap_spring_cxf.ws.demo/", className = "demo.ws.soap_spring_cxf.Say")
    @ResponseWrapper(localName = "sayResponse", targetNamespace = "http://soap_spring_cxf.ws.demo/", className = "demo.ws.soap_spring_cxf.SayResponse")
    public String say(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
