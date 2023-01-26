import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTests {
    @Test
    public void testString() {
        List <String> strings = new ArrayList<String>();
        strings.add("hello");
        strings.add("hi");
        strings.add("emma");
        strings.add("cse");

        StringChecker check = new StringChecker() {
            public boolean checkString(String s) {
                if (s.contains("e")) {
                    return true;
                }
                return false;
            }
        };

        List <String> res = new ArrayList<String>();
        res.add("hello");
        res.add("emma");
        res.add("cse");

        List<String> newList = ListExamples.filter(strings, check);

        int index = 0;
        for (String e: res ) {
            assertEquals(newList.indexOf(e),index);
            assertTrue(newList.contains(e));
            index++;
        }
    }
    
}
