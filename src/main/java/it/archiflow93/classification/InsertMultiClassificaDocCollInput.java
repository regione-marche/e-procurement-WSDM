
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertMultiClassificaDocCollInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertMultiClassificaDocCollInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="ClassDocColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject}ArrayOfBaseClassificaDocumento" minOccurs="0"/>
 *         &lt;element name="DelExisting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DocIdColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier}ArrayOfDocumentIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertMultiClassificaDocCollInput", propOrder = {
    "classDocColl",
    "delExisting",
    "docIdColl"
})
public class InsertMultiClassificaDocCollInput
    extends BaseInput
{

    @XmlElement(name = "ClassDocColl", nillable = true)
    protected ArrayOfBaseClassificaDocumento classDocColl;
    @XmlElement(name = "DelExisting")
    protected Boolean delExisting;
    @XmlElement(name = "DocIdColl", nillable = true)
    protected ArrayOfDocumentIdentifier docIdColl;

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
     * Gets the value of the delExisting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelExisting() {
        return delExisting;
    }

    /**
     * Sets the value of the delExisting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelExisting(Boolean value) {
        this.delExisting = value;
    }

    /**
     * Gets the value of the docIdColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentIdentifier }
     *     
     */
    public ArrayOfDocumentIdentifier getDocIdColl() {
        return docIdColl;
    }

    /**
     * Sets the value of the docIdColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentIdentifier }
     *     
     */
    public void setDocIdColl(ArrayOfDocumentIdentifier value) {
        this.docIdColl = value;
    }

}
