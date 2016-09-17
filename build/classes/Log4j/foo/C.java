/*
************************************************************
Index: com/foo/C.java
************************************************************
*/

package Log4j.foo;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import Log4j.A;

public class C {
 private static Logger logger = Logger.getLogger(C.class);
 public C() {
  logger.info("Inside class C constructor");
  this.cMethod();
 }

 public void cMethod() {
  logger.debug("Inside cMethod()");
 }

 public static void main(String args[]) {
  PropertyConfigurator.configure("log4j.properties");
  A a = new A();
  B b = new B();
  C c = new C();
 }
}