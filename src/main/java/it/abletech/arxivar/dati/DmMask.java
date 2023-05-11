
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Mask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Mask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MASKNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MASKDESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DM_ASSOCIAFOLDER_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OWNER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EXTERNAL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISROOT" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TYPE" type="{http://www.Abletech.it/Arxivar}Dm_Mask_Type"/>
 *         &lt;element name="PA" type="{http://www.Abletech.it/Arxivar}Dm_Mask_Pa"/>
 *         &lt;element name="SHOWAGGIUNTIVI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MASKKIND" type="{http://www.Abletech.it/Arxivar}Dm_Mask_MaskKind"/>
 *         &lt;element name="SHOWGROUPS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Mask", propOrder = {
    "id",
    "maskname",
    "maskdescription",
    "dmassociafolderid",
    "owner",
    "externalid",
    "isroot",
    "type",
    "pa",
    "showaggiuntivi",
    "maskkind",
    "showgroups"
})
public class DmMask
    extends Base
{

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "MASKNAME")
    protected String maskname;
    @XmlElement(name = "MASKDESCRIPTION")
    protected String maskdescription;
    @XmlElement(name = "DM_ASSOCIAFOLDER_ID", required = true, type = Integer.class, nillable = true)
    protected Integer dmassociafolderid;
    @XmlElement(name = "OWNER")
    protected int owner;
    @XmlElement(name = "EXTERNAL_ID")
    protected String externalid;
    @XmlElement(name = "ISROOT")
    protected boolean isroot;
    @XmlElement(name = "TYPE", required = true)
    protected DmMaskType type;
    @XmlElement(name = "PA", required = true)
    protected DmMaskPa pa;
    @XmlElement(name = "SHOWAGGIUNTIVI")
    protected boolean showaggiuntivi;
    @XmlElement(name = "MASKKIND", required = true)
    protected DmMaskMaskKind maskkind;
    @XmlElement(name = "SHOWGROUPS")
    protected boolean showgroups;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the maskname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMASKNAME() {
        return maskname;
    }

    /**
     * Sets the value of the maskname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMASKNAME(String value) {
        this.maskname = value;
    }

    /**
     * Gets the value of the maskdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMASKDESCRIPTION() {
        return maskdescription;
    }

    /**
     * Sets the value of the maskdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMASKDESCRIPTION(String value) {
        this.maskdescription = value;
    }

    /**
     * Gets the value of the dmassociafolderid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDMASSOCIAFOLDERID() {
        return dmassociafolderid;
    }

    /**
     * Sets the value of the dmassociafolderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDMASSOCIAFOLDERID(Integer value) {
        this.dmassociafolderid = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     */
    public int getOWNER() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     */
    public void setOWNER(int value) {
        this.owner = value;
    }

    /**
     * Gets the value of the externalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTERNALID() {
        return externalid;
    }

    /**
     * Sets the value of the externalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTERNALID(String value) {
        this.externalid = value;
    }

    /**
     * Gets the value of the isroot property.
     * 
     */
    public boolean isISROOT() {
        return isroot;
    }

    /**
     * Sets the value of the isroot property.
     * 
     */
    public void setISROOT(boolean value) {
        this.isroot = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DmMaskType }
     *     
     */
    public DmMaskType getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMaskType }
     *     
     */
    public void setTYPE(DmMaskType value) {
        this.type = value;
    }

    /**
     * Gets the value of the pa property.
     * 
     * @return
     *     possible object is
     *     {@link DmMaskPa }
     *     
     */
    public DmMaskPa getPA() {
        return pa;
    }

    /**
     * Sets the value of the pa property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMaskPa }
     *     
     */
    public void setPA(DmMaskPa value) {
        this.pa = value;
    }

    /**
     * Gets the value of the showaggiuntivi property.
     * 
     */
    public boolean isSHOWAGGIUNTIVI() {
        return showaggiuntivi;
    }

    /**
     * Sets the value of the showaggiuntivi property.
     * 
     */
    public void setSHOWAGGIUNTIVI(boolean value) {
        this.showaggiuntivi = value;
    }

    /**
     * Gets the value of the maskkind property.
     * 
     * @return
     *     possible object is
     *     {@link DmMaskMaskKind }
     *     
     */
    public DmMaskMaskKind getMASKKIND() {
        return maskkind;
    }

    /**
     * Sets the value of the maskkind property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMaskMaskKind }
     *     
     */
    public void setMASKKIND(DmMaskMaskKind value) {
        this.maskkind = value;
    }

    /**
     * Gets the value of the showgroups property.
     * 
     */
    public boolean isSHOWGROUPS() {
        return showgroups;
    }

    /**
     * Sets the value of the showgroups property.
     * 
     */
    public void setSHOWGROUPS(boolean value) {
        this.showgroups = value;
    }

}
