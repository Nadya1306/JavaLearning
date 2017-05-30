import com.company.JavaLearningArrays;
import org.junit.Assert;
import org.junit.Test;

public class TestForNumbersArray {

    @Test

    public void findBiggestNumberInArray(){

        JavaLearningArrays javaLearningArrays = new JavaLearningArrays();

        int biggestNumber = javaLearningArrays.findBiggestNumberInArray(new int[]{100,30,500});

        Assert.assertEquals(biggestNumber,500);

        System.out.println(biggestNumber);

    }


}
