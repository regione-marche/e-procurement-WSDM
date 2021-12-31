
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
 *         &lt;element name="SortCardResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oCardGuid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
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
    "sortCardResult",
    "oCardGuid"
})
@XmlRootElement(name = "SortCardResponse")
public class SortCardResponse {

    @XmlElement(name = "SortCardResult")
    protected ResultInfo sortCardResult;
    protected String oCardGuid;

    /**
     * Gets the value of the sortCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getSortCardResult() {
        return sortCardResult;
    }

    /**
     * Sets the value of the sortCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setSortCardResult(ResultInfo value) {
        this.sortCardResult = value;
    }

    /**
     * Gets the value of the oCardGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCardGuid() {
        return oCardGuid;
    }

    /**
     * Sets the value of the oCardGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCardGuid(String value) {
        this.oCardGuid = value;
    }

}
