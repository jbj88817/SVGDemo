package us.bojie.svgdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.context.IconicsLayoutInflater;

import us.bojie.svgdemo.typeface.BojieFont;

public class IconActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LayoutInflaterCompat.setFactory(getLayoutInflater(), new IconicsLayoutInflater(getDelegate()));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon);

        IconicsDrawable drawable = new IconicsDrawable(this)
                .icon(BojieFont.Icon.bojie_anquan)
                .color(Color.RED)
                .sizeDp(100);

        ((ImageView)this.findViewById(R.id.image)).setImageDrawable(drawable);
    }
}
