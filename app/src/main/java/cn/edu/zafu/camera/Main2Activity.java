package cn.edu.zafu.camera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void idcard(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("value","idcard");
        startActivity(intent);
    }
    public void driver(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("value","driver");
        startActivity(intent);
    }
    public void company(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("value","template");
        startActivity(intent);
    }

    public void xs(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("value","driving");
        startActivity(intent);
    }

    public void bank(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("value","bankcard");
        startActivity(intent);
    }

}
