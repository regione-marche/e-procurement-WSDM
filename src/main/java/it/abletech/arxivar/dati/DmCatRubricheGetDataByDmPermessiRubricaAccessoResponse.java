
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
 *         &lt;element name="Dm_CatRubriche_Get_Data_By_Dm_Permessi_Rubrica_AccessoResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_CatRubriche" minOccurs="0"/>
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
    "dmCatRubricheGetDataByDmPermessiRubricaAccessoResult"
})
@XmlRootElement(name = "Dm_CatRubriche_Get_Data_By_Dm_Permessi_Rubrica_AccessoResponse")
public class DmCatRubricheGetDataByDmPermessiRubricaAccessoResponse {

    @XmlElement(name = "Dm_CatRubriche_Get_Data_By_Dm_Permessi_Rubrica_AccessoResult")
    protected ArrayOfDmCatRubriche dmCatRubricheGetDataByDmPermessiRubricaAccessoResult;

    /**
     * Gets the value of the dmCatRubricheGetDataByDmPermessiRubricaAccessoResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmCatRubriche }
     *     
     */
    public ArrayOfDmCatRubriche getDmCatRubricheGetDataByDmPermessiRubricaAccessoResult() {
        return dmCatRubricheGetDataByDmPermessiRubricaAccessoResult;
    }

    /**
     * Sets the value of the dmCatRubricheGetDataByDmPermessiRubricaAccessoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmCatRubriche }
     *     
     */
    public void setDmCatRubricheGetDataByDmPermessiRubricaAccessoResult(ArrayOfDmCatRubriche value) {
        this.dmCatRubricheGetDataByDmPermessiRubricaAccessoResult = value;
    }

}
