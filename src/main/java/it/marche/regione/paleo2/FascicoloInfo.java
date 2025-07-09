
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FascicoloInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FascicoloInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custode" type="{http://paleo.regione.marche.it/services2/}OperatorePaleo" minOccurs="0"/>
 *         &lt;element name="DataApertura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataChiusura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataCreazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Procedimento" type="{http://paleo.regione.marche.it/services2/}ProcedimentoAmministrativo" minOccurs="0"/>
 *         &lt;element name="Tipologia" type="{http://paleo.regione.marche.it/services2/}TipologiaFascicolo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FascicoloInfo", propOrder = {
    "codice",
    "custode",
    "dataApertura",
    "dataChiusura",
    "dataCreazione",
    "descrizione",
    "procedimento",
    "tipologia"
})
public class FascicoloInfo {

    @XmlElement(name = "Codice", nillable = true)
    protected String codice;
    @XmlElement(name = "Custode", nillable = true)
    protected OperatorePaleo custode;
    @XmlElement(name = "DataApertura", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataApertura;
    @XmlElement(name = "DataChiusura", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataChiusura;
    @XmlElement(name = "DataCreazione")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCreazione;
    @XmlElement(name = "Descrizione", nillable = true)
    protected String descrizione;
    @XmlElement(name = "Procedimento", nillable = true)
    protected ProcedimentoAmministrativo procedimento;
    @XmlElement(name = "Tipologia", nillable = true)
    protected TipologiaFascicolo tipologia;

    /**
     * Gets the value of the codice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodice() {
        return codice;
    }

    /**
     * Sets the value of the codice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodice(String value) {
        this.codice = value;
    }

    /**
     * Gets the value of the custode property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorePaleo }
     *     
     */
    public OperatorePaleo getCustode() {
        return custode;
    }

    /**
     * Sets the value of the custode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorePaleo }
     *     
     */
    public void setCustode(OperatorePaleo value) {
        this.custode = value;
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

    /**
     * Gets the value of the dataChiusura property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataChiusura() {
        return dataChiusura;
    }

    /**
     * Sets the value of the dataChiusura property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataChiusura(XMLGregorianCalendar value) {
        this.dataChiusura = value;
    }

    /**
     * Gets the value of the dataCreazione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCreazione() {
        return dataCreazione;
    }

    /**
     * Sets the value of the dataCreazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCreazione(XMLGregorianCalendar value) {
        this.dataCreazione = value;
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
     * Gets the value of the procedimento property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedimentoAmministrativo }
     *     
     */
    public ProcedimentoAmministrativo getProcedimento() {
        return procedimento;
    }

    /**
     * Sets the value of the procedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedimentoAmministrativo }
     *     
     */
    public void setProcedimento(ProcedimentoAmministrativo value) {
        this.procedimento = value;
    }

    /**
     * Gets the value of the tipologia property.
     * 
     * @return
     *     possible object is
     *     {@link TipologiaFascicolo }
     *     
     */
    public TipologiaFascicolo getTipologia() {
        return tipologia;
    }

    /**
     * Sets the value of the tipologia property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipologiaFascicolo }
     *     
     */
    public void setTipologia(TipologiaFascicolo value) {
        this.tipologia = value;
    }

}
