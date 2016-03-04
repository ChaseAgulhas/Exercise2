package com.Chase.app;

import org.junit.Assert;
import org.junit.Test;
import org.junit.*;

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
    public void testObjEquality(){
        
        TestExercise2 t1 = new TestExercise2();
        Assert.assertEquals(x1.objEquality(),x1);
        
    }


}
