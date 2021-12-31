
package org.datacontract.schemas._2004._07.siav_common_baseclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_common.DocumentIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.FascicoloIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.LegislaturaIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_tipofascicolo.CampiTipoFascicoloIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_tipofascicolo.TipoFascicoloIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_titolario.TitolarioIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_titolarioitem.TitolarioItemIdentifier;


/**
 * <p>Java class for BaseIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseIdentifier", propOrder = {
    "id"
})
@XmlSeeAlso({
    TitolarioIdentifier.class,
    CampiTipoFascicoloIdentifier.class,
    TipoFascicoloIdentifier.class,
    TitolarioItemIdentifier.class,
    DocumentIdentifier.class,
    DateIdentifier.class,
    TypeIdentifier.class,
    LegislaturaIdentifier.class,
    FascicoloIdentifier.class
})
public class BaseIdentifier {

    @XmlElement(name = "Id")
    protected Integer id;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

}
