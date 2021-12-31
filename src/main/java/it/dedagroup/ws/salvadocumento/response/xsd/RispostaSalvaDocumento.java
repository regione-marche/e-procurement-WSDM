
package it.dedagroup.ws.salvadocumento.response.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import it.dedagroup.ws.salvadocumento.om.xsd.Esito;


/**
 * <p>Java class for Risposta_SalvaDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Risposta_SalvaDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esito" type="{http://om.protocollo.ws.dedagroup.it/xsd}Esito" minOccurs="0"/>
 *         &lt;element name="idDocumentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Risposta_SalvaDocumento", propOrder = {
    "esito",
    "idDocumentale"
})
public class RispostaSalvaDocumento {

    @XmlElementRef(name = "esito", namespace = "http://response.protocollo.ws.dedagroup.it/xsd", type = JAXBElement.class)
    protected JAXBElement<Esito> esito;
    @XmlElementRef(name = "idDocumentale", namespace = "http://response.protocollo.ws.dedagroup.it/xsd", type = JAXBElement.class)
    protected JAXBElement<String> idDocumentale;

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
     * Gets the value of the idDocumentale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdDocumentale() {
        return idDocumentale;
    }

    /**
     * Sets the value of the idDocumentale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdDocumentale(JAXBElement<String> value) {
        this.idDocumentale = ((JAXBElement<String> ) value);
    }

}
