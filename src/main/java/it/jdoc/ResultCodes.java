
package it.jdoc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultCodes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultCodes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="UtenteInesistenteONonAttivo"/>
 *     &lt;enumeration value="AutenticazioneFallita"/>
 *     &lt;enumeration value="UtenteNonTrovato"/>
 *     &lt;enumeration value="CreazioneTokenFallita"/>
 *     &lt;enumeration value="TokenNonValido"/>
 *     &lt;enumeration value="OggettoNonValido"/>
 *     &lt;enumeration value="PropietaNonValida"/>
 *     &lt;enumeration value="DatabaseError"/>
 *     &lt;enumeration value="ArchiviazioneErrata"/>
 *     &lt;enumeration value="ModificaDocErrata"/>
 *     &lt;enumeration value="EliminazioneDocErrata"/>
 *     &lt;enumeration value="CreazioneLinkErrata"/>
 *     &lt;enumeration value="ControlloUtenteDisattivato"/>
 *     &lt;enumeration value="DownloadByIdErrato"/>
 *     &lt;enumeration value="DownloadByBarcodeErrato"/>
 *     &lt;enumeration value="DownloadByKeysErrato"/>
 *     &lt;enumeration value="DocumentoNonTrovato"/>
 *     &lt;enumeration value="NessunDocumentoTrovato"/>
 *     &lt;enumeration value="TipoDocumentoNonTrovato"/>
 *     &lt;enumeration value="SocietaNonTrovata"/>
 *     &lt;enumeration value="ErroreGenerico"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultCodes", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni")
@XmlEnum
public enum ResultCodes {

    OK("OK"),
    @XmlEnumValue("UtenteInesistenteONonAttivo")
    UTENTE_INESISTENTE_O_NON_ATTIVO("UtenteInesistenteONonAttivo"),
    @XmlEnumValue("AutenticazioneFallita")
    AUTENTICAZIONE_FALLITA("AutenticazioneFallita"),
    @XmlEnumValue("UtenteNonTrovato")
    UTENTE_NON_TROVATO("UtenteNonTrovato"),
    @XmlEnumValue("CreazioneTokenFallita")
    CREAZIONE_TOKEN_FALLITA("CreazioneTokenFallita"),
    @XmlEnumValue("TokenNonValido")
    TOKEN_NON_VALIDO("TokenNonValido"),
    @XmlEnumValue("OggettoNonValido")
    OGGETTO_NON_VALIDO("OggettoNonValido"),
    @XmlEnumValue("PropietaNonValida")
    PROPIETA_NON_VALIDA("PropietaNonValida"),
    @XmlEnumValue("DatabaseError")
    DATABASE_ERROR("DatabaseError"),
    @XmlEnumValue("ArchiviazioneErrata")
    ARCHIVIAZIONE_ERRATA("ArchiviazioneErrata"),
    @XmlEnumValue("ModificaDocErrata")
    MODIFICA_DOC_ERRATA("ModificaDocErrata"),
    @XmlEnumValue("EliminazioneDocErrata")
    ELIMINAZIONE_DOC_ERRATA("EliminazioneDocErrata"),
    @XmlEnumValue("CreazioneLinkErrata")
    CREAZIONE_LINK_ERRATA("CreazioneLinkErrata"),
    @XmlEnumValue("ControlloUtenteDisattivato")
    CONTROLLO_UTENTE_DISATTIVATO("ControlloUtenteDisattivato"),
    @XmlEnumValue("DownloadByIdErrato")
    DOWNLOAD_BY_ID_ERRATO("DownloadByIdErrato"),
    @XmlEnumValue("DownloadByBarcodeErrato")
    DOWNLOAD_BY_BARCODE_ERRATO("DownloadByBarcodeErrato"),
    @XmlEnumValue("DownloadByKeysErrato")
    DOWNLOAD_BY_KEYS_ERRATO("DownloadByKeysErrato"),
    @XmlEnumValue("DocumentoNonTrovato")
    DOCUMENTO_NON_TROVATO("DocumentoNonTrovato"),
    @XmlEnumValue("NessunDocumentoTrovato")
    NESSUN_DOCUMENTO_TROVATO("NessunDocumentoTrovato"),
    @XmlEnumValue("TipoDocumentoNonTrovato")
    TIPO_DOCUMENTO_NON_TROVATO("TipoDocumentoNonTrovato"),
    @XmlEnumValue("SocietaNonTrovata")
    SOCIETA_NON_TROVATA("SocietaNonTrovata"),
    @XmlEnumValue("ErroreGenerico")
    ERRORE_GENERICO("ErroreGenerico");
    private final String value;

    ResultCodes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultCodes fromValue(String v) {
        for (ResultCodes c: ResultCodes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
