
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
 *         &lt;element name="Dm_TipiPratiche_GetDataByIdResult" type="{http://www.Abletech.it/Arxivar}Dm_TipiPratiche" minOccurs="0"/>
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
    "dmTipiPraticheGetDataByIdResult"
})
@XmlRootElement(name = "Dm_TipiPratiche_GetDataByIdResponse")
public class DmTipiPraticheGetDataByIdResponse {

    @XmlElement(name = "Dm_TipiPratiche_GetDataByIdResult")
    protected DmTipiPratiche dmTipiPraticheGetDataByIdResult;

    /**
     * Gets the value of the dmTipiPraticheGetDataByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmTipiPratiche }
     *     
     */
    public DmTipiPratiche getDmTipiPraticheGetDataByIdResult() {
        return dmTipiPraticheGetDataByIdResult;
    }

    /**
     * Sets the value of the dmTipiPraticheGetDataByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTipiPratiche }
     *     
     */
    public void setDmTipiPraticheGetDataByIdResult(DmTipiPratiche value) {
        this.dmTipiPraticheGetDataByIdResult = value;
    }

}
