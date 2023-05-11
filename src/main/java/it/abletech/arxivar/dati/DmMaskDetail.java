
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_MaskDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_MaskDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DM_MASK_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIELD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDINE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="READONLY" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RICHIESTO" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FIELD_KIND" type="{http://www.Abletech.it/Arxivar}Dm_MaskDetail_FieldKind"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_MaskDetail", propOrder = {
    "id",
    "dmmaskid",
    "fieldid",
    "ordine",
    "readonly",
    "richiesto",
    "fieldkind"
})
public class DmMaskDetail
    extends Base
{

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "DM_MASK_ID")
    protected String dmmaskid;
    @XmlElement(name = "FIELD_ID")
    protected String fieldid;
    @XmlElement(name = "ORDINE")
    protected int ordine;
    @XmlElement(name = "READONLY")
    protected boolean readonly;
    @XmlElement(name = "RICHIESTO")
    protected boolean richiesto;
    @XmlElement(name = "FIELD_KIND", required = true)
    protected DmMaskDetailFieldKind fieldkind;

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
     * Gets the value of the dmmaskid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMMASKID() {
        return dmmaskid;
    }

    /**
     * Sets the value of the dmmaskid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMMASKID(String value) {
        this.dmmaskid = value;
    }

    /**
     * Gets the value of the fieldid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIELDID() {
        return fieldid;
    }

    /**
     * Sets the value of the fieldid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIELDID(String value) {
        this.fieldid = value;
    }

    /**
     * Gets the value of the ordine property.
     * 
     */
    public int getORDINE() {
        return ordine;
    }

    /**
     * Sets the value of the ordine property.
     * 
     */
    public void setORDINE(int value) {
        this.ordine = value;
    }

    /**
     * Gets the value of the readonly property.
     * 
     */
    public boolean isREADONLY() {
        return readonly;
    }

    /**
     * Sets the value of the readonly property.
     * 
     */
    public void setREADONLY(boolean value) {
        this.readonly = value;
    }

    /**
     * Gets the value of the richiesto property.
     * 
     */
    public boolean isRICHIESTO() {
        return richiesto;
    }

    /**
     * Sets the value of the richiesto property.
     * 
     */
    public void setRICHIESTO(boolean value) {
        this.richiesto = value;
    }

    /**
     * Gets the value of the fieldkind property.
     * 
     * @return
     *     possible object is
     *     {@link DmMaskDetailFieldKind }
     *     
     */
    public DmMaskDetailFieldKind getFIELDKIND() {
        return fieldkind;
    }

    /**
     * Sets the value of the fieldkind property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMaskDetailFieldKind }
     *     
     */
    public void setFIELDKIND(DmMaskDetailFieldKind value) {
        this.fieldkind = value;
    }

}
