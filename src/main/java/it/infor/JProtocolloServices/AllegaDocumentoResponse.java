
package it.infor.JProtocolloServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allegaDocumentoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allegaDocumentoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispostaAllegaDocumento" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="messaggio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allegaDocumentoResponse", propOrder = {
    "rispostaAllegaDocumento"
})
public class AllegaDocumentoResponse {

    @XmlElement(namespace = "")
    protected AllegaDocumentoResponse.RispostaAllegaDocumento rispostaAllegaDocumento;

    /**
     * Gets the value of the rispostaAllegaDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link AllegaDocumentoResponse.RispostaAllegaDocumento }
     *     
     */
    public AllegaDocumentoResponse.RispostaAllegaDocumento getRispostaAllegaDocumento() {
        return rispostaAllegaDocumento;
    }

    /**
     * Sets the value of the rispostaAllegaDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllegaDocumentoResponse.RispostaAllegaDocumento }
     *     
     */
    public void setRispostaAllegaDocumento(AllegaDocumentoResponse.RispostaAllegaDocumento value) {
        this.rispostaAllegaDocumento = value;
    }


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
     *         &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="messaggio" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "esito",
        "messaggio"
    })
    public static class RispostaAllegaDocumento {

        @XmlElement(required = true)
        protected String esito;
        @XmlElement(required = true)
        protected String messaggio;

        /**
         * Gets the value of the esito property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEsito() {
            return esito;
        }

        /**
         * Sets the value of the esito property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEsito(String value) {
            this.esito = value;
        }

        /**
         * Gets the value of the messaggio property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessaggio() {
            return messaggio;
        }

        /**
         * Sets the value of the messaggio property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessaggio(String value) {
            this.messaggio = value;
        }

    }

}
