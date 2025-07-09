
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrasmissioneDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrasmissioneDoc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services2/}Trasmissione">
 *       &lt;sequence>
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrasmissioneDoc", propOrder = {
    "docNumber"
})
public class TrasmissioneDoc
    extends Trasmissione
{

    @XmlElement(name = "DocNumber")
    protected Integer docNumber;

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocNumber(Integer value) {
        this.docNumber = value;
    }

}
