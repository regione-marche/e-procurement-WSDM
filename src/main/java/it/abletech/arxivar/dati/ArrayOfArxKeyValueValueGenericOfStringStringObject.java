
package it.abletech.arxivar.dati;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArx_KeyValueValue_GenericOfStringStringObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArx_KeyValueValue_GenericOfStringStringObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Arx_KeyValueValue_GenericOfStringStringObject" type="{http://www.Abletech.it/Arxivar}Arx_KeyValueValue_GenericOfStringStringObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArx_KeyValueValue_GenericOfStringStringObject", propOrder = {
    "arxKeyValueValueGenericOfStringStringObject"
})
public class ArrayOfArxKeyValueValueGenericOfStringStringObject {

    @XmlElement(name = "Arx_KeyValueValue_GenericOfStringStringObject", nillable = true)
    protected List<ArxKeyValueValueGenericOfStringStringObject> arxKeyValueValueGenericOfStringStringObject;

    /**
     * Gets the value of the arxKeyValueValueGenericOfStringStringObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arxKeyValueValueGenericOfStringStringObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArxKeyValueValueGenericOfStringStringObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArxKeyValueValueGenericOfStringStringObject }
     * 
     * 
     */
    public List<ArxKeyValueValueGenericOfStringStringObject> getArxKeyValueValueGenericOfStringStringObject() {
        if (arxKeyValueValueGenericOfStringStringObject == null) {
            arxKeyValueValueGenericOfStringStringObject = new ArrayList<ArxKeyValueValueGenericOfStringStringObject>();
        }
        return this.arxKeyValueValueGenericOfStringStringObject;
    }

}
