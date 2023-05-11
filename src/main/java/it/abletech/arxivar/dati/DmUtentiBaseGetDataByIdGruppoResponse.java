
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
 *         &lt;element name="Dm_UtentiBase_GetData_By_IdGruppoResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_UtentiBase" minOccurs="0"/>
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
    "dmUtentiBaseGetDataByIdGruppoResult"
})
@XmlRootElement(name = "Dm_UtentiBase_GetData_By_IdGruppoResponse")
public class DmUtentiBaseGetDataByIdGruppoResponse {

    @XmlElement(name = "Dm_UtentiBase_GetData_By_IdGruppoResult")
    protected ArrayOfDmUtentiBase dmUtentiBaseGetDataByIdGruppoResult;

    /**
     * Gets the value of the dmUtentiBaseGetDataByIdGruppoResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmUtentiBase }
     *     
     */
    public ArrayOfDmUtentiBase getDmUtentiBaseGetDataByIdGruppoResult() {
        return dmUtentiBaseGetDataByIdGruppoResult;
    }

    /**
     * Sets the value of the dmUtentiBaseGetDataByIdGruppoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmUtentiBase }
     *     
     */
    public void setDmUtentiBaseGetDataByIdGruppoResult(ArrayOfDmUtentiBase value) {
        this.dmUtentiBaseGetDataByIdGruppoResult = value;
    }

}
