
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClassificaDocumentoEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificaDocumentoEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject}BaseClassificaDocumento">
 *       &lt;sequence>
 *         &lt;element name="DataClassifica" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DocumentId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier}DocumentIdentifier" minOccurs="0"/>
 *         &lt;element name="Sorting" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificaDocumentoEntity", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", propOrder = {
    "dataClassifica",
    "documentId",
    "sorting"
})
public class ClassificaDocumentoEntity
    extends BaseClassificaDocumento
{

    @XmlElement(name = "DataClassifica")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataClassifica;
    @XmlElement(name = "DocumentId", nillable = true)
    protected DocumentIdentifier documentId;
    @XmlElement(name = "Sorting")
    protected Integer sorting;

    /**
     * Gets the value of the dataClassifica property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataClassifica() {
        return dataClassifica;
    }

    /**
     * Sets the value of the dataClassifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataClassifica(XMLGregorianCalendar value) {
        this.dataClassifica = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentifier }
     *     
     */
    public DocumentIdentifier getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentifier }
     *     
     */
    public void setDocumentId(DocumentIdentifier value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSorting(Integer value) {
        this.sorting = value;
    }

}
