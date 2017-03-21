package com.example.user.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Hello;
    EditText etinput;
    TextView result;
    private View.OnClickListener calcResult=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String input=etinput.getText().toString();
            //Log.w("ABGame","input"+input);
            Toast.makeText(MainActivity.this,"Hello  "+input,Toast.LENGTH_LONG).show();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        etinput=(EditText)findViewById(R.id.input);
        Hello = (Button)findViewById(R.id.btn_hello);
        Hello.setOnClickListener(calcResult);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.action3:
                AlertDialog.Builder ad=new AlertDialog.Builder(this);
                ad.setTitle("關於本程式");
                ad.setMessage("作者:林建霖");
                DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface di,int i){}
            };
                ad.setPositiveButton("確定",listener);
                ad.show();
                break;
            case R.id.action1:
                etinput.setText("");
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
