package nl.tue.declare.execution.msg;

/**
 * <p>Title: DECLARE</p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: TU/e</p>
 *
 * @author Maja Pesic
 * @version 1.0
 */
public abstract class UserMessage
    extends Message {

  public static final String CLASS = "USER";

  protected String msgClass() {
    return CLASS;
  }

}
