
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
 *         &lt;element name="Dm_Profile_Insert_For_moduleResult" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Result" minOccurs="0"/>
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
    "dmProfileInsertForModuleResult"
})
@XmlRootElement(name = "Dm_Profile_Insert_For_moduleResponse")
public class DmProfileInsertForModuleResponse {

    @XmlElement(name = "Dm_Profile_Insert_For_moduleResult")
    protected DmProfileResult dmProfileInsertForModuleResult;

    /**
     * Gets the value of the dmProfileInsertForModuleResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileResult }
     *     
     */
    public DmProfileResult getDmProfileInsertForModuleResult() {
        return dmProfileInsertForModuleResult;
    }

    /**
     * Sets the value of the dmProfileInsertForModuleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileResult }
     *     
     */
    public void setDmProfileInsertForModuleResult(DmProfileResult value) {
        this.dmProfileInsertForModuleResult = value;
    }

}
