
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
 *         &lt;element name="GetDrawersResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oDrawers" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject}ArrayOfDrawer" minOccurs="0"/>
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
    "getDrawersResult",
    "oDrawers"
})
@XmlRootElement(name = "GetDrawersResponse")
public class GetDrawersResponse {

    @XmlElement(name = "GetDrawersResult")
    protected ResultInfo getDrawersResult;
    @XmlElement(nillable = true)
    protected ArrayOfDrawer oDrawers;

    /**
     * Gets the value of the getDrawersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetDrawersResult() {
        return getDrawersResult;
    }

    /**
     * Sets the value of the getDrawersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetDrawersResult(ResultInfo value) {
        this.getDrawersResult = value;
    }

    /**
     * Gets the value of the oDrawers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrawer }
     *     
     */
    public ArrayOfDrawer getODrawers() {
        return oDrawers;
    }

    /**
     * Sets the value of the oDrawers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrawer }
     *     
     */
    public void setODrawers(ArrayOfDrawer value) {
        this.oDrawers = value;
    }

}
