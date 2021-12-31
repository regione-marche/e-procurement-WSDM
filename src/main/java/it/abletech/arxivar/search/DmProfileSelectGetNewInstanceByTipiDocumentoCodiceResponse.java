
package it.abletech.arxivar.search;

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
 *         &lt;element name="Dm_Profile_Select_Get_New_Instance_By_TipiDocumentoCodiceResult" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Select" minOccurs="0"/>
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
    "dmProfileSelectGetNewInstanceByTipiDocumentoCodiceResult"
})
@XmlRootElement(name = "Dm_Profile_Select_Get_New_Instance_By_TipiDocumentoCodiceResponse")
public class DmProfileSelectGetNewInstanceByTipiDocumentoCodiceResponse {

    @XmlElement(name = "Dm_Profile_Select_Get_New_Instance_By_TipiDocumentoCodiceResult")
    protected DmProfileSelect dmProfileSelectGetNewInstanceByTipiDocumentoCodiceResult;

    /**
     * Gets the value of the dmProfileSelectGetNewInstanceByTipiDocumentoCodiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileSelect }
     *     
     */
    public DmProfileSelect getDmProfileSelectGetNewInstanceByTipiDocumentoCodiceResult() {
        return dmProfileSelectGetNewInstanceByTipiDocumentoCodiceResult;
    }

    /**
     * Sets the value of the dmProfileSelectGetNewInstanceByTipiDocumentoCodiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileSelect }
     *     
     */
    public void setDmProfileSelectGetNewInstanceByTipiDocumentoCodiceResult(DmProfileSelect value) {
        this.dmProfileSelectGetNewInstanceByTipiDocumentoCodiceResult = value;
    }

}
