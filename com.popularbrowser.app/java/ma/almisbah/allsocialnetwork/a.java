/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package ma.almisbah.allsocialnetwork;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import ma.almisbah.allsocialnetwork.c;

public class a
extends ArrayAdapter {
    private Context a;
    private ArrayList<c> b;

    public a(Context context, int n, ArrayList arrayList) {
        super(context, n, (List)arrayList);
        this.a = context;
        this.b = arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    public View getView(int n, View view, ViewGroup viewGroup) {
        a a2;
        if (view == null) {
            view = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(2131361835, null);
            a2 = new a((a)this, null);
            a2.a = (TextView)view.findViewById(2131230865);
            a2.b = (ImageView)view.findViewById(2131230864);
            view.setTag((Object)a2);
        } else {
            a2 = (a)view.getTag();
        }
        c c2 = (c)this.b.get(n);
        a2.a.setText((CharSequence)c2.a());
        int n2 = this.getContext().getResources().getIdentifier("com.popularbrowser.app:drawable/" + c2.b(), null, null);
        a2.b.setImageResource(n2);
        return view;
    }

    private class a {
        TextView a;
        ImageView b;
        final /* synthetic */ a c;

        private a(a a2) {
            this.c = a2;
        }

        /* synthetic */ a(a a2,  var2_2) {
            super(a2);
        }
    }

}

