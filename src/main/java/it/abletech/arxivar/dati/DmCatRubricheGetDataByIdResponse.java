
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
 *         &lt;element name="Dm_CatRubriche_Get_Data_By_IdResult" type="{http://www.Abletech.it/Arxivar}Dm_CatRubriche" minOccurs="0"/>
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
    "dmCatRubricheGetDataByIdResult"
})
@XmlRootElement(name = "Dm_CatRubriche_Get_Data_By_IdResponse")
public class DmCatRubricheGetDataByIdResponse {

    @XmlElement(name = "Dm_CatRubriche_Get_Data_By_IdResult")
    protected DmCatRubriche dmCatRubricheGetDataByIdResult;

    /**
     * Gets the value of the dmCatRubricheGetDataByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmCatRubriche }
     *     
     */
    public DmCatRubriche getDmCatRubricheGetDataByIdResult() {
        return dmCatRubricheGetDataByIdResult;
    }

    /**
     * Sets the value of the dmCatRubricheGetDataByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCatRubriche }
     *     
     */
    public void setDmCatRubricheGetDataByIdResult(DmCatRubriche value) {
        this.dmCatRubricheGetDataByIdResult = value;
    }

}
