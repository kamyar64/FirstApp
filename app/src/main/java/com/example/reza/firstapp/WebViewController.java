package com.example.reza.firstapp;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by behdad on 11/4/15.
 */
public class WebViewController extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}