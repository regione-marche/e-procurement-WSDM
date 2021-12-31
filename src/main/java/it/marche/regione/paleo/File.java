
package it.marche.regione.paleo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for File complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="File">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Estensione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdFile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Impronta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Stream" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "File", propOrder = {
    "estensione",
    "idFile",
    "impronta",
    "mimeType",
    "nome",
    "stream"
})
public class File {

    @XmlElement(name = "Estensione", nillable = true)
    protected String estensione;
    @XmlElement(name = "IdFile")
    protected Integer idFile;
    @XmlElement(name = "Impronta", nillable = true)
    protected String impronta;
    @XmlElement(name = "MimeType", nillable = true)
    protected String mimeType;
    @XmlElement(name = "Nome", required = true, nillable = true)
    protected String nome;
    @XmlElement(name = "Stream", nillable = true)
    protected byte[] stream;

    /**
     * Gets the value of the estensione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstensione() {
        return estensione;
    }

    /**
     * Sets the value of the estensione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstensione(String value) {
        this.estensione = value;
    }

    /**
     * Gets the value of the idFile property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFile() {
        return idFile;
    }

    /**
     * Sets the value of the idFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFile(Integer value) {
        this.idFile = value;
    }

    /**
     * Gets the value of the impronta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpronta() {
        return impronta;
    }

    /**
     * Sets the value of the impronta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpronta(String value) {
        this.impronta = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the stream property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getStream() {
        return stream;
    }

    /**
     * Sets the value of the stream property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setStream(byte[] value) {
        this.stream = ((byte[]) value);
    }

}
