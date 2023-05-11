
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldChannelKeySend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldChannelKeySend">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}ArrayOfFieldChannelKeyAttributes" minOccurs="0"/>
 *         &lt;element name="CustomKeyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DataType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}PostingFieldDataType" minOccurs="0"/>
 *         &lt;element name="FieldKeyDirection" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}PostingFieldKeyDirection" minOccurs="0"/>
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FieldType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}PostingFieldType" minOccurs="0"/>
 *         &lt;element name="KeyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="KeyTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostingChannelFieldId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SingleElementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldChannelKeySend", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", propOrder = {
    "attributes",
    "customKeyId",
    "dataType",
    "fieldKeyDirection",
    "fieldName",
    "fieldType",
    "keyId",
    "keyTag",
    "messageName",
    "postingChannelFieldId",
    "singleElementName"
})
public class FieldChannelKeySend {

    @XmlElement(name = "Attributes", nillable = true)
    protected ArrayOfFieldChannelKeyAttributes attributes;
    @XmlElement(name = "CustomKeyId")
    protected Long customKeyId;
    @XmlElement(name = "DataType")
    protected PostingFieldDataType dataType;
    @XmlElement(name = "FieldKeyDirection")
    protected PostingFieldKeyDirection fieldKeyDirection;
    @XmlElement(name = "FieldName")
    protected Long fieldName;
    @XmlElement(name = "FieldType")
    protected PostingFieldType fieldType;
    @XmlElement(name = "KeyId")
    protected Long keyId;
    @XmlElement(name = "KeyTag", nillable = true)
    protected String keyTag;
    @XmlElement(name = "MessageName", nillable = true)
    protected String messageName;
    @XmlElement(name = "PostingChannelFieldId")
    protected Long postingChannelFieldId;
    @XmlElement(name = "SingleElementName", nillable = true)
    protected String singleElementName;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldChannelKeyAttributes }
     *     
     */
    public ArrayOfFieldChannelKeyAttributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldChannelKeyAttributes }
     *     
     */
    public void setAttributes(ArrayOfFieldChannelKeyAttributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the customKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomKeyId() {
        return customKeyId;
    }

    /**
     * Sets the value of the customKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomKeyId(Long value) {
        this.customKeyId = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link PostingFieldDataType }
     *     
     */
    public PostingFieldDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingFieldDataType }
     *     
     */
    public void setDataType(PostingFieldDataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the fieldKeyDirection property.
     * 
     * @return
     *     possible object is
     *     {@link PostingFieldKeyDirection }
     *     
     */
    public PostingFieldKeyDirection getFieldKeyDirection() {
        return fieldKeyDirection;
    }

    /**
     * Sets the value of the fieldKeyDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingFieldKeyDirection }
     *     
     */
    public void setFieldKeyDirection(PostingFieldKeyDirection value) {
        this.fieldKeyDirection = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFieldName(Long value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link PostingFieldType }
     *     
     */
    public PostingFieldType getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingFieldType }
     *     
     */
    public void setFieldType(PostingFieldType value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeyId(Long value) {
        this.keyId = value;
    }

    /**
     * Gets the value of the keyTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyTag() {
        return keyTag;
    }

    /**
     * Sets the value of the keyTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyTag(String value) {
        this.keyTag = value;
    }

    /**
     * Gets the value of the messageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageName() {
        return messageName;
    }

    /**
     * Sets the value of the messageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageName(String value) {
        this.messageName = value;
    }

    /**
     * Gets the value of the postingChannelFieldId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPostingChannelFieldId() {
        return postingChannelFieldId;
    }

    /**
     * Sets the value of the postingChannelFieldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPostingChannelFieldId(Long value) {
        this.postingChannelFieldId = value;
    }

    /**
     * Gets the value of the singleElementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleElementName() {
        return singleElementName;
    }

    /**
     * Sets the value of the singleElementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleElementName(String value) {
        this.singleElementName = value;
    }

}
