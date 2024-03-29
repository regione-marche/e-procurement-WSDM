
package it.archiflow96;

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
 *         &lt;element name="GetDocumentTypes2Result" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oDocumentTypes" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfDocumentType" minOccurs="0"/>
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
    "getDocumentTypes2Result",
    "oDocumentTypes"
})
@XmlRootElement(name = "GetDocumentTypes2Response")
public class GetDocumentTypes2Response {

    @XmlElement(name = "GetDocumentTypes2Result")
    protected ResultInfo getDocumentTypes2Result;
    @XmlElement(nillable = true)
    protected ArrayOfDocumentType oDocumentTypes;

    /**
     * Gets the value of the getDocumentTypes2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetDocumentTypes2Result() {
        return getDocumentTypes2Result;
    }

    /**
     * Sets the value of the getDocumentTypes2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetDocumentTypes2Result(ResultInfo value) {
        this.getDocumentTypes2Result = value;
    }

    /**
     * Gets the value of the oDocumentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentType }
     *     
     */
    public ArrayOfDocumentType getODocumentTypes() {
        return oDocumentTypes;
    }

    /**
     * Sets the value of the oDocumentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentType }
     *     
     */
    public void setODocumentTypes(ArrayOfDocumentType value) {
        this.oDocumentTypes = value;
    }

}
