
package it.dedagroup.ws.spediscidocumento.servizi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.dedagroup.ws.spediscidocumento.response.xsd.RispostaSpedisciDocumento;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://response.protocollo.ws.dedagroup.it/xsd}Risposta_SpedisciDocumento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_return"
})
@XmlRootElement(name = "processResponse")
public class ProcessResponse {

    @XmlElementRef(name = "return", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<RispostaSpedisciDocumento> _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RispostaSpedisciDocumento }{@code >}
     *     
     */
    public JAXBElement<RispostaSpedisciDocumento> getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RispostaSpedisciDocumento }{@code >}
     *     
     */
    public void setReturn(JAXBElement<RispostaSpedisciDocumento> value) {
        this._return = ((JAXBElement<RispostaSpedisciDocumento> ) value);
    }

}
