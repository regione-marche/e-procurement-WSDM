
package it.marche.regione.paleo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.regionemarche_protocollo_common.TipoProtocollo;
import org.datacontract.schemas._2004._07.regionemarche_protocollo_common.TipoStatoProtocollo;


/**
 * <p>Java class for respProtocolloInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respProtocolloInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceUO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataProtocollo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumeroProtocollo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegnaturaProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatoProtocollo" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi}TipoStatoProtocollo" minOccurs="0"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoProtocollo" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi}TipoProtocollo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respProtocolloInfo", propOrder = {
    "codiceRegistro",
    "codiceUO",
    "dataProtocollo",
    "docNumber",
    "numeroProtocollo",
    "oggetto",
    "segnaturaProtocollo",
    "statoProtocollo",
    "tipoDocumento",
    "tipoProtocollo"
})
public class RespProtocolloInfo {

    @XmlElement(name = "CodiceRegistro", nillable = true)
    protected String codiceRegistro;
    @XmlElement(name = "CodiceUO", nillable = true)
    protected String codiceUO;
    @XmlElement(name = "DataProtocollo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataProtocollo;
    @XmlElement(name = "DocNumber")
    protected Integer docNumber;
    @XmlElement(name = "NumeroProtocollo")
    protected Integer numeroProtocollo;
    @XmlElement(name = "Oggetto", nillable = true)
    protected String oggetto;
    @XmlElement(name = "SegnaturaProtocollo", nillable = true)
    protected String segnaturaProtocollo;
    @XmlElement(name = "StatoProtocollo")
    protected TipoStatoProtocollo statoProtocollo;
    @XmlElement(name = "TipoDocumento", nillable = true)
    protected String tipoDocumento;
    @XmlElement(name = "TipoProtocollo")
    protected TipoProtocollo tipoProtocollo;

    /**
     * Gets the value of the codiceRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRegistro() {
        return codiceRegistro;
    }

    /**
     * Sets the value of the codiceRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRegistro(String value) {
        this.codiceRegistro = value;
    }

    /**
     * Gets the value of the codiceUO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceUO() {
        return codiceUO;
    }

    /**
     * Sets the value of the codiceUO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceUO(String value) {
        this.codiceUO = value;
    }

    /**
     * Gets the value of the dataProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProtocollo() {
        return dataProtocollo;
    }

    /**
     * Sets the value of the dataProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProtocollo(XMLGregorianCalendar value) {
        this.dataProtocollo = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocNumber(Integer value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the numeroProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroProtocollo() {
        return numeroProtocollo;
    }

    /**
     * Sets the value of the numeroProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroProtocollo(Integer value) {
        this.numeroProtocollo = value;
    }

    /**
     * Gets the value of the oggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggetto() {
        return oggetto;
    }

    /**
     * Sets the value of the oggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggetto(String value) {
        this.oggetto = value;
    }

    /**
     * Gets the value of the segnaturaProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegnaturaProtocollo() {
        return segnaturaProtocollo;
    }

    /**
     * Sets the value of the segnaturaProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegnaturaProtocollo(String value) {
        this.segnaturaProtocollo = value;
    }

    /**
     * Gets the value of the statoProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoStatoProtocollo }
     *     
     */
    public TipoStatoProtocollo getStatoProtocollo() {
        return statoProtocollo;
    }

    /**
     * Sets the value of the statoProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoStatoProtocollo }
     *     
     */
    public void setStatoProtocollo(TipoStatoProtocollo value) {
        this.statoProtocollo = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the tipoProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoProtocollo }
     *     
     */
    public TipoProtocollo getTipoProtocollo() {
        return tipoProtocollo;
    }

    /**
     * Sets the value of the tipoProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoProtocollo }
     *     
     */
    public void setTipoProtocollo(TipoProtocollo value) {
        this.tipoProtocollo = value;
    }

}
