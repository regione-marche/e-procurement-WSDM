
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Dm_Revisioni complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Revisioni">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DOCNUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="REVISIONE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AUTORE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DATADOC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DATAPROF" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PERCORSO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOMEFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORIGINALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATAFILE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ALLEGATI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IMPRONTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PSWZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEVICE" type="{http://www.Abletech.it/Arxivar}Device"/>
 *         &lt;element name="ETICHETTACD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSTRING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMPRESSED" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Revisioni", propOrder = {
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
    "cstring",
    "compressed"
})
public class DmRevisioni
    extends Base
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "DOCNUMBER")
    protected int docnumber;
    @XmlElement(name = "REVISIONE")
    protected int revisione;
    @XmlElement(name = "AUTORE")
    protected int autore;
    @XmlElement(name = "DATADOC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datadoc;
    @XmlElement(name = "DATAPROF", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataprof;
    @XmlElement(name = "PERCORSO")
    protected String percorso;
    @XmlElement(name = "NOMEFILE")
    protected String nomefile;
    @XmlElement(name = "ORIGINALE")
    protected String originale;
    @XmlElement(name = "DATAFILE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datafile;
    @XmlElement(name = "ALLEGATI")
    protected boolean allegati;
    @XmlElement(name = "IMPRONTA")
    protected String impronta;
    @XmlElement(name = "PSWZIP")
    protected String pswzip;
    @XmlElement(name = "DEVICE", required = true)
    protected Device device;
    @XmlElement(name = "ETICHETTACD")
    protected String etichettacd;
    @XmlElement(name = "CSTRING")
    protected String cstring;
    @XmlElement(name = "COMPRESSED")
    protected boolean compressed;

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
     * Gets the value of the autore property.
     * 
     */
    public int getAUTORE() {
        return autore;
    }

    /**
     * Sets the value of the autore property.
     * 
     */
    public void setAUTORE(int value) {
        this.autore = value;
    }

    /**
     * Gets the value of the datadoc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATADOC() {
        return datadoc;
    }

    /**
     * Sets the value of the datadoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATADOC(XMLGregorianCalendar value) {
        this.datadoc = value;
    }

    /**
     * Gets the value of the dataprof property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAPROF() {
        return dataprof;
    }

    /**
     * Sets the value of the dataprof property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAPROF(XMLGregorianCalendar value) {
        this.dataprof = value;
    }

    /**
     * Gets the value of the percorso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERCORSO() {
        return percorso;
    }

    /**
     * Sets the value of the percorso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERCORSO(String value) {
        this.percorso = value;
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
     * Gets the value of the originale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGINALE() {
        return originale;
    }

    /**
     * Sets the value of the originale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGINALE(String value) {
        this.originale = value;
    }

    /**
     * Gets the value of the datafile property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAFILE() {
        return datafile;
    }

    /**
     * Sets the value of the datafile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAFILE(XMLGregorianCalendar value) {
        this.datafile = value;
    }

    /**
     * Gets the value of the allegati property.
     * 
     */
    public boolean isALLEGATI() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     */
    public void setALLEGATI(boolean value) {
        this.allegati = value;
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
     * Gets the value of the compressed property.
     * 
     */
    public boolean isCOMPRESSED() {
        return compressed;
    }

    /**
     * Sets the value of the compressed property.
     * 
     */
    public void setCOMPRESSED(boolean value) {
        this.compressed = value;
    }

}
