
package it.iride.wsprotocollodm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CopiaCreata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CopiaCreata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdDocumentoCopia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Carico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopiaCreata", propOrder = {
    "idDocumentoCopia",
    "carico"
})
public class CopiaCreata {

    @XmlElement(name = "IdDocumentoCopia")
    protected int idDocumentoCopia;
    @XmlElement(name = "Carico")
    protected String carico;

    /**
     * Gets the value of the idDocumentoCopia property.
     * 
     */
    public int getIdDocumentoCopia() {
        return idDocumentoCopia;
    }

    /**
     * Sets the value of the idDocumentoCopia property.
     * 
     */
    public void setIdDocumentoCopia(int value) {
        this.idDocumentoCopia = value;
    }

    /**
     * Gets the value of the carico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarico() {
        return carico;
    }

    /**
     * Sets the value of the carico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarico(String value) {
        this.carico = value;
    }

}
