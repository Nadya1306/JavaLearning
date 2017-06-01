import com.company.JavaLearningCalculator;
import org.junit.Assert;
import org.junit.Test;

public class TestsForCalculator {

    JavaLearningCalculator javaLearningAddNumbers = new JavaLearningCalculator();

    @Test
    public  void testSumOfNumbers() throws Exception {
        JavaLearningCalculator javaLearningAddNumbers = new JavaLearningCalculator();

        int a = javaLearningAddNumbers.addNumbers(5);

        Assert.assertEquals(8,a);
    }

    @Test(expected = Exception.class)
    public void testSumOfZero() throws Exception {

         javaLearningAddNumbers.addNumbers(0);
    }

    @Test(expected = Exception.class)
    public void testSumOfNegativeNumber() throws Exception {

         javaLearningAddNumbers.addNumbers(-2);
    }

    @Test
    public  void testSumOfNumberWithFirstZero()throws Exception{
        int sum = javaLearningAddNumbers.addNumbers(02);
        Assert.assertEquals(0,sum);
    }

    @Test
    public  void testSumOfNumber() throws Exception {
        int sum = javaLearningAddNumbers.addNumbers(100);
        Assert.assertEquals(2418, sum);
    }
}


