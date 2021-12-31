
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_NoteWork_Search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_NoteWork_Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Base_Search">
 *       &lt;sequence>
 *         &lt;element name="SearchMode" type="{http://www.Abletech.it/Arxivar}NoteWork_SearchMode"/>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ID_PROCESSO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ID_TASK" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DATA" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="NOTA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DM_UTENTI" type="{http://www.Abletech.it/Arxivar}Join_Dm_Utenti" minOccurs="0"/>
 *         &lt;element name="DM_TASKWORK" type="{http://www.Abletech.it/Arxivar}Join_Dm_TaskWork" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_NoteWork_Search", propOrder = {
    "searchMode",
    "id",
    "idprocesso",
    "idtask",
    "utente",
    "data",
    "nota",
    "dmutenti",
    "dmtaskwork"
})
public class DmNoteWorkSearch
    extends DmBaseSearch
{

    @XmlElement(name = "SearchMode", required = true)
    protected NoteWorkSearchMode searchMode;
    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "ID_PROCESSO")
    protected FieldInt idprocesso;
    @XmlElement(name = "ID_TASK")
    protected FieldInt idtask;
    @XmlElement(name = "UTENTE")
    protected FieldInt utente;
    @XmlElement(name = "DATA")
    protected FieldDateTime data;
    @XmlElement(name = "NOTA")
    protected FieldString nota;
    @XmlElement(name = "DM_UTENTI")
    protected JoinDmUtenti dmutenti;
    @XmlElement(name = "DM_TASKWORK")
    protected JoinDmTaskWork dmtaskwork;

    /**
     * Gets the value of the searchMode property.
     * 
     * @return
     *     possible object is
     *     {@link NoteWorkSearchMode }
     *     
     */
    public NoteWorkSearchMode getSearchMode() {
        return searchMode;
    }

    /**
     * Sets the value of the searchMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteWorkSearchMode }
     *     
     */
    public void setSearchMode(NoteWorkSearchMode value) {
        this.searchMode = value;
    }

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
     * Gets the value of the idprocesso property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDPROCESSO() {
        return idprocesso;
    }

    /**
     * Sets the value of the idprocesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDPROCESSO(FieldInt value) {
        this.idprocesso = value;
    }

    /**
     * Gets the value of the idtask property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDTASK() {
        return idtask;
    }

    /**
     * Sets the value of the idtask property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDTASK(FieldInt value) {
        this.idtask = value;
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
     * Gets the value of the nota property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNOTA() {
        return nota;
    }

    /**
     * Sets the value of the nota property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNOTA(FieldString value) {
        this.nota = value;
    }

    /**
     * Gets the value of the dmutenti property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmUtenti }
     *     
     */
    public JoinDmUtenti getDMUTENTI() {
        return dmutenti;
    }

    /**
     * Sets the value of the dmutenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmUtenti }
     *     
     */
    public void setDMUTENTI(JoinDmUtenti value) {
        this.dmutenti = value;
    }

    /**
     * Gets the value of the dmtaskwork property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmTaskWork }
     *     
     */
    public JoinDmTaskWork getDMTASKWORK() {
        return dmtaskwork;
    }

    /**
     * Sets the value of the dmtaskwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmTaskWork }
     *     
     */
    public void setDMTASKWORK(JoinDmTaskWork value) {
        this.dmtaskwork = value;
    }

}
