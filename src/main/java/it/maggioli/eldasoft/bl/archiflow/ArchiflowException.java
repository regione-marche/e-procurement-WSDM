package it.maggioli.eldasoft.bl.archiflow;

public class ArchiflowException extends Exception {

  private static final long serialVersionUID = 1L;

  private String            message;

  public ArchiflowException(Exception e) {
    super(e);
  }

  public ArchiflowException(String msg, Exception e) {
    super(e);
    message = msg;
  }

  public ArchiflowException(String msg) {
    message = msg;
  }

  public String getMessage() {
    return message;
  }

}
