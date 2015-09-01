package com.example.pc.map_activity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.support.v7.app.ActionBar.DISPLAY_SHOW_CUSTOM;

public class MainActivity extends ActionBarActivity {

    private TextView info;
    FloatingActionButton  fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_notifications);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        actionBar.setCustomView(R.layout.layout_logo_bar);



        /*info =(TextView)findViewById(R.id.infos);*/
        setupFab();
        /*android.app.ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        LinearLayout actionBarLayout = (LinearLayout)getLayoutInflater().inflate(R.layout.actionbar_layout, null);
        TextView actionBarTitleview = (TextView)actionBarLayout.findViewById(R.id.actionbar_titleview);
        TextView actionBarTitleview2 = (TextView)actionBarLayout.findViewById(R.id.actionbar_titleview2);
        actionBarTitleview.setText("My Custom ActionBar Title");
        actionBarTitleview2.setText("aaaaaaaaaaaaaaaaaaaaaaaaa");
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(
                ActionBar.LayoutParams.MATCH_PARENT,
                ActionBar.LayoutParams.MATCH_PARENT,
                Gravity.LEFT);


        actionBar.setCustomView(actionBarLayout, params);
        actionBar.setDisplayHomeAsUpEnabled(false);*/

    }

    public void setupFab(){
        fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (item.getItemId()) {
            case R.id.add:
                //metodoAdd()
                info.setText("Se presionó Añadir");
                return true;
            case R.id.search:
                //metodoSearch()
                info.setText("Se presionó Buscar");
                return true;
            case R.id.edit:
                //metodoEdit()
                info.setText("Se presionó Editar") ;
                return true;
            case R.id.delete:
                //metodoDelete()
                info.setText("Se presionó Eliminar");
                return true;
            case R.id.action_settings:
                //metodoSettings()
                info.setText("Se presionó Ajustes");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
