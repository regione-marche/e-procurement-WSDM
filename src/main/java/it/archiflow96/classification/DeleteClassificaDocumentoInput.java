
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteClassificaDocumentoInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteClassificaDocumentoInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="ClassDocId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}ClassificaDocIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteClassificaDocumentoInput", propOrder = {
    "classDocId"
})
public class DeleteClassificaDocumentoInput
    extends BaseInput
{

    @XmlElement(name = "ClassDocId", nillable = true)
    protected ClassificaDocIdentifier classDocId;

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

}
