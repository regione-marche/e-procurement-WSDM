
package it.archiflow94;

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
 *         &lt;element name="SignCardAdditiveGetImageResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="base64image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "signCardAdditiveGetImageResult",
    "base64Image"
})
@XmlRootElement(name = "SignCardAdditiveGetImageResponse")
public class SignCardAdditiveGetImageResponse {

    @XmlElement(name = "SignCardAdditiveGetImageResult")
    protected ResultInfo signCardAdditiveGetImageResult;
    @XmlElement(name = "base64image", nillable = true)
    protected String base64Image;

    /**
     * Gets the value of the signCardAdditiveGetImageResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getSignCardAdditiveGetImageResult() {
        return signCardAdditiveGetImageResult;
    }

    /**
     * Sets the value of the signCardAdditiveGetImageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setSignCardAdditiveGetImageResult(ResultInfo value) {
        this.signCardAdditiveGetImageResult = value;
    }

    /**
     * Gets the value of the base64Image property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase64Image() {
        return base64Image;
    }

    /**
     * Sets the value of the base64Image property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase64Image(String value) {
        this.base64Image = value;
    }

}
