
package it.sispi.protocollo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsProtRichAllegaDocumenti complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsProtRichAllegaDocumenti">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userIdOperatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceServizio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="progDoc" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numProt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="annoProt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="regProt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allegato" type="{http://protocollo.sispi.it}WsProtocolloAllegato" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsProtRichAllegaDocumenti", propOrder = {
    "userIdOperatore",
    "codiceServizio",
    "progDoc",
    "numProt",
    "annoProt",
    "regProt",
    "allegato"
})
public class WsProtRichAllegaDocumenti {

    protected String userIdOperatore;
    protected long codiceServizio;
    protected long progDoc;
    protected int numProt;
    protected int annoProt;
    @XmlElement(required = true)
    protected String regProt;
    @XmlElement(required = true)
    protected List<WsProtocolloAllegato> allegato;

    /**
     * Gets the value of the userIdOperatore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdOperatore() {
        return userIdOperatore;
    }

    /**
     * Sets the value of the userIdOperatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdOperatore(String value) {
        this.userIdOperatore = value;
    }

    /**
     * Gets the value of the codiceServizio property.
     * 
     */
    public long getCodiceServizio() {
        return codiceServizio;
    }

    /**
     * Sets the value of the codiceServizio property.
     * 
     */
    public void setCodiceServizio(long value) {
        this.codiceServizio = value;
    }

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
     * Gets the value of the numProt property.
     * 
     */
    public int getNumProt() {
        return numProt;
    }

    /**
     * Sets the value of the numProt property.
     * 
     */
    public void setNumProt(int value) {
        this.numProt = value;
    }

    /**
     * Gets the value of the annoProt property.
     * 
     */
    public int getAnnoProt() {
        return annoProt;
    }

    /**
     * Sets the value of the annoProt property.
     * 
     */
    public void setAnnoProt(int value) {
        this.annoProt = value;
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
     * Gets the value of the allegato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allegato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllegato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsProtocolloAllegato }
     * 
     * 
     */
    public List<WsProtocolloAllegato> getAllegato() {
        if (allegato == null) {
            allegato = new ArrayList<WsProtocolloAllegato>();
        }
        return this.allegato;
    }

}
