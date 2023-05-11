
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.ArrayOfLegislatura;
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
 *         &lt;element name="ReadLegislaturaResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="pLegisColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfLegislatura" minOccurs="0"/>
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
    "readLegislaturaResult",
    "pLegisColl"
})
@XmlRootElement(name = "ReadLegislaturaResponse")
public class ReadLegislaturaResponse {

    @XmlElement(name = "ReadLegislaturaResult")
    protected ResultInfo readLegislaturaResult;
    @XmlElementRef(name = "pLegisColl", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfLegislatura> pLegisColl;

    /**
     * Gets the value of the readLegislaturaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getReadLegislaturaResult() {
        return readLegislaturaResult;
    }

    /**
     * Sets the value of the readLegislaturaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setReadLegislaturaResult(ResultInfo value) {
        this.readLegislaturaResult = value;
    }

    /**
     * Gets the value of the pLegisColl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLegislatura }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLegislatura> getPLegisColl() {
        return pLegisColl;
    }

    /**
     * Sets the value of the pLegisColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLegislatura }{@code >}
     *     
     */
    public void setPLegisColl(JAXBElement<ArrayOfLegislatura> value) {
        this.pLegisColl = ((JAXBElement<ArrayOfLegislatura> ) value);
    }

}
