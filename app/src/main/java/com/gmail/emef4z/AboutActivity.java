package com.gmail.emef4z;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {

    //Declaring variable for the webview
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //String variable holding Andela Url
        String andelaUrl = "https://andela.com/alc/";

        //Initialising webview by getting it's id using findViewById()
        webView = (WebView) findViewById(R.id.webview_alc);

        //Enabling the webview to open in this app and not using an external app
        webView.setWebViewClient(new WebViewClient());

        //Enabling webview to support javascript
        webView.getSettings().setJavaScriptEnabled(true);

        //Loads the Url; which is in our String variable
        webView.loadUrl(andelaUrl);

    }
}
