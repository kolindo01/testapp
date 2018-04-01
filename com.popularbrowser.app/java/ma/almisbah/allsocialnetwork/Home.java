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
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.webkit.WebView
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.GridView
 *  android.widget.ListAdapter
 *  java.lang.Class
 *  java.lang.Object
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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.ArrayList;
import ma.almisbah.allsocialnetwork.Browse;
import ma.almisbah.allsocialnetwork.a;
import ma.almisbah.allsocialnetwork.b;
import ma.almisbah.allsocialnetwork.c;

public class Home
extends android.support.v7.app.c {
    private a l = null;
    private GridView m = null;
    private b n = null;
    private ArrayList<c> o = null;
    private Resources p;
    private WebView q;
    private int r;
    private MenuItem s;
    private String t;
    private String u;
    private Intent v;

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
        this.q = (WebView)this.findViewById(2131230906);
        this.q.setVisibility(8);
        this.n = new b((Context)this);
        this.o = this.n.a();
        this.l = new a((Context)this, 2131361835, this.o);
        this.m.setAdapter((ListAdapter)this.l);
        this.m.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> adapterView, View view, int n, long l) {
                Home.this.t = ((c)Home.this.o.get(n)).c();
                Home.this.u = ((c)Home.this.o.get(n)).a();
                Home.this.v = new Intent(Home.this.getApplicationContext(), (Class)Browse.class);
                Home.this.v.putExtra("URL", Home.this.t);
                Home.this.v.putExtra("TITLE", Home.this.u);
                Home.this.startActivity(Home.this.v);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(2131427328, menu);
        this.s = menu.findItem(2131230745);
        this.s.setVisible(false);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.r = menuItem.getItemId();
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

