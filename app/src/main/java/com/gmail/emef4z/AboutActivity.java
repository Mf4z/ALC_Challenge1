package com.gmail.emef4z;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        String andelaUrl = "https://andela.com/alc/";

        webView = (WebView) findViewById(R.id.webview_alc);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(andelaUrl);

    }
}
