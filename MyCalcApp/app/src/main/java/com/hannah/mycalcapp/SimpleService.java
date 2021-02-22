package com.hannah.mycalcapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;


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

        };
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }

}
