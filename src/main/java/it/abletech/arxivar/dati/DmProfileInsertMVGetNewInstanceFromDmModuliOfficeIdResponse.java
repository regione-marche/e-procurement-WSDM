
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
 *         &lt;element name="Dm_Profile_Insert_MV_GetNewInstance_From_DmModuliOfficeIdResult" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Insert_MV" minOccurs="0"/>
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
    "dmProfileInsertMVGetNewInstanceFromDmModuliOfficeIdResult"
})
@XmlRootElement(name = "Dm_Profile_Insert_MV_GetNewInstance_From_DmModuliOfficeIdResponse")
public class DmProfileInsertMVGetNewInstanceFromDmModuliOfficeIdResponse {

    @XmlElement(name = "Dm_Profile_Insert_MV_GetNewInstance_From_DmModuliOfficeIdResult")
    protected DmProfileInsertMV dmProfileInsertMVGetNewInstanceFromDmModuliOfficeIdResult;

    /**
     * Gets the value of the dmProfileInsertMVGetNewInstanceFromDmModuliOfficeIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileInsertMV }
     *     
     */
    public DmProfileInsertMV getDmProfileInsertMVGetNewInstanceFromDmModuliOfficeIdResult() {
        return dmProfileInsertMVGetNewInstanceFromDmModuliOfficeIdResult;
    }

    /**
     * Sets the value of the dmProfileInsertMVGetNewInstanceFromDmModuliOfficeIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileInsertMV }
     *     
     */
    public void setDmProfileInsertMVGetNewInstanceFromDmModuliOfficeIdResult(DmProfileInsertMV value) {
        this.dmProfileInsertMVGetNewInstanceFromDmModuliOfficeIdResult = value;
    }

}
