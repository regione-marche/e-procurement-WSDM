
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}EntityType" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="SendingType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SendingType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TaskTemplate" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Tasks.ValueObject}TaskTemplate" minOccurs="0"/>
 *         &lt;element name="bCC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendEntity", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "description",
    "entityType",
    "id",
    "level",
    "parentId",
    "sendingType",
    "status",
    "taskTemplate",
    "bcc"
})
public class SendEntity {

    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "EntityType")
    protected EntityType entityType;
    @XmlElement(name = "Id")
    protected Short id;
    @XmlElement(name = "Level")
    protected Integer level;
    @XmlElement(name = "ParentId")
    protected Short parentId;
    @XmlElement(name = "SendingType")
    protected SendingType sendingType;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElement(name = "TaskTemplate", nillable = true)
    protected TaskTemplate taskTemplate;
    @XmlElement(name = "bCC")
    protected Boolean bcc;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setEntityType(EntityType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setId(Short value) {
        this.id = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLevel(Integer value) {
        this.level = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setParentId(Short value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the sendingType property.
     * 
     * @return
     *     possible object is
     *     {@link SendingType }
     *     
     */
    public SendingType getSendingType() {
        return sendingType;
    }

    /**
     * Sets the value of the sendingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingType }
     *     
     */
    public void setSendingType(SendingType value) {
        this.sendingType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the taskTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link TaskTemplate }
     *     
     */
    public TaskTemplate getTaskTemplate() {
        return taskTemplate;
    }

    /**
     * Sets the value of the taskTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskTemplate }
     *     
     */
    public void setTaskTemplate(TaskTemplate value) {
        this.taskTemplate = value;
    }

    /**
     * Gets the value of the bcc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBCC() {
        return bcc;
    }

    /**
     * Sets the value of the bcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBCC(Boolean value) {
        this.bcc = value;
    }

}
