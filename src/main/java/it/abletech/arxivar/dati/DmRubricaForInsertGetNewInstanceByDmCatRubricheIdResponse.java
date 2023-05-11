
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
 *         &lt;element name="Dm_Rubrica_ForInsert_GetNewInstance_By_DmCatRubricheIdResult" type="{http://www.Abletech.it/Arxivar}Dm_Rubrica_ForInsert" minOccurs="0"/>
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
    "dmRubricaForInsertGetNewInstanceByDmCatRubricheIdResult"
})
@XmlRootElement(name = "Dm_Rubrica_ForInsert_GetNewInstance_By_DmCatRubricheIdResponse")
public class DmRubricaForInsertGetNewInstanceByDmCatRubricheIdResponse {

    @XmlElement(name = "Dm_Rubrica_ForInsert_GetNewInstance_By_DmCatRubricheIdResult")
    protected DmRubricaForInsert dmRubricaForInsertGetNewInstanceByDmCatRubricheIdResult;

    /**
     * Gets the value of the dmRubricaForInsertGetNewInstanceByDmCatRubricheIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmRubricaForInsert }
     *     
     */
    public DmRubricaForInsert getDmRubricaForInsertGetNewInstanceByDmCatRubricheIdResult() {
        return dmRubricaForInsertGetNewInstanceByDmCatRubricheIdResult;
    }

    /**
     * Sets the value of the dmRubricaForInsertGetNewInstanceByDmCatRubricheIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRubricaForInsert }
     *     
     */
    public void setDmRubricaForInsertGetNewInstanceByDmCatRubricheIdResult(DmRubricaForInsert value) {
        this.dmRubricaForInsertGetNewInstanceByDmCatRubricheIdResult = value;
    }

}
