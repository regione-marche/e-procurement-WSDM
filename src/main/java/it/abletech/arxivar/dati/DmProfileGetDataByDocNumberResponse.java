
package it.abletech.arxivar.dati;

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
 *         &lt;element name="Dm_Profile_GetData_By_DocNumberResult" type="{http://www.Abletech.it/Arxivar}Dm_Profile" minOccurs="0"/>
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
    "dmProfileGetDataByDocNumberResult"
})
@XmlRootElement(name = "Dm_Profile_GetData_By_DocNumberResponse")
public class DmProfileGetDataByDocNumberResponse {

    @XmlElement(name = "Dm_Profile_GetData_By_DocNumberResult")
    protected DmProfile dmProfileGetDataByDocNumberResult;

    /**
     * Gets the value of the dmProfileGetDataByDocNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfile }
     *     
     */
    public DmProfile getDmProfileGetDataByDocNumberResult() {
        return dmProfileGetDataByDocNumberResult;
    }

    /**
     * Sets the value of the dmProfileGetDataByDocNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfile }
     *     
     */
    public void setDmProfileGetDataByDocNumberResult(DmProfile value) {
        this.dmProfileGetDataByDocNumberResult = value;
    }

}
