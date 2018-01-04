package com.wenld.aspectjdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MainActivity extends AppCompatActivity {
    String TAG = "tag00";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, test3());
            }
        });

    }

    @AspectJAnnotation(value = "权限A")
    public String test() {
        Log.i(TAG, "检查权限");
        return "test";
    }

    @AspectJAnnotation(value = "权限B")
    public String test3() {
        Log.i(TAG, "检查权限");
        return "test";
    }
}
