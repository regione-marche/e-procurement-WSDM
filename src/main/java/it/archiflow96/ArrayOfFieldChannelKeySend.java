
package it.archiflow96;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFieldChannelKeySend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFieldChannelKeySend">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldChannelKeySend" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}FieldChannelKeySend" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFieldChannelKeySend", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", propOrder = {
    "fieldChannelKeySend"
})
public class ArrayOfFieldChannelKeySend {

    @XmlElement(name = "FieldChannelKeySend", nillable = true)
    protected List<FieldChannelKeySend> fieldChannelKeySend;

    /**
     * Gets the value of the fieldChannelKeySend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldChannelKeySend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldChannelKeySend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldChannelKeySend }
     * 
     * 
     */
    public List<FieldChannelKeySend> getFieldChannelKeySend() {
        if (fieldChannelKeySend == null) {
            fieldChannelKeySend = new ArrayList<FieldChannelKeySend>();
        }
        return this.fieldChannelKeySend;
    }

}
