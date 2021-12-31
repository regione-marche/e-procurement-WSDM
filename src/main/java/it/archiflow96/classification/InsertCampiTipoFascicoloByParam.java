
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramIn" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}InsertCampiTipoFascicoloInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paramIn"
})
@XmlRootElement(name = "InsertCampiTipoFascicoloByParam", namespace = "http://tempuri.org/")
public class InsertCampiTipoFascicoloByParam {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected InsertCampiTipoFascicoloInput paramIn;

    /**
     * Gets the value of the paramIn property.
     * 
     * @return
     *     possible object is
     *     {@link InsertCampiTipoFascicoloInput }
     *     
     */
    public InsertCampiTipoFascicoloInput getParamIn() {
        return paramIn;
    }

    /**
     * Sets the value of the paramIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertCampiTipoFascicoloInput }
     *     
     */
    public void setParamIn(InsertCampiTipoFascicoloInput value) {
        this.paramIn = value;
    }

}
