//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.22 at 04:44:12 PM CET 
//


package it.prisma.getdocumenti.p;

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
 *         &lt;element name="DATA_DAL" type="{}DateType"/>
 *         &lt;element name="DATA_AL" type="{}DateType"/>
 *         &lt;element name="ANNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMERO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPO_REGISTRO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLASS_COD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FASCICOLO_ANNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FASCICOLO_NUMERO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MODALITA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="INT|PAR|ARR"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UTENTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "datadal",
    "dataal",
    "anno",
    "numero",
    "tiporegistro",
    "classcod",
    "fascicoloanno",
    "fascicolonumero",
    "modalita",
    "utente"
})
@XmlRootElement(name = "ROOT")
public class ROOT {

    @XmlElement(name = "DATA_DAL", required = true)
    protected String datadal;
    @XmlElement(name = "DATA_AL", required = true)
    protected String dataal;
    @XmlElement(name = "ANNO")
    protected String anno;
    @XmlElement(name = "NUMERO")
    protected String numero;
    @XmlElement(name = "TIPO_REGISTRO")
    protected String tiporegistro;
    @XmlElement(name = "CLASS_COD")
    protected String classcod;
    @XmlElement(name = "FASCICOLO_ANNO")
    protected String fascicoloanno;
    @XmlElement(name = "FASCICOLO_NUMERO")
    protected String fascicolonumero;
    @XmlElement(name = "MODALITA")
    protected String modalita;
    @XmlElement(name = "UTENTE")
    protected String utente;

    /**
     * Gets the value of the datadal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATADAL() {
        return datadal;
    }

    /**
     * Sets the value of the datadal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATADAL(String value) {
        this.datadal = value;
    }

    /**
     * Gets the value of the dataal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAAL() {
        return dataal;
    }

    /**
     * Sets the value of the dataal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAAL(String value) {
        this.dataal = value;
    }

    /**
     * Gets the value of the anno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANNO() {
        return anno;
    }

    /**
     * Sets the value of the anno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANNO(String value) {
        this.anno = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERO() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERO(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the tiporegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOREGISTRO() {
        return tiporegistro;
    }

    /**
     * Sets the value of the tiporegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOREGISTRO(String value) {
        this.tiporegistro = value;
    }

    /**
     * Gets the value of the classcod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSCOD() {
        return classcod;
    }

    /**
     * Sets the value of the classcod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSCOD(String value) {
        this.classcod = value;
    }

    /**
     * Gets the value of the fascicoloanno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASCICOLOANNO() {
        return fascicoloanno;
    }

    /**
     * Sets the value of the fascicoloanno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASCICOLOANNO(String value) {
        this.fascicoloanno = value;
    }

    /**
     * Gets the value of the fascicolonumero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASCICOLONUMERO() {
        return fascicolonumero;
    }

    /**
     * Sets the value of the fascicolonumero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASCICOLONUMERO(String value) {
        this.fascicolonumero = value;
    }

    /**
     * Gets the value of the modalita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODALITA() {
        return modalita;
    }

    /**
     * Sets the value of the modalita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODALITA(String value) {
        this.modalita = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTENTE() {
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
    public void setUTENTE(String value) {
        this.utente = value;
    }

}
