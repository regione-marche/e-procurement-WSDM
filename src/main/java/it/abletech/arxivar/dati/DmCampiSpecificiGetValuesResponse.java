
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
 *         &lt;element name="Dm_CampiSpecifici_GetValuesResult" type="{http://www.Abletech.it/Arxivar}Arx_CampiValues" minOccurs="0"/>
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
    "dmCampiSpecificiGetValuesResult"
})
@XmlRootElement(name = "Dm_CampiSpecifici_GetValuesResponse")
public class DmCampiSpecificiGetValuesResponse {

    @XmlElement(name = "Dm_CampiSpecifici_GetValuesResult")
    protected ArxCampiValues dmCampiSpecificiGetValuesResult;

    /**
     * Gets the value of the dmCampiSpecificiGetValuesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArxCampiValues }
     *     
     */
    public ArxCampiValues getDmCampiSpecificiGetValuesResult() {
        return dmCampiSpecificiGetValuesResult;
    }

    /**
     * Sets the value of the dmCampiSpecificiGetValuesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArxCampiValues }
     *     
     */
    public void setDmCampiSpecificiGetValuesResult(ArxCampiValues value) {
        this.dmCampiSpecificiGetValuesResult = value;
    }

}
