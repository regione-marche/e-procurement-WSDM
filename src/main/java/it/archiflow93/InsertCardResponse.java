
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
 *         &lt;element name="InsertCardResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
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
    "insertCardResult",
    "oCardGuid"
})
@XmlRootElement(name = "InsertCardResponse")
public class InsertCardResponse {

    @XmlElement(name = "InsertCardResult")
    protected ResultInfo insertCardResult;
    protected String oCardGuid;

    /**
     * Gets the value of the insertCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getInsertCardResult() {
        return insertCardResult;
    }

    /**
     * Sets the value of the insertCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setInsertCardResult(ResultInfo value) {
        this.insertCardResult = value;
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
