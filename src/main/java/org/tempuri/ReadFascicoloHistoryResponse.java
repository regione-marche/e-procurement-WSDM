
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.ArrayOfFascicoloHistory;
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
 *         &lt;element name="ReadFascicoloHistoryResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="pFascHistoryColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfFascicoloHistory" minOccurs="0"/>
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
    "readFascicoloHistoryResult",
    "pFascHistoryColl"
})
@XmlRootElement(name = "ReadFascicoloHistoryResponse")
public class ReadFascicoloHistoryResponse {

    @XmlElement(name = "ReadFascicoloHistoryResult")
    protected ResultInfo readFascicoloHistoryResult;
    @XmlElementRef(name = "pFascHistoryColl", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFascicoloHistory> pFascHistoryColl;

    /**
     * Gets the value of the readFascicoloHistoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getReadFascicoloHistoryResult() {
        return readFascicoloHistoryResult;
    }

    /**
     * Sets the value of the readFascicoloHistoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setReadFascicoloHistoryResult(ResultInfo value) {
        this.readFascicoloHistoryResult = value;
    }

    /**
     * Gets the value of the pFascHistoryColl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFascicoloHistory }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFascicoloHistory> getPFascHistoryColl() {
        return pFascHistoryColl;
    }

    /**
     * Sets the value of the pFascHistoryColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFascicoloHistory }{@code >}
     *     
     */
    public void setPFascHistoryColl(JAXBElement<ArrayOfFascicoloHistory> value) {
        this.pFascHistoryColl = ((JAXBElement<ArrayOfFascicoloHistory> ) value);
    }

}
