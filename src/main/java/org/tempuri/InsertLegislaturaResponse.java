
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.LegislaturaIdentifier;
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
 *         &lt;element name="InsertLegislaturaResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="pLegisId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}LegislaturaIdentifier" minOccurs="0"/>
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
    "insertLegislaturaResult",
    "pLegisId"
})
@XmlRootElement(name = "InsertLegislaturaResponse")
public class InsertLegislaturaResponse {

    @XmlElement(name = "InsertLegislaturaResult")
    protected ResultInfo insertLegislaturaResult;
    @XmlElementRef(name = "pLegisId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<LegislaturaIdentifier> pLegisId;

    /**
     * Gets the value of the insertLegislaturaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getInsertLegislaturaResult() {
        return insertLegislaturaResult;
    }

    /**
     * Sets the value of the insertLegislaturaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setInsertLegislaturaResult(ResultInfo value) {
        this.insertLegislaturaResult = value;
    }

    /**
     * Gets the value of the pLegisId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LegislaturaIdentifier }{@code >}
     *     
     */
    public JAXBElement<LegislaturaIdentifier> getPLegisId() {
        return pLegisId;
    }

    /**
     * Sets the value of the pLegisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LegislaturaIdentifier }{@code >}
     *     
     */
    public void setPLegisId(JAXBElement<LegislaturaIdentifier> value) {
        this.pLegisId = ((JAXBElement<LegislaturaIdentifier> ) value);
    }

}
