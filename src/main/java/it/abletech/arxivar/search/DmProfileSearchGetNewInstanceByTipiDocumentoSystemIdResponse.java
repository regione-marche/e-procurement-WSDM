
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
 *         &lt;element name="Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoSystemIdResult" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Search" minOccurs="0"/>
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
    "dmProfileSearchGetNewInstanceByTipiDocumentoSystemIdResult"
})
@XmlRootElement(name = "Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoSystemIdResponse")
public class DmProfileSearchGetNewInstanceByTipiDocumentoSystemIdResponse {

    @XmlElement(name = "Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoSystemIdResult")
    protected DmProfileSearch dmProfileSearchGetNewInstanceByTipiDocumentoSystemIdResult;

    /**
     * Gets the value of the dmProfileSearchGetNewInstanceByTipiDocumentoSystemIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileSearch }
     *     
     */
    public DmProfileSearch getDmProfileSearchGetNewInstanceByTipiDocumentoSystemIdResult() {
        return dmProfileSearchGetNewInstanceByTipiDocumentoSystemIdResult;
    }

    /**
     * Sets the value of the dmProfileSearchGetNewInstanceByTipiDocumentoSystemIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileSearch }
     *     
     */
    public void setDmProfileSearchGetNewInstanceByTipiDocumentoSystemIdResult(DmProfileSearch value) {
        this.dmProfileSearchGetNewInstanceByTipiDocumentoSystemIdResult = value;
    }

}
