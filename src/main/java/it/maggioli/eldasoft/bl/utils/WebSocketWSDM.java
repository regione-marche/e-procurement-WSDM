package it.maggioli.eldasoft.bl.utils;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.apache.log4j.Appender;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Level;
import org.apache.log4j.PropertyConfigurator;

@ServerEndpoint("/websocketwsdm/{mode}")
public class WebSocketWSDM {

  private static Map<Session, String> sessioniUtente = new ConcurrentHashMap<Session, String>();

  @OnMessage
  public void onMessage(String message, Session s) throws IOException, InterruptedException {

  }

  @OnOpen
  public void onOpen(@PathParam("mode") String mode, Session s) throws IOException {
    Set<Entry<Session, String>> setsu = sessioniUtente.entrySet();

    s.setMaxTextMessageBufferSize(1000000);

    // Rimozioni sessione non attive
    for (Entry<Session, String> setsusingola : setsu) {
      if (!setsusingola.getKey().isOpen()) {
        setsu.remove(setsusingola);
      }
    }

    // Aggiunta della sessione corrente alla lista delle sessioni
    sessioniUtente.put(s, "");

    // Gestione del livello di tracciatura
    if (setsu.size() > 0) {
      if ("all".equals(mode)) {
        setLogMassimo();
      } else {
        setLogIntermedio();
      }
    }

  }

  @OnClose
  public void onClose(Session s) {
    Set<Entry<Session, String>> setsu = sessioniUtente.entrySet();
    setsu.remove(s);

    if (setsu.size() == 0) {
      setLogMinimo();
    }

  }

  @OnError
  public void onError(Session s, Throwable error) throws IOException {

  }

  public void onMessageAll(String message) throws IOException {
    Set<Entry<Session, String>> setsu = sessioniUtente.entrySet();

    for (Entry<Session, String> setsusingola : setsu) {
      Session s = setsusingola.getKey();

      synchronized (s) {
        if (s.isOpen()) {
          s.getBasicRemote().sendText(message);
        } else {
          setsu.remove(setsusingola);
          if (setsu.size() == 0) {
            setLogMinimo();
          }
        }
      }

    }
  }

  private void setLogMinimo() {
    Properties props = new Properties();
    props.put("log4j.logger.org.apache.cxf", "WARN");
    props.put("log4j.logger.org.apache.axis.client", "INFO");
    props.put("log4j.logger.org.apache.axis.transport", "INFO");

    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getRootLogger();
    
    logger.setLevel(Level.INFO);
    
    Appender appenderFile = logger.getAppender("file");
    ((AppenderSkeleton) appenderFile).setThreshold(Level.INFO);

    Appender appenderWebSocketOut = logger.getAppender("websocketout");
    ((AppenderSkeleton) appenderWebSocketOut).setThreshold(Level.INFO);

    PropertyConfigurator.configure(props);

  }

  private void setLogIntermedio() {

    Properties props = new Properties();
    props.put("log4j.logger.org.apache.cxf", "INFO");

    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getRootLogger();
    
    logger.setLevel(Level.DEBUG);
    
    Appender appenderFile = logger.getAppender("file");
    ((AppenderSkeleton) appenderFile).setThreshold(Level.INFO);

    Appender appenderWebSocketOut = logger.getAppender("websocketout");
    ((AppenderSkeleton) appenderWebSocketOut).setThreshold(Level.INFO);

    PropertyConfigurator.configure(props);
  }

  private void setLogMassimo() {

    Properties props = new Properties();
    props.put("log4j.logger.org.apache.cxf", "INFO");
    props.put("log4j.logger.org.apache.axis.client", "DEBUG");
    props.put("log4j.logger.org.apache.axis.transport", "DEBUG");

    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getRootLogger();
    
    logger.setLevel(Level.DEBUG);

    Appender appenderFile = logger.getAppender("file");
    ((AppenderSkeleton) appenderFile).setThreshold(Level.DEBUG);

    Appender appenderWebSocketOut = logger.getAppender("websocketout");
    ((AppenderSkeleton) appenderWebSocketOut).setThreshold(Level.DEBUG);

    PropertyConfigurator.configure(props);
  }

}
