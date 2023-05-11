
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_NoteWork_Select complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_NoteWork_Select">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="ID_PROCESSO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="ID_TASK" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DATA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="NOTA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_UTENTI_AOO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_UTENTI_DESCRIPTION" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="MaxRowCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DM_TASKWORK_NOMETASK" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_NoteWork_Select", propOrder = {
    "id",
    "idprocesso",
    "idtask",
    "utente",
    "data",
    "nota",
    "dmutentiaoo",
    "dmutentidescription",
    "maxRowCount",
    "dmtaskworknometask"
})
public class DmNoteWorkSelect {

    @XmlElement(name = "ID")
    protected BaseSelected id;
    @XmlElement(name = "ID_PROCESSO")
    protected BaseSelected idprocesso;
    @XmlElement(name = "ID_TASK")
    protected BaseSelected idtask;
    @XmlElement(name = "UTENTE")
    protected BaseSelected utente;
    @XmlElement(name = "DATA")
    protected BaseSelected data;
    @XmlElement(name = "NOTA")
    protected BaseSelected nota;
    @XmlElement(name = "DM_UTENTI_AOO")
    protected BaseSelected dmutentiaoo;
    @XmlElement(name = "DM_UTENTI_DESCRIPTION")
    protected BaseSelected dmutentidescription;
    @XmlElement(name = "MaxRowCount")
    protected int maxRowCount;
    @XmlElement(name = "DM_TASKWORK_NOMETASK")
    protected BaseSelected dmtaskworknometask;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setID(BaseSelected value) {
        this.id = value;
    }

    /**
     * Gets the value of the idprocesso property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getIDPROCESSO() {
        return idprocesso;
    }

    /**
     * Sets the value of the idprocesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setIDPROCESSO(BaseSelected value) {
        this.idprocesso = value;
    }

    /**
     * Gets the value of the idtask property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getIDTASK() {
        return idtask;
    }

    /**
     * Sets the value of the idtask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setIDTASK(BaseSelected value) {
        this.idtask = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getUTENTE() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setUTENTE(BaseSelected value) {
        this.utente = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDATA() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDATA(BaseSelected value) {
        this.data = value;
    }

    /**
     * Gets the value of the nota property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getNOTA() {
        return nota;
    }

    /**
     * Sets the value of the nota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setNOTA(BaseSelected value) {
        this.nota = value;
    }

    /**
     * Gets the value of the dmutentiaoo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMUTENTIAOO() {
        return dmutentiaoo;
    }

    /**
     * Sets the value of the dmutentiaoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMUTENTIAOO(BaseSelected value) {
        this.dmutentiaoo = value;
    }

    /**
     * Gets the value of the dmutentidescription property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMUTENTIDESCRIPTION() {
        return dmutentidescription;
    }

    /**
     * Sets the value of the dmutentidescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMUTENTIDESCRIPTION(BaseSelected value) {
        this.dmutentidescription = value;
    }

    /**
     * Gets the value of the maxRowCount property.
     * 
     */
    public int getMaxRowCount() {
        return maxRowCount;
    }

    /**
     * Sets the value of the maxRowCount property.
     * 
     */
    public void setMaxRowCount(int value) {
        this.maxRowCount = value;
    }

    /**
     * Gets the value of the dmtaskworknometask property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKWORKNOMETASK() {
        return dmtaskworknometask;
    }

    /**
     * Sets the value of the dmtaskworknometask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKWORKNOMETASK(BaseSelected value) {
        this.dmtaskworknometask = value;
    }

}
