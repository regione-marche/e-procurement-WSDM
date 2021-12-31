
package it.iride.wsprotocollodm;

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
 *         &lt;element name="DocumentumIn" type="{http://tempuri.org/}DocumentumIn"/>
 *         &lt;element name="CodiceAmministrazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceAOO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "documentumIn",
    "codiceAmministrazione",
    "codiceAOO"
})
@XmlRootElement(name = "InserisciDocumentoDaDM")
public class InserisciDocumentoDaDM {

    @XmlElement(name = "DocumentumIn", required = true, nillable = true)
    protected DocumentumIn documentumIn;
    @XmlElement(name = "CodiceAmministrazione")
    protected String codiceAmministrazione;
    @XmlElement(name = "CodiceAOO")
    protected String codiceAOO;

    /**
     * Gets the value of the documentumIn property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentumIn }
     *     
     */
    public DocumentumIn getDocumentumIn() {
        return documentumIn;
    }

    /**
     * Sets the value of the documentumIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentumIn }
     *     
     */
    public void setDocumentumIn(DocumentumIn value) {
        this.documentumIn = value;
    }

    /**
     * Gets the value of the codiceAmministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAmministrazione() {
        return codiceAmministrazione;
    }

    /**
     * Sets the value of the codiceAmministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAmministrazione(String value) {
        this.codiceAmministrazione = value;
    }

    /**
     * Gets the value of the codiceAOO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAOO() {
        return codiceAOO;
    }

    /**
     * Sets the value of the codiceAOO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAOO(String value) {
        this.codiceAOO = value;
    }

}
