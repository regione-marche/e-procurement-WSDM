
package it.iride.wsprotocollodm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampoUtente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampoUtente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NomeCampo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoCampo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValoreCampo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampoUtente", propOrder = {
    "nomeCampo",
    "tipoCampo",
    "valoreCampo"
})
public class CampoUtente {

    @XmlElement(name = "NomeCampo")
    protected String nomeCampo;
    @XmlElement(name = "TipoCampo")
    protected String tipoCampo;
    @XmlElement(name = "ValoreCampo")
    protected String valoreCampo;

    /**
     * Gets the value of the nomeCampo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCampo() {
        return nomeCampo;
    }

    /**
     * Sets the value of the nomeCampo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCampo(String value) {
        this.nomeCampo = value;
    }

    /**
     * Gets the value of the tipoCampo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCampo() {
        return tipoCampo;
    }

    /**
     * Sets the value of the tipoCampo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCampo(String value) {
        this.tipoCampo = value;
    }

    /**
     * Gets the value of the valoreCampo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValoreCampo() {
        return valoreCampo;
    }

    /**
     * Sets the value of the valoreCampo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValoreCampo(String value) {
        this.valoreCampo = value;
    }

}
