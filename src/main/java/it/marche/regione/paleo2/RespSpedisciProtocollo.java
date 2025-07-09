
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respSpedisciProtocollo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respSpedisciProtocollo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Destinatari" type="{http://paleo.regione.marche.it/services2/}ArrayOfDestinatarioInfoInterop" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respSpedisciProtocollo", propOrder = {
    "destinatari"
})
public class RespSpedisciProtocollo {

    @XmlElement(name = "Destinatari", nillable = true)
    protected ArrayOfDestinatarioInfoInterop destinatari;

    /**
     * Gets the value of the destinatari property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDestinatarioInfoInterop }
     *     
     */
    public ArrayOfDestinatarioInfoInterop getDestinatari() {
        return destinatari;
    }

    /**
     * Sets the value of the destinatari property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDestinatarioInfoInterop }
     *     
     */
    public void setDestinatari(ArrayOfDestinatarioInfoInterop value) {
        this.destinatari = value;
    }

}
