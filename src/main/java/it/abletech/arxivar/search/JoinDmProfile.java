
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_Profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_Profile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="DOCNUMBER" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DOCNAME" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DOCUMENTTYPE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPO2" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPO3" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="PATH" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="FILENAME" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NUMERO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DATADOC" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="CC" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="PROFILATO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CREATION_DATE" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="IMPORTANTE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="REVISIONE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="AUTORE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NOTE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="PROTOCOLLO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ANNO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="BLOCCATO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="STATO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="INOUT" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="SCADENZA" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="FLAG" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="WORKFLOW" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ORIGINALE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DATAFILE" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="GESTREV" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DEVICE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ALLEGATI" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="OPENDOC" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ASSOCIAZIONI" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="IMPRONTA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="EMERGENZA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="AOO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="WEBVISIBLE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ISAOS" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="INVOICE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="SCADAOS" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="ETICHETTACD" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ETI_READER" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DATAPROT" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="AGGIUNTIVI" type="{http://www.Abletech.it/Arxivar}ArrayOfField_Abstract" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_Profile", propOrder = {
    "docnumber",
    "docname",
    "documenttype",
    "tipo2",
    "tipo3",
    "path",
    "filename",
    "numero",
    "datadoc",
    "cc",
    "profilato",
    "creationdate",
    "importante",
    "revisione",
    "autore",
    "note",
    "protocollo",
    "anno",
    "bloccato",
    "stato",
    "inout",
    "scadenza",
    "flag",
    "workflow",
    "originale",
    "datafile",
    "gestrev",
    "device",
    "allegati",
    "opendoc",
    "associazioni",
    "impronta",
    "emergenza",
    "aoo",
    "webvisible",
    "isaos",
    "invoice",
    "scadaos",
    "etichettacd",
    "etireader",
    "dataprot",
    "aggiuntivi"
})
public class JoinDmProfile
    extends JoinAbstract
{

    @XmlElement(name = "DOCNUMBER")
    protected FieldInt docnumber;
    @XmlElement(name = "DOCNAME")
    protected FieldString docname;
    @XmlElement(name = "DOCUMENTTYPE")
    protected FieldInt documenttype;
    @XmlElement(name = "TIPO2")
    protected FieldInt tipo2;
    @XmlElement(name = "TIPO3")
    protected FieldInt tipo3;
    @XmlElement(name = "PATH")
    protected FieldString path;
    @XmlElement(name = "FILENAME")
    protected FieldString filename;
    @XmlElement(name = "NUMERO")
    protected FieldString numero;
    @XmlElement(name = "DATADOC")
    protected FieldDateTime datadoc;
    @XmlElement(name = "CC")
    protected FieldString cc;
    @XmlElement(name = "PROFILATO")
    protected FieldString profilato;
    @XmlElement(name = "CREATION_DATE")
    protected FieldDateTime creationdate;
    @XmlElement(name = "IMPORTANTE")
    protected FieldString importante;
    @XmlElement(name = "REVISIONE")
    protected FieldInt revisione;
    @XmlElement(name = "AUTORE")
    protected FieldInt autore;
    @XmlElement(name = "NOTE")
    protected FieldString note;
    @XmlElement(name = "PROTOCOLLO")
    protected FieldString protocollo;
    @XmlElement(name = "ANNO")
    protected FieldString anno;
    @XmlElement(name = "BLOCCATO")
    protected FieldString bloccato;
    @XmlElement(name = "STATO")
    protected FieldString stato;
    @XmlElement(name = "INOUT")
    protected FieldInt inout;
    @XmlElement(name = "SCADENZA")
    protected FieldDateTime scadenza;
    @XmlElement(name = "FLAG")
    protected FieldString flag;
    @XmlElement(name = "WORKFLOW")
    protected FieldInt workflow;
    @XmlElement(name = "ORIGINALE")
    protected FieldString originale;
    @XmlElement(name = "DATAFILE")
    protected FieldDateTime datafile;
    @XmlElement(name = "GESTREV")
    protected FieldInt gestrev;
    @XmlElement(name = "DEVICE")
    protected FieldString device;
    @XmlElement(name = "ALLEGATI")
    protected FieldString allegati;
    @XmlElement(name = "OPENDOC")
    protected FieldInt opendoc;
    @XmlElement(name = "ASSOCIAZIONI")
    protected FieldString associazioni;
    @XmlElement(name = "IMPRONTA")
    protected FieldString impronta;
    @XmlElement(name = "EMERGENZA")
    protected FieldInt emergenza;
    @XmlElement(name = "AOO")
    protected FieldString aoo;
    @XmlElement(name = "WEBVISIBLE")
    protected FieldInt webvisible;
    @XmlElement(name = "ISAOS")
    protected FieldInt isaos;
    @XmlElement(name = "INVOICE")
    protected FieldInt invoice;
    @XmlElement(name = "SCADAOS")
    protected FieldDateTime scadaos;
    @XmlElement(name = "ETICHETTACD")
    protected FieldString etichettacd;
    @XmlElement(name = "ETI_READER")
    protected FieldString etireader;
    @XmlElement(name = "DATAPROT")
    protected FieldDateTime dataprot;
    @XmlElement(name = "AGGIUNTIVI")
    protected ArrayOfFieldAbstract aggiuntivi;

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
     * Gets the value of the docname property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDOCNAME() {
        return docname;
    }

    /**
     * Sets the value of the docname property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDOCNAME(FieldString value) {
        this.docname = value;
    }

    /**
     * Gets the value of the documenttype property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDOCUMENTTYPE() {
        return documenttype;
    }

    /**
     * Sets the value of the documenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDOCUMENTTYPE(FieldInt value) {
        this.documenttype = value;
    }

    /**
     * Gets the value of the tipo2 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPO2() {
        return tipo2;
    }

    /**
     * Sets the value of the tipo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPO2(FieldInt value) {
        this.tipo2 = value;
    }

    /**
     * Gets the value of the tipo3 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPO3() {
        return tipo3;
    }

    /**
     * Sets the value of the tipo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPO3(FieldInt value) {
        this.tipo3 = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPATH() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPATH(FieldString value) {
        this.path = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFILENAME() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFILENAME(FieldString value) {
        this.filename = value;
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
     * Gets the value of the datadoc property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATADOC() {
        return datadoc;
    }

    /**
     * Sets the value of the datadoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATADOC(FieldDateTime value) {
        this.datadoc = value;
    }

    /**
     * Gets the value of the cc property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCC() {
        return cc;
    }

    /**
     * Sets the value of the cc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCC(FieldString value) {
        this.cc = value;
    }

    /**
     * Gets the value of the profilato property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPROFILATO() {
        return profilato;
    }

    /**
     * Sets the value of the profilato property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPROFILATO(FieldString value) {
        this.profilato = value;
    }

    /**
     * Gets the value of the creationdate property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getCREATIONDATE() {
        return creationdate;
    }

    /**
     * Sets the value of the creationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setCREATIONDATE(FieldDateTime value) {
        this.creationdate = value;
    }

    /**
     * Gets the value of the importante property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getIMPORTANTE() {
        return importante;
    }

    /**
     * Sets the value of the importante property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setIMPORTANTE(FieldString value) {
        this.importante = value;
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
     * Gets the value of the autore property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getAUTORE() {
        return autore;
    }

    /**
     * Sets the value of the autore property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setAUTORE(FieldInt value) {
        this.autore = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNOTE() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNOTE(FieldString value) {
        this.note = value;
    }

    /**
     * Gets the value of the protocollo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPROTOCOLLO() {
        return protocollo;
    }

    /**
     * Sets the value of the protocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPROTOCOLLO(FieldString value) {
        this.protocollo = value;
    }

    /**
     * Gets the value of the anno property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getANNO() {
        return anno;
    }

    /**
     * Sets the value of the anno property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setANNO(FieldString value) {
        this.anno = value;
    }

    /**
     * Gets the value of the bloccato property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getBLOCCATO() {
        return bloccato;
    }

    /**
     * Sets the value of the bloccato property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setBLOCCATO(FieldString value) {
        this.bloccato = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSTATO() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSTATO(FieldString value) {
        this.stato = value;
    }

    /**
     * Gets the value of the inout property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getINOUT() {
        return inout;
    }

    /**
     * Sets the value of the inout property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setINOUT(FieldInt value) {
        this.inout = value;
    }

    /**
     * Gets the value of the scadenza property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getSCADENZA() {
        return scadenza;
    }

    /**
     * Sets the value of the scadenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setSCADENZA(FieldDateTime value) {
        this.scadenza = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFLAG() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFLAG(FieldString value) {
        this.flag = value;
    }

    /**
     * Gets the value of the workflow property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getWORKFLOW() {
        return workflow;
    }

    /**
     * Sets the value of the workflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setWORKFLOW(FieldInt value) {
        this.workflow = value;
    }

    /**
     * Gets the value of the originale property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getORIGINALE() {
        return originale;
    }

    /**
     * Sets the value of the originale property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setORIGINALE(FieldString value) {
        this.originale = value;
    }

    /**
     * Gets the value of the datafile property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATAFILE() {
        return datafile;
    }

    /**
     * Sets the value of the datafile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATAFILE(FieldDateTime value) {
        this.datafile = value;
    }

    /**
     * Gets the value of the gestrev property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getGESTREV() {
        return gestrev;
    }

    /**
     * Sets the value of the gestrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setGESTREV(FieldInt value) {
        this.gestrev = value;
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
     * Gets the value of the allegati property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getALLEGATI() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setALLEGATI(FieldString value) {
        this.allegati = value;
    }

    /**
     * Gets the value of the opendoc property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getOPENDOC() {
        return opendoc;
    }

    /**
     * Sets the value of the opendoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setOPENDOC(FieldInt value) {
        this.opendoc = value;
    }

    /**
     * Gets the value of the associazioni property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getASSOCIAZIONI() {
        return associazioni;
    }

    /**
     * Sets the value of the associazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setASSOCIAZIONI(FieldString value) {
        this.associazioni = value;
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
     * Gets the value of the emergenza property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getEMERGENZA() {
        return emergenza;
    }

    /**
     * Sets the value of the emergenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setEMERGENZA(FieldInt value) {
        this.emergenza = value;
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
     * Gets the value of the webvisible property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getWEBVISIBLE() {
        return webvisible;
    }

    /**
     * Sets the value of the webvisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setWEBVISIBLE(FieldInt value) {
        this.webvisible = value;
    }

    /**
     * Gets the value of the isaos property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getISAOS() {
        return isaos;
    }

    /**
     * Sets the value of the isaos property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setISAOS(FieldInt value) {
        this.isaos = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getINVOICE() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setINVOICE(FieldInt value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the scadaos property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getSCADAOS() {
        return scadaos;
    }

    /**
     * Sets the value of the scadaos property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setSCADAOS(FieldDateTime value) {
        this.scadaos = value;
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
     * Gets the value of the etireader property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getETIREADER() {
        return etireader;
    }

    /**
     * Sets the value of the etireader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setETIREADER(FieldString value) {
        this.etireader = value;
    }

    /**
     * Gets the value of the dataprot property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATAPROT() {
        return dataprot;
    }

    /**
     * Sets the value of the dataprot property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATAPROT(FieldDateTime value) {
        this.dataprot = value;
    }

    /**
     * Gets the value of the aggiuntivi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldAbstract }
     *     
     */
    public ArrayOfFieldAbstract getAGGIUNTIVI() {
        return aggiuntivi;
    }

    /**
     * Sets the value of the aggiuntivi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldAbstract }
     *     
     */
    public void setAGGIUNTIVI(ArrayOfFieldAbstract value) {
        this.aggiuntivi = value;
    }

}
