
package it.jdoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}InputLink" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "param"
})
@XmlRootElement(name = "DoLink")
public class DoLink {

    @XmlElement(nillable = true)
    protected InputLink param;

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link InputLink }
     *     
     */
    public InputLink getParam() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputLink }
     *     
     */
    public void setParam(InputLink value) {
        this.param = value;
    }

}
