
package jaxwsExample.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "sayHello", namespace = "http://ws.jaxwsExample/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHello", namespace = "http://ws.jaxwsExample/")
public class SayHello {

    @XmlElement(name = "name", namespace = "")
    private String name;

   
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
