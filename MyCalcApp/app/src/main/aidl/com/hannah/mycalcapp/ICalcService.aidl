// ICalcService.aidl
package com.hannah.mycalcapp;

// Declare any non-default types here with import statements

interface ICalcService {
     int Add(int a, int b);
        int Divide(int a, int b);
        int Subtract(int a, int b);
        int Multiply(int a, int b);

    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);
}
