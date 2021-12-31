
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Dm_Profile_ForInsert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Profile_ForInsert">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Profile_Insert_Base">
 *       &lt;sequence>
 *         &lt;element name="File" type="{http://www.Abletech.it/Arxivar}Arx_File" minOccurs="0"/>
 *         &lt;element name="DataFile" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Profile_ForInsert", propOrder = {
    "file",
    "dataFile"
})
@XmlSeeAlso({
    DmProfileInsertForMask2 .class,
    DmProfileInsertForMail.class
})
public class DmProfileForInsert
    extends DmProfileInsertBase
{

    @XmlElement(name = "File")
    protected ArxFile file;
    @XmlElement(name = "DataFile", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFile;

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link ArxFile }
     *     
     */
    public ArxFile getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArxFile }
     *     
     */
    public void setFile(ArxFile value) {
        this.file = value;
    }

    /**
     * Gets the value of the dataFile property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFile() {
        return dataFile;
    }

    /**
     * Sets the value of the dataFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFile(XMLGregorianCalendar value) {
        this.dataFile = value;
    }

}
