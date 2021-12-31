
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFascicoloToPreserveInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFascicoloToPreserveInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CreatedByDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OpeningStatus" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}SearchOpeningStatus" minOccurs="0"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFascicoloToPreserveInput", propOrder = {
    "createdByDays",
    "openingStatus",
    "pageSize"
})
public class GetFascicoloToPreserveInput
    extends BaseInput
{

    @XmlElement(name = "CreatedByDays")
    protected Integer createdByDays;
    @XmlElement(name = "OpeningStatus")
    protected SearchOpeningStatus openingStatus;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;

    /**
     * Gets the value of the createdByDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreatedByDays() {
        return createdByDays;
    }

    /**
     * Sets the value of the createdByDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreatedByDays(Integer value) {
        this.createdByDays = value;
    }

    /**
     * Gets the value of the openingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOpeningStatus }
     *     
     */
    public SearchOpeningStatus getOpeningStatus() {
        return openingStatus;
    }

    /**
     * Sets the value of the openingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOpeningStatus }
     *     
     */
    public void setOpeningStatus(SearchOpeningStatus value) {
        this.openingStatus = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

}
