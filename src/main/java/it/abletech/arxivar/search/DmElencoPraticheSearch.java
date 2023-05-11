
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_ElencoPratiche_Search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_ElencoPratiche_Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Base_Search">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="IDTIPOPRATICA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="STATOPRATICA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DATAINIZIO" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="DATAFINE" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NUMERO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NOMEPRATICA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="IDFOLDER" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Dm_Profile_Pratiche" type="{http://www.Abletech.it/Arxivar}Join_Dm_Profile_Pratica" minOccurs="0"/>
 *         &lt;element name="Dm_TipiPratiche" type="{http://www.Abletech.it/Arxivar}Join_Dm_TipiPratiche" minOccurs="0"/>
 *         &lt;element name="EXTERNALID" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_ElencoPratiche_Search", propOrder = {
    "id",
    "idtipopratica",
    "statopratica",
    "datainizio",
    "datafine",
    "utente",
    "numero",
    "nomepratica",
    "idfolder",
    "dmProfilePratiche",
    "dmTipiPratiche",
    "externalid"
})
public class DmElencoPraticheSearch
    extends DmBaseSearch
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "IDTIPOPRATICA")
    protected FieldInt idtipopratica;
    @XmlElement(name = "STATOPRATICA")
    protected FieldString statopratica;
    @XmlElement(name = "DATAINIZIO")
    protected FieldDateTime datainizio;
    @XmlElement(name = "DATAFINE")
    protected FieldDateTime datafine;
    @XmlElement(name = "UTENTE")
    protected FieldInt utente;
    @XmlElement(name = "NUMERO")
    protected FieldString numero;
    @XmlElement(name = "NOMEPRATICA")
    protected FieldString nomepratica;
    @XmlElement(name = "IDFOLDER")
    protected FieldInt idfolder;
    @XmlElement(name = "Dm_Profile_Pratiche")
    protected JoinDmProfilePratica dmProfilePratiche;
    @XmlElement(name = "Dm_TipiPratiche")
    protected JoinDmTipiPratiche dmTipiPratiche;
    @XmlElement(name = "EXTERNALID")
    protected FieldString externalid;

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
     * Gets the value of the idtipopratica property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDTIPOPRATICA() {
        return idtipopratica;
    }

    /**
     * Sets the value of the idtipopratica property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDTIPOPRATICA(FieldInt value) {
        this.idtipopratica = value;
    }

    /**
     * Gets the value of the statopratica property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSTATOPRATICA() {
        return statopratica;
    }

    /**
     * Sets the value of the statopratica property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSTATOPRATICA(FieldString value) {
        this.statopratica = value;
    }

    /**
     * Gets the value of the datainizio property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATAINIZIO() {
        return datainizio;
    }

    /**
     * Sets the value of the datainizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATAINIZIO(FieldDateTime value) {
        this.datainizio = value;
    }

    /**
     * Gets the value of the datafine property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATAFINE() {
        return datafine;
    }

    /**
     * Sets the value of the datafine property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATAFINE(FieldDateTime value) {
        this.datafine = value;
    }

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
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNUMERO() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNUMERO(FieldString value) {
        this.numero = value;
    }

    /**
     * Gets the value of the nomepratica property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNOMEPRATICA() {
        return nomepratica;
    }

    /**
     * Sets the value of the nomepratica property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNOMEPRATICA(FieldString value) {
        this.nomepratica = value;
    }

    /**
     * Gets the value of the idfolder property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDFOLDER() {
        return idfolder;
    }

    /**
     * Sets the value of the idfolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDFOLDER(FieldInt value) {
        this.idfolder = value;
    }

    /**
     * Gets the value of the dmProfilePratiche property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmProfilePratica }
     *     
     */
    public JoinDmProfilePratica getDmProfilePratiche() {
        return dmProfilePratiche;
    }

    /**
     * Sets the value of the dmProfilePratiche property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmProfilePratica }
     *     
     */
    public void setDmProfilePratiche(JoinDmProfilePratica value) {
        this.dmProfilePratiche = value;
    }

    /**
     * Gets the value of the dmTipiPratiche property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmTipiPratiche }
     *     
     */
    public JoinDmTipiPratiche getDmTipiPratiche() {
        return dmTipiPratiche;
    }

    /**
     * Sets the value of the dmTipiPratiche property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmTipiPratiche }
     *     
     */
    public void setDmTipiPratiche(JoinDmTipiPratiche value) {
        this.dmTipiPratiche = value;
    }

    /**
     * Gets the value of the externalid property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEXTERNALID() {
        return externalid;
    }

    /**
     * Sets the value of the externalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEXTERNALID(FieldString value) {
        this.externalid = value;
    }

}
