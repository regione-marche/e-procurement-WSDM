
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_TipiPratiche complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_TipiPratiche">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPOPRATICA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="FOLDERID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="FOLDERDINAMICO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="PROGRESSIVO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NUMERODINAMICO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="EXTERNALID" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_TipiPratiche", propOrder = {
    "id",
    "tipopratica",
    "folderid",
    "folderdinamico",
    "progressivo",
    "numerodinamico",
    "externalid"
})
public class JoinDmTipiPratiche
    extends JoinAbstract
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "TIPOPRATICA")
    protected FieldString tipopratica;
    @XmlElement(name = "FOLDERID")
    protected FieldInt folderid;
    @XmlElement(name = "FOLDERDINAMICO")
    protected FieldString folderdinamico;
    @XmlElement(name = "PROGRESSIVO")
    protected FieldInt progressivo;
    @XmlElement(name = "NUMERODINAMICO")
    protected FieldString numerodinamico;
    @XmlElement(name = "EXTERNALID")
    protected FieldString externalid;

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
     * Gets the value of the tipopratica property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTIPOPRATICA() {
        return tipopratica;
    }

    /**
     * Sets the value of the tipopratica property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTIPOPRATICA(FieldString value) {
        this.tipopratica = value;
    }

    /**
     * Gets the value of the folderid property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getFOLDERID() {
        return folderid;
    }

    /**
     * Sets the value of the folderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setFOLDERID(FieldInt value) {
        this.folderid = value;
    }

    /**
     * Gets the value of the folderdinamico property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFOLDERDINAMICO() {
        return folderdinamico;
    }

    /**
     * Sets the value of the folderdinamico property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFOLDERDINAMICO(FieldString value) {
        this.folderdinamico = value;
    }

    /**
     * Gets the value of the progressivo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getPROGRESSIVO() {
        return progressivo;
    }

    /**
     * Sets the value of the progressivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setPROGRESSIVO(FieldInt value) {
        this.progressivo = value;
    }

    /**
     * Gets the value of the numerodinamico property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNUMERODINAMICO() {
        return numerodinamico;
    }

    /**
     * Sets the value of the numerodinamico property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNUMERODINAMICO(FieldString value) {
        this.numerodinamico = value;
    }

    /**
     * Gets the value of the externalid property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEXTERNALID() {
        return externalid;
    }

    /**
     * Sets the value of the externalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEXTERNALID(FieldString value) {
        this.externalid = value;
    }

}
