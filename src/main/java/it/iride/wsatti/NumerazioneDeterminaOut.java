
package it.iride.wsatti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NumerazioneDeterminaOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumerazioneDeterminaOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Trattamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trattamento_Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dirigente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dirigente_Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Anno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Messaggio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Errore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumerazioneDeterminaOut", propOrder = {
    "idDocumento",
    "trattamento",
    "trattamentoDescrizione",
    "dirigente",
    "dirigenteDescrizione",
    "data",
    "anno",
    "numero",
    "messaggio",
    "errore"
})
public class NumerazioneDeterminaOut {

    @XmlElement(name = "IdDocumento")
    protected int idDocumento;
    @XmlElement(name = "Trattamento")
    protected String trattamento;
    @XmlElement(name = "Trattamento_Descrizione")
    protected String trattamentoDescrizione;
    @XmlElement(name = "Dirigente")
    protected String dirigente;
    @XmlElement(name = "Dirigente_Descrizione")
    protected String dirigenteDescrizione;
    @XmlElement(name = "Data", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "Anno")
    protected int anno;
    @XmlElement(name = "Numero")
    protected int numero;
    @XmlElement(name = "Messaggio")
    protected String messaggio;
    @XmlElement(name = "Errore")
    protected String errore;

    /**
     * Gets the value of the idDocumento property.
     * 
     */
    public int getIdDocumento() {
        return idDocumento;
    }

    /**
     * Sets the value of the idDocumento property.
     * 
     */
    public void setIdDocumento(int value) {
        this.idDocumento = value;
    }

    /**
     * Gets the value of the trattamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrattamento() {
        return trattamento;
    }

    /**
     * Sets the value of the trattamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrattamento(String value) {
        this.trattamento = value;
    }

    /**
     * Gets the value of the trattamentoDescrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrattamentoDescrizione() {
        return trattamentoDescrizione;
    }

    /**
     * Sets the value of the trattamentoDescrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrattamentoDescrizione(String value) {
        this.trattamentoDescrizione = value;
    }

    /**
     * Gets the value of the dirigente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirigente() {
        return dirigente;
    }

    /**
     * Sets the value of the dirigente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirigente(String value) {
        this.dirigente = value;
    }

    /**
     * Gets the value of the dirigenteDescrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirigenteDescrizione() {
        return dirigenteDescrizione;
    }

    /**
     * Sets the value of the dirigenteDescrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirigenteDescrizione(String value) {
        this.dirigenteDescrizione = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
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
     * Gets the value of the messaggio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessaggio() {
        return messaggio;
    }

    /**
     * Sets the value of the messaggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessaggio(String value) {
        this.messaggio = value;
    }

    /**
     * Gets the value of the errore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrore() {
        return errore;
    }

    /**
     * Sets the value of the errore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrore(String value) {
        this.errore = value;
    }

}
