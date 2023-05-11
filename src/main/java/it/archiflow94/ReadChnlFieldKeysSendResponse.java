
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
 *         &lt;element name="ReadChnlFieldKeysSendResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="FieldChannelKeySendList" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}ArrayOfFieldChannelKeySend" minOccurs="0"/>
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
    "readChnlFieldKeysSendResult",
    "fieldChannelKeySendList"
})
@XmlRootElement(name = "ReadChnlFieldKeysSendResponse")
public class ReadChnlFieldKeysSendResponse {

    @XmlElement(name = "ReadChnlFieldKeysSendResult")
    protected ResultInfo readChnlFieldKeysSendResult;
    @XmlElement(name = "FieldChannelKeySendList", nillable = true)
    protected ArrayOfFieldChannelKeySend fieldChannelKeySendList;

    /**
     * Gets the value of the readChnlFieldKeysSendResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getReadChnlFieldKeysSendResult() {
        return readChnlFieldKeysSendResult;
    }

    /**
     * Sets the value of the readChnlFieldKeysSendResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setReadChnlFieldKeysSendResult(ResultInfo value) {
        this.readChnlFieldKeysSendResult = value;
    }

    /**
     * Gets the value of the fieldChannelKeySendList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldChannelKeySend }
     *     
     */
    public ArrayOfFieldChannelKeySend getFieldChannelKeySendList() {
        return fieldChannelKeySendList;
    }

    /**
     * Sets the value of the fieldChannelKeySendList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldChannelKeySend }
     *     
     */
    public void setFieldChannelKeySendList(ArrayOfFieldChannelKeySend value) {
        this.fieldChannelKeySendList = value;
    }

}
