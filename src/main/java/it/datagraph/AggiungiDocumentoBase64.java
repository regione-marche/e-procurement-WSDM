
package it.datagraph;

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
 *         &lt;element name="AnnoReg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumeroReg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NomeFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllegatoBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "annoReg",
    "numeroReg",
    "nomeFile",
    "descrizione",
    "strDST",
    "allegatoBase64"
})
@XmlRootElement(name = "AggiungiDocumentoBase64")
public class AggiungiDocumentoBase64 {

    @XmlElement(name = "AnnoReg")
    protected int annoReg;
    @XmlElement(name = "NumeroReg")
    protected int numeroReg;
    @XmlElement(name = "NomeFile")
    protected String nomeFile;
    @XmlElement(name = "Descrizione")
    protected String descrizione;
    protected String strDST;
    @XmlElement(name = "AllegatoBase64")
    protected String allegatoBase64;

    /**
     * Gets the value of the annoReg property.
     * 
     */
    public int getAnnoReg() {
        return annoReg;
    }

    /**
     * Sets the value of the annoReg property.
     * 
     */
    public void setAnnoReg(int value) {
        this.annoReg = value;
    }

    /**
     * Gets the value of the numeroReg property.
     * 
     */
    public int getNumeroReg() {
        return numeroReg;
    }

    /**
     * Sets the value of the numeroReg property.
     * 
     */
    public void setNumeroReg(int value) {
        this.numeroReg = value;
    }

    /**
     * Gets the value of the nomeFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFile() {
        return nomeFile;
    }

    /**
     * Sets the value of the nomeFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFile(String value) {
        this.nomeFile = value;
    }

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the strDST property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDST() {
        return strDST;
    }

    /**
     * Sets the value of the strDST property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDST(String value) {
        this.strDST = value;
    }

    /**
     * Gets the value of the allegatoBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllegatoBase64() {
        return allegatoBase64;
    }

    /**
     * Sets the value of the allegatoBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllegatoBase64(String value) {
        this.allegatoBase64 = value;
    }

}
