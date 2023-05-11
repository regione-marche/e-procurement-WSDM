
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
 *         &lt;element name="Dm_Rubrica_ForUpdate_GetNewInstance_By_SystemIdResult" type="{http://www.Abletech.it/Arxivar}Dm_Rubrica_ForUpdate" minOccurs="0"/>
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
    "dmRubricaForUpdateGetNewInstanceBySystemIdResult"
})
@XmlRootElement(name = "Dm_Rubrica_ForUpdate_GetNewInstance_By_SystemIdResponse")
public class DmRubricaForUpdateGetNewInstanceBySystemIdResponse {

    @XmlElement(name = "Dm_Rubrica_ForUpdate_GetNewInstance_By_SystemIdResult")
    protected DmRubricaForUpdate dmRubricaForUpdateGetNewInstanceBySystemIdResult;

    /**
     * Gets the value of the dmRubricaForUpdateGetNewInstanceBySystemIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmRubricaForUpdate }
     *     
     */
    public DmRubricaForUpdate getDmRubricaForUpdateGetNewInstanceBySystemIdResult() {
        return dmRubricaForUpdateGetNewInstanceBySystemIdResult;
    }

    /**
     * Sets the value of the dmRubricaForUpdateGetNewInstanceBySystemIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRubricaForUpdate }
     *     
     */
    public void setDmRubricaForUpdateGetNewInstanceBySystemIdResult(DmRubricaForUpdate value) {
        this.dmRubricaForUpdateGetNewInstanceBySystemIdResult = value;
    }

}
