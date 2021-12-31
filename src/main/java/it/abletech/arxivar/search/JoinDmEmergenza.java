
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_Emergenza complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_Emergenza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DATAINIZIO" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="DATAFINE" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="MOTIVO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NUMEROPROTOCOLLI" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="AOO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CREATIONDATE" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_Emergenza", propOrder = {
    "id",
    "datainizio",
    "datafine",
    "motivo",
    "numeroprotocolli",
    "aoo",
    "utente",
    "tipo",
    "creationdate"
})
public class JoinDmEmergenza
    extends JoinAbstract
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "DATAINIZIO")
    protected FieldDateTime datainizio;
    @XmlElement(name = "DATAFINE")
    protected FieldDateTime datafine;
    @XmlElement(name = "MOTIVO")
    protected FieldString motivo;
    @XmlElement(name = "NUMEROPROTOCOLLI")
    protected FieldInt numeroprotocolli;
    @XmlElement(name = "AOO")
    protected FieldString aoo;
    @XmlElement(name = "UTENTE")
    protected FieldInt utente;
    @XmlElement(name = "TIPO")
    protected FieldInt tipo;
    @XmlElement(name = "CREATIONDATE")
    protected FieldDateTime creationdate;

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
     * Gets the value of the datainizio property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATAINIZIO() {
        return datainizio;
    }

    /**
     * Sets the value of the datainizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATAINIZIO(FieldDateTime value) {
        this.datainizio = value;
    }

    /**
     * Gets the value of the datafine property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATAFINE() {
        return datafine;
    }

    /**
     * Sets the value of the datafine property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATAFINE(FieldDateTime value) {
        this.datafine = value;
    }

    /**
     * Gets the value of the motivo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMOTIVO() {
        return motivo;
    }

    /**
     * Sets the value of the motivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMOTIVO(FieldString value) {
        this.motivo = value;
    }

    /**
     * Gets the value of the numeroprotocolli property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getNUMEROPROTOCOLLI() {
        return numeroprotocolli;
    }

    /**
     * Sets the value of the numeroprotocolli property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setNUMEROPROTOCOLLI(FieldInt value) {
        this.numeroprotocolli = value;
    }

    /**
     * Gets the value of the aoo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAOO() {
        return aoo;
    }

    /**
     * Sets the value of the aoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAOO(FieldString value) {
        this.aoo = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getUTENTE() {
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
    public void setUTENTE(FieldInt value) {
        this.utente = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPO() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPO(FieldInt value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the creationdate property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getCREATIONDATE() {
        return creationdate;
    }

    /**
     * Sets the value of the creationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setCREATIONDATE(FieldDateTime value) {
        this.creationdate = value;
    }

}
