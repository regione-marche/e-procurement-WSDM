
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
 *         &lt;element name="CreateWebLinksResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oWebLinkList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
    "createWebLinksResult",
    "oWebLinkList"
})
@XmlRootElement(name = "CreateWebLinksResponse")
public class CreateWebLinksResponse {

    @XmlElement(name = "CreateWebLinksResult")
    protected ResultInfo createWebLinksResult;
    @XmlElement(nillable = true)
    protected ArrayOfstring oWebLinkList;

    /**
     * Gets the value of the createWebLinksResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getCreateWebLinksResult() {
        return createWebLinksResult;
    }

    /**
     * Sets the value of the createWebLinksResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setCreateWebLinksResult(ResultInfo value) {
        this.createWebLinksResult = value;
    }

    /**
     * Gets the value of the oWebLinkList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getOWebLinkList() {
        return oWebLinkList;
    }

    /**
     * Sets the value of the oWebLinkList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setOWebLinkList(ArrayOfstring value) {
        this.oWebLinkList = value;
    }

}
