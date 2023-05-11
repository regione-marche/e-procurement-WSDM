
package it.kdm.docer.sdk.classes.xsd;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.kdm.docer.sdk.classes.xsd package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.kdm.docer.sdk.classes.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link SearchItem }
     * 
     */
    public SearchItem createSearchItem() {
        return new SearchItem();
    }

    /**
     * Create an instance of {@link StreamDescriptor }
     * 
     */
    public StreamDescriptor createStreamDescriptor() {
        return new StreamDescriptor();
    }

    /**
     * Create an instance of {@link LockStatus }
     * 
     */
    public LockStatus createLockStatus() {
        return new LockStatus();
    }

    /**
     * Create an instance of {@link HistoryItem }
     * 
     */
    public HistoryItem createHistoryItem() {
        return new HistoryItem();
    }

    /**
     * Create an instance of {@link KeyValuePair }
     * 
     */
    public KeyValuePair createKeyValuePair() {
        return new KeyValuePair();
    }

}
