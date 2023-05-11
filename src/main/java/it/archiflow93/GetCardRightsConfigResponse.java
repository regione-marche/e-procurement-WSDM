
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetCardRightsConfigResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oCardRightsConfig" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}CardRightsConfig" minOccurs="0"/>
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
    "getCardRightsConfigResult",
    "oCardRightsConfig"
})
@XmlRootElement(name = "GetCardRightsConfigResponse")
public class GetCardRightsConfigResponse {

    @XmlElement(name = "GetCardRightsConfigResult")
    protected ResultInfo getCardRightsConfigResult;
    @XmlElement(nillable = true)
    protected CardRightsConfig oCardRightsConfig;

    /**
     * Gets the value of the getCardRightsConfigResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCardRightsConfigResult() {
        return getCardRightsConfigResult;
    }

    /**
     * Sets the value of the getCardRightsConfigResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCardRightsConfigResult(ResultInfo value) {
        this.getCardRightsConfigResult = value;
    }

    /**
     * Gets the value of the oCardRightsConfig property.
     * 
     * @return
     *     possible object is
     *     {@link CardRightsConfig }
     *     
     */
    public CardRightsConfig getOCardRightsConfig() {
        return oCardRightsConfig;
    }

    /**
     * Sets the value of the oCardRightsConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardRightsConfig }
     *     
     */
    public void setOCardRightsConfig(CardRightsConfig value) {
        this.oCardRightsConfig = value;
    }

}
