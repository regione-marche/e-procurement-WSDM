
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Dm_Dati_Ente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Dati_Ente">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_DOC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PROTOCOLLO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATAPROT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UFFICIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PERSONA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPEDIZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VSRIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Dati_Ente", propOrder = {
    "id",
    "iddoc",
    "protocollo",
    "dataprot",
    "ufficio",
    "persona",
    "spedizione",
    "vsrif"
})
public class DmDatiEnte
    extends Base
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "ID_DOC")
    protected int iddoc;
    @XmlElement(name = "PROTOCOLLO")
    protected String protocollo;
    @XmlElement(name = "DATAPROT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataprot;
    @XmlElement(name = "UFFICIO")
    protected String ufficio;
    @XmlElement(name = "PERSONA")
    protected String persona;
    @XmlElement(name = "SPEDIZIONE")
    protected String spedizione;
    @XmlElement(name = "VSRIF")
    protected String vsrif;

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
     * Gets the value of the iddoc property.
     * 
     */
    public int getIDDOC() {
        return iddoc;
    }

    /**
     * Sets the value of the iddoc property.
     * 
     */
    public void setIDDOC(int value) {
        this.iddoc = value;
    }

    /**
     * Gets the value of the protocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROTOCOLLO() {
        return protocollo;
    }

    /**
     * Sets the value of the protocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROTOCOLLO(String value) {
        this.protocollo = value;
    }

    /**
     * Gets the value of the dataprot property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAPROT() {
        return dataprot;
    }

    /**
     * Sets the value of the dataprot property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAPROT(XMLGregorianCalendar value) {
        this.dataprot = value;
    }

    /**
     * Gets the value of the ufficio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUFFICIO() {
        return ufficio;
    }

    /**
     * Sets the value of the ufficio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUFFICIO(String value) {
        this.ufficio = value;
    }

    /**
     * Gets the value of the persona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERSONA() {
        return persona;
    }

    /**
     * Sets the value of the persona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERSONA(String value) {
        this.persona = value;
    }

    /**
     * Gets the value of the spedizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPEDIZIONE() {
        return spedizione;
    }

    /**
     * Sets the value of the spedizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPEDIZIONE(String value) {
        this.spedizione = value;
    }

    /**
     * Gets the value of the vsrif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSRIF() {
        return vsrif;
    }

    /**
     * Sets the value of the vsrif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSRIF(String value) {
        this.vsrif = value;
    }

}
