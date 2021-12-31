
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
 *         &lt;element name="GetRegisterRecordsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oRegRecords" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Registry.ValueObject}ArrayOfRecord" minOccurs="0"/>
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
    "getRegisterRecordsResult",
    "oRegRecords"
})
@XmlRootElement(name = "GetRegisterRecordsResponse")
public class GetRegisterRecordsResponse {

    @XmlElement(name = "GetRegisterRecordsResult")
    protected ResultInfo getRegisterRecordsResult;
    @XmlElement(nillable = true)
    protected ArrayOfRecord oRegRecords;

    /**
     * Gets the value of the getRegisterRecordsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetRegisterRecordsResult() {
        return getRegisterRecordsResult;
    }

    /**
     * Sets the value of the getRegisterRecordsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetRegisterRecordsResult(ResultInfo value) {
        this.getRegisterRecordsResult = value;
    }

    /**
     * Gets the value of the oRegRecords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecord }
     *     
     */
    public ArrayOfRecord getORegRecords() {
        return oRegRecords;
    }

    /**
     * Sets the value of the oRegRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecord }
     *     
     */
    public void setORegRecords(ArrayOfRecord value) {
        this.oRegRecords = value;
    }

}
