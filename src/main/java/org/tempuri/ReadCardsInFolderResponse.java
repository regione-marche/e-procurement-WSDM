
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_common.ArrayOfDocumentIdentifier;
import org.datacontract.schemas._2004._07.siav_common_baseclass.ResultInfo;


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
 *         &lt;element name="ReadCardsInFolderResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="pDocIdColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier}ArrayOfDocumentIdentifier" minOccurs="0"/>
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
    "readCardsInFolderResult",
    "pDocIdColl"
})
@XmlRootElement(name = "ReadCardsInFolderResponse")
public class ReadCardsInFolderResponse {

    @XmlElement(name = "ReadCardsInFolderResult")
    protected ResultInfo readCardsInFolderResult;
    @XmlElementRef(name = "pDocIdColl", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDocumentIdentifier> pDocIdColl;

    /**
     * Gets the value of the readCardsInFolderResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getReadCardsInFolderResult() {
        return readCardsInFolderResult;
    }

    /**
     * Sets the value of the readCardsInFolderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setReadCardsInFolderResult(ResultInfo value) {
        this.readCardsInFolderResult = value;
    }

    /**
     * Gets the value of the pDocIdColl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentIdentifier }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumentIdentifier> getPDocIdColl() {
        return pDocIdColl;
    }

    /**
     * Sets the value of the pDocIdColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentIdentifier }{@code >}
     *     
     */
    public void setPDocIdColl(JAXBElement<ArrayOfDocumentIdentifier> value) {
        this.pDocIdColl = ((JAXBElement<ArrayOfDocumentIdentifier> ) value);
    }

}
