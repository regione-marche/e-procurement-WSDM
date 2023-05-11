
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImpegnoOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImpegnoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnnoImpegno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumeroImpegno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CapitoloImpegno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArticoloImpegno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodSiopeImpegno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImportoImpegno" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SoggettoImpegno" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpegnoOut", propOrder = {
    "annoImpegno",
    "numeroImpegno",
    "capitoloImpegno",
    "articoloImpegno",
    "codSiopeImpegno",
    "importoImpegno",
    "soggettoImpegno"
})
public class ImpegnoOut {

    @XmlElement(name = "AnnoImpegno")
    protected int annoImpegno;
    @XmlElement(name = "NumeroImpegno", nillable = true)
    protected String numeroImpegno;
    @XmlElement(name = "CapitoloImpegno", nillable = true)
    protected String capitoloImpegno;
    @XmlElement(name = "ArticoloImpegno", nillable = true)
    protected String articoloImpegno;
    @XmlElement(name = "CodSiopeImpegno", nillable = true)
    protected String codSiopeImpegno;
    @XmlElement(name = "ImportoImpegno")
    protected double importoImpegno;
    @XmlElement(name = "SoggettoImpegno")
    protected double soggettoImpegno;

    /**
     * Gets the value of the annoImpegno property.
     * 
     */
    public int getAnnoImpegno() {
        return annoImpegno;
    }

    /**
     * Sets the value of the annoImpegno property.
     * 
     */
    public void setAnnoImpegno(int value) {
        this.annoImpegno = value;
    }

    /**
     * Gets the value of the numeroImpegno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroImpegno() {
        return numeroImpegno;
    }

    /**
     * Sets the value of the numeroImpegno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroImpegno(String value) {
        this.numeroImpegno = value;
    }

    /**
     * Gets the value of the capitoloImpegno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitoloImpegno() {
        return capitoloImpegno;
    }

    /**
     * Sets the value of the capitoloImpegno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitoloImpegno(String value) {
        this.capitoloImpegno = value;
    }

    /**
     * Gets the value of the articoloImpegno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticoloImpegno() {
        return articoloImpegno;
    }

    /**
     * Sets the value of the articoloImpegno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticoloImpegno(String value) {
        this.articoloImpegno = value;
    }

    /**
     * Gets the value of the codSiopeImpegno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSiopeImpegno() {
        return codSiopeImpegno;
    }

    /**
     * Sets the value of the codSiopeImpegno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSiopeImpegno(String value) {
        this.codSiopeImpegno = value;
    }

    /**
     * Gets the value of the importoImpegno property.
     * 
     */
    public double getImportoImpegno() {
        return importoImpegno;
    }

    /**
     * Sets the value of the importoImpegno property.
     * 
     */
    public void setImportoImpegno(double value) {
        this.importoImpegno = value;
    }

    /**
     * Gets the value of the soggettoImpegno property.
     * 
     */
    public double getSoggettoImpegno() {
        return soggettoImpegno;
    }

    /**
     * Sets the value of the soggettoImpegno property.
     * 
     */
    public void setSoggettoImpegno(double value) {
        this.soggettoImpegno = value;
    }

}
