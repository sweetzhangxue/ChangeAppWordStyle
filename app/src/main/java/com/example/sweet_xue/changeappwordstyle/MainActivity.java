package com.example.sweet_xue.changeappwordstyle;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sweet_xue.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv  = (TextView) findViewById(R.id.tv);
        Typeface typeface = Typeface.createFromAsset(getResources().getAssets(),"SourceHanSansCN-Regular.ttf");
        tv.setTypeface(typeface);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
