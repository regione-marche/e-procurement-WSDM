
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
 *         &lt;element name="Dm_ElencoPratiche_GetDataByIdPraticaResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_ElencoPratiche" minOccurs="0"/>
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
    "dmElencoPraticheGetDataByIdPraticaResult"
})
@XmlRootElement(name = "Dm_ElencoPratiche_GetDataByIdPraticaResponse")
public class DmElencoPraticheGetDataByIdPraticaResponse {

    @XmlElement(name = "Dm_ElencoPratiche_GetDataByIdPraticaResult")
    protected ArrayOfDmElencoPratiche dmElencoPraticheGetDataByIdPraticaResult;

    /**
     * Gets the value of the dmElencoPraticheGetDataByIdPraticaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmElencoPratiche }
     *     
     */
    public ArrayOfDmElencoPratiche getDmElencoPraticheGetDataByIdPraticaResult() {
        return dmElencoPraticheGetDataByIdPraticaResult;
    }

    /**
     * Sets the value of the dmElencoPraticheGetDataByIdPraticaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmElencoPratiche }
     *     
     */
    public void setDmElencoPraticheGetDataByIdPraticaResult(ArrayOfDmElencoPratiche value) {
        this.dmElencoPraticheGetDataByIdPraticaResult = value;
    }

}
