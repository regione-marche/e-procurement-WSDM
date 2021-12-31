
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Profile_Default complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Profile_Default">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="Dm_Profile_Insert_Base" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Insert_Base" minOccurs="0"/>
 *         &lt;element name="INVIAXFAX" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="INVIAXMAIL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="INSERTFOLDER" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="INSERTASS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IMPORTANTE" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BARCODEATTACH" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="STARTFLOW" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="COPIEBARCODE" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ALLEGATASK" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="INSERTRELA" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PROT_RICEVUTA" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PROT_SETUPSCANNER" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DESCRIZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Profile_Default", propOrder = {
    "dmProfileInsertBase",
    "inviaxfax",
    "inviaxmail",
    "insertfolder",
    "insertass",
    "importante",
    "barcodeattach",
    "startflow",
    "copiebarcode",
    "allegatask",
    "insertrela",
    "protricevuta",
    "protsetupscanner",
    "descrizione"
})
public class DmProfileDefault
    extends Base
{

    @XmlElement(name = "Dm_Profile_Insert_Base")
    protected DmProfileInsertBase dmProfileInsertBase;
    @XmlElement(name = "INVIAXFAX")
    protected boolean inviaxfax;
    @XmlElement(name = "INVIAXMAIL")
    protected boolean inviaxmail;
    @XmlElement(name = "INSERTFOLDER")
    protected boolean insertfolder;
    @XmlElement(name = "INSERTASS")
    protected boolean insertass;
    @XmlElement(name = "IMPORTANTE")
    protected boolean importante;
    @XmlElement(name = "BARCODEATTACH")
    protected boolean barcodeattach;
    @XmlElement(name = "STARTFLOW")
    protected boolean startflow;
    @XmlElement(name = "COPIEBARCODE")
    protected boolean copiebarcode;
    @XmlElement(name = "ALLEGATASK")
    protected boolean allegatask;
    @XmlElement(name = "INSERTRELA")
    protected boolean insertrela;
    @XmlElement(name = "PROT_RICEVUTA")
    protected boolean protricevuta;
    @XmlElement(name = "PROT_SETUPSCANNER")
    protected boolean protsetupscanner;
    @XmlElement(name = "DESCRIZIONE")
    protected String descrizione;

    /**
     * Gets the value of the dmProfileInsertBase property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileInsertBase }
     *     
     */
    public DmProfileInsertBase getDmProfileInsertBase() {
        return dmProfileInsertBase;
    }

    /**
     * Sets the value of the dmProfileInsertBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileInsertBase }
     *     
     */
    public void setDmProfileInsertBase(DmProfileInsertBase value) {
        this.dmProfileInsertBase = value;
    }

    /**
     * Gets the value of the inviaxfax property.
     * 
     */
    public boolean isINVIAXFAX() {
        return inviaxfax;
    }

    /**
     * Sets the value of the inviaxfax property.
     * 
     */
    public void setINVIAXFAX(boolean value) {
        this.inviaxfax = value;
    }

    /**
     * Gets the value of the inviaxmail property.
     * 
     */
    public boolean isINVIAXMAIL() {
        return inviaxmail;
    }

    /**
     * Sets the value of the inviaxmail property.
     * 
     */
    public void setINVIAXMAIL(boolean value) {
        this.inviaxmail = value;
    }

    /**
     * Gets the value of the insertfolder property.
     * 
     */
    public boolean isINSERTFOLDER() {
        return insertfolder;
    }

    /**
     * Sets the value of the insertfolder property.
     * 
     */
    public void setINSERTFOLDER(boolean value) {
        this.insertfolder = value;
    }

    /**
     * Gets the value of the insertass property.
     * 
     */
    public boolean isINSERTASS() {
        return insertass;
    }

    /**
     * Sets the value of the insertass property.
     * 
     */
    public void setINSERTASS(boolean value) {
        this.insertass = value;
    }

    /**
     * Gets the value of the importante property.
     * 
     */
    public boolean isIMPORTANTE() {
        return importante;
    }

    /**
     * Sets the value of the importante property.
     * 
     */
    public void setIMPORTANTE(boolean value) {
        this.importante = value;
    }

    /**
     * Gets the value of the barcodeattach property.
     * 
     */
    public boolean isBARCODEATTACH() {
        return barcodeattach;
    }

    /**
     * Sets the value of the barcodeattach property.
     * 
     */
    public void setBARCODEATTACH(boolean value) {
        this.barcodeattach = value;
    }

    /**
     * Gets the value of the startflow property.
     * 
     */
    public boolean isSTARTFLOW() {
        return startflow;
    }

    /**
     * Sets the value of the startflow property.
     * 
     */
    public void setSTARTFLOW(boolean value) {
        this.startflow = value;
    }

    /**
     * Gets the value of the copiebarcode property.
     * 
     */
    public boolean isCOPIEBARCODE() {
        return copiebarcode;
    }

    /**
     * Sets the value of the copiebarcode property.
     * 
     */
    public void setCOPIEBARCODE(boolean value) {
        this.copiebarcode = value;
    }

    /**
     * Gets the value of the allegatask property.
     * 
     */
    public boolean isALLEGATASK() {
        return allegatask;
    }

    /**
     * Sets the value of the allegatask property.
     * 
     */
    public void setALLEGATASK(boolean value) {
        this.allegatask = value;
    }

    /**
     * Gets the value of the insertrela property.
     * 
     */
    public boolean isINSERTRELA() {
        return insertrela;
    }

    /**
     * Sets the value of the insertrela property.
     * 
     */
    public void setINSERTRELA(boolean value) {
        this.insertrela = value;
    }

    /**
     * Gets the value of the protricevuta property.
     * 
     */
    public boolean isPROTRICEVUTA() {
        return protricevuta;
    }

    /**
     * Sets the value of the protricevuta property.
     * 
     */
    public void setPROTRICEVUTA(boolean value) {
        this.protricevuta = value;
    }

    /**
     * Gets the value of the protsetupscanner property.
     * 
     */
    public boolean isPROTSETUPSCANNER() {
        return protsetupscanner;
    }

    /**
     * Sets the value of the protsetupscanner property.
     * 
     */
    public void setPROTSETUPSCANNER(boolean value) {
        this.protsetupscanner = value;
    }

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIZIONE() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIZIONE(String value) {
        this.descrizione = value;
    }

}
