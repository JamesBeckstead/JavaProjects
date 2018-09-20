package academy.learnprogramming.algorithm.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleUtilsTest {

    SimpleUtils utils = null;

    @Before
    public void init(){
        utils = new SimpleUtils();
    }

    @Test
    public void stringToBooleanTrueTest() {
        Assert.assertTrue(utils.stringToBoolean("y"));
        Assert.assertTrue(utils.stringToBoolean("Y"));
        Assert.assertTrue(utils.stringToBoolean("yes"));
        Assert.assertTrue(utils.stringToBoolean("yES"));
        Assert.assertTrue(utils.stringToBoolean("YES"));
        Assert.assertTrue(utils.stringToBoolean("true"));
        Assert.assertTrue(utils.stringToBoolean("TRUE"));
    }

    @Test
    public void stringToBooleanFalseTest() {
        Assert.assertFalse(utils.stringToBoolean("n"));
        Assert.assertFalse(utils.stringToBoolean("N"));
        Assert.assertFalse(utils.stringToBoolean("no"));
        Assert.assertFalse(utils.stringToBoolean("NO"));
        Assert.assertFalse(utils.stringToBoolean("false"));
        Assert.assertFalse(utils.stringToBoolean("FALSE"));
        Assert.assertFalse(utils.stringToBoolean(null));
        Assert.assertFalse(utils.stringToBoolean("zebra"));
        Assert.assertFalse(utils.stringToBoolean("hotdog yes"));
    }

    @Test
    public void getFileTypeByCode() {
        Assert.assertEquals(SimpleUtils.FileType.PDF, utils.getFileTypeByCode(3));
        Assert.assertEquals(SimpleUtils.FileType.JPEG, utils.getFileTypeByCode(1));
        Assert.assertEquals(SimpleUtils.FileType.TEXT, utils.getFileTypeByCode(2));
    }

    @Test
    public void getFileTypeByName() {
        Assert.assertEquals(SimpleUtils.FileType.PDF, utils.getFileTypeByName("pdf"));
        Assert.assertEquals(SimpleUtils.FileType.PDF, utils.getFileTypeByName("PDF"));
        Assert.assertEquals(SimpleUtils.FileType.TEXT, utils.getFileTypeByName("txt"));
        Assert.assertEquals(SimpleUtils.FileType.TEXT, utils.getFileTypeByName("TXT"));
        Assert.assertEquals(SimpleUtils.FileType.JPEG, utils.getFileTypeByName("jpeg"));
        Assert.assertNull(utils.getFileTypeByName(null));
        Assert.assertNull(utils.getFileTypeByName("zebra"));
        Assert.assertNull(utils.getFileTypeByName("PDF1"));
    }
}
