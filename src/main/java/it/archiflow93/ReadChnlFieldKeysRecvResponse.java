
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
 *         &lt;element name="ReadChnlFieldKeysRecvResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="FieldChannelKeyRecvList" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}ArrayOfFieldChannelKeyRecv" minOccurs="0"/>
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
    "readChnlFieldKeysRecvResult",
    "fieldChannelKeyRecvList"
})
@XmlRootElement(name = "ReadChnlFieldKeysRecvResponse")
public class ReadChnlFieldKeysRecvResponse {

    @XmlElement(name = "ReadChnlFieldKeysRecvResult")
    protected ResultInfo readChnlFieldKeysRecvResult;
    @XmlElement(name = "FieldChannelKeyRecvList", nillable = true)
    protected ArrayOfFieldChannelKeyRecv fieldChannelKeyRecvList;

    /**
     * Gets the value of the readChnlFieldKeysRecvResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getReadChnlFieldKeysRecvResult() {
        return readChnlFieldKeysRecvResult;
    }

    /**
     * Sets the value of the readChnlFieldKeysRecvResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setReadChnlFieldKeysRecvResult(ResultInfo value) {
        this.readChnlFieldKeysRecvResult = value;
    }

    /**
     * Gets the value of the fieldChannelKeyRecvList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldChannelKeyRecv }
     *     
     */
    public ArrayOfFieldChannelKeyRecv getFieldChannelKeyRecvList() {
        return fieldChannelKeyRecvList;
    }

    /**
     * Sets the value of the fieldChannelKeyRecvList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldChannelKeyRecv }
     *     
     */
    public void setFieldChannelKeyRecvList(ArrayOfFieldChannelKeyRecv value) {
        this.fieldChannelKeyRecvList = value;
    }

}
