
package it.abletech.arxivar.search;

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
 *         &lt;element name="Dm_AllegatiWork_GetDataResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "dmAllegatiWorkGetDataResult"
})
@XmlRootElement(name = "Dm_AllegatiWork_GetDataResponse")
public class DmAllegatiWorkGetDataResponse {

    @XmlElement(name = "Dm_AllegatiWork_GetDataResult")
    protected String dmAllegatiWorkGetDataResult;

    /**
     * Gets the value of the dmAllegatiWorkGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmAllegatiWorkGetDataResult() {
        return dmAllegatiWorkGetDataResult;
    }

    /**
     * Sets the value of the dmAllegatiWorkGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmAllegatiWorkGetDataResult(String value) {
        this.dmAllegatiWorkGetDataResult = value;
    }

}
