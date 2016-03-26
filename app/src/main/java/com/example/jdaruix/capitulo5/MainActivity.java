package com.example.jdaruix.capitulo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_search)
        {
            return  true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void alerta(String msg)
    {
        //Snackbar snackbar = new SnackBar();
        //Snackbar snackbar = Snackbar
                //.make(coordinatorLayout, "Welcome to AndroidHive", Snackbar.LENGTH_LONG);

        //snackbar.show();
        //Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
