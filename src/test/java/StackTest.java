import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StackTest {

    @Test
    public void testAddElementToStack() {

     MyStack myStack = new MyStack();
     myStack.addElement("ABC");
     assertEquals("ABC",myStack.popElement());
     myStack.addElement("XYZ");
     myStack.addElement("TQR");
     myStack.addElement("PQT");
     myStack.popElement();
     assertEquals("TQR",myStack.popElement());
     double d = 23;
     myStack.addElement(d);
    }


}