
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertClassificaDocumentoOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertClassificaDocumentoOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="Pk" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}ClassificaDocIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertClassificaDocumentoOutput", propOrder = {
    "pk"
})
public class InsertClassificaDocumentoOutput
    extends BaseOutput
{

    @XmlElement(name = "Pk", nillable = true)
    protected ClassificaDocIdentifier pk;

    /**
     * Gets the value of the pk property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificaDocIdentifier }
     *     
     */
    public ClassificaDocIdentifier getPk() {
        return pk;
    }

    /**
     * Sets the value of the pk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificaDocIdentifier }
     *     
     */
    public void setPk(ClassificaDocIdentifier value) {
        this.pk = value;
    }

}
