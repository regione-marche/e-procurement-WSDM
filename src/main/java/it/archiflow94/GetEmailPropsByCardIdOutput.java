
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEmailPropsByCardIdOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEmailPropsByCardIdOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="EMailInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}EMailIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEmailPropsByCardIdOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Posting.ValueObject", propOrder = {
    "eMailInfo"
})
public class GetEmailPropsByCardIdOutput
    extends BaseOutput
{

    @XmlElement(name = "EMailInfo", nillable = true)
    protected EMailIn eMailInfo;

    /**
     * Gets the value of the eMailInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EMailIn }
     *     
     */
    public EMailIn getEMailInfo() {
        return eMailInfo;
    }

    /**
     * Sets the value of the eMailInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailIn }
     *     
     */
    public void setEMailInfo(EMailIn value) {
        this.eMailInfo = value;
    }

}
