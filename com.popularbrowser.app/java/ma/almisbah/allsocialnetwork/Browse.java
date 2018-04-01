/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.net.Uri
 *  android.os.Bundle
 *  android.support.v7.app.a
 *  android.support.v7.app.c
 *  android.support.v7.widget.Toolbar
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.GridView
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.String
 *  java.util.ArrayList
 */
package ma.almisbah.allsocialnetwork;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.GridView;
import java.util.ArrayList;
import ma.almisbah.allsocialnetwork.Home;
import ma.almisbah.allsocialnetwork.a;
import ma.almisbah.allsocialnetwork.b;
import ma.almisbah.allsocialnetwork.c;

public class Browse
extends android.support.v7.app.c {
    private a l = null;
    private GridView m = null;
    private b n = null;
    private ArrayList<c> o = null;
    private Resources p;
    private WebView q;
    private int r;
    private String s;
    private String t;

    public boolean h() {
        this.startActivity(new Intent((Context)this, (Class)Home.class));
        this.finish();
        return true;
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131361819);
        this.p = this.getResources();
        this.a((Toolbar)this.findViewById(2131230892));
        this.g().a(2131558435);
        this.m = (GridView)this.findViewById(2131230811);
        this.m.setVisibility(8);
        this.q = (WebView)this.findViewById(2131230906);
        this.q.setVisibility(0);
        this.s = this.getIntent().getStringExtra("URL");
        this.t = this.getIntent().getStringExtra("TITLE");
        this.g().a((CharSequence)this.t);
        this.g().b(true);
        this.g().a(true);
        this.q.getSettings().setLoadsImagesAutomatically(true);
        this.q.getSettings().setJavaScriptEnabled(true);
        this.q.setScrollBarStyle(0);
        this.q.setWebViewClient(new WebViewClient(){});
        this.q.setWebChromeClient(new WebChromeClient());
        this.q.loadUrl(this.s);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(2131427328, menu);
        return true;
    }

    public boolean onKeyDown(int n, KeyEvent keyEvent) {
        if (n == 4 && this.q.canGoBack()) {
            this.q.goBack();
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.r = menuItem.getItemId();
        if (this.r == 2131230745) {
            this.q.loadUrl(this.s);
            return true;
        }
        if (this.r == 2131230744) {
            this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"market://details?id=com.popularbrowser.app")));
            return true;
        }
        if (this.r == 2131230743) {
            this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"https://play.google.com/store/apps/dev?id=9077658682438761784")));
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

}

