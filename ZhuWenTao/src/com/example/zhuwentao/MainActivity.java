package com.example.zhuwentao;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Button myButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = (Button) findViewById(R.id.myButton);
        myButton.setOnClickListener(new Text01Listener());
    }
    
    class Text01Listener implements OnClickListener{
    	public void onClick(View v){
    		Intent intent = new Intent();
    		intent.setAction("com.hahaha.activity01");
    		intent.addCategory(Intent.CATEGORY_DEFAULT);
    		startActivity(intent);
    	}
    }

    class MyButtonListener implements OnClickListener{
    	// …Ë÷√º‡Ã˝∆˜
    	public void onClick(View v){
    		Intent intent = new Intent();
    		intent.putExtra("testIntent", "123456789");
    		intent.setClass(MainActivity.this, OtherActivity.class);
    		MainActivity.this.startActivity(intent);
    	}
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
