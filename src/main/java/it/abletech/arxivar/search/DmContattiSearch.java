
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Contatti_Search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Contatti_Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Base_Search">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="RUBRICA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CONTATTO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="MANSIONE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="TEL" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="FAX" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CELL" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ABITAZIONE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="REPARTO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="UFFICIO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="EMAIL" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Dm_Rubrica" type="{http://www.Abletech.it/Arxivar}Join_Dm_Rubrica" minOccurs="0"/>
 *         &lt;element name="Dm_CatRubriche" type="{http://www.Abletech.it/Arxivar}Join_Dm_CatRubriche" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Contatti_Search", propOrder = {
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
    "email",
    "dmRubrica",
    "dmCatRubriche"
})
public class DmContattiSearch
    extends DmBaseSearch
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "RUBRICA")
    protected FieldInt rubrica;
    @XmlElement(name = "CONTATTO")
    protected FieldString contatto;
    @XmlElement(name = "MANSIONE")
    protected FieldString mansione;
    @XmlElement(name = "TEL")
    protected FieldString tel;
    @XmlElement(name = "FAX")
    protected FieldString fax;
    @XmlElement(name = "CELL")
    protected FieldString cell;
    @XmlElement(name = "ABITAZIONE")
    protected FieldString abitazione;
    @XmlElement(name = "REPARTO")
    protected FieldString reparto;
    @XmlElement(name = "UFFICIO")
    protected FieldString ufficio;
    @XmlElement(name = "EMAIL")
    protected FieldString email;
    @XmlElement(name = "Dm_Rubrica")
    protected JoinDmRubrica dmRubrica;
    @XmlElement(name = "Dm_CatRubriche")
    protected JoinDmCatRubriche dmCatRubriche;

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
     * Gets the value of the rubrica property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getRUBRICA() {
        return rubrica;
    }

    /**
     * Sets the value of the rubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setRUBRICA(FieldInt value) {
        this.rubrica = value;
    }

    /**
     * Gets the value of the contatto property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCONTATTO() {
        return contatto;
    }

    /**
     * Sets the value of the contatto property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCONTATTO(FieldString value) {
        this.contatto = value;
    }

    /**
     * Gets the value of the mansione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMANSIONE() {
        return mansione;
    }

    /**
     * Sets the value of the mansione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMANSIONE(FieldString value) {
        this.mansione = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTEL() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTEL(FieldString value) {
        this.tel = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFAX() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFAX(FieldString value) {
        this.fax = value;
    }

    /**
     * Gets the value of the cell property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCELL() {
        return cell;
    }

    /**
     * Sets the value of the cell property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCELL(FieldString value) {
        this.cell = value;
    }

    /**
     * Gets the value of the abitazione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getABITAZIONE() {
        return abitazione;
    }

    /**
     * Sets the value of the abitazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setABITAZIONE(FieldString value) {
        this.abitazione = value;
    }

    /**
     * Gets the value of the reparto property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getREPARTO() {
        return reparto;
    }

    /**
     * Sets the value of the reparto property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setREPARTO(FieldString value) {
        this.reparto = value;
    }

    /**
     * Gets the value of the ufficio property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUFFICIO() {
        return ufficio;
    }

    /**
     * Sets the value of the ufficio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUFFICIO(FieldString value) {
        this.ufficio = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEMAIL() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEMAIL(FieldString value) {
        this.email = value;
    }

    /**
     * Gets the value of the dmRubrica property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmRubrica }
     *     
     */
    public JoinDmRubrica getDmRubrica() {
        return dmRubrica;
    }

    /**
     * Sets the value of the dmRubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmRubrica }
     *     
     */
    public void setDmRubrica(JoinDmRubrica value) {
        this.dmRubrica = value;
    }

    /**
     * Gets the value of the dmCatRubriche property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmCatRubriche }
     *     
     */
    public JoinDmCatRubriche getDmCatRubriche() {
        return dmCatRubriche;
    }

    /**
     * Sets the value of the dmCatRubriche property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmCatRubriche }
     *     
     */
    public void setDmCatRubriche(JoinDmCatRubriche value) {
        this.dmCatRubriche = value;
    }

}
