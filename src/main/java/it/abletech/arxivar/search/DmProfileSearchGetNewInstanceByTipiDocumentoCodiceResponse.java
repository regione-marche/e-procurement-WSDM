
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
 *         &lt;element name="Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoCodiceResult" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Search" minOccurs="0"/>
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
    "dmProfileSearchGetNewInstanceByTipiDocumentoCodiceResult"
})
@XmlRootElement(name = "Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoCodiceResponse")
public class DmProfileSearchGetNewInstanceByTipiDocumentoCodiceResponse {

    @XmlElement(name = "Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoCodiceResult")
    protected DmProfileSearch dmProfileSearchGetNewInstanceByTipiDocumentoCodiceResult;

    /**
     * Gets the value of the dmProfileSearchGetNewInstanceByTipiDocumentoCodiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileSearch }
     *     
     */
    public DmProfileSearch getDmProfileSearchGetNewInstanceByTipiDocumentoCodiceResult() {
        return dmProfileSearchGetNewInstanceByTipiDocumentoCodiceResult;
    }

    /**
     * Sets the value of the dmProfileSearchGetNewInstanceByTipiDocumentoCodiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileSearch }
     *     
     */
    public void setDmProfileSearchGetNewInstanceByTipiDocumentoCodiceResult(DmProfileSearch value) {
        this.dmProfileSearchGetNewInstanceByTipiDocumentoCodiceResult = value;
    }

}
