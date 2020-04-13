package com.example.plugin;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Hello extends CordovaPlugin {

    public static final String EXTRA_IS_SPEED_MODE = "is_speed_mode";
    Resources activityRes = cordova.getActivity().getResources();
    int R_font_0 = activityRes.getIdentifier("font_0", "mipmap", packageName());
        int R_font_1 = activityRes.getIdentifier("font_1", "mipmap", packageName());
        int R_font_2 = activityRes.getIdentifier("font_2", "mipmap", packageName());
        int R_font_3 = activityRes.getIdentifier("font_3", "mipmap", packageName());
        int R_font_4 = activityRes.getIdentifier("font_4", "mipmap", packageName());
        int R_font_5 = activityRes.getIdentifier("font_5", "mipmap", packageName());
        int R_font_6 = activityRes.getIdentifier("font_6", "mipmap", packageName());
        int R_font_7 = activityRes.getIdentifier("font_7", "mipmap", packageName());
        int R_font_8 = activityRes.getIdentifier("font_8", "mipmap", packageName());
        int R_font_9 = activityRes.getIdentifier("font_9", "mipmap", packageName());
    
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Context context = cordova.getActivity().getApplicationContext();
        if(action.equals("new_activity")) {
            this.openNewActivity(context);
            return true;
        }
        return false;
    }

    private String packageName(){
        String currentPackage = cordova.getActivity().getPackageName();
        return currentPackage;
    }
    
    public int[] fonts(){
        int[] A = {R_font_0,R_font_1,R_font_2,R_font_3,R_font_4,R_font_5,R_font_6,R_font_7,R_font_8,R_font_9};
        return A;
    }
    private void openNewActivity(Context context) {
        //Intent intent = new Intent(context, NewActivity.class);
        //this.cordova.getActivity().startActivity(intent);
        Intent intent = new Intent(context, GameActivity.class);
        intent.putExtra(EXTRA_IS_SPEED_MODE, false);
        this.cordova.getActivity().startActivity(intent);
    }
}
