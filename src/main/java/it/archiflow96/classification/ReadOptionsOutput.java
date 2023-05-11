
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadOptionsOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadOptionsOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="OptColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}ArrayOfBaseOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadOptionsOutput", propOrder = {
    "optColl"
})
public class ReadOptionsOutput
    extends BaseOutput
{

    @XmlElement(name = "OptColl", nillable = true)
    protected ArrayOfBaseOption optColl;

    /**
     * Gets the value of the optColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseOption }
     *     
     */
    public ArrayOfBaseOption getOptColl() {
        return optColl;
    }

    /**
     * Sets the value of the optColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseOption }
     *     
     */
    public void setOptColl(ArrayOfBaseOption value) {
        this.optColl = value;
    }

}
