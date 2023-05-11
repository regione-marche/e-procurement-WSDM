
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertTitolarioOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertTitolarioOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="OutPk" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}TitolarioIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertTitolarioOutput", propOrder = {
    "outPk"
})
public class InsertTitolarioOutput
    extends BaseOutput
{

    @XmlElement(name = "OutPk", nillable = true)
    protected TitolarioIdentifier outPk;

    /**
     * Gets the value of the outPk property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioIdentifier }
     *     
     */
    public TitolarioIdentifier getOutPk() {
        return outPk;
    }

    /**
     * Sets the value of the outPk property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioIdentifier }
     *     
     */
    public void setOutPk(TitolarioIdentifier value) {
        this.outPk = value;
    }

}
