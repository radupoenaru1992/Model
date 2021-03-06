package ro.pub.cs.systems.pdsd.practicaltest01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01SecondaryActivity extends Activity{
	
	Button ok, cancel;
	EditText sec;
	
	public class AscultatorSec implements View.OnClickListener {

		@Override
		public void onClick(View v) {
			
			switch (v.getId()) {
				case R.id.bOk:
					setResult(RESULT_OK, new Intent());
					finish();
					break;
				case R.id.bCancel:
					setResult(RESULT_CANCELED, new Intent());
					finish();
					break;
			}
			
		}
		
	}
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_secondary);
        
        ok = (Button)findViewById(R.id.bOk);
        cancel = (Button)findViewById(R.id.bCancel);
        
        sec = (EditText)findViewById(R.id.etSec);
        
        Intent intent = getIntent();
        String clicks = intent.getStringExtra("clicks");
        sec.setText(clicks);
        
        AscultatorSec asculta = new AscultatorSec();
        
        ok.setOnClickListener(asculta);
        cancel.setOnClickListener(asculta);
	}

}
