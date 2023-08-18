package jaxwsExample.ws;

import javax.jws.WebService;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.WebEndpoint;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class HelloWs {
	
	
	
  @WebEndpoint
  public String sayHello(@WebParam(name="name")String name) {
    if (name == null) {
      return "Hello";
    }

    return "Hello, " + name + "!";
  }
}