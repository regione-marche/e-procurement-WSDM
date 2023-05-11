
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadTipoDocDefaultTitolarioItemCollInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadTipoDocDefaultTitolarioItemCollInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="TipoDocId" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadTipoDocDefaultTitolarioItemCollInput", propOrder = {
    "tipoDocId"
})
public class ReadTipoDocDefaultTitolarioItemCollInput
    extends BaseInput
{

    @XmlElement(name = "TipoDocId", nillable = true)
    protected BaseIdentifier tipoDocId;

    /**
     * Gets the value of the tipoDocId property.
     * 
     * @return
     *     possible object is
     *     {@link BaseIdentifier }
     *     
     */
    public BaseIdentifier getTipoDocId() {
        return tipoDocId;
    }

    /**
     * Sets the value of the tipoDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseIdentifier }
     *     
     */
    public void setTipoDocId(BaseIdentifier value) {
        this.tipoDocId = value;
    }

}
