
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Dm_Barcode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Barcode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="IDBARCODE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DOCNUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NUMBARCODE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DATALETT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NUMLETT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TIPOBARCODE" type="{http://www.Abletech.it/Arxivar}Dm_Barcode_TipoBarcode"/>
 *         &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORIGINALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATAFILE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IMPRONTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PSWZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPOIMPORTA" type="{http://www.Abletech.it/Arxivar}Dm_Barcode_TipoImpronta"/>
 *         &lt;element name="BARCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSTRING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Barcode", propOrder = {
    "idbarcode",
    "docnumber",
    "numbarcode",
    "datalett",
    "numlett",
    "tipobarcode",
    "path",
    "filename",
    "originale",
    "datafile",
    "impronta",
    "pswzip",
    "tipoimporta",
    "barcode",
    "cstring"
})
public class DmBarcode
    extends Base
{

    @XmlElement(name = "IDBARCODE")
    protected int idbarcode;
    @XmlElement(name = "DOCNUMBER")
    protected int docnumber;
    @XmlElement(name = "NUMBARCODE")
    protected int numbarcode;
    @XmlElement(name = "DATALETT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datalett;
    @XmlElement(name = "NUMLETT")
    protected int numlett;
    @XmlElement(name = "TIPOBARCODE", required = true)
    protected DmBarcodeTipoBarcode tipobarcode;
    @XmlElement(name = "PATH")
    protected String path;
    @XmlElement(name = "FILENAME")
    protected String filename;
    @XmlElement(name = "ORIGINALE")
    protected String originale;
    @XmlElement(name = "DATAFILE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datafile;
    @XmlElement(name = "IMPRONTA")
    protected String impronta;
    @XmlElement(name = "PSWZIP")
    protected String pswzip;
    @XmlElement(name = "TIPOIMPORTA", required = true)
    protected DmBarcodeTipoImpronta tipoimporta;
    @XmlElement(name = "BARCODE")
    protected String barcode;
    @XmlElement(name = "CSTRING")
    protected String cstring;

    /**
     * Gets the value of the idbarcode property.
     * 
     */
    public int getIDBARCODE() {
        return idbarcode;
    }

    /**
     * Sets the value of the idbarcode property.
     * 
     */
    public void setIDBARCODE(int value) {
        this.idbarcode = value;
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
     * Gets the value of the numbarcode property.
     * 
     */
    public int getNUMBARCODE() {
        return numbarcode;
    }

    /**
     * Sets the value of the numbarcode property.
     * 
     */
    public void setNUMBARCODE(int value) {
        this.numbarcode = value;
    }

    /**
     * Gets the value of the datalett property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATALETT() {
        return datalett;
    }

    /**
     * Sets the value of the datalett property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATALETT(XMLGregorianCalendar value) {
        this.datalett = value;
    }

    /**
     * Gets the value of the numlett property.
     * 
     */
    public int getNUMLETT() {
        return numlett;
    }

    /**
     * Sets the value of the numlett property.
     * 
     */
    public void setNUMLETT(int value) {
        this.numlett = value;
    }

    /**
     * Gets the value of the tipobarcode property.
     * 
     * @return
     *     possible object is
     *     {@link DmBarcodeTipoBarcode }
     *     
     */
    public DmBarcodeTipoBarcode getTIPOBARCODE() {
        return tipobarcode;
    }

    /**
     * Sets the value of the tipobarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmBarcodeTipoBarcode }
     *     
     */
    public void setTIPOBARCODE(DmBarcodeTipoBarcode value) {
        this.tipobarcode = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATH() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATH(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILENAME() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILENAME(String value) {
        this.filename = value;
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
     * Gets the value of the tipoimporta property.
     * 
     * @return
     *     possible object is
     *     {@link DmBarcodeTipoImpronta }
     *     
     */
    public DmBarcodeTipoImpronta getTIPOIMPORTA() {
        return tipoimporta;
    }

    /**
     * Sets the value of the tipoimporta property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmBarcodeTipoImpronta }
     *     
     */
    public void setTIPOIMPORTA(DmBarcodeTipoImpronta value) {
        this.tipoimporta = value;
    }

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBARCODE() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBARCODE(String value) {
        this.barcode = value;
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

}
