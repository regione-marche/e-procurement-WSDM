
package it.marche.regione.paleo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSerieArchivistica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSerieArchivistica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SerieArchivistica" type="{http://paleo.regione.marche.it/services/}SerieArchivistica" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSerieArchivistica", propOrder = {
    "serieArchivistica"
})
public class ArrayOfSerieArchivistica {

    @XmlElement(name = "SerieArchivistica", nillable = true)
    protected List<SerieArchivistica> serieArchivistica;

    /**
     * Gets the value of the serieArchivistica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serieArchivistica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerieArchivistica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SerieArchivistica }
     * 
     * 
     */
    public List<SerieArchivistica> getSerieArchivistica() {
        if (serieArchivistica == null) {
            serieArchivistica = new ArrayList<SerieArchivistica>();
        }
        return this.serieArchivistica;
    }

}
