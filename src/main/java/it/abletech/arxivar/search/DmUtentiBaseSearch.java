
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_UtentiBase_Search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_UtentiBase_Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Base_Search">
 *       &lt;sequence>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="GRUPPO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="EMAIL" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="AOO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CATEGORIA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="STATOUTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="MUSTCHANGEPASSWORD" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="LANG" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Dm_Roles_User" type="{http://www.Abletech.it/Arxivar}Join_Dm_Roles_User" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_UtentiBase_Search", propOrder = {
    "utente",
    "gruppo",
    "description",
    "email",
    "aoo",
    "categoria",
    "statoutente",
    "mustchangepassword",
    "lang",
    "dmRolesUser"
})
public class DmUtentiBaseSearch
    extends DmBaseSearch
{

    @XmlElement(name = "UTENTE")
    protected FieldInt utente;
    @XmlElement(name = "GRUPPO")
    protected FieldInt gruppo;
    @XmlElement(name = "DESCRIPTION")
    protected FieldString description;
    @XmlElement(name = "EMAIL")
    protected FieldString email;
    @XmlElement(name = "AOO")
    protected FieldString aoo;
    @XmlElement(name = "CATEGORIA")
    protected FieldString categoria;
    @XmlElement(name = "STATOUTENTE")
    protected FieldInt statoutente;
    @XmlElement(name = "MUSTCHANGEPASSWORD")
    protected FieldInt mustchangepassword;
    @XmlElement(name = "LANG")
    protected FieldString lang;
    @XmlElement(name = "Dm_Roles_User")
    protected JoinDmRolesUser dmRolesUser;

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getUTENTE() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setUTENTE(FieldInt value) {
        this.utente = value;
    }

    /**
     * Gets the value of the gruppo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getGRUPPO() {
        return gruppo;
    }

    /**
     * Sets the value of the gruppo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setGRUPPO(FieldInt value) {
        this.gruppo = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEMAIL() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEMAIL(FieldString value) {
        this.email = value;
    }

    /**
     * Gets the value of the aoo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAOO() {
        return aoo;
    }

    /**
     * Sets the value of the aoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAOO(FieldString value) {
        this.aoo = value;
    }

    /**
     * Gets the value of the categoria property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCATEGORIA() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCATEGORIA(FieldString value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the statoutente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getSTATOUTENTE() {
        return statoutente;
    }

    /**
     * Sets the value of the statoutente property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setSTATOUTENTE(FieldInt value) {
        this.statoutente = value;
    }

    /**
     * Gets the value of the mustchangepassword property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getMUSTCHANGEPASSWORD() {
        return mustchangepassword;
    }

    /**
     * Sets the value of the mustchangepassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setMUSTCHANGEPASSWORD(FieldInt value) {
        this.mustchangepassword = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLANG() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLANG(FieldString value) {
        this.lang = value;
    }

    /**
     * Gets the value of the dmRolesUser property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmRolesUser }
     *     
     */
    public JoinDmRolesUser getDmRolesUser() {
        return dmRolesUser;
    }

    /**
     * Sets the value of the dmRolesUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmRolesUser }
     *     
     */
    public void setDmRolesUser(JoinDmRolesUser value) {
        this.dmRolesUser = value;
    }

}
