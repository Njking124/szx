package com.example.twoactivities; import android.content.Intent; import android.os.Bundle; import android.view.View; import android.widget.Toast; import androidx.appcompat.app.AppCompatActivity; public class SecondActivity extends AppCompatActivity { @Override protected void onCreate(Bundle savedInstanceState){ super.onCreate(savedInstanceState); setContentView(R.layout.activity_second); Bundle extras = getIntent().getExtras(); String s1 = extras.getString("Value1"); String s2 = extras.getString("Value2"); Toast.makeText(this, "Values are:\n First value: "+s1+"\n Second value: "+s2, Toast.LENGTH_SHORT).show(); } public void show(View view){ Intent i = new Intent(getApplicationContext(),MainActivity.class); startActivity(i); } }