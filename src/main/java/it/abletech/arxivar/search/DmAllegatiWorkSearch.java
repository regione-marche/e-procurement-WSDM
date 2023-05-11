
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_AllegatiWork_Search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_AllegatiWork_Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Base_Search">
 *       &lt;sequence>
 *         &lt;element name="SearchMode" type="{http://www.Abletech.it/Arxivar}AllegatiWork_SearchMode"/>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NOMEORIGINALE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NOMEINTERNO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="PERCORSO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DATA" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="IDPROCESSO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="IDTASK" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPOALLEGATO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DOCNUMBER" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="REV" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="PSWZIP" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="TOSEND" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CSTRING" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DM_UTENTI" type="{http://www.Abletech.it/Arxivar}Join_Dm_Utenti" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE" type="{http://www.Abletech.it/Arxivar}Join_Dm_Profile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_AllegatiWork_Search", propOrder = {
    "searchMode",
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
    "dmutenti",
    "dmprofile"
})
public class DmAllegatiWorkSearch
    extends DmBaseSearch
{

    @XmlElement(name = "SearchMode", required = true)
    protected AllegatiWorkSearchMode searchMode;
    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "NOMEORIGINALE")
    protected FieldString nomeoriginale;
    @XmlElement(name = "NOMEINTERNO")
    protected FieldString nomeinterno;
    @XmlElement(name = "PERCORSO")
    protected FieldString percorso;
    @XmlElement(name = "UTENTE")
    protected FieldInt utente;
    @XmlElement(name = "DATA")
    protected FieldDateTime data;
    @XmlElement(name = "IDPROCESSO")
    protected FieldInt idprocesso;
    @XmlElement(name = "IDTASK")
    protected FieldInt idtask;
    @XmlElement(name = "TIPOALLEGATO")
    protected FieldInt tipoallegato;
    @XmlElement(name = "DOCNUMBER")
    protected FieldInt docnumber;
    @XmlElement(name = "REV")
    protected FieldInt rev;
    @XmlElement(name = "PSWZIP")
    protected FieldString pswzip;
    @XmlElement(name = "TOSEND")
    protected FieldInt tosend;
    @XmlElement(name = "CSTRING")
    protected FieldString cstring;
    @XmlElement(name = "DM_UTENTI")
    protected JoinDmUtenti dmutenti;
    @XmlElement(name = "DM_PROFILE")
    protected JoinDmProfile dmprofile;

    /**
     * Gets the value of the searchMode property.
     * 
     * @return
     *     possible object is
     *     {@link AllegatiWorkSearchMode }
     *     
     */
    public AllegatiWorkSearchMode getSearchMode() {
        return searchMode;
    }

    /**
     * Sets the value of the searchMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllegatiWorkSearchMode }
     *     
     */
    public void setSearchMode(AllegatiWorkSearchMode value) {
        this.searchMode = value;
    }

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
     * Gets the value of the nomeoriginale property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNOMEORIGINALE() {
        return nomeoriginale;
    }

    /**
     * Sets the value of the nomeoriginale property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNOMEORIGINALE(FieldString value) {
        this.nomeoriginale = value;
    }

    /**
     * Gets the value of the nomeinterno property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNOMEINTERNO() {
        return nomeinterno;
    }

    /**
     * Sets the value of the nomeinterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNOMEINTERNO(FieldString value) {
        this.nomeinterno = value;
    }

    /**
     * Gets the value of the percorso property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPERCORSO() {
        return percorso;
    }

    /**
     * Sets the value of the percorso property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPERCORSO(FieldString value) {
        this.percorso = value;
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
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATA() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATA(FieldDateTime value) {
        this.data = value;
    }

    /**
     * Gets the value of the idprocesso property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDPROCESSO() {
        return idprocesso;
    }

    /**
     * Sets the value of the idprocesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDPROCESSO(FieldInt value) {
        this.idprocesso = value;
    }

    /**
     * Gets the value of the idtask property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDTASK() {
        return idtask;
    }

    /**
     * Sets the value of the idtask property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDTASK(FieldInt value) {
        this.idtask = value;
    }

    /**
     * Gets the value of the tipoallegato property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPOALLEGATO() {
        return tipoallegato;
    }

    /**
     * Sets the value of the tipoallegato property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPOALLEGATO(FieldInt value) {
        this.tipoallegato = value;
    }

    /**
     * Gets the value of the docnumber property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDOCNUMBER() {
        return docnumber;
    }

    /**
     * Sets the value of the docnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDOCNUMBER(FieldInt value) {
        this.docnumber = value;
    }

    /**
     * Gets the value of the rev property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getREV() {
        return rev;
    }

    /**
     * Sets the value of the rev property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setREV(FieldInt value) {
        this.rev = value;
    }

    /**
     * Gets the value of the pswzip property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPSWZIP() {
        return pswzip;
    }

    /**
     * Sets the value of the pswzip property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPSWZIP(FieldString value) {
        this.pswzip = value;
    }

    /**
     * Gets the value of the tosend property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTOSEND() {
        return tosend;
    }

    /**
     * Sets the value of the tosend property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTOSEND(FieldInt value) {
        this.tosend = value;
    }

    /**
     * Gets the value of the cstring property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCSTRING() {
        return cstring;
    }

    /**
     * Sets the value of the cstring property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCSTRING(FieldString value) {
        this.cstring = value;
    }

    /**
     * Gets the value of the dmutenti property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmUtenti }
     *     
     */
    public JoinDmUtenti getDMUTENTI() {
        return dmutenti;
    }

    /**
     * Sets the value of the dmutenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmUtenti }
     *     
     */
    public void setDMUTENTI(JoinDmUtenti value) {
        this.dmutenti = value;
    }

    /**
     * Gets the value of the dmprofile property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmProfile }
     *     
     */
    public JoinDmProfile getDMPROFILE() {
        return dmprofile;
    }

    /**
     * Sets the value of the dmprofile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmProfile }
     *     
     */
    public void setDMPROFILE(JoinDmProfile value) {
        this.dmprofile = value;
    }

}
