package it.maggioli.eldasoft.bl.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

public class WSDMLog4jAppender extends AppenderSkeleton {

  private static final SimpleDateFormat sdf      = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");

  private WebSocketWSDM                 webSocketWSDM;
  // private static int                    MAX_CHAR = 20000;

  public WSDMLog4jAppender() {
    webSocketWSDM = new WebSocketWSDM();
  }

  @Override
  protected void append(LoggingEvent event) {

    try {
      String level = event.getLevel().toString();
      String _m = "LEVEL: " + level;

      Date time = new Date(event.timeStamp);
      String dateTime = sdf.format(time);
      _m += "\nTIMESTAMP: " + dateTime;

      String threadName = event.getThreadName();
      _m += "\nTHREADNAME: " + threadName;

      if (event.getLocationInformation() != null) {
        String className = event.getLocationInformation().getClassName();
        String methodName = event.getLocationInformation().getMethodName();
        _m += "\nCLASS: " + className;
        _m += "\nMETHOD: " + methodName;
      }

      String message = event.getMessage().toString();
      _m += "\nMESSAGE: " + message;

      if (event.getThrowableInformation() != null) {
        if (event.getThrowableInformation().getThrowable() != null) {
          String throwable = event.getThrowableInformation().getThrowable().toString();
          if (event.getThrowableInformation().getThrowableStrRep() != null) {
            for (int i = 0; i < event.getThrowableInformation().getThrowableStrRep().length; i++) {
              throwable += "\n" + event.getThrowableInformation().getThrowableStrRep()[i];
            }
          }
          _m += "\nTHROWABLE: " + throwable;
        }
      }

      // if (_m.length() > MAX_CHAR) _m = _m.substring(0, MAX_CHAR - 1) + " ... [Elemento troncato a " + MAX_CHAR + " caratteri]";

      webSocketWSDM.onMessageAll(_m);
    } catch (IOException e) {

    }

  }

  @Override
  public void close() {

  }

  @Override
  public boolean requiresLayout() {

    return false;
  }

}
