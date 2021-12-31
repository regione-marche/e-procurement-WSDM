
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
 *         &lt;element name="GetCabinetsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oCabinets" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject}ArrayOfCabinet" minOccurs="0"/>
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
    "getCabinetsResult",
    "oCabinets"
})
@XmlRootElement(name = "GetCabinetsResponse")
public class GetCabinetsResponse {

    @XmlElement(name = "GetCabinetsResult")
    protected ResultInfo getCabinetsResult;
    @XmlElement(nillable = true)
    protected ArrayOfCabinet oCabinets;

    /**
     * Gets the value of the getCabinetsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCabinetsResult() {
        return getCabinetsResult;
    }

    /**
     * Sets the value of the getCabinetsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCabinetsResult(ResultInfo value) {
        this.getCabinetsResult = value;
    }

    /**
     * Gets the value of the oCabinets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCabinet }
     *     
     */
    public ArrayOfCabinet getOCabinets() {
        return oCabinets;
    }

    /**
     * Sets the value of the oCabinets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCabinet }
     *     
     */
    public void setOCabinets(ArrayOfCabinet value) {
        this.oCabinets = value;
    }

}
