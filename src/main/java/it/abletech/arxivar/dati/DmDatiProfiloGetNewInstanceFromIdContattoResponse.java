
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
 *         &lt;element name="Dm_DatiProfilo_GetNewInstance_From_IdContattoResult" type="{http://www.Abletech.it/Arxivar}Dm_DatiProfilo" minOccurs="0"/>
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
    "dmDatiProfiloGetNewInstanceFromIdContattoResult"
})
@XmlRootElement(name = "Dm_DatiProfilo_GetNewInstance_From_IdContattoResponse")
public class DmDatiProfiloGetNewInstanceFromIdContattoResponse {

    @XmlElement(name = "Dm_DatiProfilo_GetNewInstance_From_IdContattoResult")
    protected DmDatiProfilo dmDatiProfiloGetNewInstanceFromIdContattoResult;

    /**
     * Gets the value of the dmDatiProfiloGetNewInstanceFromIdContattoResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmDatiProfilo }
     *     
     */
    public DmDatiProfilo getDmDatiProfiloGetNewInstanceFromIdContattoResult() {
        return dmDatiProfiloGetNewInstanceFromIdContattoResult;
    }

    /**
     * Sets the value of the dmDatiProfiloGetNewInstanceFromIdContattoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmDatiProfilo }
     *     
     */
    public void setDmDatiProfiloGetNewInstanceFromIdContattoResult(DmDatiProfilo value) {
        this.dmDatiProfiloGetNewInstanceFromIdContattoResult = value;
    }

}
