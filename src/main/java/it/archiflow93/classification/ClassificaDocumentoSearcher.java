
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassificaDocumentoSearcher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificaDocumentoSearcher">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}ClassificazioneBaseSearcher">
 *       &lt;sequence>
 *         &lt;element name="DocumentId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier}DocumentIdentifier" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}ClassificaDocIdentifier" minOccurs="0"/>
 *         &lt;element name="TitolarioItemId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Identifier}TitolarioItemIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificaDocumentoSearcher", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Searcher", propOrder = {
    "documentId",
    "id",
    "titolarioItemId"
})
public class ClassificaDocumentoSearcher
    extends ClassificazioneBaseSearcher
{

    @XmlElement(name = "DocumentId", nillable = true)
    protected DocumentIdentifier documentId;
    @XmlElement(name = "Id", nillable = true)
    protected ClassificaDocIdentifier id;
    @XmlElement(name = "TitolarioItemId", nillable = true)
    protected TitolarioItemIdentifier titolarioItemId;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificaDocIdentifier }
     *     
     */
    public ClassificaDocIdentifier getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificaDocIdentifier }
     *     
     */
    public void setId(ClassificaDocIdentifier value) {
        this.id = value;
    }

    /**
     * Gets the value of the titolarioItemId property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public TitolarioItemIdentifier getTitolarioItemId() {
        return titolarioItemId;
    }

    /**
     * Sets the value of the titolarioItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public void setTitolarioItemId(TitolarioItemIdentifier value) {
        this.titolarioItemId = value;
    }

}
