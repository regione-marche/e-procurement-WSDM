
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrasmissioneInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrasmissioneInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataInvio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InvioOriginaleCartaceo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NoteGenerali" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatoreMittente" type="{http://paleo.regione.marche.it/services2/}OperatorePaleo" minOccurs="0"/>
 *         &lt;element name="TrasmissioniRuolo" type="{http://paleo.regione.marche.it/services2/}ArrayOfTrasmissioneRuoloInfo" minOccurs="0"/>
 *         &lt;element name="TrasmissioniUtente" type="{http://paleo.regione.marche.it/services2/}ArrayOfTrasmissioneUtenteInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrasmissioneInfo", propOrder = {
    "dataInvio",
    "invioOriginaleCartaceo",
    "noteGenerali",
    "operatoreMittente",
    "trasmissioniRuolo",
    "trasmissioniUtente"
})
public class TrasmissioneInfo {

    @XmlElement(name = "DataInvio")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInvio;
    @XmlElement(name = "InvioOriginaleCartaceo")
    protected Boolean invioOriginaleCartaceo;
    @XmlElement(name = "NoteGenerali", nillable = true)
    protected String noteGenerali;
    @XmlElement(name = "OperatoreMittente", nillable = true)
    protected OperatorePaleo operatoreMittente;
    @XmlElement(name = "TrasmissioniRuolo", nillable = true)
    protected ArrayOfTrasmissioneRuoloInfo trasmissioniRuolo;
    @XmlElement(name = "TrasmissioniUtente", nillable = true)
    protected ArrayOfTrasmissioneUtenteInfo trasmissioniUtente;

    /**
     * Gets the value of the dataInvio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInvio() {
        return dataInvio;
    }

    /**
     * Sets the value of the dataInvio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInvio(XMLGregorianCalendar value) {
        this.dataInvio = value;
    }

    /**
     * Gets the value of the invioOriginaleCartaceo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvioOriginaleCartaceo() {
        return invioOriginaleCartaceo;
    }

    /**
     * Sets the value of the invioOriginaleCartaceo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvioOriginaleCartaceo(Boolean value) {
        this.invioOriginaleCartaceo = value;
    }

    /**
     * Gets the value of the noteGenerali property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteGenerali() {
        return noteGenerali;
    }

    /**
     * Sets the value of the noteGenerali property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteGenerali(String value) {
        this.noteGenerali = value;
    }

    /**
     * Gets the value of the operatoreMittente property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorePaleo }
     *     
     */
    public OperatorePaleo getOperatoreMittente() {
        return operatoreMittente;
    }

    /**
     * Sets the value of the operatoreMittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorePaleo }
     *     
     */
    public void setOperatoreMittente(OperatorePaleo value) {
        this.operatoreMittente = value;
    }

    /**
     * Gets the value of the trasmissioniRuolo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrasmissioneRuoloInfo }
     *     
     */
    public ArrayOfTrasmissioneRuoloInfo getTrasmissioniRuolo() {
        return trasmissioniRuolo;
    }

    /**
     * Sets the value of the trasmissioniRuolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrasmissioneRuoloInfo }
     *     
     */
    public void setTrasmissioniRuolo(ArrayOfTrasmissioneRuoloInfo value) {
        this.trasmissioniRuolo = value;
    }

    /**
     * Gets the value of the trasmissioniUtente property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrasmissioneUtenteInfo }
     *     
     */
    public ArrayOfTrasmissioneUtenteInfo getTrasmissioniUtente() {
        return trasmissioniUtente;
    }

    /**
     * Sets the value of the trasmissioniUtente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrasmissioneUtenteInfo }
     *     
     */
    public void setTrasmissioniUtente(ArrayOfTrasmissioneUtenteInfo value) {
        this.trasmissioniUtente = value;
    }

}
