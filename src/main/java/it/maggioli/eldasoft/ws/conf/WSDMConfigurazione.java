package it.maggioli.eldasoft.ws.conf;

import java.rmi.RemoteException;
import javax.jws.WebService;
import org.apache.cxf.annotations.WSDLDocumentation;

@WebService
public interface WSDMConfigurazione {

  @WSDLDocumentation("Lettura della configurazione")
  WSDMConfigurazioneOut WSDMConfigurazioneLeggi() throws RemoteException;

}
