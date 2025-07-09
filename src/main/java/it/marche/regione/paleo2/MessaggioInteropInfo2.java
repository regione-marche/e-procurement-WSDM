
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.regionemarche_protocollo2_common.TipoMessaggioInterop;
import org.datacontract.schemas._2004._07.regionemarche_protocollo2_common.TipoStatoSpedizione;


/**
 * <p>Java class for MessaggioInteropInfo2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessaggioInteropInfo2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataOraInvioRicezione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Direzione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPeo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MessaggiPosta" type="{http://paleo.regione.marche.it/services/}ArrayOfMessaggioPostaInfo2" minOccurs="0"/>
 *         &lt;element name="StatoSpedizione" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.TipiInterop}TipoStatoSpedizione" minOccurs="0"/>
 *         &lt;element name="Tipo" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.TipiInterop}TipoMessaggioInterop" minOccurs="0"/>
 *         &lt;element name="Versione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessaggioInteropInfo2", namespace = "http://paleo.regione.marche.it/services/", propOrder = {
    "dataOraInvioRicezione",
    "direzione",
    "isPeo",
    "messaggiPosta",
    "statoSpedizione",
    "tipo",
    "versione"
})
public class MessaggioInteropInfo2 {

    @XmlElement(name = "DataOraInvioRicezione")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOraInvioRicezione;
    @XmlElement(name = "Direzione", nillable = true)
    protected String direzione;
    @XmlElement(name = "IsPeo", nillable = true)
    protected Boolean isPeo;
    @XmlElement(name = "MessaggiPosta", nillable = true)
    protected ArrayOfMessaggioPostaInfo2 messaggiPosta;
    @XmlElement(name = "StatoSpedizione", nillable = true)
    protected TipoStatoSpedizione statoSpedizione;
    @XmlElement(name = "Tipo")
    protected TipoMessaggioInterop tipo;
    @XmlElement(name = "Versione", nillable = true)
    protected String versione;

    /**
     * Gets the value of the dataOraInvioRicezione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOraInvioRicezione() {
        return dataOraInvioRicezione;
    }

    /**
     * Sets the value of the dataOraInvioRicezione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOraInvioRicezione(XMLGregorianCalendar value) {
        this.dataOraInvioRicezione = value;
    }

    /**
     * Gets the value of the direzione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirezione() {
        return direzione;
    }

    /**
     * Sets the value of the direzione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirezione(String value) {
        this.direzione = value;
    }

    /**
     * Gets the value of the isPeo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPeo() {
        return isPeo;
    }

    /**
     * Sets the value of the isPeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPeo(Boolean value) {
        this.isPeo = value;
    }

    /**
     * Gets the value of the messaggiPosta property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessaggioPostaInfo2 }
     *     
     */
    public ArrayOfMessaggioPostaInfo2 getMessaggiPosta() {
        return messaggiPosta;
    }

    /**
     * Sets the value of the messaggiPosta property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessaggioPostaInfo2 }
     *     
     */
    public void setMessaggiPosta(ArrayOfMessaggioPostaInfo2 value) {
        this.messaggiPosta = value;
    }

    /**
     * Gets the value of the statoSpedizione property.
     * 
     * @return
     *     possible object is
     *     {@link TipoStatoSpedizione }
     *     
     */
    public TipoStatoSpedizione getStatoSpedizione() {
        return statoSpedizione;
    }

    /**
     * Sets the value of the statoSpedizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoStatoSpedizione }
     *     
     */
    public void setStatoSpedizione(TipoStatoSpedizione value) {
        this.statoSpedizione = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoMessaggioInterop }
     *     
     */
    public TipoMessaggioInterop getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMessaggioInterop }
     *     
     */
    public void setTipo(TipoMessaggioInterop value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the versione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersione() {
        return versione;
    }

    /**
     * Sets the value of the versione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersione(String value) {
        this.versione = value;
    }

}
