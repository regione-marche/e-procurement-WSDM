
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
 *         &lt;element name="Dm_Profile_Select_Get_New_Instance_By_ElencoRicerche_IdResult" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Select" minOccurs="0"/>
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
    "dmProfileSelectGetNewInstanceByElencoRicercheIdResult"
})
@XmlRootElement(name = "Dm_Profile_Select_Get_New_Instance_By_ElencoRicerche_IdResponse")
public class DmProfileSelectGetNewInstanceByElencoRicercheIdResponse {

    @XmlElement(name = "Dm_Profile_Select_Get_New_Instance_By_ElencoRicerche_IdResult")
    protected DmProfileSelect dmProfileSelectGetNewInstanceByElencoRicercheIdResult;

    /**
     * Gets the value of the dmProfileSelectGetNewInstanceByElencoRicercheIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileSelect }
     *     
     */
    public DmProfileSelect getDmProfileSelectGetNewInstanceByElencoRicercheIdResult() {
        return dmProfileSelectGetNewInstanceByElencoRicercheIdResult;
    }

    /**
     * Sets the value of the dmProfileSelectGetNewInstanceByElencoRicercheIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileSelect }
     *     
     */
    public void setDmProfileSelectGetNewInstanceByElencoRicercheIdResult(DmProfileSelect value) {
        this.dmProfileSelectGetNewInstanceByElencoRicercheIdResult = value;
    }

}
