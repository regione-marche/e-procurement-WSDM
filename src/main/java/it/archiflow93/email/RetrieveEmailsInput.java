
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveEmailsInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveEmailsInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="SearchMailInCriteria" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}SearchMailInCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveEmailsInput", propOrder = {
    "searchMailInCriteria"
})
public class RetrieveEmailsInput
    extends BaseInput
{

    @XmlElement(name = "SearchMailInCriteria", nillable = true)
    protected SearchMailInCriteria searchMailInCriteria;

    /**
     * Gets the value of the searchMailInCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMailInCriteria }
     *     
     */
    public SearchMailInCriteria getSearchMailInCriteria() {
        return searchMailInCriteria;
    }

    /**
     * Sets the value of the searchMailInCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMailInCriteria }
     *     
     */
    public void setSearchMailInCriteria(SearchMailInCriteria value) {
        this.searchMailInCriteria = value;
    }

}
