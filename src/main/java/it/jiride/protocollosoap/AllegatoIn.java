
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllegatoIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllegatoIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Commento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdAllegatoPrincipale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeAllegato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllegatoIn", propOrder = {
    "tipoFile",
    "contentType",
    "image",
    "commento",
    "idAllegatoPrincipale",
    "schema",
    "nomeAllegato"
})
public class AllegatoIn {

    @XmlElement(name = "TipoFile", nillable = true)
    protected String tipoFile;
    @XmlElement(name = "ContentType", nillable = true)
    protected String contentType;
    @XmlElement(name = "Image", nillable = true)
    protected byte[] image;
    @XmlElement(name = "Commento", nillable = true)
    protected String commento;
    @XmlElement(name = "IdAllegatoPrincipale", nillable = true)
    protected String idAllegatoPrincipale;
    @XmlElement(name = "Schema", nillable = true)
    protected String schema;
    @XmlElement(name = "NomeAllegato", nillable = true)
    protected String nomeAllegato;

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
     * Gets the value of the idAllegatoPrincipale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAllegatoPrincipale() {
        return idAllegatoPrincipale;
    }

    /**
     * Sets the value of the idAllegatoPrincipale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAllegatoPrincipale(String value) {
        this.idAllegatoPrincipale = value;
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

}
