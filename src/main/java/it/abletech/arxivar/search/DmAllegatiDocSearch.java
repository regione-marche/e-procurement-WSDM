
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_AllegatiDoc_Search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_AllegatiDoc_Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Base_Search">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DOCNUMBER" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="REVISIONE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NOMEFILE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="PATHFILE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NOMEORIGINALE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DEVICE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ETICHETTACD" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="COMMENTO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DATAIMPORT" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="BLOCCO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="PSWZIP" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="COPIACONFORME" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CSTRING" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="IMPRONTA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CHECKSEND" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CHECKIX" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Dm_Utenti" type="{http://www.Abletech.it/Arxivar}Join_Dm_Utenti" minOccurs="0"/>
 *         &lt;element name="Dm_PermessiAllegati" type="{http://www.Abletech.it/Arxivar}Join_Dm_PermessiAllegati" minOccurs="0"/>
 *         &lt;element name="FLAGAOS" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Dm_Profile" type="{http://www.Abletech.it/Arxivar}Join_Dm_Profile" minOccurs="0"/>
 *         &lt;element name="FILESIZE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="KIND" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DOCNUMBER_ATTACH" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_AllegatiDoc_Search", propOrder = {
    "id",
    "docnumber",
    "revisione",
    "nomefile",
    "pathfile",
    "nomeoriginale",
    "device",
    "etichettacd",
    "commento",
    "dataimport",
    "utente",
    "blocco",
    "pswzip",
    "copiaconforme",
    "cstring",
    "impronta",
    "checksend",
    "checkix",
    "dmUtenti",
    "dmPermessiAllegati",
    "flagaos",
    "dmProfile",
    "filesize",
    "kind",
    "docnumberattach"
})
public class DmAllegatiDocSearch
    extends DmBaseSearch
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "DOCNUMBER")
    protected FieldInt docnumber;
    @XmlElement(name = "REVISIONE")
    protected FieldInt revisione;
    @XmlElement(name = "NOMEFILE")
    protected FieldString nomefile;
    @XmlElement(name = "PATHFILE")
    protected FieldString pathfile;
    @XmlElement(name = "NOMEORIGINALE")
    protected FieldString nomeoriginale;
    @XmlElement(name = "DEVICE")
    protected FieldString device;
    @XmlElement(name = "ETICHETTACD")
    protected FieldString etichettacd;
    @XmlElement(name = "COMMENTO")
    protected FieldString commento;
    @XmlElement(name = "DATAIMPORT")
    protected FieldDateTime dataimport;
    @XmlElement(name = "UTENTE")
    protected FieldInt utente;
    @XmlElement(name = "BLOCCO")
    protected FieldInt blocco;
    @XmlElement(name = "PSWZIP")
    protected FieldString pswzip;
    @XmlElement(name = "COPIACONFORME")
    protected FieldInt copiaconforme;
    @XmlElement(name = "CSTRING")
    protected FieldString cstring;
    @XmlElement(name = "IMPRONTA")
    protected FieldString impronta;
    @XmlElement(name = "CHECKSEND")
    protected FieldInt checksend;
    @XmlElement(name = "CHECKIX")
    protected FieldInt checkix;
    @XmlElement(name = "Dm_Utenti")
    protected JoinDmUtenti dmUtenti;
    @XmlElement(name = "Dm_PermessiAllegati")
    protected JoinDmPermessiAllegati dmPermessiAllegati;
    @XmlElement(name = "FLAGAOS")
    protected FieldInt flagaos;
    @XmlElement(name = "Dm_Profile")
    protected JoinDmProfile dmProfile;
    @XmlElement(name = "FILESIZE")
    protected FieldInt filesize;
    @XmlElement(name = "KIND")
    protected FieldInt kind;
    @XmlElement(name = "DOCNUMBER_ATTACH")
    protected FieldInt docnumberattach;

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
     * Gets the value of the revisione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getREVISIONE() {
        return revisione;
    }

    /**
     * Sets the value of the revisione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setREVISIONE(FieldInt value) {
        this.revisione = value;
    }

    /**
     * Gets the value of the nomefile property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNOMEFILE() {
        return nomefile;
    }

    /**
     * Sets the value of the nomefile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNOMEFILE(FieldString value) {
        this.nomefile = value;
    }

    /**
     * Gets the value of the pathfile property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPATHFILE() {
        return pathfile;
    }

    /**
     * Sets the value of the pathfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPATHFILE(FieldString value) {
        this.pathfile = value;
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
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDEVICE() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDEVICE(FieldString value) {
        this.device = value;
    }

    /**
     * Gets the value of the etichettacd property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getETICHETTACD() {
        return etichettacd;
    }

    /**
     * Sets the value of the etichettacd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setETICHETTACD(FieldString value) {
        this.etichettacd = value;
    }

    /**
     * Gets the value of the commento property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCOMMENTO() {
        return commento;
    }

    /**
     * Sets the value of the commento property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCOMMENTO(FieldString value) {
        this.commento = value;
    }

    /**
     * Gets the value of the dataimport property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATAIMPORT() {
        return dataimport;
    }

    /**
     * Sets the value of the dataimport property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATAIMPORT(FieldDateTime value) {
        this.dataimport = value;
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
     * Gets the value of the blocco property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getBLOCCO() {
        return blocco;
    }

    /**
     * Sets the value of the blocco property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setBLOCCO(FieldInt value) {
        this.blocco = value;
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
     * Gets the value of the copiaconforme property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCOPIACONFORME() {
        return copiaconforme;
    }

    /**
     * Sets the value of the copiaconforme property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCOPIACONFORME(FieldInt value) {
        this.copiaconforme = value;
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
     * Gets the value of the impronta property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getIMPRONTA() {
        return impronta;
    }

    /**
     * Sets the value of the impronta property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setIMPRONTA(FieldString value) {
        this.impronta = value;
    }

    /**
     * Gets the value of the checksend property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCHECKSEND() {
        return checksend;
    }

    /**
     * Sets the value of the checksend property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCHECKSEND(FieldInt value) {
        this.checksend = value;
    }

    /**
     * Gets the value of the checkix property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCHECKIX() {
        return checkix;
    }

    /**
     * Sets the value of the checkix property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCHECKIX(FieldInt value) {
        this.checkix = value;
    }

    /**
     * Gets the value of the dmUtenti property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmUtenti }
     *     
     */
    public JoinDmUtenti getDmUtenti() {
        return dmUtenti;
    }

    /**
     * Sets the value of the dmUtenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmUtenti }
     *     
     */
    public void setDmUtenti(JoinDmUtenti value) {
        this.dmUtenti = value;
    }

    /**
     * Gets the value of the dmPermessiAllegati property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmPermessiAllegati }
     *     
     */
    public JoinDmPermessiAllegati getDmPermessiAllegati() {
        return dmPermessiAllegati;
    }

    /**
     * Sets the value of the dmPermessiAllegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmPermessiAllegati }
     *     
     */
    public void setDmPermessiAllegati(JoinDmPermessiAllegati value) {
        this.dmPermessiAllegati = value;
    }

    /**
     * Gets the value of the flagaos property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getFLAGAOS() {
        return flagaos;
    }

    /**
     * Sets the value of the flagaos property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setFLAGAOS(FieldInt value) {
        this.flagaos = value;
    }

    /**
     * Gets the value of the dmProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmProfile }
     *     
     */
    public JoinDmProfile getDmProfile() {
        return dmProfile;
    }

    /**
     * Sets the value of the dmProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmProfile }
     *     
     */
    public void setDmProfile(JoinDmProfile value) {
        this.dmProfile = value;
    }

    /**
     * Gets the value of the filesize property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getFILESIZE() {
        return filesize;
    }

    /**
     * Sets the value of the filesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setFILESIZE(FieldInt value) {
        this.filesize = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getKIND() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setKIND(FieldInt value) {
        this.kind = value;
    }

    /**
     * Gets the value of the docnumberattach property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDOCNUMBERATTACH() {
        return docnumberattach;
    }

    /**
     * Sets the value of the docnumberattach property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDOCNUMBERATTACH(FieldInt value) {
        this.docnumberattach = value;
    }

}
