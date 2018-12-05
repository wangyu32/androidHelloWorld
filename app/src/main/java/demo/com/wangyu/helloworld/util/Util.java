package demo.com.wangyu.helloworld.util;

import android.content.Context;

/**
 *
 */
public class Util {

    public static String getSerialNumber (Context context) {
        String SerialNumber = android.os.Build.SERIAL;
        return SerialNumber;
    }

}
