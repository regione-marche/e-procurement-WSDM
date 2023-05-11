
package it.marche.regione.paleo;

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
 *     &lt;extension base="{http://paleo.regione.marche.it/services/}BEBase">
 *       &lt;sequence>
 *         &lt;element name="Destinatari" type="{http://paleo.regione.marche.it/services/}ArrayOfDestinatarioInfoInterop" minOccurs="0"/>
 *         &lt;element name="DestinatariCC" type="{http://paleo.regione.marche.it/services/}ArrayOfDestinatarioInfoInterop" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respSpedisciProtocollo", propOrder = {
    "destinatari",
    "destinatariCC"
})
public class RespSpedisciProtocollo
    extends BEBase
{

    @XmlElement(name = "Destinatari", nillable = true)
    protected ArrayOfDestinatarioInfoInterop destinatari;
    @XmlElement(name = "DestinatariCC", nillable = true)
    protected ArrayOfDestinatarioInfoInterop destinatariCC;

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

    /**
     * Gets the value of the destinatariCC property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDestinatarioInfoInterop }
     *     
     */
    public ArrayOfDestinatarioInfoInterop getDestinatariCC() {
        return destinatariCC;
    }

    /**
     * Sets the value of the destinatariCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDestinatarioInfoInterop }
     *     
     */
    public void setDestinatariCC(ArrayOfDestinatarioInfoInterop value) {
        this.destinatariCC = value;
    }

}
