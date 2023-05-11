
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertClassificaDocCollInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertClassificaDocCollInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="ClassDocColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject}ArrayOfBaseClassificaDocumento" minOccurs="0"/>
 *         &lt;element name="DocumentId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier}DocumentIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertClassificaDocCollInput", propOrder = {
    "classDocColl",
    "documentId"
})
public class InsertClassificaDocCollInput
    extends BaseInput
{

    @XmlElement(name = "ClassDocColl", nillable = true)
    protected ArrayOfBaseClassificaDocumento classDocColl;
    @XmlElement(name = "DocumentId", nillable = true)
    protected DocumentIdentifier documentId;

    /**
     * Gets the value of the classDocColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseClassificaDocumento }
     *     
     */
    public ArrayOfBaseClassificaDocumento getClassDocColl() {
        return classDocColl;
    }

    /**
     * Sets the value of the classDocColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseClassificaDocumento }
     *     
     */
    public void setClassDocColl(ArrayOfBaseClassificaDocumento value) {
        this.classDocColl = value;
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

}
