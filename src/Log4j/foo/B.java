/*
************************************************************
Index: com/foo/B.java
************************************************************
*/

package Log4j.foo;
import org.apache.log4j.Logger;

public class B {
 private static Logger logger = Logger.getLogger(B.class);
 public B() {
  logger.info("Inside Class B constructor");
  this.bMethod();
 }
 public void bMethod() {
  logger.debug("Inside bMethod()");
 }
}