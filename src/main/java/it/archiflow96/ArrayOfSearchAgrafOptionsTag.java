
package it.archiflow96;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSearchAgrafOptionsTag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSearchAgrafOptionsTag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchAgrafOptionsTag" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}SearchAgrafOptionsTag" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchAgrafOptionsTag", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", propOrder = {
    "searchAgrafOptionsTag"
})
public class ArrayOfSearchAgrafOptionsTag {

    @XmlElement(name = "SearchAgrafOptionsTag", nillable = true)
    protected List<SearchAgrafOptionsTag> searchAgrafOptionsTag;

    /**
     * Gets the value of the searchAgrafOptionsTag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchAgrafOptionsTag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchAgrafOptionsTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchAgrafOptionsTag }
     * 
     * 
     */
    public List<SearchAgrafOptionsTag> getSearchAgrafOptionsTag() {
        if (searchAgrafOptionsTag == null) {
            searchAgrafOptionsTag = new ArrayList<SearchAgrafOptionsTag>();
        }
        return this.searchAgrafOptionsTag;
    }

}
