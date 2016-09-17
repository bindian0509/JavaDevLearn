/*
************************************************************
Index: com/A.java
************************************************************
*/

package Log4j;
import org.apache.log4j.Logger;
public class A {

 // Give Classname.class as input to getLogger method
 private static Logger logger = Logger.getLogger(A.class);

 public A() {
  logger.info("Inside class A constructor");
  this.aMethod();
 }
 public void aMethod() {
  logger.debug("Inside aMethod()");
 }
}