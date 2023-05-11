
package it.datagraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FascicoloNet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FascicoloNet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Titolario" type="{http://tempuri.org/}VoceTitolario" minOccurs="0"/>
 *         &lt;element name="Anno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SottoFasc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataApertura" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FascicoloNet", propOrder = {
    "titolario",
    "anno",
    "numero",
    "sottoFasc",
    "descrizione",
    "uo",
    "dataApertura"
})
@XmlSeeAlso({
    FascicoloNetDettaglio.class
})
public class FascicoloNet {

    @XmlElement(name = "Titolario")
    protected VoceTitolario titolario;
    @XmlElement(name = "Anno")
    protected int anno;
    @XmlElement(name = "Numero")
    protected int numero;
    @XmlElement(name = "SottoFasc")
    protected int sottoFasc;
    @XmlElement(name = "Descrizione")
    protected String descrizione;
    @XmlElement(name = "UO")
    protected String uo;
    @XmlElement(name = "DataApertura", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataApertura;

    /**
     * Gets the value of the titolario property.
     * 
     * @return
     *     possible object is
     *     {@link VoceTitolario }
     *     
     */
    public VoceTitolario getTitolario() {
        return titolario;
    }

    /**
     * Sets the value of the titolario property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoceTitolario }
     *     
     */
    public void setTitolario(VoceTitolario value) {
        this.titolario = value;
    }

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
     * Gets the value of the sottoFasc property.
     * 
     */
    public int getSottoFasc() {
        return sottoFasc;
    }

    /**
     * Sets the value of the sottoFasc property.
     * 
     */
    public void setSottoFasc(int value) {
        this.sottoFasc = value;
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
     * Gets the value of the uo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUO() {
        return uo;
    }

    /**
     * Sets the value of the uo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUO(String value) {
        this.uo = value;
    }

    /**
     * Gets the value of the dataApertura property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataApertura() {
        return dataApertura;
    }

    /**
     * Sets the value of the dataApertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataApertura(XMLGregorianCalendar value) {
        this.dataApertura = value;
    }

}
