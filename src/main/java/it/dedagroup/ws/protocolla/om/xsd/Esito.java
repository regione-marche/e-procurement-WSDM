
package it.dedagroup.ws.protocolla.om.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Esito complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Esito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errore" type="{http://om.protocollo.ws.dedagroup.it/xsd}Errore" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Esito", propOrder = {
    "codice",
    "descrizione",
    "errore"
})
public class Esito {

    @XmlElementRef(name = "codice", namespace = "http://om.protocollo.ws.dedagroup.it/xsd", type = JAXBElement.class)
    protected JAXBElement<String> codice;
    @XmlElementRef(name = "descrizione", namespace = "http://om.protocollo.ws.dedagroup.it/xsd", type = JAXBElement.class)
    protected JAXBElement<String> descrizione;
    @XmlElementRef(name = "errore", namespace = "http://om.protocollo.ws.dedagroup.it/xsd", type = JAXBElement.class)
    protected JAXBElement<Errore> errore;

    /**
     * Gets the value of the codice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodice() {
        return codice;
    }

    /**
     * Sets the value of the codice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodice(JAXBElement<String> value) {
        this.codice = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescrizione(JAXBElement<String> value) {
        this.descrizione = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the errore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Errore }{@code >}
     *     
     */
    public JAXBElement<Errore> getErrore() {
        return errore;
    }

    /**
     * Sets the value of the errore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Errore }{@code >}
     *     
     */
    public void setErrore(JAXBElement<Errore> value) {
        this.errore = ((JAXBElement<Errore> ) value);
    }

}
