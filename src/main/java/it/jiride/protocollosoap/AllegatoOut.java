
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllegatoOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllegatoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Serial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TipoFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Commento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDBase" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Versione" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="TipoAllegato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SottoEstensione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Firmato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeAllegato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Principale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pubblicato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentoBilingue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllegatoOut", propOrder = {
    "serial",
    "tipoFile",
    "contentType",
    "image",
    "commento",
    "idBase",
    "versione",
    "tipoAllegato",
    "schema",
    "sottoEstensione",
    "firmato",
    "nomeAllegato",
    "principale",
    "pubblicato",
    "commentoBilingue"
})
public class AllegatoOut {

    @XmlElement(name = "Serial")
    protected int serial;
    @XmlElement(name = "TipoFile", nillable = true)
    protected String tipoFile;
    @XmlElement(name = "ContentType", nillable = true)
    protected String contentType;
    @XmlElement(name = "Image", nillable = true)
    protected byte[] image;
    @XmlElement(name = "Commento", nillable = true)
    protected String commento;
    @XmlElement(name = "IDBase")
    protected int idBase;
    @XmlElement(name = "Versione")
    protected short versione;
    @XmlElement(name = "TipoAllegato", nillable = true)
    protected String tipoAllegato;
    @XmlElement(name = "Schema", nillable = true)
    protected String schema;
    @XmlElement(name = "SottoEstensione", nillable = true)
    protected String sottoEstensione;
    @XmlElement(name = "Firmato", nillable = true)
    protected String firmato;
    @XmlElement(name = "NomeAllegato", nillable = true)
    protected String nomeAllegato;
    @XmlElement(name = "Principale", nillable = true)
    protected String principale;
    @XmlElement(name = "Pubblicato", nillable = true)
    protected String pubblicato;
    @XmlElement(name = "CommentoBilingue", nillable = true)
    protected String commentoBilingue;

    /**
     * Gets the value of the serial property.
     * 
     */
    public int getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     */
    public void setSerial(int value) {
        this.serial = value;
    }

    /**
     * Gets the value of the tipoFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFile() {
        return tipoFile;
    }

    /**
     * Sets the value of the tipoFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFile(String value) {
        this.tipoFile = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = ((byte[]) value);
    }

    /**
     * Gets the value of the commento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommento() {
        return commento;
    }

    /**
     * Sets the value of the commento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommento(String value) {
        this.commento = value;
    }

    /**
     * Gets the value of the idBase property.
     * 
     */
    public int getIDBase() {
        return idBase;
    }

    /**
     * Sets the value of the idBase property.
     * 
     */
    public void setIDBase(int value) {
        this.idBase = value;
    }

    /**
     * Gets the value of the versione property.
     * 
     */
    public short getVersione() {
        return versione;
    }

    /**
     * Sets the value of the versione property.
     * 
     */
    public void setVersione(short value) {
        this.versione = value;
    }

    /**
     * Gets the value of the tipoAllegato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAllegato() {
        return tipoAllegato;
    }

    /**
     * Sets the value of the tipoAllegato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAllegato(String value) {
        this.tipoAllegato = value;
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Gets the value of the sottoEstensione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSottoEstensione() {
        return sottoEstensione;
    }

    /**
     * Sets the value of the sottoEstensione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSottoEstensione(String value) {
        this.sottoEstensione = value;
    }

    /**
     * Gets the value of the firmato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmato() {
        return firmato;
    }

    /**
     * Sets the value of the firmato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmato(String value) {
        this.firmato = value;
    }

    /**
     * Gets the value of the nomeAllegato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAllegato() {
        return nomeAllegato;
    }

    /**
     * Sets the value of the nomeAllegato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAllegato(String value) {
        this.nomeAllegato = value;
    }

    /**
     * Gets the value of the principale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipale() {
        return principale;
    }

    /**
     * Sets the value of the principale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipale(String value) {
        this.principale = value;
    }

    /**
     * Gets the value of the pubblicato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPubblicato() {
        return pubblicato;
    }

    /**
     * Sets the value of the pubblicato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPubblicato(String value) {
        this.pubblicato = value;
    }

    /**
     * Gets the value of the commentoBilingue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentoBilingue() {
        return commentoBilingue;
    }

    /**
     * Sets the value of the commentoBilingue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentoBilingue(String value) {
        this.commentoBilingue = value;
    }

}
