
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
 *         &lt;element name="GetDomainsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oDomains" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}ArrayOfArchiflowDomain" minOccurs="0"/>
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
    "getDomainsResult",
    "oDomains"
})
@XmlRootElement(name = "GetDomainsResponse")
public class GetDomainsResponse {

    @XmlElement(name = "GetDomainsResult")
    protected ResultInfo getDomainsResult;
    @XmlElement(nillable = true)
    protected ArrayOfArchiflowDomain oDomains;

    /**
     * Gets the value of the getDomainsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetDomainsResult() {
        return getDomainsResult;
    }

    /**
     * Sets the value of the getDomainsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetDomainsResult(ResultInfo value) {
        this.getDomainsResult = value;
    }

    /**
     * Gets the value of the oDomains property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArchiflowDomain }
     *     
     */
    public ArrayOfArchiflowDomain getODomains() {
        return oDomains;
    }

    /**
     * Sets the value of the oDomains property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArchiflowDomain }
     *     
     */
    public void setODomains(ArrayOfArchiflowDomain value) {
        this.oDomains = value;
    }

}
