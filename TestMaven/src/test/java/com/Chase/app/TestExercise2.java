package com.Chase.app;

import org.junit.Assert;
import org.junit.Test;
import org.junit.*;
import org.junit.experimental.ParallelComputer;

/**
 * Created by student on 2016/03/04.
 */

public class TestExercise2 {

    Exercise2 x1 = new Exercise2();


    @Test
    public void testAdd() throws Exception {

        Assert.assertEquals(x1.addInt(3, 4), 7);

    }

    @Test
    public void testFloating() throws Exception {

       Assert.assertEquals(x1.addFloat((float) 2.0, (float) 3.0), (float) 5.0, 0);

    }

    @Test
    public void testObjIdentity() throws Exception {

        Assert.assertTrue(x1.objIdentity());

    }

    @Test
    public void testObjEquality(){
        
        TestExercise2 t1 = new TestExercise2();
        Assert.assertEquals(x1.objEquality(),x1);
        
    }

    @Test
    public void testTruth() throws Exception {

        Assert.assertTrue(x1.isItTrue());


    }

    @Test
    public void testFalse() throws Exception {

        Assert.assertFalse(x1.isItFalse());

    }

    @Test
    public void testNull() throws Exception {

        Assert.assertNull(x1.nullValues());

    }

    @Test
    public void testNotNull() throws Exception {

        Assert.assertNotNull(x1.notNullString());

    }

    @Test
    public void testFailing() throws Exception {

        Assert.assertEquals(x1.failTest(4), 4);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testExceptions() throws Exception {

        x1.exceptionsTest(4);

    }

    @Test(timeout=10000)
    public void testTimeout() throws Exception {

        Thread.sleep(1000);

    }

    @Test
    @Ignore
    public void testIgnore() throws Exception
    {
        x1.addInt(2, 1);

    }

    @Test
    public void testArrayEquality() throws Exception {
        int numbers[] = {1, 2, 4};
        Assert.assertArrayEquals(x1.arrayEquality(), numbers);

    }
}
