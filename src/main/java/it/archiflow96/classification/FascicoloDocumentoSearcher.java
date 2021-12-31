
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FascicoloDocumentoSearcher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FascicoloDocumentoSearcher">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}ClassificazioneBaseSearcher">
 *       &lt;sequence>
 *         &lt;element name="ClassDoc_Id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}ClassificaDocIdentifier" minOccurs="0"/>
 *         &lt;element name="DocumentId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier}DocumentIdentifier" minOccurs="0"/>
 *         &lt;element name="Fascicolo_Id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicolo.Identifier}FascicoloDocIdentifier" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FascicoloDocumentoSearcher", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", propOrder = {
    "classDocId",
    "documentId",
    "fascicoloId",
    "id",
    "userId"
})
public class FascicoloDocumentoSearcher
    extends ClassificazioneBaseSearcher
{

    @XmlElement(name = "ClassDoc_Id", nillable = true)
    protected ClassificaDocIdentifier classDocId;
    @XmlElement(name = "DocumentId", nillable = true)
    protected DocumentIdentifier documentId;
    @XmlElement(name = "Fascicolo_Id", nillable = true)
    protected FascicoloIdentifier fascicoloId;
    @XmlElement(name = "Id", nillable = true)
    protected FascicoloDocIdentifier id;
    @XmlElement(name = "UserId", nillable = true)
    protected BaseIdentifier userId;

    /**
     * Gets the value of the classDocId property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificaDocIdentifier }
     *     
     */
    public ClassificaDocIdentifier getClassDocId() {
        return classDocId;
    }

    /**
     * Sets the value of the classDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificaDocIdentifier }
     *     
     */
    public void setClassDocId(ClassificaDocIdentifier value) {
        this.classDocId = value;
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
     * Gets the value of the fascicoloId property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public FascicoloIdentifier getFascicoloId() {
        return fascicoloId;
    }

    /**
     * Sets the value of the fascicoloId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public void setFascicoloId(FascicoloIdentifier value) {
        this.fascicoloId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloDocIdentifier }
     *     
     */
    public FascicoloDocIdentifier getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloDocIdentifier }
     *     
     */
    public void setId(FascicoloDocIdentifier value) {
        this.id = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link BaseIdentifier }
     *     
     */
    public BaseIdentifier getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseIdentifier }
     *     
     */
    public void setUserId(BaseIdentifier value) {
        this.userId = value;
    }

}
