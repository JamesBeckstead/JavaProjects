package academy.learnprogramming.algorithm.kmp;

import org.junit.Test;
import org.junit.Assert;

public class KnuthMorrisPrattTest {

    @Test
    public void computerLSPTableTest(){
        KnuthMorrisPratt kmp = new KnuthMorrisPratt();

        int[] actual = kmp.computeLSPTable(new char[]{'a','b','a','b','a','c'});
        int[] expect = new int[]{0,0,1,2,3,0};
        Assert.assertArrayEquals(expect, actual);

        actual = kmp.computeLSPTable(new char[]{'a','a','b','a','c'});
        expect = new int[]{0,1,0,1,0};
        Assert.assertArrayEquals(expect, actual);

        actual = kmp.computeLSPTable(new char[]{'a','b','c','d','a','b','c','a'});
        expect = new int[]{0,0,0,0,1,2,3,1};
        Assert.assertArrayEquals(expect, actual);

        actual = kmp.computeLSPTable(new char[]{'a'});
        expect = new int[]{0};
        Assert.assertArrayEquals(expect, actual);

        actual = kmp.computeLSPTable(new char[]{'a','a'});
        expect = new int[]{0,1};
        Assert.assertArrayEquals(expect, actual);

        actual = kmp.computeLSPTable(new char[]{'a','b'});
        expect = new int[]{0,0};
        Assert.assertArrayEquals(expect, actual);

        actual = kmp.computeLSPTable(new char[]{'a','a','a','a','a','a','a','a','z'});
        expect = new int[]{0,1,2,3,4,5,6,7,0};
        Assert.assertArrayEquals(expect, actual);
    }
}
