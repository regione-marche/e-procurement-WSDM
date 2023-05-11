
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
 *         &lt;element name="GetCardKeyVersionsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="keyVersions" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfKeyVersion" minOccurs="0"/>
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
    "getCardKeyVersionsResult",
    "keyVersions"
})
@XmlRootElement(name = "GetCardKeyVersionsResponse")
public class GetCardKeyVersionsResponse {

    @XmlElement(name = "GetCardKeyVersionsResult")
    protected ResultInfo getCardKeyVersionsResult;
    @XmlElement(nillable = true)
    protected ArrayOfKeyVersion keyVersions;

    /**
     * Gets the value of the getCardKeyVersionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCardKeyVersionsResult() {
        return getCardKeyVersionsResult;
    }

    /**
     * Sets the value of the getCardKeyVersionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCardKeyVersionsResult(ResultInfo value) {
        this.getCardKeyVersionsResult = value;
    }

    /**
     * Gets the value of the keyVersions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyVersion }
     *     
     */
    public ArrayOfKeyVersion getKeyVersions() {
        return keyVersions;
    }

    /**
     * Sets the value of the keyVersions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyVersion }
     *     
     */
    public void setKeyVersions(ArrayOfKeyVersion value) {
        this.keyVersions = value;
    }

}
