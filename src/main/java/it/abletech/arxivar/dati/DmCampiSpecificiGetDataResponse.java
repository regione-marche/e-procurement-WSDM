
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
 *         &lt;element name="Dm_CampiSpecifici_GetDataResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_CampiSpecifici" minOccurs="0"/>
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
    "dmCampiSpecificiGetDataResult"
})
@XmlRootElement(name = "Dm_CampiSpecifici_GetDataResponse")
public class DmCampiSpecificiGetDataResponse {

    @XmlElement(name = "Dm_CampiSpecifici_GetDataResult")
    protected ArrayOfDmCampiSpecifici dmCampiSpecificiGetDataResult;

    /**
     * Gets the value of the dmCampiSpecificiGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmCampiSpecifici }
     *     
     */
    public ArrayOfDmCampiSpecifici getDmCampiSpecificiGetDataResult() {
        return dmCampiSpecificiGetDataResult;
    }

    /**
     * Sets the value of the dmCampiSpecificiGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmCampiSpecifici }
     *     
     */
    public void setDmCampiSpecificiGetDataResult(ArrayOfDmCampiSpecifici value) {
        this.dmCampiSpecificiGetDataResult = value;
    }

}
