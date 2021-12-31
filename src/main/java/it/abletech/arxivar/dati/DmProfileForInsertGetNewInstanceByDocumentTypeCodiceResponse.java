
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
 *         &lt;element name="Dm_Profile_ForInsert_Get_New_Instance_ByDocumentTypeCodiceResult" type="{http://www.Abletech.it/Arxivar}Dm_Profile_ForInsert" minOccurs="0"/>
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
    "dmProfileForInsertGetNewInstanceByDocumentTypeCodiceResult"
})
@XmlRootElement(name = "Dm_Profile_ForInsert_Get_New_Instance_ByDocumentTypeCodiceResponse")
public class DmProfileForInsertGetNewInstanceByDocumentTypeCodiceResponse {

    @XmlElement(name = "Dm_Profile_ForInsert_Get_New_Instance_ByDocumentTypeCodiceResult")
    protected DmProfileForInsert dmProfileForInsertGetNewInstanceByDocumentTypeCodiceResult;

    /**
     * Gets the value of the dmProfileForInsertGetNewInstanceByDocumentTypeCodiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileForInsert }
     *     
     */
    public DmProfileForInsert getDmProfileForInsertGetNewInstanceByDocumentTypeCodiceResult() {
        return dmProfileForInsertGetNewInstanceByDocumentTypeCodiceResult;
    }

    /**
     * Sets the value of the dmProfileForInsertGetNewInstanceByDocumentTypeCodiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileForInsert }
     *     
     */
    public void setDmProfileForInsertGetNewInstanceByDocumentTypeCodiceResult(DmProfileForInsert value) {
        this.dmProfileForInsertGetNewInstanceByDocumentTypeCodiceResult = value;
    }

}
