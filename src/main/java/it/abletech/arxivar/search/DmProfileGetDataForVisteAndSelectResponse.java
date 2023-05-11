
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
 *         &lt;element name="Dm_Profile_GetData_For_Viste_And_SelectResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "dmProfileGetDataForVisteAndSelectResult"
})
@XmlRootElement(name = "Dm_Profile_GetData_For_Viste_And_SelectResponse")
public class DmProfileGetDataForVisteAndSelectResponse {

    @XmlElement(name = "Dm_Profile_GetData_For_Viste_And_SelectResult")
    protected String dmProfileGetDataForVisteAndSelectResult;

    /**
     * Gets the value of the dmProfileGetDataForVisteAndSelectResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmProfileGetDataForVisteAndSelectResult() {
        return dmProfileGetDataForVisteAndSelectResult;
    }

    /**
     * Sets the value of the dmProfileGetDataForVisteAndSelectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmProfileGetDataForVisteAndSelectResult(String value) {
        this.dmProfileGetDataForVisteAndSelectResult = value;
    }

}
