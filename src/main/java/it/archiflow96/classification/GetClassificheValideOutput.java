
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetClassificheValideOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClassificheValideOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="DiffType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}FascicoloDiffType" minOccurs="0"/>
 *         &lt;element name="ListTitItemId" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClassificheValideOutput", propOrder = {
    "diffType",
    "listTitItemId"
})
public class GetClassificheValideOutput
    extends BaseOutput
{

    @XmlElement(name = "DiffType")
    protected FascicoloDiffType diffType;
    @XmlElement(name = "ListTitItemId", nillable = true)
    protected ArrayOfint listTitItemId;

    /**
     * Gets the value of the diffType property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloDiffType }
     *     
     */
    public FascicoloDiffType getDiffType() {
        return diffType;
    }

    /**
     * Sets the value of the diffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloDiffType }
     *     
     */
    public void setDiffType(FascicoloDiffType value) {
        this.diffType = value;
    }

    /**
     * Gets the value of the listTitItemId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getListTitItemId() {
        return listTitItemId;
    }

    /**
     * Sets the value of the listTitItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setListTitItemId(ArrayOfint value) {
        this.listTitItemId = value;
    }

}
