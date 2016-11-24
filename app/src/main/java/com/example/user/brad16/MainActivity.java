package com.example.user.brad16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView)findViewById(R.id.webView);
        initWebView();
    }

    private void initWebView(){
        WebViewClient client = new WebViewClient();
        webView.setWebViewClient(client);

        // 1.
        //webView.loadUrl("http://www.iii.org.tw");
        // 2 .
        webView.loadUrl("file:///android_asset/brad.html");
        // 3.
        //webView.loadData("<h1>Brad Company</h1>","text/html;charset=utf-8",null);
    }
}
