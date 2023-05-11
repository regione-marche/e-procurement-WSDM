
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
 *         &lt;element name="Dm_DatiProfilo_GetNewInstance_From_IdRubricaResult" type="{http://www.Abletech.it/Arxivar}Dm_DatiProfilo" minOccurs="0"/>
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
    "dmDatiProfiloGetNewInstanceFromIdRubricaResult"
})
@XmlRootElement(name = "Dm_DatiProfilo_GetNewInstance_From_IdRubricaResponse")
public class DmDatiProfiloGetNewInstanceFromIdRubricaResponse {

    @XmlElement(name = "Dm_DatiProfilo_GetNewInstance_From_IdRubricaResult")
    protected DmDatiProfilo dmDatiProfiloGetNewInstanceFromIdRubricaResult;

    /**
     * Gets the value of the dmDatiProfiloGetNewInstanceFromIdRubricaResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmDatiProfilo }
     *     
     */
    public DmDatiProfilo getDmDatiProfiloGetNewInstanceFromIdRubricaResult() {
        return dmDatiProfiloGetNewInstanceFromIdRubricaResult;
    }

    /**
     * Sets the value of the dmDatiProfiloGetNewInstanceFromIdRubricaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmDatiProfilo }
     *     
     */
    public void setDmDatiProfiloGetNewInstanceFromIdRubricaResult(DmDatiProfilo value) {
        this.dmDatiProfiloGetNewInstanceFromIdRubricaResult = value;
    }

}
