
package it.abletech.arxivar.dati;

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
 *         &lt;element name="Dm_UtentiBase_GetDataByUserIdResult" type="{http://www.Abletech.it/Arxivar}Dm_UtentiBase" minOccurs="0"/>
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
    "dmUtentiBaseGetDataByUserIdResult"
})
@XmlRootElement(name = "Dm_UtentiBase_GetDataByUserIdResponse")
public class DmUtentiBaseGetDataByUserIdResponse {

    @XmlElement(name = "Dm_UtentiBase_GetDataByUserIdResult")
    protected DmUtentiBase dmUtentiBaseGetDataByUserIdResult;

    /**
     * Gets the value of the dmUtentiBaseGetDataByUserIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmUtentiBase }
     *     
     */
    public DmUtentiBase getDmUtentiBaseGetDataByUserIdResult() {
        return dmUtentiBaseGetDataByUserIdResult;
    }

    /**
     * Sets the value of the dmUtentiBaseGetDataByUserIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmUtentiBase }
     *     
     */
    public void setDmUtentiBaseGetDataByUserIdResult(DmUtentiBase value) {
        this.dmUtentiBaseGetDataByUserIdResult = value;
    }

}
