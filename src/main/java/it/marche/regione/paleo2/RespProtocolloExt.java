
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.regionemarche_protocollo2_common.TipoStatoProtocollo;


/**
 * <p>Java class for respProtocolloExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respProtocolloExt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services2/}RespDocumentoExt">
 *       &lt;sequence>
 *         &lt;element name="Annullato" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataProtocollazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Registro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Segnatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stato" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi}TipoStatoProtocollo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respProtocolloExt", propOrder = {
    "annullato",
    "data",
    "dataProtocollazione",
    "numero",
    "registro",
    "segnatura",
    "stato"
})
@XmlSeeAlso({
    RespProtocolloPartenzaExt.class,
    RespProtocolloArrivoExt.class
})
public class RespProtocolloExt
    extends RespDocumentoExt
{

    @XmlElement(name = "Annullato")
    protected Boolean annullato;
    @XmlElement(name = "Data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "DataProtocollazione")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataProtocollazione;
    @XmlElement(name = "Numero", nillable = true)
    protected Integer numero;
    @XmlElement(name = "Registro", nillable = true)
    protected String registro;
    @XmlElement(name = "Segnatura", nillable = true)
    protected String segnatura;
    @XmlElement(name = "Stato")
    protected TipoStatoProtocollo stato;

    /**
     * Gets the value of the annullato property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnnullato() {
        return annullato;
    }

    /**
     * Sets the value of the annullato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnnullato(Boolean value) {
        this.annullato = value;
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
     * Gets the value of the dataProtocollazione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProtocollazione() {
        return dataProtocollazione;
    }

    /**
     * Sets the value of the dataProtocollazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProtocollazione(XMLGregorianCalendar value) {
        this.dataProtocollazione = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumero(Integer value) {
        this.numero = value;
    }

    /**
     * Gets the value of the registro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistro() {
        return registro;
    }

    /**
     * Sets the value of the registro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistro(String value) {
        this.registro = value;
    }

    /**
     * Gets the value of the segnatura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegnatura() {
        return segnatura;
    }

    /**
     * Sets the value of the segnatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegnatura(String value) {
        this.segnatura = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link TipoStatoProtocollo }
     *     
     */
    public TipoStatoProtocollo getStato() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoStatoProtocollo }
     *     
     */
    public void setStato(TipoStatoProtocollo value) {
        this.stato = value;
    }

}
