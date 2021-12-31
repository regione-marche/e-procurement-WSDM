
package it.jiride.protocollosoap;

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
 *         &lt;element name="ProtoIn" type="{http://tempuri.org/}ProtocolloIn"/>
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
    "protoIn"
})
@XmlRootElement(name = "InserisciDocumentoEAnagrafiche")
public class InserisciDocumentoEAnagrafiche {

    @XmlElement(name = "ProtoIn", required = true)
    protected ProtocolloIn protoIn;

    /**
     * Gets the value of the protoIn property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolloIn }
     *     
     */
    public ProtocolloIn getProtoIn() {
        return protoIn;
    }

    /**
     * Sets the value of the protoIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolloIn }
     *     
     */
    public void setProtoIn(ProtocolloIn value) {
        this.protoIn = value;
    }

}
