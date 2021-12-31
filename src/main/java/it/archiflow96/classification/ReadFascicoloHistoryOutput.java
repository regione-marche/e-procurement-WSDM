
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadFascicoloHistoryOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadFascicoloHistoryOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="FascHistoryColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfFascicoloHistory" minOccurs="0"/>
 *         &lt;element name="HitCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadFascicoloHistoryOutput", propOrder = {
    "fascHistoryColl",
    "hitCount"
})
public class ReadFascicoloHistoryOutput
    extends BaseOutput
{

    @XmlElement(name = "FascHistoryColl", nillable = true)
    protected ArrayOfFascicoloHistory fascHistoryColl;
    @XmlElement(name = "HitCount")
    protected Integer hitCount;

    /**
     * Gets the value of the fascHistoryColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFascicoloHistory }
     *     
     */
    public ArrayOfFascicoloHistory getFascHistoryColl() {
        return fascHistoryColl;
    }

    /**
     * Sets the value of the fascHistoryColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFascicoloHistory }
     *     
     */
    public void setFascHistoryColl(ArrayOfFascicoloHistory value) {
        this.fascHistoryColl = value;
    }

    /**
     * Gets the value of the hitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHitCount() {
        return hitCount;
    }

    /**
     * Sets the value of the hitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHitCount(Integer value) {
        this.hitCount = value;
    }

}
