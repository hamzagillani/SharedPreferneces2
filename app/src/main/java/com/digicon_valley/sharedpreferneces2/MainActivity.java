package com.digicon_valley.sharedpreferneces2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 //  private Button button;
   private EditText Username, Userpassword;
    private SharedPreferences_class preferences_class;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences_class=new SharedPreferences_class(getApplicationContext());

        //button = findViewById(R.id.btn_login_id);

        Username = findViewById(R.id.edit_name);
        Userpassword = findViewById(R.id.edit_password);


        if(preferences_class.readLoginStatus())

    {

        startActivity(new Intent(MainActivity.this, Second_Activity.class));
        finish();

    }


}

    public void LoginUser(View view) {

        String username=Username.getText().toString();

        String userpassword=Userpassword.getText().toString();

       if (username.equals(getResources().getString(R.string.user_name)) && userpassword.equals(getResources().getString(R.string.password_user))){

            startActivity(new Intent(MainActivity.this,Second_Activity.class));
            preferences_class.writeLoingStatus(true);
            finish();


       }else {
           Toast.makeText(this, "Login Faild...Try again", Toast.LENGTH_SHORT).show();
           Userpassword.setText("");
           //Username.setText("");



    }}
}
