
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Fascicoli_Select complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Fascicoli_Select">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetRowCount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Distinct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="ID_PADRE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="AUTORE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DATA_CREATE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="NOME" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="ACCESSO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="FULLPATH" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PERMESSIFOLDER_UTENTE_DESCRIPTION" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PERMESSIFOLDER_UTENTE_AOO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PERMESSIFOLDER_UTENTE_CATEGORIA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PERMESSIFOLDER_UTENTE_UTENTE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PERMESSIFOLDER_ACCESSO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PERMESSIFOLDER_ID" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Fascicoli_Select", propOrder = {
    "getRowCount",
    "distinct",
    "id",
    "idpadre",
    "autore",
    "datacreate",
    "nome",
    "accesso",
    "fullpath",
    "dmpermessifolderutentedescription",
    "dmpermessifolderutenteaoo",
    "dmpermessifolderutentecategoria",
    "dmpermessifolderutenteutente",
    "dmpermessifolderaccesso",
    "dmpermessifolderid"
})
public class DmFascicoliSelect {

    @XmlElement(name = "GetRowCount")
    protected boolean getRowCount;
    @XmlElement(name = "Distinct")
    protected boolean distinct;
    @XmlElement(name = "ID")
    protected BaseSelected id;
    @XmlElement(name = "ID_PADRE")
    protected BaseSelected idpadre;
    @XmlElement(name = "AUTORE")
    protected BaseSelected autore;
    @XmlElement(name = "DATA_CREATE")
    protected BaseSelected datacreate;
    @XmlElement(name = "NOME")
    protected BaseSelected nome;
    @XmlElement(name = "ACCESSO")
    protected BaseSelected accesso;
    @XmlElement(name = "FULLPATH")
    protected BaseSelected fullpath;
    @XmlElement(name = "DM_PERMESSIFOLDER_UTENTE_DESCRIPTION")
    protected BaseSelected dmpermessifolderutentedescription;
    @XmlElement(name = "DM_PERMESSIFOLDER_UTENTE_AOO")
    protected BaseSelected dmpermessifolderutenteaoo;
    @XmlElement(name = "DM_PERMESSIFOLDER_UTENTE_CATEGORIA")
    protected BaseSelected dmpermessifolderutentecategoria;
    @XmlElement(name = "DM_PERMESSIFOLDER_UTENTE_UTENTE")
    protected BaseSelected dmpermessifolderutenteutente;
    @XmlElement(name = "DM_PERMESSIFOLDER_ACCESSO")
    protected BaseSelected dmpermessifolderaccesso;
    @XmlElement(name = "DM_PERMESSIFOLDER_ID")
    protected BaseSelected dmpermessifolderid;

    /**
     * Gets the value of the getRowCount property.
     * 
     */
    public boolean isGetRowCount() {
        return getRowCount;
    }

    /**
     * Sets the value of the getRowCount property.
     * 
     */
    public void setGetRowCount(boolean value) {
        this.getRowCount = value;
    }

    /**
     * Gets the value of the distinct property.
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * Sets the value of the distinct property.
     * 
     */
    public void setDistinct(boolean value) {
        this.distinct = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setID(BaseSelected value) {
        this.id = value;
    }

    /**
     * Gets the value of the idpadre property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getIDPADRE() {
        return idpadre;
    }

    /**
     * Sets the value of the idpadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setIDPADRE(BaseSelected value) {
        this.idpadre = value;
    }

    /**
     * Gets the value of the autore property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getAUTORE() {
        return autore;
    }

    /**
     * Sets the value of the autore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setAUTORE(BaseSelected value) {
        this.autore = value;
    }

    /**
     * Gets the value of the datacreate property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDATACREATE() {
        return datacreate;
    }

    /**
     * Sets the value of the datacreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDATACREATE(BaseSelected value) {
        this.datacreate = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getNOME() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setNOME(BaseSelected value) {
        this.nome = value;
    }

    /**
     * Gets the value of the accesso property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getACCESSO() {
        return accesso;
    }

    /**
     * Sets the value of the accesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setACCESSO(BaseSelected value) {
        this.accesso = value;
    }

    /**
     * Gets the value of the fullpath property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getFULLPATH() {
        return fullpath;
    }

    /**
     * Sets the value of the fullpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setFULLPATH(BaseSelected value) {
        this.fullpath = value;
    }

    /**
     * Gets the value of the dmpermessifolderutentedescription property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPERMESSIFOLDERUTENTEDESCRIPTION() {
        return dmpermessifolderutentedescription;
    }

    /**
     * Sets the value of the dmpermessifolderutentedescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPERMESSIFOLDERUTENTEDESCRIPTION(BaseSelected value) {
        this.dmpermessifolderutentedescription = value;
    }

    /**
     * Gets the value of the dmpermessifolderutenteaoo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPERMESSIFOLDERUTENTEAOO() {
        return dmpermessifolderutenteaoo;
    }

    /**
     * Sets the value of the dmpermessifolderutenteaoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPERMESSIFOLDERUTENTEAOO(BaseSelected value) {
        this.dmpermessifolderutenteaoo = value;
    }

    /**
     * Gets the value of the dmpermessifolderutentecategoria property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPERMESSIFOLDERUTENTECATEGORIA() {
        return dmpermessifolderutentecategoria;
    }

    /**
     * Sets the value of the dmpermessifolderutentecategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPERMESSIFOLDERUTENTECATEGORIA(BaseSelected value) {
        this.dmpermessifolderutentecategoria = value;
    }

    /**
     * Gets the value of the dmpermessifolderutenteutente property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPERMESSIFOLDERUTENTEUTENTE() {
        return dmpermessifolderutenteutente;
    }

    /**
     * Sets the value of the dmpermessifolderutenteutente property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPERMESSIFOLDERUTENTEUTENTE(BaseSelected value) {
        this.dmpermessifolderutenteutente = value;
    }

    /**
     * Gets the value of the dmpermessifolderaccesso property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPERMESSIFOLDERACCESSO() {
        return dmpermessifolderaccesso;
    }

    /**
     * Sets the value of the dmpermessifolderaccesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPERMESSIFOLDERACCESSO(BaseSelected value) {
        this.dmpermessifolderaccesso = value;
    }

    /**
     * Gets the value of the dmpermessifolderid property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPERMESSIFOLDERID() {
        return dmpermessifolderid;
    }

    /**
     * Sets the value of the dmpermessifolderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPERMESSIFOLDERID(BaseSelected value) {
        this.dmpermessifolderid = value;
    }

}
