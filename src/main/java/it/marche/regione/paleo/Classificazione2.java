
package it.marche.regione.paleo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Classificazione2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Classificazione2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services/}Classificazione">
 *       &lt;sequence>
 *         &lt;element name="Principale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Classificazione2", propOrder = {
    "principale"
})
public class Classificazione2
    extends Classificazione
{

    @XmlElement(name = "Principale")
    protected Boolean principale;

    /**
     * Gets the value of the principale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrincipale() {
        return principale;
    }

    /**
     * Sets the value of the principale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrincipale(Boolean value) {
        this.principale = value;
    }

}
