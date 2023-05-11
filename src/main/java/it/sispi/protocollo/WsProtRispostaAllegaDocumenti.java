
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WsProtRispostaAllegaDocumenti complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsProtRispostaAllegaDocumenti">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="progDoc" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="regProt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numProt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="annoProt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="datProt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsProtRispostaAllegaDocumenti", propOrder = {
    "progDoc",
    "regProt",
    "numProt",
    "annoProt",
    "datProt"
})
public class WsProtRispostaAllegaDocumenti {

    protected long progDoc;
    @XmlElement(required = true)
    protected String regProt;
    protected long numProt;
    protected long annoProt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datProt;

    /**
     * Gets the value of the progDoc property.
     * 
     */
    public long getProgDoc() {
        return progDoc;
    }

    /**
     * Sets the value of the progDoc property.
     * 
     */
    public void setProgDoc(long value) {
        this.progDoc = value;
    }

    /**
     * Gets the value of the regProt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegProt() {
        return regProt;
    }

    /**
     * Sets the value of the regProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegProt(String value) {
        this.regProt = value;
    }

    /**
     * Gets the value of the numProt property.
     * 
     */
    public long getNumProt() {
        return numProt;
    }

    /**
     * Sets the value of the numProt property.
     * 
     */
    public void setNumProt(long value) {
        this.numProt = value;
    }

    /**
     * Gets the value of the annoProt property.
     * 
     */
    public long getAnnoProt() {
        return annoProt;
    }

    /**
     * Sets the value of the annoProt property.
     * 
     */
    public void setAnnoProt(long value) {
        this.annoProt = value;
    }

    /**
     * Gets the value of the datProt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatProt() {
        return datProt;
    }

    /**
     * Sets the value of the datProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatProt(XMLGregorianCalendar value) {
        this.datProt = value;
    }

}
