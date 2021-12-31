
package it.marche.regione.paleowssec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqProtocolloPartenza complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reqProtocolloPartenza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services/}reqProtocollo">
 *       &lt;sequence>
 *         &lt;element name="Destinatari" type="{http://paleo.regione.marche.it/services/}ArrayOfCorrispondente"/>
 *         &lt;element name="DestinatariCC" type="{http://paleo.regione.marche.it/services/}ArrayOfCorrispondente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqProtocolloPartenza", propOrder = {
    "destinatari",
    "destinatariCC"
})
public class ReqProtocolloPartenza
    extends ReqProtocollo
{

    @XmlElement(name = "Destinatari", required = true, nillable = true)
    protected ArrayOfCorrispondente destinatari;
    @XmlElement(name = "DestinatariCC", nillable = true)
    protected ArrayOfCorrispondente destinatariCC;

    /**
     * Gets the value of the destinatari property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCorrispondente }
     *     
     */
    public ArrayOfCorrispondente getDestinatari() {
        return destinatari;
    }

    /**
     * Sets the value of the destinatari property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCorrispondente }
     *     
     */
    public void setDestinatari(ArrayOfCorrispondente value) {
        this.destinatari = value;
    }

    /**
     * Gets the value of the destinatariCC property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCorrispondente }
     *     
     */
    public ArrayOfCorrispondente getDestinatariCC() {
        return destinatariCC;
    }

    /**
     * Sets the value of the destinatariCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCorrispondente }
     *     
     */
    public void setDestinatariCC(ArrayOfCorrispondente value) {
        this.destinatariCC = value;
    }

}
