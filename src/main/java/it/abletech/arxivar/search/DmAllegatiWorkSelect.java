
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_AllegatiWork_Select complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_AllegatiWork_Select">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="NOMEORIGINALE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="NOMEINTERNO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="PERCORSO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DATA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="IDPROCESSO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="IDTASK" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="TIPOALLEGATO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DOCNUMBER" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="REV" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="PSWZIP" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="TOSEND" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="CSTRING" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_UTENTI_AOO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_UTENTI_DESCRIPTION" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_DOCNAME" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_REVISIONE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="FORMATO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_AOO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="MaxRowCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DM_TASKWORK_NOMETASK" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_AllegatiWork_Select", propOrder = {
    "id",
    "nomeoriginale",
    "nomeinterno",
    "percorso",
    "utente",
    "data",
    "idprocesso",
    "idtask",
    "tipoallegato",
    "docnumber",
    "rev",
    "pswzip",
    "tosend",
    "cstring",
    "dmutentiaoo",
    "dmutentidescription",
    "dmprofiledocname",
    "dmprofilerevisione",
    "formato",
    "dmprofileaoo",
    "maxRowCount",
    "dmtaskworknometask"
})
public class DmAllegatiWorkSelect {

    @XmlElement(name = "ID")
    protected BaseSelected id;
    @XmlElement(name = "NOMEORIGINALE")
    protected BaseSelected nomeoriginale;
    @XmlElement(name = "NOMEINTERNO")
    protected BaseSelected nomeinterno;
    @XmlElement(name = "PERCORSO")
    protected BaseSelected percorso;
    @XmlElement(name = "UTENTE")
    protected BaseSelected utente;
    @XmlElement(name = "DATA")
    protected BaseSelected data;
    @XmlElement(name = "IDPROCESSO")
    protected BaseSelected idprocesso;
    @XmlElement(name = "IDTASK")
    protected BaseSelected idtask;
    @XmlElement(name = "TIPOALLEGATO")
    protected BaseSelected tipoallegato;
    @XmlElement(name = "DOCNUMBER")
    protected BaseSelected docnumber;
    @XmlElement(name = "REV")
    protected BaseSelected rev;
    @XmlElement(name = "PSWZIP")
    protected BaseSelected pswzip;
    @XmlElement(name = "TOSEND")
    protected BaseSelected tosend;
    @XmlElement(name = "CSTRING")
    protected BaseSelected cstring;
    @XmlElement(name = "DM_UTENTI_AOO")
    protected BaseSelected dmutentiaoo;
    @XmlElement(name = "DM_UTENTI_DESCRIPTION")
    protected BaseSelected dmutentidescription;
    @XmlElement(name = "DM_PROFILE_DOCNAME")
    protected BaseSelected dmprofiledocname;
    @XmlElement(name = "DM_PROFILE_REVISIONE")
    protected BaseSelected dmprofilerevisione;
    @XmlElement(name = "FORMATO")
    protected BaseSelected formato;
    @XmlElement(name = "DM_PROFILE_AOO")
    protected BaseSelected dmprofileaoo;
    @XmlElement(name = "MaxRowCount")
    protected int maxRowCount;
    @XmlElement(name = "DM_TASKWORK_NOMETASK")
    protected BaseSelected dmtaskworknometask;

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
     * Gets the value of the nomeoriginale property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getNOMEORIGINALE() {
        return nomeoriginale;
    }

    /**
     * Sets the value of the nomeoriginale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setNOMEORIGINALE(BaseSelected value) {
        this.nomeoriginale = value;
    }

    /**
     * Gets the value of the nomeinterno property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getNOMEINTERNO() {
        return nomeinterno;
    }

    /**
     * Sets the value of the nomeinterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setNOMEINTERNO(BaseSelected value) {
        this.nomeinterno = value;
    }

    /**
     * Gets the value of the percorso property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getPERCORSO() {
        return percorso;
    }

    /**
     * Sets the value of the percorso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setPERCORSO(BaseSelected value) {
        this.percorso = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getUTENTE() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setUTENTE(BaseSelected value) {
        this.utente = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDATA() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDATA(BaseSelected value) {
        this.data = value;
    }

    /**
     * Gets the value of the idprocesso property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getIDPROCESSO() {
        return idprocesso;
    }

    /**
     * Sets the value of the idprocesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setIDPROCESSO(BaseSelected value) {
        this.idprocesso = value;
    }

    /**
     * Gets the value of the idtask property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getIDTASK() {
        return idtask;
    }

    /**
     * Sets the value of the idtask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setIDTASK(BaseSelected value) {
        this.idtask = value;
    }

    /**
     * Gets the value of the tipoallegato property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getTIPOALLEGATO() {
        return tipoallegato;
    }

    /**
     * Sets the value of the tipoallegato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setTIPOALLEGATO(BaseSelected value) {
        this.tipoallegato = value;
    }

    /**
     * Gets the value of the docnumber property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDOCNUMBER() {
        return docnumber;
    }

    /**
     * Sets the value of the docnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDOCNUMBER(BaseSelected value) {
        this.docnumber = value;
    }

    /**
     * Gets the value of the rev property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getREV() {
        return rev;
    }

    /**
     * Sets the value of the rev property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setREV(BaseSelected value) {
        this.rev = value;
    }

    /**
     * Gets the value of the pswzip property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getPSWZIP() {
        return pswzip;
    }

    /**
     * Sets the value of the pswzip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setPSWZIP(BaseSelected value) {
        this.pswzip = value;
    }

    /**
     * Gets the value of the tosend property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getTOSEND() {
        return tosend;
    }

    /**
     * Sets the value of the tosend property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setTOSEND(BaseSelected value) {
        this.tosend = value;
    }

    /**
     * Gets the value of the cstring property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getCSTRING() {
        return cstring;
    }

    /**
     * Sets the value of the cstring property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setCSTRING(BaseSelected value) {
        this.cstring = value;
    }

    /**
     * Gets the value of the dmutentiaoo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMUTENTIAOO() {
        return dmutentiaoo;
    }

    /**
     * Sets the value of the dmutentiaoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMUTENTIAOO(BaseSelected value) {
        this.dmutentiaoo = value;
    }

    /**
     * Gets the value of the dmutentidescription property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMUTENTIDESCRIPTION() {
        return dmutentidescription;
    }

    /**
     * Sets the value of the dmutentidescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMUTENTIDESCRIPTION(BaseSelected value) {
        this.dmutentidescription = value;
    }

    /**
     * Gets the value of the dmprofiledocname property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEDOCNAME() {
        return dmprofiledocname;
    }

    /**
     * Sets the value of the dmprofiledocname property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEDOCNAME(BaseSelected value) {
        this.dmprofiledocname = value;
    }

    /**
     * Gets the value of the dmprofilerevisione property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEREVISIONE() {
        return dmprofilerevisione;
    }

    /**
     * Sets the value of the dmprofilerevisione property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEREVISIONE(BaseSelected value) {
        this.dmprofilerevisione = value;
    }

    /**
     * Gets the value of the formato property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getFORMATO() {
        return formato;
    }

    /**
     * Sets the value of the formato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setFORMATO(BaseSelected value) {
        this.formato = value;
    }

    /**
     * Gets the value of the dmprofileaoo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEAOO() {
        return dmprofileaoo;
    }

    /**
     * Sets the value of the dmprofileaoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEAOO(BaseSelected value) {
        this.dmprofileaoo = value;
    }

    /**
     * Gets the value of the maxRowCount property.
     * 
     */
    public int getMaxRowCount() {
        return maxRowCount;
    }

    /**
     * Sets the value of the maxRowCount property.
     * 
     */
    public void setMaxRowCount(int value) {
        this.maxRowCount = value;
    }

    /**
     * Gets the value of the dmtaskworknometask property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKWORKNOMETASK() {
        return dmtaskworknometask;
    }

    /**
     * Sets the value of the dmtaskworknometask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKWORKNOMETASK(BaseSelected value) {
        this.dmtaskworknometask = value;
    }

}
