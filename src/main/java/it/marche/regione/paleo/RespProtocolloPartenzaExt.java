
package it.marche.regione.paleo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for respProtocolloPartenzaExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respProtocolloPartenzaExt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services/}respProtocolloExt">
 *       &lt;sequence>
 *         &lt;element name="Destinatari" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="DestinatariCC" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="DestinatariInfo" type="{http://paleo.regione.marche.it/services/}ArrayOfDestinatarioInfo" minOccurs="0"/>
 *         &lt;element name="DestinatariInfoCC" type="{http://paleo.regione.marche.it/services/}ArrayOfDestinatarioInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respProtocolloPartenzaExt", propOrder = {
    "destinatari",
    "destinatariCC",
    "destinatariInfo",
    "destinatariInfoCC"
})
public class RespProtocolloPartenzaExt
    extends RespProtocolloExt
{

    @XmlElement(name = "Destinatari", nillable = true)
    protected ArrayOfstring destinatari;
    @XmlElement(name = "DestinatariCC", nillable = true)
    protected ArrayOfstring destinatariCC;
    @XmlElement(name = "DestinatariInfo", nillable = true)
    protected ArrayOfDestinatarioInfo destinatariInfo;
    @XmlElement(name = "DestinatariInfoCC", nillable = true)
    protected ArrayOfDestinatarioInfo destinatariInfoCC;

    /**
     * Gets the value of the destinatari property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getDestinatari() {
        return destinatari;
    }

    /**
     * Sets the value of the destinatari property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setDestinatari(ArrayOfstring value) {
        this.destinatari = value;
    }

    /**
     * Gets the value of the destinatariCC property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getDestinatariCC() {
        return destinatariCC;
    }

    /**
     * Sets the value of the destinatariCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setDestinatariCC(ArrayOfstring value) {
        this.destinatariCC = value;
    }

    /**
     * Gets the value of the destinatariInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDestinatarioInfo }
     *     
     */
    public ArrayOfDestinatarioInfo getDestinatariInfo() {
        return destinatariInfo;
    }

    /**
     * Sets the value of the destinatariInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDestinatarioInfo }
     *     
     */
    public void setDestinatariInfo(ArrayOfDestinatarioInfo value) {
        this.destinatariInfo = value;
    }

    /**
     * Gets the value of the destinatariInfoCC property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDestinatarioInfo }
     *     
     */
    public ArrayOfDestinatarioInfo getDestinatariInfoCC() {
        return destinatariInfoCC;
    }

    /**
     * Sets the value of the destinatariInfoCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDestinatarioInfo }
     *     
     */
    public void setDestinatariInfoCC(ArrayOfDestinatarioInfo value) {
        this.destinatariInfoCC = value;
    }

}
