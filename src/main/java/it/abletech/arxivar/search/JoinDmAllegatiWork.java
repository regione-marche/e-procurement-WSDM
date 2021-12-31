
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_AllegatiWork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_AllegatiWork">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NOMEORIGINALE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NOMEINTERNO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="PERCORSO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DATA" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="IDWORKFLOW" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="IDTASK" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPOALLEGATO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NUMDOC" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="REV" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="PSWZIP" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="TOSEND" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CSTRING" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_AllegatiWork", propOrder = {
    "id",
    "nomeoriginale",
    "nomeinterno",
    "percorso",
    "utente",
    "data",
    "idworkflow",
    "idtask",
    "tipoallegato",
    "numdoc",
    "rev",
    "pswzip",
    "tosend",
    "cstring"
})
public class JoinDmAllegatiWork
    extends JoinAbstract
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "NOMEORIGINALE")
    protected FieldString nomeoriginale;
    @XmlElement(name = "NOMEINTERNO")
    protected FieldString nomeinterno;
    @XmlElement(name = "PERCORSO")
    protected FieldString percorso;
    @XmlElement(name = "UTENTE")
    protected FieldInt utente;
    @XmlElement(name = "DATA")
    protected FieldDateTime data;
    @XmlElement(name = "IDWORKFLOW")
    protected FieldInt idworkflow;
    @XmlElement(name = "IDTASK")
    protected FieldInt idtask;
    @XmlElement(name = "TIPOALLEGATO")
    protected FieldInt tipoallegato;
    @XmlElement(name = "NUMDOC")
    protected FieldInt numdoc;
    @XmlElement(name = "REV")
    protected FieldInt rev;
    @XmlElement(name = "PSWZIP")
    protected FieldString pswzip;
    @XmlElement(name = "TOSEND")
    protected FieldInt tosend;
    @XmlElement(name = "CSTRING")
    protected FieldString cstring;

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
     * Gets the value of the nomeoriginale property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNOMEORIGINALE() {
        return nomeoriginale;
    }

    /**
     * Sets the value of the nomeoriginale property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNOMEORIGINALE(FieldString value) {
        this.nomeoriginale = value;
    }

    /**
     * Gets the value of the nomeinterno property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNOMEINTERNO() {
        return nomeinterno;
    }

    /**
     * Sets the value of the nomeinterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNOMEINTERNO(FieldString value) {
        this.nomeinterno = value;
    }

    /**
     * Gets the value of the percorso property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPERCORSO() {
        return percorso;
    }

    /**
     * Sets the value of the percorso property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPERCORSO(FieldString value) {
        this.percorso = value;
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
     * Gets the value of the idworkflow property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDWORKFLOW() {
        return idworkflow;
    }

    /**
     * Sets the value of the idworkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDWORKFLOW(FieldInt value) {
        this.idworkflow = value;
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
     * Gets the value of the tipoallegato property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPOALLEGATO() {
        return tipoallegato;
    }

    /**
     * Sets the value of the tipoallegato property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPOALLEGATO(FieldInt value) {
        this.tipoallegato = value;
    }

    /**
     * Gets the value of the numdoc property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getNUMDOC() {
        return numdoc;
    }

    /**
     * Sets the value of the numdoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setNUMDOC(FieldInt value) {
        this.numdoc = value;
    }

    /**
     * Gets the value of the rev property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getREV() {
        return rev;
    }

    /**
     * Sets the value of the rev property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setREV(FieldInt value) {
        this.rev = value;
    }

    /**
     * Gets the value of the pswzip property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPSWZIP() {
        return pswzip;
    }

    /**
     * Sets the value of the pswzip property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPSWZIP(FieldString value) {
        this.pswzip = value;
    }

    /**
     * Gets the value of the tosend property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTOSEND() {
        return tosend;
    }

    /**
     * Sets the value of the tosend property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTOSEND(FieldInt value) {
        this.tosend = value;
    }

    /**
     * Gets the value of the cstring property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCSTRING() {
        return cstring;
    }

    /**
     * Sets the value of the cstring property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCSTRING(FieldString value) {
        this.cstring = value;
    }

}
