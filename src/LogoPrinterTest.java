import org.junit.Test;

import java.io.BufferedReader;
import java.io.Reader;

import static org.junit.Assert.*;

public class LogoPrinterTest {
    @Test
    public void MMLogoDrawsCorrectImage() throws Exception {
        BufferedReader expected = new BufferedReader(Reader.nullReader());
        BufferedReader actual = new BufferedReader(Reader.nullReader());

        String example3 = " \"---***---***------***---***---\\n\" +\n" +
                "           \"--*****-*****----*****-*****--\\n\" +\n" +
                "           \"-***-*****-***--***-*****-***-\\n\" +\n" +
                "           \"***---***---******---***---***\"";

        String example5 = "\"-----*****-----*****----------*****-----*****-----\\n\" +\n" +
                "          \"----*******---*******--------*******---*******----\\n\" +\n" +
                "          \"---*********-*********------*********-*********---\\n\" +\n" +
                "          \"--*****-*********-*****----*****-*********-*****--\\n\" +\n" +
                "          \"-*****---*******---*****--*****---*******---*****-\\n\" +\n" +
                "          \"*****-----*****-----**********-----*****-----*****\"";

        String example7 = "\"-------*******-------*******--------------*******-------*******-------\\n\" +\n" +
                "          \"------*********-----*********------------*********-----*********------\\n\" +\n" +
                "          \"-----***********---***********----------***********---***********-----\\n\" +\n" +
                "          \"----*************-*************--------*************-*************----\\n\" +\n" +
                "          \"---*******-*************-*******------*******-*************-*******---\\n\" +\n" +
                "          \"--*******---***********---*******----*******---***********---*******--\\n\" +\n" +
                "          \"-*******-----*********-----*******--*******-----*********-----*******-\\n\" +\n" +
                "          \"*******-------*******-------**************-------*******-------*******\"";
        String logo;

        while((logo = expected.readLine()) != null){
            assertEquals(logo, actual.readLine());
        }
        assertNull(example3, actual.readLine());
        assertNull(example3, expected.readLine());

        assertNull(example5, actual.readLine());
        assertNull(example5, expected.readLine());

        assertNull(example7, actual.readLine());
        assertNull(example7, expected.readLine());
    }
}