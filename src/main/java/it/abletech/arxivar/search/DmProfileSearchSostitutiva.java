
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Profile_Search_Sostitutiva complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Profile_Search_Sostitutiva">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="Note" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="Utente" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Capacita" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="QtaFile" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CpaFile" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Tipo" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Unita" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Operatore" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CodFisOp" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="RespAos" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="PubbUff" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CodFisPu" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Commento" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Etichetta" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DataValMt" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="IsLul" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="LinkedVol" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Aoo" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Profile_Search_Sostitutiva", propOrder = {
    "note",
    "nome",
    "data",
    "utente",
    "capacita",
    "qtaFile",
    "cpaFile",
    "tipo",
    "unita",
    "descrizione",
    "operatore",
    "codFisOp",
    "respAos",
    "pubbUff",
    "codFisPu",
    "commento",
    "etichetta",
    "dataValMt",
    "isLul",
    "linkedVol",
    "aoo"
})
public class DmProfileSearchSostitutiva
    extends JoinAbstract
{

    @XmlElement(name = "Note")
    protected FieldString note;
    @XmlElement(name = "Nome")
    protected FieldString nome;
    @XmlElement(name = "Data")
    protected FieldDateTime data;
    @XmlElement(name = "Utente")
    protected FieldInt utente;
    @XmlElement(name = "Capacita")
    protected FieldInt capacita;
    @XmlElement(name = "QtaFile")
    protected FieldInt qtaFile;
    @XmlElement(name = "CpaFile")
    protected FieldInt cpaFile;
    @XmlElement(name = "Tipo")
    protected FieldString tipo;
    @XmlElement(name = "Unita")
    protected FieldString unita;
    @XmlElement(name = "Descrizione")
    protected FieldString descrizione;
    @XmlElement(name = "Operatore")
    protected FieldString operatore;
    @XmlElement(name = "CodFisOp")
    protected FieldString codFisOp;
    @XmlElement(name = "RespAos")
    protected FieldString respAos;
    @XmlElement(name = "PubbUff")
    protected FieldString pubbUff;
    @XmlElement(name = "CodFisPu")
    protected FieldString codFisPu;
    @XmlElement(name = "Commento")
    protected FieldString commento;
    @XmlElement(name = "Etichetta")
    protected FieldString etichetta;
    @XmlElement(name = "DataValMt")
    protected FieldDateTime dataValMt;
    @XmlElement(name = "IsLul")
    protected FieldInt isLul;
    @XmlElement(name = "LinkedVol")
    protected FieldString linkedVol;
    @XmlElement(name = "Aoo")
    protected FieldString aoo;

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNote(FieldString value) {
        this.note = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNome(FieldString value) {
        this.nome = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getData() {
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
    public void setData(FieldDateTime value) {
        this.data = value;
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
     * Gets the value of the capacita property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCapacita() {
        return capacita;
    }

    /**
     * Sets the value of the capacita property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCapacita(FieldInt value) {
        this.capacita = value;
    }

    /**
     * Gets the value of the qtaFile property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getQtaFile() {
        return qtaFile;
    }

    /**
     * Sets the value of the qtaFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setQtaFile(FieldInt value) {
        this.qtaFile = value;
    }

    /**
     * Gets the value of the cpaFile property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCpaFile() {
        return cpaFile;
    }

    /**
     * Sets the value of the cpaFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCpaFile(FieldInt value) {
        this.cpaFile = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTipo(FieldString value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the unita property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUnita() {
        return unita;
    }

    /**
     * Sets the value of the unita property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUnita(FieldString value) {
        this.unita = value;
    }

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDescrizione(FieldString value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the operatore property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getOperatore() {
        return operatore;
    }

    /**
     * Sets the value of the operatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setOperatore(FieldString value) {
        this.operatore = value;
    }

    /**
     * Gets the value of the codFisOp property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCodFisOp() {
        return codFisOp;
    }

    /**
     * Sets the value of the codFisOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCodFisOp(FieldString value) {
        this.codFisOp = value;
    }

    /**
     * Gets the value of the respAos property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getRespAos() {
        return respAos;
    }

    /**
     * Sets the value of the respAos property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setRespAos(FieldString value) {
        this.respAos = value;
    }

    /**
     * Gets the value of the pubbUff property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPubbUff() {
        return pubbUff;
    }

    /**
     * Sets the value of the pubbUff property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPubbUff(FieldString value) {
        this.pubbUff = value;
    }

    /**
     * Gets the value of the codFisPu property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCodFisPu() {
        return codFisPu;
    }

    /**
     * Sets the value of the codFisPu property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCodFisPu(FieldString value) {
        this.codFisPu = value;
    }

    /**
     * Gets the value of the commento property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCommento() {
        return commento;
    }

    /**
     * Sets the value of the commento property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCommento(FieldString value) {
        this.commento = value;
    }

    /**
     * Gets the value of the etichetta property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEtichetta() {
        return etichetta;
    }

    /**
     * Sets the value of the etichetta property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEtichetta(FieldString value) {
        this.etichetta = value;
    }

    /**
     * Gets the value of the dataValMt property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDataValMt() {
        return dataValMt;
    }

    /**
     * Sets the value of the dataValMt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDataValMt(FieldDateTime value) {
        this.dataValMt = value;
    }

    /**
     * Gets the value of the isLul property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIsLul() {
        return isLul;
    }

    /**
     * Sets the value of the isLul property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIsLul(FieldInt value) {
        this.isLul = value;
    }

    /**
     * Gets the value of the linkedVol property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLinkedVol() {
        return linkedVol;
    }

    /**
     * Sets the value of the linkedVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLinkedVol(FieldString value) {
        this.linkedVol = value;
    }

    /**
     * Gets the value of the aoo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAoo() {
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
    public void setAoo(FieldString value) {
        this.aoo = value;
    }

}
