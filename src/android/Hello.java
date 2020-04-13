package com.example.plugin;

import android.content.Context;
import android.content.Intent;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Hello extends CordovaPlugin {

    public static final String EXTRA_IS_SPEED_MODE = "is_speed_mode";
    public static final int R_font_0 = cordova.getActivity().getResources().getIdentifier("font_0", "mipmap", cordova.getActivity().getPackageName());
    public static final int R_font_1 = cordova.getActivity().getResources().getIdentifier("font_1", "mipmap", cordova.getActivity().getPackageName());
    public static final int R_font_2 = cordova.getActivity().getResources().getIdentifier("font_2", "mipmap", cordova.getActivity().getPackageName());
    public static final int R_font_3 = cordova.getActivity().getResources().getIdentifier("font_3", "mipmap", cordova.getActivity().getPackageName());
    public static final int R_font_4 = cordova.getActivity().getResources().getIdentifier("font_4", "mipmap", cordova.getActivity().getPackageName());
    public static final int R_font_5 = cordova.getActivity().getResources().getIdentifier("font_5", "mipmap", cordova.getActivity().getPackageName());
    public static final int R_font_6 = cordova.getActivity().getResources().getIdentifier("font_6", "mipmap", cordova.getActivity().getPackageName());
    public static final int R_font_7 = cordova.getActivity().getResources().getIdentifier("font_7", "mipmap", cordova.getActivity().getPackageName());
    public static final int R_font_8 = cordova.getActivity().getResources().getIdentifier("font_8", "mipmap", cordova.getActivity().getPackageName());
    public static final int R_font_9 = cordova.getActivity().getResources().getIdentifier("font_9", "mipmap", cordova.getActivity().getPackageName());

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

    private void openNewActivity(Context context) {
        //Intent intent = new Intent(context, NewActivity.class);
        //this.cordova.getActivity().startActivity(intent);
        Intent intent = new Intent(context, GameActivity.class);
        intent.putExtra(EXTRA_IS_SPEED_MODE, false);
        this.cordova.getActivity().startActivity(intent);
    }
}
