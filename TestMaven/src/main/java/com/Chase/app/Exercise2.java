package com.Chase.app;

/**
 * Created by student on 2016/03/04.
 */
public class Exercise2 {

    public int  addInt(int a, int b)
    {
        return a+b;
    }

    public float addFloat(float a, float b)
    {
        return a+b;
    }

    public Exercise2 objEquality()
    {
        return this;
    }

    public boolean isItTrue()
    {
        return 1==1;
    }

    public boolean isItFalse()
    {
        return 1!=1;
    }

    public String nullValues()
    {
        String name = null;
        return name;
    }

    public boolean objIdentity()
    {
        Exercise2 obj1 = new Exercise2();
        Exercise2 obj2 = obj1;
        return obj1==obj2;

    }

    public String notNullString()
    {
        String name = "Chase";
        return name;
    }

    public int failTest( int a )
    {
        return a;
    }

    public int exceptionsTest(int numPosition)
    {
        int numbers[] = new int[3];
        return numbers[numPosition];
    }

    public int[] arrayEquality()
    {
        int numbers[] = {1, 2, 4};
        return numbers;
    }


}
