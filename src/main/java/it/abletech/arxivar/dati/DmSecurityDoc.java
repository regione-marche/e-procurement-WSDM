
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_SecurityDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_SecurityDoc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DOCNUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UTENTE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EDITDOC" type="{http://www.Abletech.it/Arxivar}Dm_SecurityDoc_EditDoc"/>
 *         &lt;element name="EDITPROFILO" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FIRMA" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="REVISIONI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DELDOC" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AOS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EXTERNALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_SecurityDoc", propOrder = {
    "id",
    "docnumber",
    "utente",
    "editdoc",
    "editprofilo",
    "firma",
    "revisioni",
    "deldoc",
    "aos",
    "externalid"
})
public class DmSecurityDoc
    extends Base
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "DOCNUMBER")
    protected int docnumber;
    @XmlElement(name = "UTENTE")
    protected int utente;
    @XmlElement(name = "EDITDOC", required = true)
    protected DmSecurityDocEditDoc editdoc;
    @XmlElement(name = "EDITPROFILO")
    protected boolean editprofilo;
    @XmlElement(name = "FIRMA")
    protected boolean firma;
    @XmlElement(name = "REVISIONI")
    protected boolean revisioni;
    @XmlElement(name = "DELDOC")
    protected boolean deldoc;
    @XmlElement(name = "AOS")
    protected boolean aos;
    @XmlElement(name = "EXTERNALID")
    protected String externalid;

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
     * Gets the value of the editdoc property.
     * 
     * @return
     *     possible object is
     *     {@link DmSecurityDocEditDoc }
     *     
     */
    public DmSecurityDocEditDoc getEDITDOC() {
        return editdoc;
    }

    /**
     * Sets the value of the editdoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSecurityDocEditDoc }
     *     
     */
    public void setEDITDOC(DmSecurityDocEditDoc value) {
        this.editdoc = value;
    }

    /**
     * Gets the value of the editprofilo property.
     * 
     */
    public boolean isEDITPROFILO() {
        return editprofilo;
    }

    /**
     * Sets the value of the editprofilo property.
     * 
     */
    public void setEDITPROFILO(boolean value) {
        this.editprofilo = value;
    }

    /**
     * Gets the value of the firma property.
     * 
     */
    public boolean isFIRMA() {
        return firma;
    }

    /**
     * Sets the value of the firma property.
     * 
     */
    public void setFIRMA(boolean value) {
        this.firma = value;
    }

    /**
     * Gets the value of the revisioni property.
     * 
     */
    public boolean isREVISIONI() {
        return revisioni;
    }

    /**
     * Sets the value of the revisioni property.
     * 
     */
    public void setREVISIONI(boolean value) {
        this.revisioni = value;
    }

    /**
     * Gets the value of the deldoc property.
     * 
     */
    public boolean isDELDOC() {
        return deldoc;
    }

    /**
     * Sets the value of the deldoc property.
     * 
     */
    public void setDELDOC(boolean value) {
        this.deldoc = value;
    }

    /**
     * Gets the value of the aos property.
     * 
     */
    public boolean isAOS() {
        return aos;
    }

    /**
     * Sets the value of the aos property.
     * 
     */
    public void setAOS(boolean value) {
        this.aos = value;
    }

    /**
     * Gets the value of the externalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTERNALID() {
        return externalid;
    }

    /**
     * Sets the value of the externalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTERNALID(String value) {
        this.externalid = value;
    }

}
