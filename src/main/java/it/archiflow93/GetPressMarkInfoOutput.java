
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPressMarkInfoOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPressMarkInfoOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="Models" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfPressMarkModelInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPressMarkInfoOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "models"
})
public class GetPressMarkInfoOutput
    extends BaseOutput
{

    @XmlElement(name = "Models", nillable = true)
    protected ArrayOfPressMarkModelInfo models;

    /**
     * Gets the value of the models property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPressMarkModelInfo }
     *     
     */
    public ArrayOfPressMarkModelInfo getModels() {
        return models;
    }

    /**
     * Sets the value of the models property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPressMarkModelInfo }
     *     
     */
    public void setModels(ArrayOfPressMarkModelInfo value) {
        this.models = value;
    }

}
