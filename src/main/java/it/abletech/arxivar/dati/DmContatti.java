
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Contatti complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Contatti">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RUBRICA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CONTATTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MANSIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CELL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ABITAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REPARTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UFFICIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Contatti", propOrder = {
    "id",
    "rubrica",
    "contatto",
    "mansione",
    "tel",
    "fax",
    "cell",
    "abitazione",
    "reparto",
    "ufficio",
    "email"
})
public class DmContatti
    extends Base
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "RUBRICA")
    protected int rubrica;
    @XmlElement(name = "CONTATTO")
    protected String contatto;
    @XmlElement(name = "MANSIONE")
    protected String mansione;
    @XmlElement(name = "TEL")
    protected String tel;
    @XmlElement(name = "FAX")
    protected String fax;
    @XmlElement(name = "CELL")
    protected String cell;
    @XmlElement(name = "ABITAZIONE")
    protected String abitazione;
    @XmlElement(name = "REPARTO")
    protected String reparto;
    @XmlElement(name = "UFFICIO")
    protected String ufficio;
    @XmlElement(name = "EMAIL")
    protected String email;

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
     * Gets the value of the rubrica property.
     * 
     */
    public int getRUBRICA() {
        return rubrica;
    }

    /**
     * Sets the value of the rubrica property.
     * 
     */
    public void setRUBRICA(int value) {
        this.rubrica = value;
    }

    /**
     * Gets the value of the contatto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTATTO() {
        return contatto;
    }

    /**
     * Sets the value of the contatto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTATTO(String value) {
        this.contatto = value;
    }

    /**
     * Gets the value of the mansione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANSIONE() {
        return mansione;
    }

    /**
     * Sets the value of the mansione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANSIONE(String value) {
        this.mansione = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEL() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEL(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAX() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAX(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the cell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCELL() {
        return cell;
    }

    /**
     * Sets the value of the cell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCELL(String value) {
        this.cell = value;
    }

    /**
     * Gets the value of the abitazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABITAZIONE() {
        return abitazione;
    }

    /**
     * Sets the value of the abitazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABITAZIONE(String value) {
        this.abitazione = value;
    }

    /**
     * Gets the value of the reparto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPARTO() {
        return reparto;
    }

    /**
     * Sets the value of the reparto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPARTO(String value) {
        this.reparto = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

}
