
package jp.mixi.practice.res.string.beg;

import android.R.id;
import android.os.Bundle;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        String[] array1 = getResources().getStringArray(R.array.japanese);        
        String[] array2 = getResources().getStringArray(R.array.english);        
        TextView tv1 = (TextView) findViewById(R.id.japanese);
        TextView tv2 = (TextView) findViewById(R.id.english);
        
        StringBuilder builder1 = new StringBuilder();
        for(String s : array1) {
            builder1.append(s);
        }
        StringBuilder builder2 = new StringBuilder();
        for(String s : array2) {
            builder2.append(s);
        }
        	tv1.setText(builder1.toString());
        	tv2.setText(builder2.toString());     	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
