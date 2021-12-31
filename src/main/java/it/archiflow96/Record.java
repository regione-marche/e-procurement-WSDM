
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Record complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Record">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DontShow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Fields" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Registry.ValueObject}ArrayOfRegistryField" minOccurs="0"/>
 *         &lt;element name="RecordId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RegistryId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Registry.ValueObject", propOrder = {
    "dontShow",
    "fields",
    "recordId",
    "registryId"
})
public class Record {

    @XmlElement(name = "DontShow")
    protected Boolean dontShow;
    @XmlElement(name = "Fields", nillable = true)
    protected ArrayOfRegistryField fields;
    @XmlElement(name = "RecordId")
    protected Integer recordId;
    @XmlElement(name = "RegistryId")
    protected Short registryId;

    /**
     * Gets the value of the dontShow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDontShow() {
        return dontShow;
    }

    /**
     * Sets the value of the dontShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDontShow(Boolean value) {
        this.dontShow = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRegistryField }
     *     
     */
    public ArrayOfRegistryField getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRegistryField }
     *     
     */
    public void setFields(ArrayOfRegistryField value) {
        this.fields = value;
    }

    /**
     * Gets the value of the recordId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecordId(Integer value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the registryId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRegistryId() {
        return registryId;
    }

    /**
     * Sets the value of the registryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRegistryId(Short value) {
        this.registryId = value;
    }

}
