
package it.dedagroup.ws.protocolla.response.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import it.dedagroup.ws.protocolla.om.xsd.Esito;


/**
 * <p>Java class for Risposta_RestituisciProtocollo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Risposta_RestituisciProtocollo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataProtocollo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="esito" type="{http://om.protocollo.ws.dedagroup.it/xsd}Esito" minOccurs="0"/>
 *         &lt;element name="numProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Risposta_RestituisciProtocollo", propOrder = {
    "dataProtocollo",
    "esito",
    "numProtocollo"
})
@XmlSeeAlso({
    RispostaProtocolla.class
})
public class RispostaRestituisciProtocollo {

    @XmlElementRef(name = "dataProtocollo", namespace = "http://response.protocollo.ws.dedagroup.it/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dataProtocollo;
    @XmlElementRef(name = "esito", namespace = "http://response.protocollo.ws.dedagroup.it/xsd", type = JAXBElement.class)
    protected JAXBElement<Esito> esito;
    @XmlElementRef(name = "numProtocollo", namespace = "http://response.protocollo.ws.dedagroup.it/xsd", type = JAXBElement.class)
    protected JAXBElement<String> numProtocollo;

    /**
     * Gets the value of the dataProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataProtocollo() {
        return dataProtocollo;
    }

    /**
     * Sets the value of the dataProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataProtocollo(JAXBElement<XMLGregorianCalendar> value) {
        this.dataProtocollo = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the esito property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Esito }{@code >}
     *     
     */
    public JAXBElement<Esito> getEsito() {
        return esito;
    }

    /**
     * Sets the value of the esito property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Esito }{@code >}
     *     
     */
    public void setEsito(JAXBElement<Esito> value) {
        this.esito = ((JAXBElement<Esito> ) value);
    }

    /**
     * Gets the value of the numProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumProtocollo() {
        return numProtocollo;
    }

    /**
     * Sets the value of the numProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumProtocollo(JAXBElement<String> value) {
        this.numProtocollo = ((JAXBElement<String> ) value);
    }

}
