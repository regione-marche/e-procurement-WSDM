
package it.iride.wsprotocollodm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CentriDiCostoOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentriDiCostoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Voce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CdC_provento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Propon_ammor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Importo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentriDiCostoOut", propOrder = {
    "tipo",
    "voce",
    "cdCProvento",
    "proponAmmor",
    "importo"
})
public class CentriDiCostoOut {

    @XmlElement(name = "Tipo")
    protected String tipo;
    @XmlElement(name = "Voce")
    protected String voce;
    @XmlElement(name = "CdC_provento")
    protected String cdCProvento;
    @XmlElement(name = "Propon_ammor")
    protected String proponAmmor;
    @XmlElement(name = "Importo")
    protected double importo;

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the voce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoce() {
        return voce;
    }

    /**
     * Sets the value of the voce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoce(String value) {
        this.voce = value;
    }

    /**
     * Gets the value of the cdCProvento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCProvento() {
        return cdCProvento;
    }

    /**
     * Sets the value of the cdCProvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCProvento(String value) {
        this.cdCProvento = value;
    }

    /**
     * Gets the value of the proponAmmor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProponAmmor() {
        return proponAmmor;
    }

    /**
     * Sets the value of the proponAmmor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProponAmmor(String value) {
        this.proponAmmor = value;
    }

    /**
     * Gets the value of the importo property.
     * 
     */
    public double getImporto() {
        return importo;
    }

    /**
     * Sets the value of the importo property.
     * 
     */
    public void setImporto(double value) {
        this.importo = value;
    }

}
