package it.maggioli.eldasoft.bl.smat;

import javax.xml.rpc.handler.soap.SOAPMessageContext;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.message.RPCParam;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SOAPHandlers extends BasicHandler {

  @Override
  public void invoke(MessageContext msgContext) throws AxisFault {
    try {
      SOAPMessageContext smc = (SOAPMessageContext) msgContext;
      SOAPMessage soapMessage = smc.getMessage();
      SOAPBody soapBody = soapMessage.getSOAPBody();

      NodeList soapBodyChildNodes = soapBody.getChildNodes();
      if (soapBodyChildNodes != null) {
        Node soapBodyItem0 = soapBodyChildNodes.item(0);
        NodeList childNodes = soapBodyItem0.getChildNodes();

        // Ricerca dell'elemento BASE64FILE
        Node nodeBASE64FILE = null;
        for (int n = 0; n < childNodes.getLength(); n++) {
          Node node = childNodes.item(n);
          String localName = node.getLocalName();
          if ("BASE64FILE".equals(localName)) {
            nodeBASE64FILE = childNodes.item(n);
          }
        }
        
        // Ricerca del nodo NOMEFILE, rimozione e trasformazioni degli
        // elementi "item" del nodo originale
        // in nuovi nodi NOMEFILE
        for (int n = 0; n < childNodes.getLength(); n++) {
          Node node = childNodes.item(n);
          String localName = node.getLocalName();
          if ("NOMEFILE".equals(localName)) {
            soapBodyItem0.removeChild(node);
            if (node instanceof RPCParam) {
              RPCParam docElement = (RPCParam) node;
              String[] NOMEFILE_itemList = (String[]) docElement.getObjectValue();
              for (int nfnl = 0; nfnl <= NOMEFILE_itemList.length - 1; nfnl++) {
                String ITEM_value = NOMEFILE_itemList[nfnl];
                RPCParam NOMEFILE_RPCParam = new RPCParam("urn:DefaultNamespace", "NOMEFILE", ITEM_value);
                soapBodyItem0.insertBefore(NOMEFILE_RPCParam, nodeBASE64FILE);
              }
            }
          }
        }
      }

    } catch (SOAPException e) {

    }

  }

}



















