package com.cclz.myapp_170323_05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textview);

        registerForContextMenu(tv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        // 長按
        if(v.getId() == R.id.textview){
            menu.add("AA");
            menu.add("BB");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        menu.add("選項一");
//        menu.add("選項二");

        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();

        switch (item.getItemId()){
            case R.id.menuadd:

                break;
            case R.id.menuserrings:

                break;
            case R.id.menuabout:

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
