
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetPrimaryClassificaDocumentoInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetPrimaryClassificaDocumentoInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="ClassDocId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}ClassificaDocIdentifier" minOccurs="0"/>
 *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetPrimaryClassificaDocumentoInput", propOrder = {
    "classDocId",
    "primary"
})
public class SetPrimaryClassificaDocumentoInput
    extends BaseInput
{

    @XmlElement(name = "ClassDocId", nillable = true)
    protected ClassificaDocIdentifier classDocId;
    @XmlElement(name = "Primary")
    protected Boolean primary;

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
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimary(Boolean value) {
        this.primary = value;
    }

}
