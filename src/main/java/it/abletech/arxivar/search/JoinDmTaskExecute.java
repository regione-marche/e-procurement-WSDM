
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_TaskExecute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_TaskExecute">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="IDUtente" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="AOO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="UtenteCompleto" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Gruppo_Utente" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ID_Task" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="IDProcesso" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Esito_Task" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="METODO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DATA" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="NOTATASK" type="{http://www.Abletech.it/Arxivar}Field_Full_Text" minOccurs="0"/>
 *         &lt;element name="INELABORAZIONE" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_TaskExecute", propOrder = {
    "id",
    "idUtente",
    "aoo",
    "utenteCompleto",
    "gruppoUtente",
    "idTask",
    "idProcesso",
    "esitoTask",
    "metodo",
    "data",
    "notatask",
    "inelaborazione"
})
public class JoinDmTaskExecute
    extends JoinAbstract
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "IDUtente")
    protected FieldInt idUtente;
    @XmlElement(name = "AOO")
    protected FieldString aoo;
    @XmlElement(name = "UtenteCompleto")
    protected FieldString utenteCompleto;
    @XmlElement(name = "Gruppo_Utente")
    protected FieldString gruppoUtente;
    @XmlElement(name = "ID_Task")
    protected FieldInt idTask;
    @XmlElement(name = "IDProcesso")
    protected FieldInt idProcesso;
    @XmlElement(name = "Esito_Task")
    protected FieldString esitoTask;
    @XmlElement(name = "METODO")
    protected FieldString metodo;
    @XmlElement(name = "DATA")
    protected FieldDateTime data;
    @XmlElement(name = "NOTATASK")
    protected FieldFullText notatask;
    @XmlElement(name = "INELABORAZIONE")
    protected FieldDateTime inelaborazione;

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
     * Gets the value of the idUtente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDUtente() {
        return idUtente;
    }

    /**
     * Sets the value of the idUtente property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDUtente(FieldInt value) {
        this.idUtente = value;
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
     * Gets the value of the utenteCompleto property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUtenteCompleto() {
        return utenteCompleto;
    }

    /**
     * Sets the value of the utenteCompleto property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUtenteCompleto(FieldString value) {
        this.utenteCompleto = value;
    }

    /**
     * Gets the value of the gruppoUtente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getGruppoUtente() {
        return gruppoUtente;
    }

    /**
     * Sets the value of the gruppoUtente property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setGruppoUtente(FieldString value) {
        this.gruppoUtente = value;
    }

    /**
     * Gets the value of the idTask property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDTask() {
        return idTask;
    }

    /**
     * Sets the value of the idTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDTask(FieldInt value) {
        this.idTask = value;
    }

    /**
     * Gets the value of the idProcesso property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDProcesso() {
        return idProcesso;
    }

    /**
     * Sets the value of the idProcesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDProcesso(FieldInt value) {
        this.idProcesso = value;
    }

    /**
     * Gets the value of the esitoTask property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEsitoTask() {
        return esitoTask;
    }

    /**
     * Sets the value of the esitoTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEsitoTask(FieldString value) {
        this.esitoTask = value;
    }

    /**
     * Gets the value of the metodo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMETODO() {
        return metodo;
    }

    /**
     * Sets the value of the metodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMETODO(FieldString value) {
        this.metodo = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATA() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATA(FieldDateTime value) {
        this.data = value;
    }

    /**
     * Gets the value of the notatask property.
     * 
     * @return
     *     possible object is
     *     {@link FieldFullText }
     *     
     */
    public FieldFullText getNOTATASK() {
        return notatask;
    }

    /**
     * Sets the value of the notatask property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldFullText }
     *     
     */
    public void setNOTATASK(FieldFullText value) {
        this.notatask = value;
    }

    /**
     * Gets the value of the inelaborazione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getINELABORAZIONE() {
        return inelaborazione;
    }

    /**
     * Sets the value of the inelaborazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setINELABORAZIONE(FieldDateTime value) {
        this.inelaborazione = value;
    }

}
