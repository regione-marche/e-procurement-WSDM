
package it.archiflow93.email;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOfficeChart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOfficeChart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfficeChart" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}OfficeChart" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOfficeChart", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", propOrder = {
    "officeChart"
})
public class ArrayOfOfficeChart {

    @XmlElement(name = "OfficeChart", nillable = true)
    protected List<OfficeChart> officeChart;

    /**
     * Gets the value of the officeChart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the officeChart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfficeChart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfficeChart }
     * 
     * 
     */
    public List<OfficeChart> getOfficeChart() {
        if (officeChart == null) {
            officeChart = new ArrayList<OfficeChart>();
        }
        return this.officeChart;
    }

}
