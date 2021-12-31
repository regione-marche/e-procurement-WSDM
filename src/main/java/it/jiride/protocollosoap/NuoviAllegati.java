
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NuoviAllegati complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NuoviAllegati">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annoProt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numProt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Allegati" type="{http://tempuri.org/}ArrayOfAllegatoIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NuoviAllegati", propOrder = {
    "idDoc",
    "annoProt",
    "numProt",
    "utente",
    "ruolo",
    "allegati"
})
public class NuoviAllegati {

    protected String idDoc;
    protected String annoProt;
    protected String numProt;
    protected String utente;
    protected String ruolo;
    @XmlElement(name = "Allegati", nillable = true)
    protected ArrayOfAllegatoIn allegati;

    /**
     * Gets the value of the idDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDoc() {
        return idDoc;
    }

    /**
     * Sets the value of the idDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDoc(String value) {
        this.idDoc = value;
    }

    /**
     * Gets the value of the annoProt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoProt() {
        return annoProt;
    }

    /**
     * Sets the value of the annoProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoProt(String value) {
        this.annoProt = value;
    }

    /**
     * Gets the value of the numProt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumProt() {
        return numProt;
    }

    /**
     * Sets the value of the numProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumProt(String value) {
        this.numProt = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtente() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtente(String value) {
        this.utente = value;
    }

    /**
     * Gets the value of the ruolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuolo() {
        return ruolo;
    }

    /**
     * Sets the value of the ruolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuolo(String value) {
        this.ruolo = value;
    }

    /**
     * Gets the value of the allegati property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllegatoIn }
     *     
     */
    public ArrayOfAllegatoIn getAllegati() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllegatoIn }
     *     
     */
    public void setAllegati(ArrayOfAllegatoIn value) {
        this.allegati = value;
    }

}
