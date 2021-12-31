
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
 *         &lt;element name="Dm_Rubrica_GetData_By_CodiceResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_Rubrica" minOccurs="0"/>
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
    "dmRubricaGetDataByCodiceResult"
})
@XmlRootElement(name = "Dm_Rubrica_GetData_By_CodiceResponse")
public class DmRubricaGetDataByCodiceResponse {

    @XmlElement(name = "Dm_Rubrica_GetData_By_CodiceResult")
    protected ArrayOfDmRubrica dmRubricaGetDataByCodiceResult;

    /**
     * Gets the value of the dmRubricaGetDataByCodiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmRubrica }
     *     
     */
    public ArrayOfDmRubrica getDmRubricaGetDataByCodiceResult() {
        return dmRubricaGetDataByCodiceResult;
    }

    /**
     * Sets the value of the dmRubricaGetDataByCodiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmRubrica }
     *     
     */
    public void setDmRubricaGetDataByCodiceResult(ArrayOfDmRubrica value) {
        this.dmRubricaGetDataByCodiceResult = value;
    }

}
