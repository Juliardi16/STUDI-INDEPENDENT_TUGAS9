package com.example.produkapp;

import android.os.Bundle;
import android.webkit.WebViewClient;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Web extends AppCompatActivity {

    WebView wbView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);

        wbView = findViewById(R.id.webView);

        wbView.setWebViewClient(new WebViewClient());
        wbView.loadUrl("https://www.orami.co.id/magazine/ikan-hias-air-tawar/");

    }
    @Override
    public void onBackPressed() {
        if (wbView.canGoBack()){
            wbView.goBack();
            Toast.makeText(this,"web close", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(this,"web close", Toast.LENGTH_SHORT).show();
        super.onBackPressed();
    }
}
