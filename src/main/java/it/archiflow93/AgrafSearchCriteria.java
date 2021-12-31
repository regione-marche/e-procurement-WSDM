
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgrafSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgrafSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchAgrafEntitiesId" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}ArrayOfSearchAgrafEntityId" minOccurs="0"/>
 *         &lt;element name="SearchAgrafOptionsTags" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}ArrayOfSearchAgrafOptionsTag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgrafSearchCriteria", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", propOrder = {
    "searchAgrafEntitiesId",
    "searchAgrafOptionsTags"
})
public class AgrafSearchCriteria {

    @XmlElement(name = "SearchAgrafEntitiesId", nillable = true)
    protected ArrayOfSearchAgrafEntityId searchAgrafEntitiesId;
    @XmlElement(name = "SearchAgrafOptionsTags", nillable = true)
    protected ArrayOfSearchAgrafOptionsTag searchAgrafOptionsTags;

    /**
     * Gets the value of the searchAgrafEntitiesId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchAgrafEntityId }
     *     
     */
    public ArrayOfSearchAgrafEntityId getSearchAgrafEntitiesId() {
        return searchAgrafEntitiesId;
    }

    /**
     * Sets the value of the searchAgrafEntitiesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchAgrafEntityId }
     *     
     */
    public void setSearchAgrafEntitiesId(ArrayOfSearchAgrafEntityId value) {
        this.searchAgrafEntitiesId = value;
    }

    /**
     * Gets the value of the searchAgrafOptionsTags property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchAgrafOptionsTag }
     *     
     */
    public ArrayOfSearchAgrafOptionsTag getSearchAgrafOptionsTags() {
        return searchAgrafOptionsTags;
    }

    /**
     * Sets the value of the searchAgrafOptionsTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchAgrafOptionsTag }
     *     
     */
    public void setSearchAgrafOptionsTags(ArrayOfSearchAgrafOptionsTag value) {
        this.searchAgrafOptionsTags = value;
    }

}
