
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_Barcode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_Barcode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="IDBARCODE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DOCNUMBER" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NUMBARCODE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DATALETT" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="NUMLETT" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPOBARCODE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="PATH" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="FILENAME" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ORIGINALE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DATAFILE" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="IMPRONTA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="PSWZIP" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="TIPOIMPORTA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="BARCODE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
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
@XmlType(name = "Join_Dm_Barcode", propOrder = {
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
public class JoinDmBarcode
    extends JoinAbstract
{

    @XmlElement(name = "IDBARCODE")
    protected FieldInt idbarcode;
    @XmlElement(name = "DOCNUMBER")
    protected FieldInt docnumber;
    @XmlElement(name = "NUMBARCODE")
    protected FieldInt numbarcode;
    @XmlElement(name = "DATALETT")
    protected FieldDateTime datalett;
    @XmlElement(name = "NUMLETT")
    protected FieldInt numlett;
    @XmlElement(name = "TIPOBARCODE")
    protected FieldInt tipobarcode;
    @XmlElement(name = "PATH")
    protected FieldString path;
    @XmlElement(name = "FILENAME")
    protected FieldString filename;
    @XmlElement(name = "ORIGINALE")
    protected FieldString originale;
    @XmlElement(name = "DATAFILE")
    protected FieldDateTime datafile;
    @XmlElement(name = "IMPRONTA")
    protected FieldString impronta;
    @XmlElement(name = "PSWZIP")
    protected FieldString pswzip;
    @XmlElement(name = "TIPOIMPORTA")
    protected FieldString tipoimporta;
    @XmlElement(name = "BARCODE")
    protected FieldString barcode;
    @XmlElement(name = "CSTRING")
    protected FieldString cstring;

    /**
     * Gets the value of the idbarcode property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDBARCODE() {
        return idbarcode;
    }

    /**
     * Sets the value of the idbarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDBARCODE(FieldInt value) {
        this.idbarcode = value;
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
     * Gets the value of the numbarcode property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getNUMBARCODE() {
        return numbarcode;
    }

    /**
     * Sets the value of the numbarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setNUMBARCODE(FieldInt value) {
        this.numbarcode = value;
    }

    /**
     * Gets the value of the datalett property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATALETT() {
        return datalett;
    }

    /**
     * Sets the value of the datalett property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATALETT(FieldDateTime value) {
        this.datalett = value;
    }

    /**
     * Gets the value of the numlett property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getNUMLETT() {
        return numlett;
    }

    /**
     * Sets the value of the numlett property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setNUMLETT(FieldInt value) {
        this.numlett = value;
    }

    /**
     * Gets the value of the tipobarcode property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPOBARCODE() {
        return tipobarcode;
    }

    /**
     * Sets the value of the tipobarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPOBARCODE(FieldInt value) {
        this.tipobarcode = value;
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
     * Gets the value of the tipoimporta property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTIPOIMPORTA() {
        return tipoimporta;
    }

    /**
     * Sets the value of the tipoimporta property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTIPOIMPORTA(FieldString value) {
        this.tipoimporta = value;
    }

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getBARCODE() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setBARCODE(FieldString value) {
        this.barcode = value;
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
