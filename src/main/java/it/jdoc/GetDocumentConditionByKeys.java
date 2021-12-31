
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
 *         &lt;element name="param" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}InputByKeys" minOccurs="0"/>
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
@XmlRootElement(name = "GetDocumentConditionByKeys")
public class GetDocumentConditionByKeys {

    @XmlElement(nillable = true)
    protected InputByKeys param;

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link InputByKeys }
     *     
     */
    public InputByKeys getParam() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputByKeys }
     *     
     */
    public void setParam(InputByKeys value) {
        this.param = value;
    }

}
