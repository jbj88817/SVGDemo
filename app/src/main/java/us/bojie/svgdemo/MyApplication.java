package us.bojie.svgdemo;

import android.app.Application;

import com.mikepenz.iconics.Iconics;

import us.bojie.svgdemo.typeface.BojieFont;

/**
 * Created by bojiejiang on 4/23/17.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //only required if you add a custom or generic font on your own
        Iconics.init(getApplicationContext());

        //register custom fonts like this (or also provide a font definition file)
        Iconics.registerFont(new BojieFont());
    }
}
