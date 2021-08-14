package com.example.triall;

import static com.example.triall.R.color.cardview_dark_background;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.triall.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txt;
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        TextView txt = findViewById(R.id.txt);
        Log.i("tag","message");
        Log.i("tag","message2");
//        Button button = findViewById(R.id.button);
//        findViewById(R.id.button).setOnClickListener(new click()); //using another class
//        findViewById(R.id.button).setOnClickListener(MainActivity.this);//using same cls

//        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                view.setBackgroundColor(Color.GRAY);
//            }
//        });
    }



    @Override
    public void onClick(View view) {
        view.setBackgroundColor(Color.CYAN);
        EditText edt1=findViewById(R.id.edt1);
        EditText edt2=findViewById(R.id.edt2);
        int result=(Integer.parseInt(edt1.toString()))* (Integer.parseInt(edt2.toString()));
//        TextView txt1=findViewById(R.id.txt);
    }

//    public void buttonis(View view)
//    {
//        view.setBackgroundColor(Color.RED);
//        findViewById(R.id.lol).setBackgroundColor(Color.BLUE);
//        Toast.makeText(this,"button is clicked",Toast.LENGTH_SHORT).show();
//    }
}