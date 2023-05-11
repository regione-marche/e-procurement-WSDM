
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
 *         &lt;element ref="{}DescDoc" minOccurs="0"/>
 *         &lt;element name="strDST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "descDoc",
    "strDST"
})
@XmlRootElement(name = "AggiornaDocumento")
public class AggiornaDocumento {

    @XmlElement(name = "AnnoReg")
    protected int annoReg;
    @XmlElement(name = "NumeroReg")
    protected int numeroReg;
    @XmlElement(name = "DescDoc", namespace = "")
    protected Documento descDoc;
    protected String strDST;

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
     * Gets the value of the descDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Documento }
     *     
     */
    public Documento getDescDoc() {
        return descDoc;
    }

    /**
     * Sets the value of the descDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documento }
     *     
     */
    public void setDescDoc(Documento value) {
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

}
