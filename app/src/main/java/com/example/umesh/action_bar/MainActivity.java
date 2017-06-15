package com.example.umesh.action_bar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    public String url = "";
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d("main activity", "onOptionsItemSelected: ");
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.google_icon:
                url = "google";
                intent = new Intent(this, WebViewActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);
                break;

            case R.id.wiki_icon:
                url = "wikipedia";
                intent = new Intent(this, WebViewActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);
                break;

            case R.id.location_icon:
                url = "location";
                intent = new Intent(this, WebViewActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);
                break;

            case R.id.youtube_icon:
                url = "youtube";
                intent = new Intent(this, WebViewActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);
             break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

}
