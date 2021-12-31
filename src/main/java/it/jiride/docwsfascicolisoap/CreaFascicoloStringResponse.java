
package it.jiride.docwsfascicolisoap;

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
 *         &lt;element name="CreaFascicoloStringResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "creaFascicoloStringResult"
})
@XmlRootElement(name = "CreaFascicoloStringResponse")
public class CreaFascicoloStringResponse {

    @XmlElement(name = "CreaFascicoloStringResult", required = true)
    protected String creaFascicoloStringResult;

    /**
     * Gets the value of the creaFascicoloStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreaFascicoloStringResult() {
        return creaFascicoloStringResult;
    }

    /**
     * Sets the value of the creaFascicoloStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreaFascicoloStringResult(String value) {
        this.creaFascicoloStringResult = value;
    }

}
