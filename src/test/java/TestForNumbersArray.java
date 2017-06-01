import com.company.JavaLearningArrays;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class TestForNumbersArray {

    JavaLearningArrays javaLearningArrays = new JavaLearningArrays();

    @Test

    public void findBiggestNumberInArray() {

        int biggestNumber = javaLearningArrays.findBiggestNumberInArray(new int[]{100, 30, 500});

        Assert.assertEquals(biggestNumber, 500);

        System.out.println(biggestNumber);
    }

    @Test
    public void testReverseOfArrayNumbers() {

        int[] reverseArrey = javaLearningArrays.reverseArrayOfNumbers(new int[]{100, 30, 500});

        Assert.assertArrayEquals(new int[]{500, 30, 100}, reverseArrey);

        System.out.println(StringUtils.join(ArrayUtils.toObject(reverseArrey), ':'));
    }

    @Test

    public void testReverseArrayOfNumbersWithArrayUtils() {

        int[] reverseArray = javaLearningArrays.reverseArrayOfNumbersWithArrayUtils(new int[]{100, 30, 500});

        Assert.assertArrayEquals(new int[]{500, 30, 100}, reverseArray);
    }

    @Test

    public void testReverseArrayOfString() {

        String[] reverseArray = javaLearningArrays.reverseArrayOfStrings(new String[]{"one", "two", "three"});

        Assert.assertArrayEquals(new String[]{"three", "two", "one"}, reverseArray);

        System.out.println(StringUtils.join(ArrayUtils.toString(reverseArray)));
    }

    @Test

    public void testReverseArrayOfStringsWithGeneric() {

        Object[] reverseArray = javaLearningArrays.reverseArray(new String[]{"one", "two", "three"});

        Assert.assertArrayEquals(new String[]{"three", "two", "one"}, reverseArray);

        System.out.println(StringUtils.join(ArrayUtils.toString(reverseArray)));
    }

    @Test
    public void testReverseArrayOfIntegersWithGeneric() {

        Object[] reverseArray = javaLearningArrays.reverseArray(new Integer[]{100, 30, 500});

        Assert.assertArrayEquals(new Integer[]{500, 30, 100}, reverseArray);

        System.out.println(StringUtils.join(ArrayUtils.toString(reverseArray)));
    }

    @Test
    public void testReverseArrayOfCharsWithGeneric() {

        Object[] reverseArray = javaLearningArrays.reverseArray(new Character[]{'a', ',', '='});

        Assert.assertArrayEquals(new Character[]{'=', ',', 'a'}, reverseArray);

        System.out.println(StringUtils.join(ArrayUtils.toString(reverseArray)));
    }
}



