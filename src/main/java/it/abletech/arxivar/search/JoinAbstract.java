
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Abstract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Abstract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegameTabella" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forceCaseInsensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="JoinMode" type="{http://www.Abletech.it/Arxivar}EJoinMode"/>
 *         &lt;element name="NomeTabella" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Abstract", propOrder = {
    "legameTabella",
    "forceCaseInsensitive",
    "joinMode",
    "nomeTabella"
})
@XmlSeeAlso({
    JoinDmElencoPratiche.class,
    JoinDmFascicoli.class,
    JoinDmRolesUser.class,
    JoinDmCampiSpecGrp.class,
    JoinDmProfilePratica.class,
    JoinDmTaskWork.class,
    JoinDmPermessiProfili.class,
    JoinDmEmergenza.class,
    JoinDmDocAllegati.class,
    JoinDmDatiEnte.class,
    JoinDmCatRubriche.class,
    JoinDmUtenti.class,
    JoinDmDettagliMail.class,
    JoinDmDocOpen.class,
    JoinDmBarcode.class,
    JoinDmProcessDoc.class,
    JoinDmCampiClasseLegami.class,
    JoinDmLinguaCampi.class,
    JoinDmRevisioni.class,
    JoinDmTipiPratiche.class,
    JoinDmDevDoc.class,
    JoinDmStampDefinition.class,
    JoinDmAssociazioni.class,
    JoinDmVariabiliProcesso.class,
    JoinDmPermessiAllegati.class,
    JoinDmTaskExecute.class,
    JoinDmAssociaFolderDatiProfilo.class,
    JoinDmStampsInstance.class,
    JoinDmNote.class,
    DmProfileSearchSostitutiva.class,
    JoinDmPermessiFolder.class,
    JoinDmMapWorkflow.class,
    JoinDmAllegatiWork.class,
    JoinDmTesto.class,
    JoinDmProcessi.class,
    JoinDmRelazioni.class,
    JoinDmTipiDocumento.class,
    JoinDmProfile.class,
    JoinDmWorkflow.class,
    JoinDmDatiProfilo.class,
    JoinDmRubrica.class,
    JoinDmUsersWork.class,
    JoinDmFileInFolder.class,
    JoinDmVariabiliProcessoVal.class,
    JoinDmTipoDocumento.class,
    JoinDmAutore.class,
    JoinDmStampApplied.class,
    JoinDmNpceOut.class,
    JoinDmMovimentiListe.class,
    JoinSdAssocdoc.class,
    JoinDmAllegatiDoc.class,
    JoinDmTaskDoc.class
})
public abstract class JoinAbstract {

    @XmlElement(name = "LegameTabella")
    protected String legameTabella;
    protected boolean forceCaseInsensitive;
    @XmlElement(name = "JoinMode", required = true)
    protected EJoinMode joinMode;
    @XmlElement(name = "NomeTabella")
    protected String nomeTabella;

    /**
     * Gets the value of the legameTabella property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegameTabella() {
        return legameTabella;
    }

    /**
     * Sets the value of the legameTabella property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegameTabella(String value) {
        this.legameTabella = value;
    }

    /**
     * Gets the value of the forceCaseInsensitive property.
     * 
     */
    public boolean isForceCaseInsensitive() {
        return forceCaseInsensitive;
    }

    /**
     * Sets the value of the forceCaseInsensitive property.
     * 
     */
    public void setForceCaseInsensitive(boolean value) {
        this.forceCaseInsensitive = value;
    }

    /**
     * Gets the value of the joinMode property.
     * 
     * @return
     *     possible object is
     *     {@link EJoinMode }
     *     
     */
    public EJoinMode getJoinMode() {
        return joinMode;
    }

    /**
     * Sets the value of the joinMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EJoinMode }
     *     
     */
    public void setJoinMode(EJoinMode value) {
        this.joinMode = value;
    }

    /**
     * Gets the value of the nomeTabella property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTabella() {
        return nomeTabella;
    }

    /**
     * Sets the value of the nomeTabella property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTabella(String value) {
        this.nomeTabella = value;
    }

}
