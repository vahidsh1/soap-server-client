
package com.test;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://test.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorld {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloWorld", targetNamespace = "http://test.com/", className = "com.test.SayHelloWorld")
    @ResponseWrapper(localName = "sayHelloWorldResponse", targetNamespace = "http://test.com/", className = "com.test.SayHelloWorldResponse")
    @Action(input = "http://test.com/HelloWorld/sayHelloWorldRequest", output = "http://test.com/HelloWorld/sayHelloWorldResponse")
    public String sayHelloWorld(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}