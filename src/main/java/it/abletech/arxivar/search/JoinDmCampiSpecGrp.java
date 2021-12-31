
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_CampiSpecGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_CampiSpecGrp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ORDINE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_CampiSpecGrp", propOrder = {
    "id",
    "descrizione",
    "ordine"
})
public class JoinDmCampiSpecGrp
    extends JoinAbstract
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "DESCRIZIONE")
    protected FieldString descrizione;
    @XmlElement(name = "ORDINE")
    protected FieldInt ordine;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setID(FieldInt value) {
        this.id = value;
    }

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDESCRIZIONE() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDESCRIZIONE(FieldString value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the ordine property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getORDINE() {
        return ordine;
    }

    /**
     * Sets the value of the ordine property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setORDINE(FieldInt value) {
        this.ordine = value;
    }

}
