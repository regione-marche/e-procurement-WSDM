
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Note complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Note">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Note">
 *       &lt;sequence>
 *         &lt;element name="UTENTEDESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanEdit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CanDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Note", propOrder = {
    "utentedescription",
    "canEdit",
    "canDelete"
})
public class Note
    extends DmNote
{

    @XmlElement(name = "UTENTEDESCRIPTION")
    protected String utentedescription;
    @XmlElement(name = "CanEdit")
    protected boolean canEdit;
    @XmlElement(name = "CanDelete")
    protected boolean canDelete;

    /**
     * Gets the value of the utentedescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTENTEDESCRIPTION() {
        return utentedescription;
    }

    /**
     * Sets the value of the utentedescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTENTEDESCRIPTION(String value) {
        this.utentedescription = value;
    }

    /**
     * Gets the value of the canEdit property.
     * 
     */
    public boolean isCanEdit() {
        return canEdit;
    }

    /**
     * Sets the value of the canEdit property.
     * 
     */
    public void setCanEdit(boolean value) {
        this.canEdit = value;
    }

    /**
     * Gets the value of the canDelete property.
     * 
     */
    public boolean isCanDelete() {
        return canDelete;
    }

    /**
     * Sets the value of the canDelete property.
     * 
     */
    public void setCanDelete(boolean value) {
        this.canDelete = value;
    }

}
