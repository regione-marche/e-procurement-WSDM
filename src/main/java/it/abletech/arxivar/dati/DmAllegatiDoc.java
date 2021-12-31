
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Dm_AllegatiDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_AllegatiDoc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DOCNUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="REVISIONE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NOMEFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PATHFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOMEORIGINALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEVICE" type="{http://www.Abletech.it/Arxivar}Device"/>
 *         &lt;element name="ETICHETTACD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATAIMPORT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UTENTE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BLOCCO" type="{http://www.Abletech.it/Arxivar}Dm_AllegatiDoc_Blocco"/>
 *         &lt;element name="PSWZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COPIACONFORME" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CSTRING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMPRONTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECKSEND" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FLAGAOS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Accesso" type="{http://www.Abletech.it/Arxivar}Dm_PermessiAllegati_AccessType"/>
 *         &lt;element name="FILESIZE" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="KIND" type="{http://www.Abletech.it/Arxivar}Dm_AllegatiDoc_Kind"/>
 *         &lt;element name="DOCNUMBER_ATTACH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CHECKIX" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_AllegatiDoc", propOrder = {
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
    "flagaos",
    "accesso",
    "filesize",
    "kind",
    "docnumberattach",
    "checkix"
})
public class DmAllegatiDoc
    extends Base
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "DOCNUMBER")
    protected int docnumber;
    @XmlElement(name = "REVISIONE")
    protected int revisione;
    @XmlElement(name = "NOMEFILE")
    protected String nomefile;
    @XmlElement(name = "PATHFILE")
    protected String pathfile;
    @XmlElement(name = "NOMEORIGINALE")
    protected String nomeoriginale;
    @XmlElement(name = "DEVICE", required = true)
    protected Device device;
    @XmlElement(name = "ETICHETTACD")
    protected String etichettacd;
    @XmlElement(name = "COMMENTO")
    protected String commento;
    @XmlElement(name = "DATAIMPORT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataimport;
    @XmlElement(name = "UTENTE")
    protected int utente;
    @XmlElement(name = "BLOCCO", required = true)
    protected DmAllegatiDocBlocco blocco;
    @XmlElement(name = "PSWZIP")
    protected String pswzip;
    @XmlElement(name = "COPIACONFORME")
    protected boolean copiaconforme;
    @XmlElement(name = "CSTRING")
    protected String cstring;
    @XmlElement(name = "IMPRONTA")
    protected String impronta;
    @XmlElement(name = "CHECKSEND")
    protected boolean checksend;
    @XmlElement(name = "FLAGAOS")
    protected boolean flagaos;
    @XmlElement(name = "Accesso", required = true)
    protected DmPermessiAllegatiAccessType accesso;
    @XmlElement(name = "FILESIZE", required = true, type = Long.class, nillable = true)
    protected Long filesize;
    @XmlElement(name = "KIND", required = true)
    protected DmAllegatiDocKind kind;
    @XmlElement(name = "DOCNUMBER_ATTACH", required = true, type = Integer.class, nillable = true)
    protected Integer docnumberattach;
    @XmlElement(name = "CHECKIX")
    protected boolean checkix;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the docnumber property.
     * 
     */
    public int getDOCNUMBER() {
        return docnumber;
    }

    /**
     * Sets the value of the docnumber property.
     * 
     */
    public void setDOCNUMBER(int value) {
        this.docnumber = value;
    }

    /**
     * Gets the value of the revisione property.
     * 
     */
    public int getREVISIONE() {
        return revisione;
    }

    /**
     * Sets the value of the revisione property.
     * 
     */
    public void setREVISIONE(int value) {
        this.revisione = value;
    }

    /**
     * Gets the value of the nomefile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEFILE() {
        return nomefile;
    }

    /**
     * Sets the value of the nomefile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEFILE(String value) {
        this.nomefile = value;
    }

    /**
     * Gets the value of the pathfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATHFILE() {
        return pathfile;
    }

    /**
     * Sets the value of the pathfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATHFILE(String value) {
        this.pathfile = value;
    }

    /**
     * Gets the value of the nomeoriginale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEORIGINALE() {
        return nomeoriginale;
    }

    /**
     * Sets the value of the nomeoriginale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEORIGINALE(String value) {
        this.nomeoriginale = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link Device }
     *     
     */
    public Device getDEVICE() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link Device }
     *     
     */
    public void setDEVICE(Device value) {
        this.device = value;
    }

    /**
     * Gets the value of the etichettacd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETICHETTACD() {
        return etichettacd;
    }

    /**
     * Sets the value of the etichettacd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETICHETTACD(String value) {
        this.etichettacd = value;
    }

    /**
     * Gets the value of the commento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMENTO() {
        return commento;
    }

    /**
     * Sets the value of the commento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMENTO(String value) {
        this.commento = value;
    }

    /**
     * Gets the value of the dataimport property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAIMPORT() {
        return dataimport;
    }

    /**
     * Sets the value of the dataimport property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAIMPORT(XMLGregorianCalendar value) {
        this.dataimport = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     */
    public int getUTENTE() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     */
    public void setUTENTE(int value) {
        this.utente = value;
    }

    /**
     * Gets the value of the blocco property.
     * 
     * @return
     *     possible object is
     *     {@link DmAllegatiDocBlocco }
     *     
     */
    public DmAllegatiDocBlocco getBLOCCO() {
        return blocco;
    }

    /**
     * Sets the value of the blocco property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAllegatiDocBlocco }
     *     
     */
    public void setBLOCCO(DmAllegatiDocBlocco value) {
        this.blocco = value;
    }

    /**
     * Gets the value of the pswzip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSWZIP() {
        return pswzip;
    }

    /**
     * Sets the value of the pswzip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSWZIP(String value) {
        this.pswzip = value;
    }

    /**
     * Gets the value of the copiaconforme property.
     * 
     */
    public boolean isCOPIACONFORME() {
        return copiaconforme;
    }

    /**
     * Sets the value of the copiaconforme property.
     * 
     */
    public void setCOPIACONFORME(boolean value) {
        this.copiaconforme = value;
    }

    /**
     * Gets the value of the cstring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSTRING() {
        return cstring;
    }

    /**
     * Sets the value of the cstring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSTRING(String value) {
        this.cstring = value;
    }

    /**
     * Gets the value of the impronta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPRONTA() {
        return impronta;
    }

    /**
     * Sets the value of the impronta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPRONTA(String value) {
        this.impronta = value;
    }

    /**
     * Gets the value of the checksend property.
     * 
     */
    public boolean isCHECKSEND() {
        return checksend;
    }

    /**
     * Sets the value of the checksend property.
     * 
     */
    public void setCHECKSEND(boolean value) {
        this.checksend = value;
    }

    /**
     * Gets the value of the flagaos property.
     * 
     */
    public boolean isFLAGAOS() {
        return flagaos;
    }

    /**
     * Sets the value of the flagaos property.
     * 
     */
    public void setFLAGAOS(boolean value) {
        this.flagaos = value;
    }

    /**
     * Gets the value of the accesso property.
     * 
     * @return
     *     possible object is
     *     {@link DmPermessiAllegatiAccessType }
     *     
     */
    public DmPermessiAllegatiAccessType getAccesso() {
        return accesso;
    }

    /**
     * Sets the value of the accesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPermessiAllegatiAccessType }
     *     
     */
    public void setAccesso(DmPermessiAllegatiAccessType value) {
        this.accesso = value;
    }

    /**
     * Gets the value of the filesize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFILESIZE() {
        return filesize;
    }

    /**
     * Sets the value of the filesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFILESIZE(Long value) {
        this.filesize = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link DmAllegatiDocKind }
     *     
     */
    public DmAllegatiDocKind getKIND() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAllegatiDocKind }
     *     
     */
    public void setKIND(DmAllegatiDocKind value) {
        this.kind = value;
    }

    /**
     * Gets the value of the docnumberattach property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDOCNUMBERATTACH() {
        return docnumberattach;
    }

    /**
     * Sets the value of the docnumberattach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDOCNUMBERATTACH(Integer value) {
        this.docnumberattach = value;
    }

    /**
     * Gets the value of the checkix property.
     * 
     */
    public boolean isCHECKIX() {
        return checkix;
    }

    /**
     * Sets the value of the checkix property.
     * 
     */
    public void setCHECKIX(boolean value) {
        this.checkix = value;
    }

}
