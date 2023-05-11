
package it.easydoc.rest.protocol;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAoosResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAoosResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.consorziocsa.it/easydoc/ws}GenericServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="Aoo" type="{http://www.consorziocsa.it/easydoc/ws}AooType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAoosResponseType", propOrder = {
    "aoo"
})
public class GetAoosResponseType
    extends GenericServiceResponse
{

    @XmlElement(name = "Aoo")
    protected List<AooType> aoo;

    /**
     * Gets the value of the aoo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aoo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAoo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AooType }
     * 
     * 
     */
    public List<AooType> getAoo() {
        if (aoo == null) {
            aoo = new ArrayList<AooType>();
        }
        return this.aoo;
    }

}
