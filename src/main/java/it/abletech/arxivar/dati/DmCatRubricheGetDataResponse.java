
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
 *         &lt;element name="Dm_CatRubriche_Get_DataResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_CatRubriche" minOccurs="0"/>
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
    "dmCatRubricheGetDataResult"
})
@XmlRootElement(name = "Dm_CatRubriche_Get_DataResponse")
public class DmCatRubricheGetDataResponse {

    @XmlElement(name = "Dm_CatRubriche_Get_DataResult")
    protected ArrayOfDmCatRubriche dmCatRubricheGetDataResult;

    /**
     * Gets the value of the dmCatRubricheGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmCatRubriche }
     *     
     */
    public ArrayOfDmCatRubriche getDmCatRubricheGetDataResult() {
        return dmCatRubricheGetDataResult;
    }

    /**
     * Sets the value of the dmCatRubricheGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmCatRubriche }
     *     
     */
    public void setDmCatRubricheGetDataResult(ArrayOfDmCatRubriche value) {
        this.dmCatRubricheGetDataResult = value;
    }

}
