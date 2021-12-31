
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
 *         &lt;element name="Dm_TipiPratiche_GetDataResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_TipiPratiche" minOccurs="0"/>
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
    "dmTipiPraticheGetDataResult"
})
@XmlRootElement(name = "Dm_TipiPratiche_GetDataResponse")
public class DmTipiPraticheGetDataResponse {

    @XmlElement(name = "Dm_TipiPratiche_GetDataResult")
    protected ArrayOfDmTipiPratiche dmTipiPraticheGetDataResult;

    /**
     * Gets the value of the dmTipiPraticheGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmTipiPratiche }
     *     
     */
    public ArrayOfDmTipiPratiche getDmTipiPraticheGetDataResult() {
        return dmTipiPraticheGetDataResult;
    }

    /**
     * Sets the value of the dmTipiPraticheGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmTipiPratiche }
     *     
     */
    public void setDmTipiPraticheGetDataResult(ArrayOfDmTipiPratiche value) {
        this.dmTipiPraticheGetDataResult = value;
    }

}
