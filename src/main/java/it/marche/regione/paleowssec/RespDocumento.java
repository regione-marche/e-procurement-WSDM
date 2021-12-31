
package it.marche.regione.paleowssec;

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
 *     &lt;extension base="{http://paleo.regione.marche.it/services/}BEBase">
 *       &lt;sequence>
 *         &lt;element name="Classificazioni" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="DataDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DatiProcedimento" type="{http://paleo.regione.marche.it/services/}ProcedimentoInfo" minOccurs="0"/>
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegnaturaDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respDocumento", propOrder = {
    "classificazioni",
    "dataDocumento",
    "datiProcedimento",
    "docNumber",
    "oggetto",
    "segnaturaDocumento"
})
@XmlSeeAlso({
    RespProtocollo.class,
    RespDocumentoExt.class
})
public class RespDocumento
    extends BEBase
{

    @XmlElement(name = "Classificazioni", nillable = true)
    protected ArrayOfstring classificazioni;
    @XmlElement(name = "DataDocumento", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDocumento;
    @XmlElement(name = "DatiProcedimento", nillable = true)
    protected ProcedimentoInfo datiProcedimento;
    @XmlElement(name = "DocNumber")
    protected int docNumber;
    @XmlElement(name = "Oggetto", nillable = true)
    protected String oggetto;
    @XmlElement(name = "SegnaturaDocumento", required = true, nillable = true)
    protected String segnaturaDocumento;

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
     * Gets the value of the datiProcedimento property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedimentoInfo }
     *     
     */
    public ProcedimentoInfo getDatiProcedimento() {
        return datiProcedimento;
    }

    /**
     * Sets the value of the datiProcedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedimentoInfo }
     *     
     */
    public void setDatiProcedimento(ProcedimentoInfo value) {
        this.datiProcedimento = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     */
    public int getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     */
    public void setDocNumber(int value) {
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

}
