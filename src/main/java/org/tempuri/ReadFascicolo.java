
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.FascicoloSearcher;


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
 *         &lt;element name="pFascSearcher" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher}FascicoloSearcher" minOccurs="0"/>
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
    "pFascSearcher"
})
@XmlRootElement(name = "ReadFascicolo")
public class ReadFascicolo {

    @XmlElementRef(name = "pFascSearcher", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<FascicoloSearcher> pFascSearcher;

    /**
     * Gets the value of the pFascSearcher property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FascicoloSearcher }{@code >}
     *     
     */
    public JAXBElement<FascicoloSearcher> getPFascSearcher() {
        return pFascSearcher;
    }

    /**
     * Sets the value of the pFascSearcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FascicoloSearcher }{@code >}
     *     
     */
    public void setPFascSearcher(JAXBElement<FascicoloSearcher> value) {
        this.pFascSearcher = ((JAXBElement<FascicoloSearcher> ) value);
    }

}
