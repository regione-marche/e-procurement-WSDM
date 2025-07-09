
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for respDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Classificazioni" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="DataAnnullamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Proprietario" type="{http://paleo.regione.marche.it/services2/}OperatorePaleo" minOccurs="0"/>
 *         &lt;element name="SegnaturaDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respDocumento", propOrder = {
    "classificazioni",
    "dataAnnullamento",
    "dataDocumento",
    "docNumber",
    "oggetto",
    "proprietario",
    "segnaturaDocumento",
    "tipoDocumento"
})
@XmlSeeAlso({
    RespProtocollo.class,
    RespDocumentoExt.class
})
public class RespDocumento {

    @XmlElement(name = "Classificazioni", nillable = true)
    protected ArrayOfstring classificazioni;
    @XmlElement(name = "DataAnnullamento", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAnnullamento;
    @XmlElement(name = "DataDocumento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDocumento;
    @XmlElement(name = "DocNumber")
    protected Integer docNumber;
    @XmlElement(name = "Oggetto", nillable = true)
    protected String oggetto;
    @XmlElement(name = "Proprietario", nillable = true)
    protected OperatorePaleo proprietario;
    @XmlElement(name = "SegnaturaDocumento", nillable = true)
    protected String segnaturaDocumento;
    @XmlElement(name = "TipoDocumento", nillable = true)
    protected String tipoDocumento;

    /**
     * Gets the value of the classificazioni property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getClassificazioni() {
        return classificazioni;
    }

    /**
     * Sets the value of the classificazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setClassificazioni(ArrayOfstring value) {
        this.classificazioni = value;
    }

    /**
     * Gets the value of the dataAnnullamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAnnullamento() {
        return dataAnnullamento;
    }

    /**
     * Sets the value of the dataAnnullamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAnnullamento(XMLGregorianCalendar value) {
        this.dataAnnullamento = value;
    }

    /**
     * Gets the value of the dataDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDocumento() {
        return dataDocumento;
    }

    /**
     * Sets the value of the dataDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDocumento(XMLGregorianCalendar value) {
        this.dataDocumento = value;
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
     * Gets the value of the proprietario property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorePaleo }
     *     
     */
    public OperatorePaleo getProprietario() {
        return proprietario;
    }

    /**
     * Sets the value of the proprietario property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorePaleo }
     *     
     */
    public void setProprietario(OperatorePaleo value) {
        this.proprietario = value;
    }

    /**
     * Gets the value of the segnaturaDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegnaturaDocumento() {
        return segnaturaDocumento;
    }

    /**
     * Sets the value of the segnaturaDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegnaturaDocumento(String value) {
        this.segnaturaDocumento = value;
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

}
