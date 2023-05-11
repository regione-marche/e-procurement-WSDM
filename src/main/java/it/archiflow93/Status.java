
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Status">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.Tools.Log}LoggableBase">
 *       &lt;sequence>
 *         &lt;element name="ChannelsError" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.Monitor}ArrayOfChannel" minOccurs="0"/>
 *         &lt;element name="ChannelsOk" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.Monitor}ArrayOfChannel" minOccurs="0"/>
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorInError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalInError" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalLapseErrors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalOk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalTransitions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.Monitor", propOrder = {
    "channelsError",
    "channelsOk",
    "color",
    "colorInError",
    "name",
    "totalInError",
    "totalLapseErrors",
    "totalOk",
    "totalTransitions"
})
public class Status
    extends LoggableBase
{

    @XmlElement(name = "ChannelsError", nillable = true)
    protected ArrayOfChannel channelsError;
    @XmlElement(name = "ChannelsOk", nillable = true)
    protected ArrayOfChannel channelsOk;
    @XmlElement(name = "Color", nillable = true)
    protected String color;
    @XmlElement(name = "ColorInError", nillable = true)
    protected String colorInError;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "TotalInError")
    protected Integer totalInError;
    @XmlElement(name = "TotalLapseErrors")
    protected Integer totalLapseErrors;
    @XmlElement(name = "TotalOk")
    protected Integer totalOk;
    @XmlElement(name = "TotalTransitions")
    protected Integer totalTransitions;

    /**
     * Gets the value of the channelsError property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChannel }
     *     
     */
    public ArrayOfChannel getChannelsError() {
        return channelsError;
    }

    /**
     * Sets the value of the channelsError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChannel }
     *     
     */
    public void setChannelsError(ArrayOfChannel value) {
        this.channelsError = value;
    }

    /**
     * Gets the value of the channelsOk property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChannel }
     *     
     */
    public ArrayOfChannel getChannelsOk() {
        return channelsOk;
    }

    /**
     * Sets the value of the channelsOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChannel }
     *     
     */
    public void setChannelsOk(ArrayOfChannel value) {
        this.channelsOk = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the colorInError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorInError() {
        return colorInError;
    }

    /**
     * Sets the value of the colorInError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorInError(String value) {
        this.colorInError = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the totalInError property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalInError() {
        return totalInError;
    }

    /**
     * Sets the value of the totalInError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalInError(Integer value) {
        this.totalInError = value;
    }

    /**
     * Gets the value of the totalLapseErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalLapseErrors() {
        return totalLapseErrors;
    }

    /**
     * Sets the value of the totalLapseErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalLapseErrors(Integer value) {
        this.totalLapseErrors = value;
    }

    /**
     * Gets the value of the totalOk property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalOk() {
        return totalOk;
    }

    /**
     * Sets the value of the totalOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalOk(Integer value) {
        this.totalOk = value;
    }

    /**
     * Gets the value of the totalTransitions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalTransitions() {
        return totalTransitions;
    }

    /**
     * Sets the value of the totalTransitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalTransitions(Integer value) {
        this.totalTransitions = value;
    }

}
