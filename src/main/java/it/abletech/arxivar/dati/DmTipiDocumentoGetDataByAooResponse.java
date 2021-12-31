
package it.abletech.arxivar.dati;

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
 *         &lt;element name="Dm_TipiDocumento_GetData_By_AooResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_TipiDocumento" minOccurs="0"/>
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
    "dmTipiDocumentoGetDataByAooResult"
})
@XmlRootElement(name = "Dm_TipiDocumento_GetData_By_AooResponse")
public class DmTipiDocumentoGetDataByAooResponse {

    @XmlElement(name = "Dm_TipiDocumento_GetData_By_AooResult")
    protected ArrayOfDmTipiDocumento dmTipiDocumentoGetDataByAooResult;

    /**
     * Gets the value of the dmTipiDocumentoGetDataByAooResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmTipiDocumento }
     *     
     */
    public ArrayOfDmTipiDocumento getDmTipiDocumentoGetDataByAooResult() {
        return dmTipiDocumentoGetDataByAooResult;
    }

    /**
     * Sets the value of the dmTipiDocumentoGetDataByAooResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmTipiDocumento }
     *     
     */
    public void setDmTipiDocumentoGetDataByAooResult(ArrayOfDmTipiDocumento value) {
        this.dmTipiDocumentoGetDataByAooResult = value;
    }

}
