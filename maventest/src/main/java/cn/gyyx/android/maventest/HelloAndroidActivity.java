package cn.gyyx.android.maventest;

import cn.gyyx.common.util.MathUtil;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class HelloAndroidActivity extends Activity {

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MathUtil mathUtil = new MathUtil();
        int sum = mathUtil.getSum(3, 3);
        System.out.println(sum);
        
        TextView tv = (TextView) findViewById(R.id.tv_sum);
        tv.setText("the sum is :"+sum);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(cn.gyyx.android.maventest.R.menu.main, menu);
	return true;
    }

}

