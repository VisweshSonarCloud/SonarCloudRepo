package foo;

import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

  @Test
  public void testAdd() throws Exception {
  	assertEquals(Foo.div(10, 5), 2);
    System.out.println("Main Branch 1st Commit");
    System.out.println("Main Branch 2st Commit");
  }
}
