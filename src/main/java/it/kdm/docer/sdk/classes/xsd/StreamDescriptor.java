
package it.kdm.docer.sdk.classes.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StreamDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreamDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="byteSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="handler" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamDescriptor", propOrder = {
    "byteSize",
    "handler"
})
public class StreamDescriptor {

    protected Long byteSize;
    @XmlElement(nillable = true)
    protected byte[] handler;

    /**
     * Gets the value of the byteSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getByteSize() {
        return byteSize;
    }

    /**
     * Sets the value of the byteSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setByteSize(Long value) {
        this.byteSize = value;
    }

    /**
     * Gets the value of the handler property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHandler() {
        return handler;
    }

    /**
     * Sets the value of the handler property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHandler(byte[] value) {
        this.handler = ((byte[]) value);
    }

}
