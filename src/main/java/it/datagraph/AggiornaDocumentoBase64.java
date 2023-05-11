
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
 *         &lt;element name="idDoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nomeDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idDoc",
    "nomeDoc",
    "descDoc",
    "strDST",
    "allegatoBase64"
})
@XmlRootElement(name = "AggiornaDocumentoBase64")
public class AggiornaDocumentoBase64 {

    @XmlElement(name = "AnnoReg")
    protected int annoReg;
    @XmlElement(name = "NumeroReg")
    protected int numeroReg;
    protected int idDoc;
    protected String nomeDoc;
    @XmlElement(name = "DescDoc")
    protected String descDoc;
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
     * Gets the value of the idDoc property.
     * 
     */
    public int getIdDoc() {
        return idDoc;
    }

    /**
     * Sets the value of the idDoc property.
     * 
     */
    public void setIdDoc(int value) {
        this.idDoc = value;
    }

    /**
     * Gets the value of the nomeDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeDoc() {
        return nomeDoc;
    }

    /**
     * Sets the value of the nomeDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeDoc(String value) {
        this.nomeDoc = value;
    }

    /**
     * Gets the value of the descDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescDoc() {
        return descDoc;
    }

    /**
     * Sets the value of the descDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescDoc(String value) {
        this.descDoc = value;
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
