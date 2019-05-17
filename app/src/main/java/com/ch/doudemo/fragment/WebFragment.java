package com.ch.doudemo.fragment;

import android.app.Activity;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ch.doudemo.R;
import com.ch.doudemo.widget.AdvancedWebView;

import butterknife.BindView;

/**
 * Create by alex on 2019/5/17
 * desc:
 */
public class WebFragment extends BaseFragment {
    @BindView(R.id.webview)
    AdvancedWebView webview;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_web;
    }

    @Override
    protected void initView() {
        webview.setWebViewClient(new WebViewClient() {
            //覆盖shouldOverrideUrlLoading 方法
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        webview.loadUrl("http://hequ-api.fly010.com/teaminfo.html?id=2");
    }

    @Override
    protected void loadData() {

    }
}
