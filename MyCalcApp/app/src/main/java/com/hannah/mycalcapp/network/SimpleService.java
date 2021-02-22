package com.hannah.mycalcapp.network;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import androidx.annotation.Nullable;

import com.hannah.mycalcapp.ICalcService;

class SimpleService extends Service {
    private static final String TAG = "CalcService";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate()");
    }

    @Override
    public IBinder onBind(Intent intent) {

        return new ICalcService.Stub() {
            @Override
            public int Add(int a, int b) throws RemoteException {
                return a + b;
            }

            @Override
            public int Divide(int a, int b) throws RemoteException {
                return a / b;
            }

            @Override
            public int Subtract(int a, int b) throws RemoteException {
                return a - b;
            }

            @Override
            public int Multiply(int a, int b) throws RemoteException {

                return a * b;
            }

            @Override
            public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

            }

            /**
             * Implementation of the add() method
             */
            public int add(int value1, int value2) throws RemoteException {
                Log.d(TAG, String.format("AdditionService.add(%d, %d)",value1, value2));
                return value1 + value2;
            }

        };
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }

}
