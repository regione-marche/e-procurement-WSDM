
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respProtocolloPartenza complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respProtocolloPartenza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services2/}respProtocollo">
 *       &lt;sequence>
 *         &lt;element name="Destinatari" type="{http://paleo.regione.marche.it/services2/}ArrayOfDestinatarioInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respProtocolloPartenza", propOrder = {
    "destinatari"
})
public class RespProtocolloPartenza
    extends RespProtocollo
{

    @XmlElement(name = "Destinatari", nillable = true)
    protected ArrayOfDestinatarioInfo destinatari;

    /**
     * Gets the value of the destinatari property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDestinatarioInfo }
     *     
     */
    public ArrayOfDestinatarioInfo getDestinatari() {
        return destinatari;
    }

    /**
     * Sets the value of the destinatari property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDestinatarioInfo }
     *     
     */
    public void setDestinatari(ArrayOfDestinatarioInfo value) {
        this.destinatari = value;
    }

}
