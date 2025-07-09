
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DestinatarioInfoInterop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DestinatarioInfoInterop">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services2/}DestinatarioInfo">
 *       &lt;sequence>
 *         &lt;element name="MessaggiInterop" type="{http://paleo.regione.marche.it/services/}ArrayOfMessaggioInteropInfo2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinatarioInfoInterop", propOrder = {
    "messaggiInterop"
})
public class DestinatarioInfoInterop
    extends DestinatarioInfo
{

    @XmlElement(name = "MessaggiInterop", nillable = true)
    protected ArrayOfMessaggioInteropInfo2 messaggiInterop;

    /**
     * Gets the value of the messaggiInterop property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessaggioInteropInfo2 }
     *     
     */
    public ArrayOfMessaggioInteropInfo2 getMessaggiInterop() {
        return messaggiInterop;
    }

    /**
     * Sets the value of the messaggiInterop property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessaggioInteropInfo2 }
     *     
     */
    public void setMessaggiInterop(ArrayOfMessaggioInteropInfo2 value) {
        this.messaggiInterop = value;
    }

}
