
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
 *         &lt;element name="Anno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NuovoFascicolo" type="{http://tempuri.org/}FascicoloNet" minOccurs="0"/>
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
    "anno",
    "numero",
    "nuovoFascicolo",
    "strDST"
})
@XmlRootElement(name = "ModificaFascicoloRegistrazione")
public class ModificaFascicoloRegistrazione {

    @XmlElement(name = "Anno")
    protected int anno;
    @XmlElement(name = "Numero")
    protected int numero;
    @XmlElement(name = "NuovoFascicolo")
    protected FascicoloNet nuovoFascicolo;
    protected String strDST;

    /**
     * Gets the value of the anno property.
     * 
     */
    public int getAnno() {
        return anno;
    }

    /**
     * Sets the value of the anno property.
     * 
     */
    public void setAnno(int value) {
        this.anno = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Gets the value of the nuovoFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloNet }
     *     
     */
    public FascicoloNet getNuovoFascicolo() {
        return nuovoFascicolo;
    }

    /**
     * Sets the value of the nuovoFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloNet }
     *     
     */
    public void setNuovoFascicolo(FascicoloNet value) {
        this.nuovoFascicolo = value;
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
