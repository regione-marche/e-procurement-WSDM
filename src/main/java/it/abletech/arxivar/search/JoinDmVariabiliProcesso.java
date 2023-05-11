
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_VariabiliProcesso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_VariabiliProcesso">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NOME" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE" type="{http://www.Abletech.it/Arxivar}Field_String_Traduzioni_Pkg" minOccurs="0"/>
 *         &lt;element name="FORMATO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="PROCESSO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ETICHETTA" type="{http://www.Abletech.it/Arxivar}Field_String_Traduzioni_Pkg" minOccurs="0"/>
 *         &lt;element name="COLINDEX" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="MAXNUMROWS" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="IDPARENT" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_VariabiliProcesso", propOrder = {
    "id",
    "nome",
    "descrizione",
    "formato",
    "processo",
    "etichetta",
    "colindex",
    "maxnumrows",
    "idparent"
})
public class JoinDmVariabiliProcesso
    extends JoinAbstract
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "NOME")
    protected FieldString nome;
    @XmlElement(name = "DESCRIZIONE")
    protected FieldStringTraduzioniPkg descrizione;
    @XmlElement(name = "FORMATO")
    protected FieldInt formato;
    @XmlElement(name = "PROCESSO")
    protected FieldInt processo;
    @XmlElement(name = "ETICHETTA")
    protected FieldStringTraduzioniPkg etichetta;
    @XmlElement(name = "COLINDEX")
    protected FieldInt colindex;
    @XmlElement(name = "MAXNUMROWS")
    protected FieldInt maxnumrows;
    @XmlElement(name = "IDPARENT")
    protected FieldInt idparent;

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
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNOME() {
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
    public void setNOME(FieldString value) {
        this.nome = value;
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
     * Gets the value of the formato property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getFORMATO() {
        return formato;
    }

    /**
     * Sets the value of the formato property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setFORMATO(FieldInt value) {
        this.formato = value;
    }

    /**
     * Gets the value of the processo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getPROCESSO() {
        return processo;
    }

    /**
     * Sets the value of the processo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setPROCESSO(FieldInt value) {
        this.processo = value;
    }

    /**
     * Gets the value of the etichetta property.
     * 
     * @return
     *     possible object is
     *     {@link FieldStringTraduzioniPkg }
     *     
     */
    public FieldStringTraduzioniPkg getETICHETTA() {
        return etichetta;
    }

    /**
     * Sets the value of the etichetta property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldStringTraduzioniPkg }
     *     
     */
    public void setETICHETTA(FieldStringTraduzioniPkg value) {
        this.etichetta = value;
    }

    /**
     * Gets the value of the colindex property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCOLINDEX() {
        return colindex;
    }

    /**
     * Sets the value of the colindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCOLINDEX(FieldInt value) {
        this.colindex = value;
    }

    /**
     * Gets the value of the maxnumrows property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getMAXNUMROWS() {
        return maxnumrows;
    }

    /**
     * Sets the value of the maxnumrows property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setMAXNUMROWS(FieldInt value) {
        this.maxnumrows = value;
    }

    /**
     * Gets the value of the idparent property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDPARENT() {
        return idparent;
    }

    /**
     * Sets the value of the idparent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDPARENT(FieldInt value) {
        this.idparent = value;
    }

}
