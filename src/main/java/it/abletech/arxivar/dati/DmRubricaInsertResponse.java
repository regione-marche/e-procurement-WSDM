
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
 *         &lt;element name="Dm_Rubrica_InsertResult" type="{http://www.Abletech.it/Arxivar}Dm_Rubrica" minOccurs="0"/>
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
    "dmRubricaInsertResult"
})
@XmlRootElement(name = "Dm_Rubrica_InsertResponse")
public class DmRubricaInsertResponse {

    @XmlElement(name = "Dm_Rubrica_InsertResult")
    protected DmRubrica dmRubricaInsertResult;

    /**
     * Gets the value of the dmRubricaInsertResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmRubrica }
     *     
     */
    public DmRubrica getDmRubricaInsertResult() {
        return dmRubricaInsertResult;
    }

    /**
     * Sets the value of the dmRubricaInsertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRubrica }
     *     
     */
    public void setDmRubricaInsertResult(DmRubrica value) {
        this.dmRubricaInsertResult = value;
    }

}
