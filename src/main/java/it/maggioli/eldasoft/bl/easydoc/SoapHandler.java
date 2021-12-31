package it.maggioli.eldasoft.bl.easydoc;

import java.io.IOException;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SoapHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public void close(MessageContext context) {
		System.out.println("EASYDOC : close()......");
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("EASYDOC : handleFault()......");
		try{
			
		    SOAPMessage soapMsg = context.getMessage();
		    soapMsg.writeTo(System.out);
		    
		}catch(SOAPException e){
			System.err.println(e);
		}catch(IOException e){
			System.err.println(e);
		}
		return true;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if(isRequest){
			System.out.println("EASYDOC : MESSAGE_OUTBOUND");
		} else {
			System.out.println("EASYDOC : MESSAGE_INBOUND");
		}

		try{
			
		    SOAPMessage soapMsg = context.getMessage();
                    String str = soapMsg.toString();
		    soapMsg.writeTo(System.out);
		    
		}catch(SOAPException e){
			System.err.println(e);
		}catch(IOException e){
			System.err.println(e);
		}

		return true;
	}

	@Override
	public Set<QName> getHeaders() {
		System.out.println("EASYDOC : getHeaders()......");
		return null;
	}

}
