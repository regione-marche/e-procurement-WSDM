
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Profile_Insert_MV complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Profile_Insert_MV">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="DmMask" type="{http://www.Abletech.it/Arxivar}Dm_Mask" minOccurs="0"/>
 *         &lt;element name="DmMaskDetails" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_MaskDetail" minOccurs="0"/>
 *         &lt;element name="DmProfileDefault" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Default" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Profile_Insert_MV", propOrder = {
    "dmMask",
    "dmMaskDetails",
    "dmProfileDefault"
})
public class DmProfileInsertMV
    extends Base
{

    @XmlElement(name = "DmMask")
    protected DmMask dmMask;
    @XmlElement(name = "DmMaskDetails")
    protected ArrayOfDmMaskDetail dmMaskDetails;
    @XmlElement(name = "DmProfileDefault")
    protected DmProfileDefault dmProfileDefault;

    /**
     * Gets the value of the dmMask property.
     * 
     * @return
     *     possible object is
     *     {@link DmMask }
     *     
     */
    public DmMask getDmMask() {
        return dmMask;
    }

    /**
     * Sets the value of the dmMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMask }
     *     
     */
    public void setDmMask(DmMask value) {
        this.dmMask = value;
    }

    /**
     * Gets the value of the dmMaskDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmMaskDetail }
     *     
     */
    public ArrayOfDmMaskDetail getDmMaskDetails() {
        return dmMaskDetails;
    }

    /**
     * Sets the value of the dmMaskDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmMaskDetail }
     *     
     */
    public void setDmMaskDetails(ArrayOfDmMaskDetail value) {
        this.dmMaskDetails = value;
    }

    /**
     * Gets the value of the dmProfileDefault property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileDefault }
     *     
     */
    public DmProfileDefault getDmProfileDefault() {
        return dmProfileDefault;
    }

    /**
     * Sets the value of the dmProfileDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileDefault }
     *     
     */
    public void setDmProfileDefault(DmProfileDefault value) {
        this.dmProfileDefault = value;
    }

}
