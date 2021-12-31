
package it.marche.regione.paleowssec;

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
 *         &lt;element name="SaveVoceRubricaResult" type="{http://paleo.regione.marche.it/services/}Rubrica" minOccurs="0"/>
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
    "saveVoceRubricaResult"
})
@XmlRootElement(name = "SaveVoceRubricaResponse")
public class SaveVoceRubricaResponse {

    @XmlElement(name = "SaveVoceRubricaResult", nillable = true)
    protected Rubrica saveVoceRubricaResult;

    /**
     * Gets the value of the saveVoceRubricaResult property.
     * 
     * @return
     *     possible object is
     *     {@link Rubrica }
     *     
     */
    public Rubrica getSaveVoceRubricaResult() {
        return saveVoceRubricaResult;
    }

    /**
     * Sets the value of the saveVoceRubricaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rubrica }
     *     
     */
    public void setSaveVoceRubricaResult(Rubrica value) {
        this.saveVoceRubricaResult = value;
    }

}
