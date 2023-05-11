
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field_String complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field_String">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Field_Abstract">
 *       &lt;sequence>
 *         &lt;element name="Operatore" type="{http://www.Abletech.it/Arxivar}Dm_Base_Search_Operatore_String"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="Valore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forceCaseInsensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field_String", propOrder = {
    "operatore",
    "size",
    "valore",
    "forceCaseInsensitive"
})
@XmlSeeAlso({
    FieldStringPeriodo.class,
    FieldStringLinguaCampi.class,
    FieldStringTraduzioniPkg.class
})
public class FieldString
    extends FieldAbstract
{

    @XmlElement(name = "Operatore", required = true)
    protected DmBaseSearchOperatoreString operatore;
    @XmlElement(name = "Size", required = true, type = Long.class, nillable = true)
    @XmlSchemaType(name = "unsignedInt")
    protected Long size;
    @XmlElement(name = "Valore")
    protected String valore;
    protected boolean forceCaseInsensitive;

    /**
     * Gets the value of the operatore property.
     * 
     * @return
     *     possible object is
     *     {@link DmBaseSearchOperatoreString }
     *     
     */
    public DmBaseSearchOperatoreString getOperatore() {
        return operatore;
    }

    /**
     * Sets the value of the operatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmBaseSearchOperatoreString }
     *     
     */
    public void setOperatore(DmBaseSearchOperatoreString value) {
        this.operatore = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSize(Long value) {
        this.size = value;
    }

    /**
     * Gets the value of the valore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValore() {
        return valore;
    }

    /**
     * Sets the value of the valore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValore(String value) {
        this.valore = value;
    }

    /**
     * Gets the value of the forceCaseInsensitive property.
     * 
     */
    public boolean isForceCaseInsensitive() {
        return forceCaseInsensitive;
    }

    /**
     * Sets the value of the forceCaseInsensitive property.
     * 
     */
    public void setForceCaseInsensitive(boolean value) {
        this.forceCaseInsensitive = value;
    }

}
