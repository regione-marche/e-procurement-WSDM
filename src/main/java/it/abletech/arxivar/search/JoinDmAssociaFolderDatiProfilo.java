
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_AssociaFolder_DatiProfilo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_AssociaFolder_DatiProfilo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="IDPROFILO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="IDRUBRICA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="IDCONTATTO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CAMPO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_AssociaFolder_DatiProfilo", propOrder = {
    "id",
    "idprofilo",
    "idrubrica",
    "idcontatto",
    "campo"
})
public class JoinDmAssociaFolderDatiProfilo
    extends JoinAbstract
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "IDPROFILO")
    protected FieldInt idprofilo;
    @XmlElement(name = "IDRUBRICA")
    protected FieldInt idrubrica;
    @XmlElement(name = "IDCONTATTO")
    protected FieldInt idcontatto;
    @XmlElement(name = "CAMPO")
    protected FieldString campo;

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
     * Gets the value of the idprofilo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDPROFILO() {
        return idprofilo;
    }

    /**
     * Sets the value of the idprofilo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDPROFILO(FieldInt value) {
        this.idprofilo = value;
    }

    /**
     * Gets the value of the idrubrica property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDRUBRICA() {
        return idrubrica;
    }

    /**
     * Sets the value of the idrubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDRUBRICA(FieldInt value) {
        this.idrubrica = value;
    }

    /**
     * Gets the value of the idcontatto property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDCONTATTO() {
        return idcontatto;
    }

    /**
     * Sets the value of the idcontatto property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDCONTATTO(FieldInt value) {
        this.idcontatto = value;
    }

    /**
     * Gets the value of the campo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCAMPO() {
        return campo;
    }

    /**
     * Sets the value of the campo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCAMPO(FieldString value) {
        this.campo = value;
    }

}
