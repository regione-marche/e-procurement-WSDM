
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadClassificaCodeCollOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadClassificaCodeCollOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="ListClassCode" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="ListFascCode" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadClassificaCodeCollOutput", propOrder = {
    "listClassCode",
    "listFascCode"
})
public class ReadClassificaCodeCollOutput
    extends BaseOutput
{

    @XmlElement(name = "ListClassCode", nillable = true)
    protected ArrayOfstring listClassCode;
    @XmlElement(name = "ListFascCode", nillable = true)
    protected ArrayOfstring listFascCode;

    /**
     * Gets the value of the listClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getListClassCode() {
        return listClassCode;
    }

    /**
     * Sets the value of the listClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setListClassCode(ArrayOfstring value) {
        this.listClassCode = value;
    }

    /**
     * Gets the value of the listFascCode property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getListFascCode() {
        return listFascCode;
    }

    /**
     * Sets the value of the listFascCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setListFascCode(ArrayOfstring value) {
        this.listFascCode = value;
    }

}
