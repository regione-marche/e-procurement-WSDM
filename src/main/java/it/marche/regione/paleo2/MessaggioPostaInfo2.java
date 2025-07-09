
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.regionemarche_protocollo2_common.TipoDirezioneMessaggio;


/**
 * <p>Java class for MessaggioPostaInfo2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessaggioPostaInfo2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataOra" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Direzione" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.TipiInterop}TipoDirezioneMessaggio" minOccurs="0"/>
 *         &lt;element name="IdCasellaPosta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndirizzoCasella" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessaggioPostaInfo2", namespace = "http://paleo.regione.marche.it/services/", propOrder = {
    "dataOra",
    "direzione",
    "idCasellaPosta",
    "indirizzoCasella",
    "messageId",
    "subject"
})
public class MessaggioPostaInfo2 {

    @XmlElement(name = "DataOra")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOra;
    @XmlElement(name = "Direzione")
    protected TipoDirezioneMessaggio direzione;
    @XmlElement(name = "IdCasellaPosta")
    protected Integer idCasellaPosta;
    @XmlElement(name = "IndirizzoCasella", nillable = true)
    protected String indirizzoCasella;
    @XmlElement(name = "MessageId", nillable = true)
    protected String messageId;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;

    /**
     * Gets the value of the dataOra property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOra() {
        return dataOra;
    }

    /**
     * Sets the value of the dataOra property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOra(XMLGregorianCalendar value) {
        this.dataOra = value;
    }

    /**
     * Gets the value of the direzione property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDirezioneMessaggio }
     *     
     */
    public TipoDirezioneMessaggio getDirezione() {
        return direzione;
    }

    /**
     * Sets the value of the direzione property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDirezioneMessaggio }
     *     
     */
    public void setDirezione(TipoDirezioneMessaggio value) {
        this.direzione = value;
    }

    /**
     * Gets the value of the idCasellaPosta property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCasellaPosta() {
        return idCasellaPosta;
    }

    /**
     * Sets the value of the idCasellaPosta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCasellaPosta(Integer value) {
        this.idCasellaPosta = value;
    }

    /**
     * Gets the value of the indirizzoCasella property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzoCasella() {
        return indirizzoCasella;
    }

    /**
     * Sets the value of the indirizzoCasella property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzoCasella(String value) {
        this.indirizzoCasella = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

}
