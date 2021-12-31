package it.maggioli.eldasoft.bl.archiflowfa96;

public class ArchiflowFaException extends Exception {

  private static final long serialVersionUID = 1L;

  private String            message;

  public ArchiflowFaException(Exception e) {
    super(e);
  }

  public ArchiflowFaException(String msg, Exception e) {
    super(e);
    message = msg;
  }

  public ArchiflowFaException(String msg) {
    message = msg;
  }

  public String getMessage() {
    return message;
  }

}
