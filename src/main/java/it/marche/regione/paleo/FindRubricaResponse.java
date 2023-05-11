
package it.marche.regione.paleo;

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
 *         &lt;element name="FindRubricaResult" type="{http://paleo.regione.marche.it/services/}BEListOfRubricaZA0hwLp5" minOccurs="0"/>
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
    "findRubricaResult"
})
@XmlRootElement(name = "FindRubricaResponse")
public class FindRubricaResponse {

    @XmlElement(name = "FindRubricaResult", nillable = true)
    protected BEListOfRubricaZA0HwLp5 findRubricaResult;

    /**
     * Gets the value of the findRubricaResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfRubricaZA0HwLp5 }
     *     
     */
    public BEListOfRubricaZA0HwLp5 getFindRubricaResult() {
        return findRubricaResult;
    }

    /**
     * Sets the value of the findRubricaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfRubricaZA0HwLp5 }
     *     
     */
    public void setFindRubricaResult(BEListOfRubricaZA0HwLp5 value) {
        this.findRubricaResult = value;
    }

}
