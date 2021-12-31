
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDataTransmissionSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDataTransmissionSearchCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.Tools.Log}LoggableBase">
 *       &lt;sequence>
 *         &lt;element name="ArchiveList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="CompetenceDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}RangeOfNullableOfdateTime5F2dSckg" minOccurs="0"/>
 *         &lt;element name="InsertDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}RangeOfNullableOfdateTime5F2dSckg" minOccurs="0"/>
 *         &lt;element name="PhaseList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="StatusList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDataTransmissionSearchCriteria", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Spesometro.ValueObject", propOrder = {
    "archiveList",
    "competenceDate",
    "insertDate",
    "phaseList",
    "statusList"
})
public class InvoiceDataTransmissionSearchCriteria
    extends LoggableBase
{

    @XmlElement(name = "ArchiveList", nillable = true)
    protected ArrayOfint archiveList;
    @XmlElement(name = "CompetenceDate", nillable = true)
    protected RangeOfNullableOfdateTime5F2DSckg competenceDate;
    @XmlElement(name = "InsertDate", nillable = true)
    protected RangeOfNullableOfdateTime5F2DSckg insertDate;
    @XmlElement(name = "PhaseList", nillable = true)
    protected ArrayOfstring phaseList;
    @XmlElement(name = "StatusList", nillable = true)
    protected ArrayOfstring statusList;

    /**
     * Gets the value of the archiveList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getArchiveList() {
        return archiveList;
    }

    /**
     * Sets the value of the archiveList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setArchiveList(ArrayOfint value) {
        this.archiveList = value;
    }

    /**
     * Gets the value of the competenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public RangeOfNullableOfdateTime5F2DSckg getCompetenceDate() {
        return competenceDate;
    }

    /**
     * Sets the value of the competenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public void setCompetenceDate(RangeOfNullableOfdateTime5F2DSckg value) {
        this.competenceDate = value;
    }

    /**
     * Gets the value of the insertDate property.
     * 
     * @return
     *     possible object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public RangeOfNullableOfdateTime5F2DSckg getInsertDate() {
        return insertDate;
    }

    /**
     * Sets the value of the insertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public void setInsertDate(RangeOfNullableOfdateTime5F2DSckg value) {
        this.insertDate = value;
    }

    /**
     * Gets the value of the phaseList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getPhaseList() {
        return phaseList;
    }

    /**
     * Sets the value of the phaseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setPhaseList(ArrayOfstring value) {
        this.phaseList = value;
    }

    /**
     * Gets the value of the statusList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getStatusList() {
        return statusList;
    }

    /**
     * Sets the value of the statusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setStatusList(ArrayOfstring value) {
        this.statusList = value;
    }

}
