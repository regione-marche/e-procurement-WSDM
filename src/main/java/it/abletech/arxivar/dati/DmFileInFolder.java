
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Dm_FileInFolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_FileInFolder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FOLDER_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DOCNUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AUTORE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DATA" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="REVISIONE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_FileInFolder", propOrder = {
    "id",
    "folderid",
    "docnumber",
    "autore",
    "data",
    "revisione"
})
public class DmFileInFolder
    extends Base
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "FOLDER_ID")
    protected int folderid;
    @XmlElement(name = "DOCNUMBER")
    protected int docnumber;
    @XmlElement(name = "AUTORE")
    protected int autore;
    @XmlElement(name = "DATA", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "REVISIONE")
    protected int revisione;

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
     * Gets the value of the folderid property.
     * 
     */
    public int getFOLDERID() {
        return folderid;
    }

    /**
     * Sets the value of the folderid property.
     * 
     */
    public void setFOLDERID(int value) {
        this.folderid = value;
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
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATA() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATA(XMLGregorianCalendar value) {
        this.data = value;
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

}
