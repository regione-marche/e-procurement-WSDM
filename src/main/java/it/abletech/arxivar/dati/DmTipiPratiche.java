
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_TipiPratiche complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_TipiPratiche">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TIPOPRATICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FOLDERID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FOLDERDINAMICO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROGRESSIVO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NUMERODINAMICO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXTERNALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_TipiPratiche", propOrder = {
    "id",
    "tipopratica",
    "folderid",
    "folderdinamico",
    "progressivo",
    "numerodinamico",
    "externalid"
})
public class DmTipiPratiche
    extends Base
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "TIPOPRATICA")
    protected String tipopratica;
    @XmlElement(name = "FOLDERID")
    protected int folderid;
    @XmlElement(name = "FOLDERDINAMICO")
    protected String folderdinamico;
    @XmlElement(name = "PROGRESSIVO")
    protected int progressivo;
    @XmlElement(name = "NUMERODINAMICO")
    protected String numerodinamico;
    @XmlElement(name = "EXTERNALID")
    protected String externalid;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the tipopratica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPRATICA() {
        return tipopratica;
    }

    /**
     * Sets the value of the tipopratica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPRATICA(String value) {
        this.tipopratica = value;
    }

    /**
     * Gets the value of the folderid property.
     * 
     */
    public int getFOLDERID() {
        return folderid;
    }

    /**
     * Sets the value of the folderid property.
     * 
     */
    public void setFOLDERID(int value) {
        this.folderid = value;
    }

    /**
     * Gets the value of the folderdinamico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOLDERDINAMICO() {
        return folderdinamico;
    }

    /**
     * Sets the value of the folderdinamico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOLDERDINAMICO(String value) {
        this.folderdinamico = value;
    }

    /**
     * Gets the value of the progressivo property.
     * 
     */
    public int getPROGRESSIVO() {
        return progressivo;
    }

    /**
     * Sets the value of the progressivo property.
     * 
     */
    public void setPROGRESSIVO(int value) {
        this.progressivo = value;
    }

    /**
     * Gets the value of the numerodinamico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODINAMICO() {
        return numerodinamico;
    }

    /**
     * Sets the value of the numerodinamico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODINAMICO(String value) {
        this.numerodinamico = value;
    }

    /**
     * Gets the value of the externalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTERNALID() {
        return externalid;
    }

    /**
     * Sets the value of the externalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTERNALID(String value) {
        this.externalid = value;
    }

}
