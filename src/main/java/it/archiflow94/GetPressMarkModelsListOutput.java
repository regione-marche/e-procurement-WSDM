
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPressMarkModelsListOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPressMarkModelsListOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="DafaultModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Models" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPressMarkModelsListOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "dafaultModel",
    "models"
})
public class GetPressMarkModelsListOutput
    extends BaseOutput
{

    @XmlElement(name = "DafaultModel", nillable = true)
    protected String dafaultModel;
    @XmlElement(name = "Models", nillable = true)
    protected ArrayOfstring models;

    /**
     * Gets the value of the dafaultModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDafaultModel() {
        return dafaultModel;
    }

    /**
     * Sets the value of the dafaultModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDafaultModel(String value) {
        this.dafaultModel = value;
    }

    /**
     * Gets the value of the models property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getModels() {
        return models;
    }

    /**
     * Sets the value of the models property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setModels(ArrayOfstring value) {
        this.models = value;
    }

}
