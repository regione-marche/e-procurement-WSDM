
package it.datagraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="DataIniNot" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GiorniScadenza" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TipoAtto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "dataIniNot",
    "giorniScadenza",
    "tipoAtto",
    "strDST"
})
@XmlRootElement(name = "RichiediNotifica")
public class RichiediNotifica {

    @XmlElement(name = "Anno")
    protected int anno;
    @XmlElement(name = "Numero")
    protected int numero;
    @XmlElement(name = "DataIniNot", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataIniNot;
    @XmlElement(name = "GiorniScadenza")
    protected int giorniScadenza;
    @XmlElement(name = "TipoAtto")
    protected String tipoAtto;
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
     * Gets the value of the dataIniNot property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataIniNot() {
        return dataIniNot;
    }

    /**
     * Sets the value of the dataIniNot property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataIniNot(XMLGregorianCalendar value) {
        this.dataIniNot = value;
    }

    /**
     * Gets the value of the giorniScadenza property.
     * 
     */
    public int getGiorniScadenza() {
        return giorniScadenza;
    }

    /**
     * Sets the value of the giorniScadenza property.
     * 
     */
    public void setGiorniScadenza(int value) {
        this.giorniScadenza = value;
    }

    /**
     * Gets the value of the tipoAtto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAtto() {
        return tipoAtto;
    }

    /**
     * Sets the value of the tipoAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAtto(String value) {
        this.tipoAtto = value;
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
