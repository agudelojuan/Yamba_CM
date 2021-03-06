package co.edu.udea.cmovil.gr4.yamba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Called to lazily initialize the action bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu items to the action bar.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    // Called every time user clicks on an action
    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //
        switch (item.getItemId()) { //
            case R.id.action_settings:
                startActivity(new Intent(this, SettingsActivity.class)); //
                return true; //
            case R.id.action_tweet:
                startActivity(new Intent("com.marakana.android.yamba.action.tweet"));
                return true;
            case R.id.action_refresh:
                startService(new Intent(this, RefreshService.class));
                return true;
        default:
            return false;
        }
    }
}
