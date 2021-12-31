
package it.abletech.arxivar.documenti;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArx_File complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArx_File">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Arx_File" type="{http://www.Abletech.it/Arxivar}Arx_File" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArx_File", propOrder = {
    "arxFile"
})
public class ArrayOfArxFile {

    @XmlElement(name = "Arx_File", nillable = true)
    protected List<ArxFile> arxFile;

    /**
     * Gets the value of the arxFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arxFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArxFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArxFile }
     * 
     * 
     */
    public List<ArxFile> getArxFile() {
        if (arxFile == null) {
            arxFile = new ArrayList<ArxFile>();
        }
        return this.arxFile;
    }

}
