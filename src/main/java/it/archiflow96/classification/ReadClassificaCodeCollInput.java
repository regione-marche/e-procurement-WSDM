
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadClassificaCodeCollInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadClassificaCodeCollInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
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
@XmlType(name = "ReadClassificaCodeCollInput", propOrder = {
    "docIdColl"
})
public class ReadClassificaCodeCollInput
    extends BaseInput
{

    @XmlElement(name = "DocIdColl", nillable = true)
    protected ArrayOfDocumentIdentifier docIdColl;

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
