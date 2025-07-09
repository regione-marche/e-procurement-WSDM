
package org.datacontract.schemas._2004._07.regionemarche_protocollo_common_tipi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SWType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DenominazioneSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWType", propOrder = {
    "denominazioneSistema"
})
public class SWType {

    @XmlElement(name = "DenominazioneSistema", nillable = true)
    protected String denominazioneSistema;

    /**
     * Gets the value of the denominazioneSistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazioneSistema() {
        return denominazioneSistema;
    }

    /**
     * Sets the value of the denominazioneSistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazioneSistema(String value) {
        this.denominazioneSistema = value;
    }

}
