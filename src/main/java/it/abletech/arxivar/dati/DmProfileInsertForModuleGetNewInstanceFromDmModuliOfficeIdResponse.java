
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
 *         &lt;element name="Dm_Profile_Insert_For_Module_Get_New_Instance_From_DmModuliOfficeIdResult" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Insert_For_Module" minOccurs="0"/>
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
    "dmProfileInsertForModuleGetNewInstanceFromDmModuliOfficeIdResult"
})
@XmlRootElement(name = "Dm_Profile_Insert_For_Module_Get_New_Instance_From_DmModuliOfficeIdResponse")
public class DmProfileInsertForModuleGetNewInstanceFromDmModuliOfficeIdResponse {

    @XmlElement(name = "Dm_Profile_Insert_For_Module_Get_New_Instance_From_DmModuliOfficeIdResult")
    protected DmProfileInsertForModule dmProfileInsertForModuleGetNewInstanceFromDmModuliOfficeIdResult;

    /**
     * Gets the value of the dmProfileInsertForModuleGetNewInstanceFromDmModuliOfficeIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileInsertForModule }
     *     
     */
    public DmProfileInsertForModule getDmProfileInsertForModuleGetNewInstanceFromDmModuliOfficeIdResult() {
        return dmProfileInsertForModuleGetNewInstanceFromDmModuliOfficeIdResult;
    }

    /**
     * Sets the value of the dmProfileInsertForModuleGetNewInstanceFromDmModuliOfficeIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileInsertForModule }
     *     
     */
    public void setDmProfileInsertForModuleGetNewInstanceFromDmModuliOfficeIdResult(DmProfileInsertForModule value) {
        this.dmProfileInsertForModuleGetNewInstanceFromDmModuliOfficeIdResult = value;
    }

}
