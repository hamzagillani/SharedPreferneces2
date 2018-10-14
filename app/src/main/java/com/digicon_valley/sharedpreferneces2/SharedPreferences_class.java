package com.digicon_valley.sharedpreferneces2;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferences_class {

    private SharedPreferences sharedPreferences;
    private Context context;

    public SharedPreferences_class(Context context) {

        this.context = context;
        sharedPreferences=context.getSharedPreferences(context.getResources().getString(R.string.login_preference),Context.MODE_PRIVATE);


    }

    public  void writeLoingStatus(boolean status){
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.login_status_preference),status);
        editor.commit();
    }

    public  boolean readLoginStatus(){
        boolean status=false;
        status=sharedPreferences.getBoolean(context.getResources().getString(R.string.login_status_preference),false);
    return status;
    }
}
