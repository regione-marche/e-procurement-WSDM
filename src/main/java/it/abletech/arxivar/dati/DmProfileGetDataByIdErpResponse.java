
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
 *         &lt;element name="Dm_Profile_GetData_By_IdErpResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_Profile" minOccurs="0"/>
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
    "dmProfileGetDataByIdErpResult"
})
@XmlRootElement(name = "Dm_Profile_GetData_By_IdErpResponse")
public class DmProfileGetDataByIdErpResponse {

    @XmlElement(name = "Dm_Profile_GetData_By_IdErpResult")
    protected ArrayOfDmProfile dmProfileGetDataByIdErpResult;

    /**
     * Gets the value of the dmProfileGetDataByIdErpResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmProfile }
     *     
     */
    public ArrayOfDmProfile getDmProfileGetDataByIdErpResult() {
        return dmProfileGetDataByIdErpResult;
    }

    /**
     * Sets the value of the dmProfileGetDataByIdErpResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmProfile }
     *     
     */
    public void setDmProfileGetDataByIdErpResult(ArrayOfDmProfile value) {
        this.dmProfileGetDataByIdErpResult = value;
    }

}
