
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadFascicoloVisibilityPrivacyOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadFascicoloVisibilityPrivacyOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="PrivacyVis" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseVisibilityPrivacy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadFascicoloVisibilityPrivacyOutput", propOrder = {
    "privacyVis"
})
public class ReadFascicoloVisibilityPrivacyOutput
    extends BaseOutput
{

    @XmlElement(name = "PrivacyVis", nillable = true)
    protected BaseVisibilityPrivacy privacyVis;

    /**
     * Gets the value of the privacyVis property.
     * 
     * @return
     *     possible object is
     *     {@link BaseVisibilityPrivacy }
     *     
     */
    public BaseVisibilityPrivacy getPrivacyVis() {
        return privacyVis;
    }

    /**
     * Sets the value of the privacyVis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseVisibilityPrivacy }
     *     
     */
    public void setPrivacyVis(BaseVisibilityPrivacy value) {
        this.privacyVis = value;
    }

}
