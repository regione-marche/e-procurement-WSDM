
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
 *         &lt;element name="CreateWebLinkResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="webLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "createWebLinkResult",
    "webLink"
})
@XmlRootElement(name = "CreateWebLinkResponse")
public class CreateWebLinkResponse {

    @XmlElement(name = "CreateWebLinkResult")
    protected ResultInfo createWebLinkResult;
    @XmlElement(nillable = true)
    protected String webLink;

    /**
     * Gets the value of the createWebLinkResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getCreateWebLinkResult() {
        return createWebLinkResult;
    }

    /**
     * Sets the value of the createWebLinkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setCreateWebLinkResult(ResultInfo value) {
        this.createWebLinkResult = value;
    }

    /**
     * Gets the value of the webLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebLink() {
        return webLink;
    }

    /**
     * Sets the value of the webLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebLink(String value) {
        this.webLink = value;
    }

}
