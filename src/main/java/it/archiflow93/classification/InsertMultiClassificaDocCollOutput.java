
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertMultiClassificaDocCollOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertMultiClassificaDocCollOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="ClassDocColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject}ArrayOfBaseClassificaDocumento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertMultiClassificaDocCollOutput", propOrder = {
    "classDocColl"
})
public class InsertMultiClassificaDocCollOutput
    extends BaseOutput
{

    @XmlElement(name = "ClassDocColl", nillable = true)
    protected ArrayOfBaseClassificaDocumento classDocColl;

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

}
