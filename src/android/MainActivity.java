package com.example.plugin;

import com.game.flappybird.R;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends Activity {

    public static final String EXTRA_IS_SPEED_MODE = "is_speed_mode";
    private ProgressBar mBar;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        String package_name = getApplication().getPackageName();
        setContentView(getApplication().getResources().getIdentifier("activity_new", "layout", package_name));
        
       // mBar = (ProgressBar)findViewById(R.id.pb_loading);

        findViewById(R.id.btn_normal_mode).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mBar.setVisibility(View.VISIBLE);
                //Intent intent = new Intent(MainActivity.this, GameActivity.class);
                //intent.putExtra(EXTRA_IS_SPEED_MODE, false);
               // startActivity(intent);
            }
        });

        findViewById(R.id.btn_speed_mode).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // mBar.setVisibility(View.VISIBLE);
                //Intent intent = new Intent(MainActivity.this, GameActivity.class);
               // intent.putExtra(EXTRA_IS_SPEED_MODE, true);
                //startActivity(intent);
            }
        });
    }
    
    @Override
    protected void onResume() {
       // super.onPause();
       // mBar.setVisibility(View.INVISIBLE);
    }
}
