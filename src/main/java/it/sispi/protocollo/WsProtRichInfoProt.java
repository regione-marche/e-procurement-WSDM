
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsProtRichInfoProt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsProtRichInfoProt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userIdOperatore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="progDoc" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numProt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="annoProt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="regProt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allegati" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsProtRichInfoProt", propOrder = {
    "userIdOperatore",
    "progDoc",
    "numProt",
    "annoProt",
    "regProt",
    "allegati"
})
public class WsProtRichInfoProt {

    @XmlElement(required = true)
    protected String userIdOperatore;
    protected long progDoc;
    protected int numProt;
    protected int annoProt;
    @XmlElement(required = true)
    protected String regProt;
    protected boolean allegati;

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
     * Gets the value of the allegati property.
     * 
     */
    public boolean isAllegati() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     */
    public void setAllegati(boolean value) {
        this.allegati = value;
    }

}
