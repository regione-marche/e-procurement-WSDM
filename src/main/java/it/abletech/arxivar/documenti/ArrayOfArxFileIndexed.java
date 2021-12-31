
package it.abletech.arxivar.documenti;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArx_File_Indexed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArx_File_Indexed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Arx_File_Indexed" type="{http://www.Abletech.it/Arxivar}Arx_File_Indexed" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArx_File_Indexed", propOrder = {
    "arxFileIndexed"
})
public class ArrayOfArxFileIndexed {

    @XmlElement(name = "Arx_File_Indexed", nillable = true)
    protected List<ArxFileIndexed> arxFileIndexed;

    /**
     * Gets the value of the arxFileIndexed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arxFileIndexed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArxFileIndexed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArxFileIndexed }
     * 
     * 
     */
    public List<ArxFileIndexed> getArxFileIndexed() {
        if (arxFileIndexed == null) {
            arxFileIndexed = new ArrayList<ArxFileIndexed>();
        }
        return this.arxFileIndexed;
    }

}
