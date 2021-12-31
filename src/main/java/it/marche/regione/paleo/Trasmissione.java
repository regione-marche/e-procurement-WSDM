
package it.marche.regione.paleo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Trasmissione complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Trasmissione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvioOriginaleCartaceo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NoteGenerali" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegueCartaceo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TrasmissioniRuolo" type="{http://paleo.regione.marche.it/services/}ArrayOfTrasmissioneRuolo" minOccurs="0"/>
 *         &lt;element name="TrasmissioniUtente" type="{http://paleo.regione.marche.it/services/}ArrayOfTrasmissioneUtente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trasmissione", propOrder = {
    "invioOriginaleCartaceo",
    "noteGenerali",
    "segueCartaceo",
    "trasmissioniRuolo",
    "trasmissioniUtente"
})
@XmlSeeAlso({
    TrasmissioneDoc.class
})
public class Trasmissione {

    @XmlElement(name = "InvioOriginaleCartaceo")
    protected Boolean invioOriginaleCartaceo;
    @XmlElement(name = "NoteGenerali", nillable = true)
    protected String noteGenerali;
    @XmlElement(name = "SegueCartaceo")
    protected boolean segueCartaceo;
    @XmlElement(name = "TrasmissioniRuolo", nillable = true)
    protected ArrayOfTrasmissioneRuolo trasmissioniRuolo;
    @XmlElement(name = "TrasmissioniUtente", nillable = true)
    protected ArrayOfTrasmissioneUtente trasmissioniUtente;

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
     * Gets the value of the segueCartaceo property.
     * 
     */
    public boolean isSegueCartaceo() {
        return segueCartaceo;
    }

    /**
     * Sets the value of the segueCartaceo property.
     * 
     */
    public void setSegueCartaceo(boolean value) {
        this.segueCartaceo = value;
    }

    /**
     * Gets the value of the trasmissioniRuolo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrasmissioneRuolo }
     *     
     */
    public ArrayOfTrasmissioneRuolo getTrasmissioniRuolo() {
        return trasmissioniRuolo;
    }

    /**
     * Sets the value of the trasmissioniRuolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrasmissioneRuolo }
     *     
     */
    public void setTrasmissioniRuolo(ArrayOfTrasmissioneRuolo value) {
        this.trasmissioniRuolo = value;
    }

    /**
     * Gets the value of the trasmissioniUtente property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrasmissioneUtente }
     *     
     */
    public ArrayOfTrasmissioneUtente getTrasmissioniUtente() {
        return trasmissioniUtente;
    }

    /**
     * Sets the value of the trasmissioniUtente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrasmissioneUtente }
     *     
     */
    public void setTrasmissioniUtente(ArrayOfTrasmissioneUtente value) {
        this.trasmissioniUtente = value;
    }

}
