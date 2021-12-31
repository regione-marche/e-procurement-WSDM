
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_Note complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_Note">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="Id_System" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Docnumber" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Utente" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DataOra" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="Commenti" type="{http://www.Abletech.it/Arxivar}Field_Full_Text" minOccurs="0"/>
 *         &lt;element name="Revisione" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="FLAGAOS" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_Note", propOrder = {
    "idSystem",
    "docnumber",
    "utente",
    "dataOra",
    "commenti",
    "revisione",
    "flagaos"
})
public class JoinDmNote
    extends JoinAbstract
{

    @XmlElement(name = "Id_System")
    protected FieldInt idSystem;
    @XmlElement(name = "Docnumber")
    protected FieldInt docnumber;
    @XmlElement(name = "Utente")
    protected FieldInt utente;
    @XmlElement(name = "DataOra")
    protected FieldDateTime dataOra;
    @XmlElement(name = "Commenti")
    protected FieldFullText commenti;
    @XmlElement(name = "Revisione")
    protected FieldInt revisione;
    @XmlElement(name = "FLAGAOS")
    protected FieldInt flagaos;

    /**
     * Gets the value of the idSystem property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIdSystem() {
        return idSystem;
    }

    /**
     * Sets the value of the idSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIdSystem(FieldInt value) {
        this.idSystem = value;
    }

    /**
     * Gets the value of the docnumber property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDocnumber() {
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
    public void setDocnumber(FieldInt value) {
        this.docnumber = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getUtente() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setUtente(FieldInt value) {
        this.utente = value;
    }

    /**
     * Gets the value of the dataOra property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDataOra() {
        return dataOra;
    }

    /**
     * Sets the value of the dataOra property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDataOra(FieldDateTime value) {
        this.dataOra = value;
    }

    /**
     * Gets the value of the commenti property.
     * 
     * @return
     *     possible object is
     *     {@link FieldFullText }
     *     
     */
    public FieldFullText getCommenti() {
        return commenti;
    }

    /**
     * Sets the value of the commenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldFullText }
     *     
     */
    public void setCommenti(FieldFullText value) {
        this.commenti = value;
    }

    /**
     * Gets the value of the revisione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getRevisione() {
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
    public void setRevisione(FieldInt value) {
        this.revisione = value;
    }

    /**
     * Gets the value of the flagaos property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getFLAGAOS() {
        return flagaos;
    }

    /**
     * Sets the value of the flagaos property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setFLAGAOS(FieldInt value) {
        this.flagaos = value;
    }

}
