
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Profile_Insert_For_Mask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Profile_Insert_For_Mask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Profile_ForInsert">
 *       &lt;sequence>
 *         &lt;element name="DmMaskId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.Abletech.it/Arxivar}Dm_Mask_Type"/>
 *         &lt;element name="Dm_ModuliOffice_Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Profile_Insert_For_Mask", propOrder = {
    "dmMaskId",
    "reason",
    "dmModuliOfficeId",
    "barcode"
})
public class DmProfileInsertForMask2
    extends DmProfileForInsert
{

    @XmlElement(name = "DmMaskId")
    protected String dmMaskId;
    @XmlElement(name = "Reason", required = true)
    protected DmMaskType reason;
    @XmlElement(name = "Dm_ModuliOffice_Id", required = true, type = Integer.class, nillable = true)
    protected Integer dmModuliOfficeId;
    @XmlElement(name = "Barcode")
    protected String barcode;

    /**
     * Gets the value of the dmMaskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmMaskId() {
        return dmMaskId;
    }

    /**
     * Sets the value of the dmMaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmMaskId(String value) {
        this.dmMaskId = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link DmMaskType }
     *     
     */
    public DmMaskType getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMaskType }
     *     
     */
    public void setReason(DmMaskType value) {
        this.reason = value;
    }

    /**
     * Gets the value of the dmModuliOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDmModuliOfficeId() {
        return dmModuliOfficeId;
    }

    /**
     * Sets the value of the dmModuliOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDmModuliOfficeId(Integer value) {
        this.dmModuliOfficeId = value;
    }

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcode(String value) {
        this.barcode = value;
    }

}
