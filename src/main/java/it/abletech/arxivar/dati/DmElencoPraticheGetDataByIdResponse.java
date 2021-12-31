
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
 *         &lt;element name="Dm_ElencoPratiche_GetDataByIdResult" type="{http://www.Abletech.it/Arxivar}Dm_ElencoPratiche" minOccurs="0"/>
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
    "dmElencoPraticheGetDataByIdResult"
})
@XmlRootElement(name = "Dm_ElencoPratiche_GetDataByIdResponse")
public class DmElencoPraticheGetDataByIdResponse {

    @XmlElement(name = "Dm_ElencoPratiche_GetDataByIdResult")
    protected DmElencoPratiche dmElencoPraticheGetDataByIdResult;

    /**
     * Gets the value of the dmElencoPraticheGetDataByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmElencoPratiche }
     *     
     */
    public DmElencoPratiche getDmElencoPraticheGetDataByIdResult() {
        return dmElencoPraticheGetDataByIdResult;
    }

    /**
     * Sets the value of the dmElencoPraticheGetDataByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmElencoPratiche }
     *     
     */
    public void setDmElencoPraticheGetDataByIdResult(DmElencoPratiche value) {
        this.dmElencoPraticheGetDataByIdResult = value;
    }

}
