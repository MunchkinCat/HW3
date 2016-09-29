import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
//import Triple.*;

/**
 * Created by Gabe on 9/27/2016.
 */
public class tripleTest {


    @Test
    public void testSetTriple() {
        Triple t = new Triple<>();
        t.Triple("test", 2, 4.3);
        Triple u = new Triple <>();
        u.Triple(",34","#*(36", .43);
        assertEquals("Error left", "test",t.getLeft());
        assertEquals("Error middle", 2, t.getMiddle());
        assertEquals("Error right", 4.3,t.getRight());
        assertEquals("Error left", ",34",u.getLeft());
        assertEquals("Error middle", "#*(36",u.getMiddle());
        assertEquals("Error right", .43,u.getRight());
    }
}

