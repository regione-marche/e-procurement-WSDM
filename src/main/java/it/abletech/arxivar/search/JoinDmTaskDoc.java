
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_TaskDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_TaskDoc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="IDTASK" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="IDPROCESSO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="INPUTNEWDOC" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DOCOBBLIGATORIO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="INPUT_TYPE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="COPIAEDIT" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPO1" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPO2" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPO3" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="MODULO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ASSOCIA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE" type="{http://www.Abletech.it/Arxivar}Field_String_Traduzioni_Pkg" minOccurs="0"/>
 *         &lt;element name="TOSEND" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="MODE_FILE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="MODE_SCANNER" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="OP_ESEGUITA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="PRATICA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="MODE_TP" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="MODE_REL" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DM_MASK_ID" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_TaskDoc", propOrder = {
    "id",
    "idtask",
    "idprocesso",
    "inputnewdoc",
    "docobbligatorio",
    "inputtype",
    "copiaedit",
    "tipo1",
    "tipo2",
    "tipo3",
    "modulo",
    "associa",
    "descrizione",
    "tosend",
    "modefile",
    "modescanner",
    "opeseguita",
    "pratica",
    "modetp",
    "moderel",
    "dmmaskid"
})
public class JoinDmTaskDoc
    extends JoinAbstract
{

    @XmlElement(name = "ID")
    protected FieldString id;
    @XmlElement(name = "IDTASK")
    protected FieldInt idtask;
    @XmlElement(name = "IDPROCESSO")
    protected FieldInt idprocesso;
    @XmlElement(name = "INPUTNEWDOC")
    protected FieldInt inputnewdoc;
    @XmlElement(name = "DOCOBBLIGATORIO")
    protected FieldInt docobbligatorio;
    @XmlElement(name = "INPUT_TYPE")
    protected FieldInt inputtype;
    @XmlElement(name = "COPIAEDIT")
    protected FieldInt copiaedit;
    @XmlElement(name = "TIPO1")
    protected FieldInt tipo1;
    @XmlElement(name = "TIPO2")
    protected FieldInt tipo2;
    @XmlElement(name = "TIPO3")
    protected FieldInt tipo3;
    @XmlElement(name = "MODULO")
    protected FieldInt modulo;
    @XmlElement(name = "ASSOCIA")
    protected FieldInt associa;
    @XmlElement(name = "DESCRIZIONE")
    protected FieldStringTraduzioniPkg descrizione;
    @XmlElement(name = "TOSEND")
    protected FieldInt tosend;
    @XmlElement(name = "MODE_FILE")
    protected FieldInt modefile;
    @XmlElement(name = "MODE_SCANNER")
    protected FieldInt modescanner;
    @XmlElement(name = "OP_ESEGUITA")
    protected FieldInt opeseguita;
    @XmlElement(name = "PRATICA")
    protected FieldString pratica;
    @XmlElement(name = "MODE_TP")
    protected FieldInt modetp;
    @XmlElement(name = "MODE_REL")
    protected FieldInt moderel;
    @XmlElement(name = "DM_MASK_ID")
    protected FieldString dmmaskid;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setID(FieldString value) {
        this.id = value;
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
     * Gets the value of the inputnewdoc property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getINPUTNEWDOC() {
        return inputnewdoc;
    }

    /**
     * Sets the value of the inputnewdoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setINPUTNEWDOC(FieldInt value) {
        this.inputnewdoc = value;
    }

    /**
     * Gets the value of the docobbligatorio property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDOCOBBLIGATORIO() {
        return docobbligatorio;
    }

    /**
     * Sets the value of the docobbligatorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDOCOBBLIGATORIO(FieldInt value) {
        this.docobbligatorio = value;
    }

    /**
     * Gets the value of the inputtype property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getINPUTTYPE() {
        return inputtype;
    }

    /**
     * Sets the value of the inputtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setINPUTTYPE(FieldInt value) {
        this.inputtype = value;
    }

    /**
     * Gets the value of the copiaedit property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCOPIAEDIT() {
        return copiaedit;
    }

    /**
     * Sets the value of the copiaedit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCOPIAEDIT(FieldInt value) {
        this.copiaedit = value;
    }

    /**
     * Gets the value of the tipo1 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPO1() {
        return tipo1;
    }

    /**
     * Sets the value of the tipo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPO1(FieldInt value) {
        this.tipo1 = value;
    }

    /**
     * Gets the value of the tipo2 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPO2() {
        return tipo2;
    }

    /**
     * Sets the value of the tipo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPO2(FieldInt value) {
        this.tipo2 = value;
    }

    /**
     * Gets the value of the tipo3 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPO3() {
        return tipo3;
    }

    /**
     * Sets the value of the tipo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPO3(FieldInt value) {
        this.tipo3 = value;
    }

    /**
     * Gets the value of the modulo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getMODULO() {
        return modulo;
    }

    /**
     * Sets the value of the modulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setMODULO(FieldInt value) {
        this.modulo = value;
    }

    /**
     * Gets the value of the associa property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getASSOCIA() {
        return associa;
    }

    /**
     * Sets the value of the associa property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setASSOCIA(FieldInt value) {
        this.associa = value;
    }

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldStringTraduzioniPkg }
     *     
     */
    public FieldStringTraduzioniPkg getDESCRIZIONE() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldStringTraduzioniPkg }
     *     
     */
    public void setDESCRIZIONE(FieldStringTraduzioniPkg value) {
        this.descrizione = value;
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
     * Gets the value of the modefile property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getMODEFILE() {
        return modefile;
    }

    /**
     * Sets the value of the modefile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setMODEFILE(FieldInt value) {
        this.modefile = value;
    }

    /**
     * Gets the value of the modescanner property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getMODESCANNER() {
        return modescanner;
    }

    /**
     * Sets the value of the modescanner property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setMODESCANNER(FieldInt value) {
        this.modescanner = value;
    }

    /**
     * Gets the value of the opeseguita property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getOPESEGUITA() {
        return opeseguita;
    }

    /**
     * Sets the value of the opeseguita property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setOPESEGUITA(FieldInt value) {
        this.opeseguita = value;
    }

    /**
     * Gets the value of the pratica property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPRATICA() {
        return pratica;
    }

    /**
     * Sets the value of the pratica property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPRATICA(FieldString value) {
        this.pratica = value;
    }

    /**
     * Gets the value of the modetp property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getMODETP() {
        return modetp;
    }

    /**
     * Sets the value of the modetp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setMODETP(FieldInt value) {
        this.modetp = value;
    }

    /**
     * Gets the value of the moderel property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getMODEREL() {
        return moderel;
    }

    /**
     * Sets the value of the moderel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setMODEREL(FieldInt value) {
        this.moderel = value;
    }

    /**
     * Gets the value of the dmmaskid property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDMMASKID() {
        return dmmaskid;
    }

    /**
     * Sets the value of the dmmaskid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDMMASKID(FieldString value) {
        this.dmmaskid = value;
    }

}
