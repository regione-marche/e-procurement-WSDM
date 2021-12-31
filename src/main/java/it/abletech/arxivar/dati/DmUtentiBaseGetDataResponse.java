
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
 *         &lt;element name="Dm_UtentiBase_GetDataResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_UtentiBase" minOccurs="0"/>
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
    "dmUtentiBaseGetDataResult"
})
@XmlRootElement(name = "Dm_UtentiBase_GetDataResponse")
public class DmUtentiBaseGetDataResponse {

    @XmlElement(name = "Dm_UtentiBase_GetDataResult")
    protected ArrayOfDmUtentiBase dmUtentiBaseGetDataResult;

    /**
     * Gets the value of the dmUtentiBaseGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmUtentiBase }
     *     
     */
    public ArrayOfDmUtentiBase getDmUtentiBaseGetDataResult() {
        return dmUtentiBaseGetDataResult;
    }

    /**
     * Sets the value of the dmUtentiBaseGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmUtentiBase }
     *     
     */
    public void setDmUtentiBaseGetDataResult(ArrayOfDmUtentiBase value) {
        this.dmUtentiBaseGetDataResult = value;
    }

}
