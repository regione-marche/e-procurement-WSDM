
package it.genova.comune.protocollotest.axis.services.wsricercafascicolo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.genova.comune.protocollotest.axis.services.wsricercafascicolo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.genova.comune.protocollotest.axis.services.wsricercafascicolo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ricerca }
     * 
     */
    public Ricerca createRicerca() {
        return new Ricerca();
    }

    /**
     * Create an instance of {@link RicercaResponse }
     * 
     */
    public RicercaResponse createRicercaResponse() {
        return new RicercaResponse();
    }

}
