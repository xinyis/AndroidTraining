package jp.mixi.assignment.intent.med;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class EditActivity extends Activity {
    public static final String ACTION_SUBMIT = "android.intent.action.SUBMIT";
    public static final int REQUEST_CODE = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        findViewById(R.id.Submit).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO ここで、id が MyEdit の EditText からテキストを取得して、結果にセットする
            	EditText et = (EditText) findViewById(R.id.MyEdit);
            	String result = et.getText().toString();
            	Intent intent = new Intent();
            	intent.setClass(getApplicationContext(), MainActivity.class);
                intent.putExtra("result", result);  
                setResult(RESULT_OK, intent);
                finish();
                }
        });
    }
}