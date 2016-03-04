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

    public int failTest( int a )
    {
        return a;
    }


}
