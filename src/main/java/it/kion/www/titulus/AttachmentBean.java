/**
 * AttachmentBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.kion.www.titulus;

public class AttachmentBean  implements java.io.Serializable {
    private byte[] content;

    private java.lang.String contentProviderId;

    private java.lang.Object contentProviderParams;

    private java.lang.String contentUri;

    private java.lang.String description;

    private java.lang.String fileName;

    private java.lang.String id;

    private java.lang.String mimeType;

    public AttachmentBean() {
    }

    public AttachmentBean(
           byte[] content,
           java.lang.String contentProviderId,
           java.lang.Object contentProviderParams,
           java.lang.String contentUri,
           java.lang.String description,
           java.lang.String fileName,
           java.lang.String id,
           java.lang.String mimeType) {
           this.content = content;
           this.contentProviderId = contentProviderId;
           this.contentProviderParams = contentProviderParams;
           this.contentUri = contentUri;
           this.description = description;
           this.fileName = fileName;
           this.id = id;
           this.mimeType = mimeType;
    }


    /**
     * Gets the content value for this AttachmentBean.
     * 
     * @return content
     */
    public byte[] getContent() {
        return content;
    }


    /**
     * Sets the content value for this AttachmentBean.
     * 
     * @param content
     */
    public void setContent(byte[] content) {
        this.content = content;
    }


    /**
     * Gets the contentProviderId value for this AttachmentBean.
     * 
     * @return contentProviderId
     */
    public java.lang.String getContentProviderId() {
        return contentProviderId;
    }


    /**
     * Sets the contentProviderId value for this AttachmentBean.
     * 
     * @param contentProviderId
     */
    public void setContentProviderId(java.lang.String contentProviderId) {
        this.contentProviderId = contentProviderId;
    }


    /**
     * Gets the contentProviderParams value for this AttachmentBean.
     * 
     * @return contentProviderParams
     */
    public java.lang.Object getContentProviderParams() {
        return contentProviderParams;
    }


    /**
     * Sets the contentProviderParams value for this AttachmentBean.
     * 
     * @param contentProviderParams
     */
    public void setContentProviderParams(java.lang.Object contentProviderParams) {
        this.contentProviderParams = contentProviderParams;
    }


    /**
     * Gets the contentUri value for this AttachmentBean.
     * 
     * @return contentUri
     */
    public java.lang.String getContentUri() {
        return contentUri;
    }


    /**
     * Sets the contentUri value for this AttachmentBean.
     * 
     * @param contentUri
     */
    public void setContentUri(java.lang.String contentUri) {
        this.contentUri = contentUri;
    }


    /**
     * Gets the description value for this AttachmentBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AttachmentBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the fileName value for this AttachmentBean.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this AttachmentBean.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the id value for this AttachmentBean.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this AttachmentBean.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the mimeType value for this AttachmentBean.
     * 
     * @return mimeType
     */
    public java.lang.String getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this AttachmentBean.
     * 
     * @param mimeType
     */
    public void setMimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttachmentBean)) return false;
        AttachmentBean other = (AttachmentBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              java.util.Arrays.equals(this.content, other.getContent()))) &&
            ((this.contentProviderId==null && other.getContentProviderId()==null) || 
             (this.contentProviderId!=null &&
              this.contentProviderId.equals(other.getContentProviderId()))) &&
            ((this.contentProviderParams==null && other.getContentProviderParams()==null) || 
             (this.contentProviderParams!=null &&
              this.contentProviderParams.equals(other.getContentProviderParams()))) &&
            ((this.contentUri==null && other.getContentUri()==null) || 
             (this.contentUri!=null &&
              this.contentUri.equals(other.getContentUri()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContentProviderId() != null) {
            _hashCode += getContentProviderId().hashCode();
        }
        if (getContentProviderParams() != null) {
            _hashCode += getContentProviderParams().hashCode();
        }
        if (getContentUri() != null) {
            _hashCode += getContentUri().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttachmentBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.kion.it/titulus", "AttachmentBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentProviderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentProviderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentProviderParams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentProviderParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentUri");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentUri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
