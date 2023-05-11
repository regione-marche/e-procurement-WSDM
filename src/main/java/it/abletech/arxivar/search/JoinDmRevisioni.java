
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_Revisioni complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_Revisioni">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DOCNUMBER" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="REVISIONE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="AUTORE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DATADOC" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="DATAPROF" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="PERCORSO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NOMEFILE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ORIGINALE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DATAFILE" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="ALLEGATI" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="IMPRONTA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="PSWZIP" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DEVICE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ETICHETTACD" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CSTRING" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_Revisioni", propOrder = {
    "id",
    "docnumber",
    "revisione",
    "autore",
    "datadoc",
    "dataprof",
    "percorso",
    "nomefile",
    "originale",
    "datafile",
    "allegati",
    "impronta",
    "pswzip",
    "device",
    "etichettacd",
    "cstring"
})
public class JoinDmRevisioni
    extends JoinAbstract
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "DOCNUMBER")
    protected FieldInt docnumber;
    @XmlElement(name = "REVISIONE")
    protected FieldInt revisione;
    @XmlElement(name = "AUTORE")
    protected FieldInt autore;
    @XmlElement(name = "DATADOC")
    protected FieldDateTime datadoc;
    @XmlElement(name = "DATAPROF")
    protected FieldDateTime dataprof;
    @XmlElement(name = "PERCORSO")
    protected FieldString percorso;
    @XmlElement(name = "NOMEFILE")
    protected FieldString nomefile;
    @XmlElement(name = "ORIGINALE")
    protected FieldString originale;
    @XmlElement(name = "DATAFILE")
    protected FieldDateTime datafile;
    @XmlElement(name = "ALLEGATI")
    protected FieldString allegati;
    @XmlElement(name = "IMPRONTA")
    protected FieldString impronta;
    @XmlElement(name = "PSWZIP")
    protected FieldString pswzip;
    @XmlElement(name = "DEVICE")
    protected FieldString device;
    @XmlElement(name = "ETICHETTACD")
    protected FieldString etichettacd;
    @XmlElement(name = "CSTRING")
    protected FieldString cstring;

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
     * Gets the value of the dataprof property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATAPROF() {
        return dataprof;
    }

    /**
     * Sets the value of the dataprof property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATAPROF(FieldDateTime value) {
        this.dataprof = value;
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

}
