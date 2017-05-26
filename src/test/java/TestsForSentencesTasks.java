import com.company.JavaLearning;
import org.junit.Assert;
import org.junit.Test;

public class TestsForSentencesTasks {

    @Test
    public void testDeviedSentences() {
        JavaLearning javaLearning = new JavaLearning();

        String a = javaLearning.devideSentences("Helllo, world.What a nice day!It is going to rain.");

        Assert.assertEquals("Helllo, world",a);
    }
}
