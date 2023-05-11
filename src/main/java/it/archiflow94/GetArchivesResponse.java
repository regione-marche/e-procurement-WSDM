
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetArchivesResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oArchives" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfArchive" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getArchivesResult",
    "oArchives"
})
@XmlRootElement(name = "GetArchivesResponse")
public class GetArchivesResponse {

    @XmlElement(name = "GetArchivesResult")
    protected ResultInfo getArchivesResult;
    @XmlElement(nillable = true)
    protected ArrayOfArchive oArchives;

    /**
     * Gets the value of the getArchivesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetArchivesResult() {
        return getArchivesResult;
    }

    /**
     * Sets the value of the getArchivesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetArchivesResult(ResultInfo value) {
        this.getArchivesResult = value;
    }

    /**
     * Gets the value of the oArchives property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArchive }
     *     
     */
    public ArrayOfArchive getOArchives() {
        return oArchives;
    }

    /**
     * Sets the value of the oArchives property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArchive }
     *     
     */
    public void setOArchives(ArrayOfArchive value) {
        this.oArchives = value;
    }

}
