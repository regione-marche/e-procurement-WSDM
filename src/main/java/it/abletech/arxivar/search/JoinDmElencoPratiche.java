
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_ElencoPratiche complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_ElencoPratiche">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="IDPRATICA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="STATOPRATICA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DATAINIZIO" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="DATAFINE" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NUMERO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NOMEPRATICA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="IDFOLDER" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="EXTERNALID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_ElencoPratiche", propOrder = {
    "id",
    "idpratica",
    "statopratica",
    "datainizio",
    "datafine",
    "utente",
    "numero",
    "nomepratica",
    "idfolder",
    "externalid"
})
public class JoinDmElencoPratiche
    extends JoinAbstract
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "IDPRATICA")
    protected FieldInt idpratica;
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
    @XmlElement(name = "EXTERNALID")
    protected FieldInt externalid;

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
     * Gets the value of the idpratica property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDPRATICA() {
        return idpratica;
    }

    /**
     * Sets the value of the idpratica property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDPRATICA(FieldInt value) {
        this.idpratica = value;
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
     * Gets the value of the externalid property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getEXTERNALID() {
        return externalid;
    }

    /**
     * Sets the value of the externalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setEXTERNALID(FieldInt value) {
        this.externalid = value;
    }

}
