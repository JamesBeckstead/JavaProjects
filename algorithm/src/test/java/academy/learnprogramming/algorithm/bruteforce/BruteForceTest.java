package academy.learnprogramming.algorithm.bruteforce;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BruteForceTest {

    BruteForce b = null;
    char[] array;


    @Before
    public void init(){
        b = new BruteForce();
        String s = new String("academy.learnprogramming");
        array = s.toCharArray();
    }
    @Test
    public void firstMatchTest(){
        Assert.assertEquals(0, b.firstMatch(array, new char[]{'a'}));
        //System.out.println(b.firstMatch(array, new char[]{'g'}));
        Assert.assertEquals(16,b.firstMatch(array, new char[]{'g'}));
        Assert.assertEquals(22,b.firstMatch(array, new char[]{'n','g'}));
        Assert.assertEquals(-1,b.firstMatch(array, new char[]{'d','z'}));
        Assert.assertEquals(6,b.firstMatch(array, new char[]{'y','.','l','e'}));
    }

    @Test
    public void everyMatchTest(){
        int[] expect = new int[array.length];
        resetExpectArray(expect);
        expect[0] = 0;
        expect[1] = 2;
        expect[2] = 10;
        expect[3] = 18;
        Assert.assertArrayEquals(expect, b.everyMatch(array, new char[]{'a'}));

        resetExpectArray(expect);
        expect[0] = 16;
        expect[1] = 23;
        Assert.assertArrayEquals(expect, b.everyMatch(array, new char[]{'g'}));

        resetExpectArray(expect);
        expect[0] = 22;
        //expect[1] = 23;
        Assert.assertArrayEquals(expect, b.everyMatch(array, new char[]{'n', 'g'}));

        resetExpectArray(expect);
        Assert.assertArrayEquals(expect, b.everyMatch(array, new char[]{'z'}));

        resetExpectArray(expect);
        expect[0] = 6;
        Assert.assertArrayEquals(expect, b.everyMatch(array, new char[]{'y','.','l','e'}));
    }

    public void resetExpectArray(int[] expect){
        Arrays.fill(expect, -1);
    }
}
