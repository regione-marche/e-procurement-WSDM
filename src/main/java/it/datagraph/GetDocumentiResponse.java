
package it.datagraph;

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
 *         &lt;element name="GetDocumentiResult" type="{http://tempuri.org/}DocumentiRet" minOccurs="0"/>
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
    "getDocumentiResult"
})
@XmlRootElement(name = "GetDocumentiResponse")
public class GetDocumentiResponse {

    @XmlElement(name = "GetDocumentiResult")
    protected DocumentiRet getDocumentiResult;

    /**
     * Gets the value of the getDocumentiResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentiRet }
     *     
     */
    public DocumentiRet getGetDocumentiResult() {
        return getDocumentiResult;
    }

    /**
     * Sets the value of the getDocumentiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentiRet }
     *     
     */
    public void setGetDocumentiResult(DocumentiRet value) {
        this.getDocumentiResult = value;
    }

}
