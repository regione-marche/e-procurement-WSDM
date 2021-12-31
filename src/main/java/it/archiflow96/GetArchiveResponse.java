
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
 *         &lt;element name="GetArchiveResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oArchive" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}Archive" minOccurs="0"/>
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
    "getArchiveResult",
    "oArchive"
})
@XmlRootElement(name = "GetArchiveResponse")
public class GetArchiveResponse {

    @XmlElement(name = "GetArchiveResult")
    protected ResultInfo getArchiveResult;
    @XmlElement(nillable = true)
    protected Archive oArchive;

    /**
     * Gets the value of the getArchiveResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetArchiveResult() {
        return getArchiveResult;
    }

    /**
     * Sets the value of the getArchiveResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetArchiveResult(ResultInfo value) {
        this.getArchiveResult = value;
    }

    /**
     * Gets the value of the oArchive property.
     * 
     * @return
     *     possible object is
     *     {@link Archive }
     *     
     */
    public Archive getOArchive() {
        return oArchive;
    }

    /**
     * Sets the value of the oArchive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Archive }
     *     
     */
    public void setOArchive(Archive value) {
        this.oArchive = value;
    }

}
