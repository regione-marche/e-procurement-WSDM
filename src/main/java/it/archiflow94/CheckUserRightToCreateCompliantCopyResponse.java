
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
 *         &lt;element name="CheckUserRightToCreateCompliantCopyResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="retAnalog" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="retDigital" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "checkUserRightToCreateCompliantCopyResult",
    "retAnalog",
    "retDigital"
})
@XmlRootElement(name = "CheckUserRightToCreateCompliantCopyResponse")
public class CheckUserRightToCreateCompliantCopyResponse {

    @XmlElement(name = "CheckUserRightToCreateCompliantCopyResult")
    protected ResultInfo checkUserRightToCreateCompliantCopyResult;
    protected Boolean retAnalog;
    protected Boolean retDigital;

    /**
     * Gets the value of the checkUserRightToCreateCompliantCopyResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getCheckUserRightToCreateCompliantCopyResult() {
        return checkUserRightToCreateCompliantCopyResult;
    }

    /**
     * Sets the value of the checkUserRightToCreateCompliantCopyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setCheckUserRightToCreateCompliantCopyResult(ResultInfo value) {
        this.checkUserRightToCreateCompliantCopyResult = value;
    }

    /**
     * Gets the value of the retAnalog property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetAnalog() {
        return retAnalog;
    }

    /**
     * Sets the value of the retAnalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetAnalog(Boolean value) {
        this.retAnalog = value;
    }

    /**
     * Gets the value of the retDigital property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetDigital() {
        return retDigital;
    }

    /**
     * Sets the value of the retDigital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetDigital(Boolean value) {
        this.retDigital = value;
    }

}
