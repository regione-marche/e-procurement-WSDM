
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_Autore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_Autore">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NOMECOMPLETO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_Autore", propOrder = {
    "utente",
    "description",
    "nomecompleto"
})
public class JoinDmAutore
    extends JoinAbstract
{

    @XmlElement(name = "UTENTE")
    protected FieldString utente;
    @XmlElement(name = "DESCRIPTION")
    protected FieldString description;
    @XmlElement(name = "NOMECOMPLETO")
    protected FieldString nomecompleto;

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUTENTE() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUTENTE(FieldString value) {
        this.utente = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDESCRIPTION(FieldString value) {
        this.description = value;
    }

    /**
     * Gets the value of the nomecompleto property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNOMECOMPLETO() {
        return nomecompleto;
    }

    /**
     * Sets the value of the nomecompleto property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNOMECOMPLETO(FieldString value) {
        this.nomecompleto = value;
    }

}
