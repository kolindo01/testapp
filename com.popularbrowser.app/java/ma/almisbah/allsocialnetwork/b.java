/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package ma.almisbah.allsocialnetwork;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import ma.almisbah.allsocialnetwork.c;

public class b
extends SQLiteOpenHelper {
    public b(Context context) {
        super(context, "SocialNetworksDb.db", null, 2);
    }

    public ArrayList<c> a() {
        SQLiteDatabase sQLiteDatabase = this.getReadableDatabase();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = sQLiteDatabase.rawQuery("SELECT * FROM social_networks", null);
        while (cursor.moveToNext()) {
            arrayList.add((Object)new c(cursor.getInt(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("nom")), cursor.getString(cursor.getColumnIndex("img")), cursor.getString(cursor.getColumnIndex("wUrl")), cursor.getString(cursor.getColumnIndex("idApp")), cursor.getString(cursor.getColumnIndex("psUrl")), Boolean.parseBoolean((String)cursor.getString(cursor.getColumnIndex("actif"))), cursor.getString(cursor.getColumnIndex("cat"))));
        }
        return arrayList;
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        this.a("Google", "ic_google", "https://www.google.com/", "com.google.android.googlequicksearchbox", "market://details?id=com.google.android.googlequicksearchbox", true, "Information", sQLiteDatabase);
        this.a("Yahoo Mail", "ic_yahoomail", "https://login.yahoo.com/", "com.yahoo.mobile.client.android.mail", "market://details?id=com.yahoo.mobile.client.android.mail", true, "Information", sQLiteDatabase);
        this.a("Gmail", "ic_gmail", "https://mail.google.com/", "com.android.gmail", "market://details?id=com.android.gmail", true, "Information", sQLiteDatabase);
        this.a("Facebook", "ic_facebook", "https://m.facebook.com", "com.facebook.katana", "market://details?id=com.facebook.katana", true, "Social", sQLiteDatabase);
        this.a("Instagram", "ic_instagram", "https://www.instagram.com", "com.instagram.android", "market://details?id=com.instagram.android", true, "Photos", sQLiteDatabase);
        this.a("Twitter", "ic_twitter", "https://mobile.twitter.com/", "com.twitter.android", "market://details?id=com.twitter.android", true, "Social", sQLiteDatabase);
        this.a("Linkedin", "ic_linkedin", "https://www.linkedin.com/", "com.linkedin.android", "market://details?id=com.linkedin.android", true, "Social", sQLiteDatabase);
        this.a("Myspace", "ic_myspace", "https://myspace.com/", "", "", true, "Social", sQLiteDatabase);
        this.a("Pinterest", "ic_pinterest", "https://www.pinterest.com/", "com.pinterest", "market://details?id=com.pinterest", true, "Photos", sQLiteDatabase)
        this.a("Vimeo", "ic_vimeo", "https://vimeo.com/channels/staffpicks", "com.vimeo.android.videoapp", "market://details?id=com.vimeo.android.videoapp", true, "Videos", sQLiteDatabase);
        this.a("Dailymotion", "ic_dailymotion", "https://www.dailymotion.com/", "com.dailymotion.dailymotion", "market://details?id=com.dailymotion.dailymotion", true, "Videos", sQLiteDatabase);
        this.a("YouTube", "ic_youtube", "https://www.youtube.com/", "com.google.android.youtube", "market://details?id=com.google.android.youtube", true, "Videos", sQLiteDatabase);
        this.a("Vine", "ic_vine", "https://vine.co/vines", "co.vine.android", "market://details?id=co.vine.android", true, "Videos", sQLiteDatabase);
        this.a("Netflix", "ic_netflix", "https://www.netflix.com/browse", "com.netflix.mediaclient", "market://details?id=com.netflix.mediaclient", true, "Videos", sQLiteDatabase);
        this.a("Imdb", "ic_imdb", "http://m.imdb.com/", "com.imdb.mobile", "market://details?id=com.imdb.mobile", true, "Videos", sQLiteDatabase);
        this.a("Wikipedia", "ic_wikipedia", "https://www.wikipedia.org/", "org.wikipedia", "market://details?id=org.wikipedia", true, "Information", sQLiteDatabase);
        this.a("Aliexpress", "ic_aliexpress", "https://m.aliexpress.com/", "com.alibaba.aliexpresshd", "market://details?id=com.alibaba.aliexpresshd", true, "Shopping", sQLiteDatabase);
        this.a("Amazon", "ic_amazone", "https://www.amazon.com/", "com.amazon.mShop.android.shopping", "market://details?id=com.amazon.mShop.android.shopping", true, "Shopping", sQLiteDatabase);
        this.a("Booking", "ic_booking", "https://www.booking.com/", "com.booking", "market://details?id=com.booking", true, "Booking", sQLiteDatabase);
        this.a("Ebay", "ic_ebay", "https://m.ebay.com/", "com.ebay.mobile", "market://details?id=com.ebay.mobile", true, "Shopping", sQLiteDatabase);
   public boolean a(String string, String string2, String string3, String string4, String string5, Boolean bl, String string6, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("nom", string);
        contentValues.put("img", string2);
        contentValues.put("wUrl", string3);
        contentValues.put("idApp", string4);
        contentValues.put("psUrl", string5);
        contentValues.put("actif", bl);
        contentValues.put("cat", string6);
        sQLiteDatabase.insert("social_networks", null, contentValues);
        return true;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE social_networks(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, nom TEXT, img TEXT, wUrl TEXT, idApp TEXT, psUrl TEXT, actif VARCHAR, cat TEXT )");
        this.a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n, int n2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS social_networks");
        this.onCreate(sQLiteDatabase);
    }
}

