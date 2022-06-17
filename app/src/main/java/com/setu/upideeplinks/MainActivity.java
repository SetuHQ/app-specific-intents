package com.setu.upideeplinks;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://codepen.io/kaustav1996/full/WNMadRY");

        ProgressDialog progressDialog = new ProgressDialog(this);
        
//        webView.setWebViewClient(new WebViewClient() {
//
//            @Override
//            public void onPageStarted(WebView view, String url, Bitmap favicon) {
//                super.onPageStarted(view, url, favicon);
//                progressDialog.setTitle("Loading...");
//                progressDialog.setMessage("Please wait...");
//                progressDialog.setCancelable(false);
//                progressDialog.show();
//            }
//
//            @Override
//            public void onPageCommitVisible(WebView view, String url) {
//                super.onPageCommitVisible(view, url);
//                if (progressDialog != null){
//                    progressDialog.dismiss();
//                }
//            }
//
////            public void onReceivedError(WebView webView, int errorCode, String description, String failingUrl) {
////
////                try {
////                    webView.stopLoading();
////                } catch (Exception e) {
////                }
////
////                if (webView.canGoBack()) {
////                    webView.goBack();
////                }
////
////                webView.loadUrl("about:blank");
////                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
////                alertDialog.setTitle("Error");
////                alertDialog.setMessage("Check your internet connection and try again." + description);
////                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Try Again", new DialogInterface.OnClickListener() {
////                    public void onClick(DialogInterface dialog, int which) {
////                        finish();
////                        startActivity(getIntent());
////                    }
////                });
////
////                alertDialog.show();
////                super.onReceivedError(webView, errorCode, description, failingUrl);
////            }
//        });
    }

    @Override
    // This method is used to detect back button
    public void onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }
}