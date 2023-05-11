
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Fascicoli_Search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Fascicoli_Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Base_Search">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ID_PADRE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="AUTORE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DATA_CREATE" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="NOME" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ACCESSO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="FULLPATH" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Dm_Permessi_Folder" type="{http://www.Abletech.it/Arxivar}Join_Dm_Permessi_Folder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Fascicoli_Search", propOrder = {
    "id",
    "idpadre",
    "autore",
    "datacreate",
    "nome",
    "accesso",
    "fullpath",
    "dmPermessiFolder"
})
public class DmFascicoliSearch
    extends DmBaseSearch
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "ID_PADRE")
    protected FieldInt idpadre;
    @XmlElement(name = "AUTORE")
    protected FieldInt autore;
    @XmlElement(name = "DATA_CREATE")
    protected FieldDateTime datacreate;
    @XmlElement(name = "NOME")
    protected FieldString nome;
    @XmlElement(name = "ACCESSO")
    protected FieldInt accesso;
    @XmlElement(name = "FULLPATH")
    protected FieldString fullpath;
    @XmlElement(name = "Dm_Permessi_Folder")
    protected JoinDmPermessiFolder dmPermessiFolder;

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
     * Gets the value of the idpadre property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDPADRE() {
        return idpadre;
    }

    /**
     * Sets the value of the idpadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDPADRE(FieldInt value) {
        this.idpadre = value;
    }

    /**
     * Gets the value of the autore property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getAUTORE() {
        return autore;
    }

    /**
     * Sets the value of the autore property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setAUTORE(FieldInt value) {
        this.autore = value;
    }

    /**
     * Gets the value of the datacreate property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATACREATE() {
        return datacreate;
    }

    /**
     * Sets the value of the datacreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATACREATE(FieldDateTime value) {
        this.datacreate = value;
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
     * Gets the value of the accesso property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getACCESSO() {
        return accesso;
    }

    /**
     * Sets the value of the accesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setACCESSO(FieldInt value) {
        this.accesso = value;
    }

    /**
     * Gets the value of the fullpath property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFULLPATH() {
        return fullpath;
    }

    /**
     * Sets the value of the fullpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFULLPATH(FieldString value) {
        this.fullpath = value;
    }

    /**
     * Gets the value of the dmPermessiFolder property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmPermessiFolder }
     *     
     */
    public JoinDmPermessiFolder getDmPermessiFolder() {
        return dmPermessiFolder;
    }

    /**
     * Sets the value of the dmPermessiFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmPermessiFolder }
     *     
     */
    public void setDmPermessiFolder(JoinDmPermessiFolder value) {
        this.dmPermessiFolder = value;
    }

}
