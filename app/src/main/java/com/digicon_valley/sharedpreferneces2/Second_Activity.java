package com.digicon_valley.sharedpreferneces2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second_Activity extends AppCompatActivity {
    Button button3;
    private SharedPreferences_class preferencesClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button3=findViewById(R.id.logout_id);
        preferencesClass=new SharedPreferences_class(getApplicationContext());
    }

    public void LogutUser(View view) {

        preferencesClass.writeLoingStatus(false);
        startActivity(new Intent(this,MainActivity.class));
            finish();
    }
}
