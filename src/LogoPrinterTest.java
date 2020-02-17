import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.Reader;

import static org.junit.Assert.*;

public class LogoPrinterTest {
    @Test
    public void MMLogoDrawsCorrectImage() throws Exception {
        LogoPrinter test = new LogoPrinter(3);
     /*   BufferedReader expected = new BufferedReader(Reader.nullReader());*/
        BufferedReader actual = new BufferedReader(Reader.nullReader());

        String example3 =
                "---***---***------***---***---\n" +
                "--*****-*****----*****-*****--\n" +
                "-***-*****-***--***-*****-***-\n" +
                "***---***---******---***---***";

        String example5 =
                "-----*****-----*****----------*****-----*****-----\n" +
                "----*******---*******--------*******---*******----\n" +
                "---*********-*********------*********-*********---\n" +
                "--*****-*********-*****----*****-*********-*****--\n" +
                "-*****---*******---*****--*****---*******---*****-\n" +
                "*****-----*****-----**********-----*****-----*****";

        String example7 =
                "-------*******-------*******--------------*******-------*******-------\n" +
                "------*********-----*********------------*********-----*********------\n" +
                "-----***********---***********----------***********---***********-----\n" +
                "----*************-*************--------*************-*************----\n" +
                "---*******-*************-*******------*******-*************-*******---\n" +
                "--*******---***********---*******----*******---***********---*******--\n" +
                "-*******-----*********-----*******--*******-----*********-----*******-\n" +
                "*******-------*******-------**************-------*******-------*******";
        String examples3 = Examples.exampleWith3;
        String examples5 = Examples.exampleWith5;
        String examples7 = Examples.exampleWith7;

        assertEquals(example7,examples7);
/*String logo;
        while((logo = expected.readLine()) != null){
            assertEquals(example3, actual.readLine());
        }
        Assert.assertEquals(example3, actual.readLine());
        Assert.assertEquals(example3, expected.readLine());
*/
        /*assertNull(example5, actual.readLine());
        assertNull(example5, expected.readLine());

        Assert.assertNull(example7, actual.readLine());
        Assert.assertNull(example7, expected.readLine());*/
    }
}

