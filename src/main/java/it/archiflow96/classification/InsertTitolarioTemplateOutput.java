
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertTitolarioTemplateOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertTitolarioTemplateOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="OutPk" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}TitolarioTemplateIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertTitolarioTemplateOutput", propOrder = {
    "outPk"
})
public class InsertTitolarioTemplateOutput
    extends BaseOutput
{

    @XmlElement(name = "OutPk", nillable = true)
    protected TitolarioTemplateIdentifier outPk;

    /**
     * Gets the value of the outPk property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioTemplateIdentifier }
     *     
     */
    public TitolarioTemplateIdentifier getOutPk() {
        return outPk;
    }

    /**
     * Sets the value of the outPk property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioTemplateIdentifier }
     *     
     */
    public void setOutPk(TitolarioTemplateIdentifier value) {
        this.outPk = value;
    }

}
