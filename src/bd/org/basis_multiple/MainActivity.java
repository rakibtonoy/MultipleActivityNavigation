
package bd.org.basis_multiple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * @author Rakib
 *
 */
public class MainActivity extends Activity implements OnClickListener {
     
	private Button btnNext;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_main);
    	btnNext=(Button)findViewById(R.id.btnNext);
    	
    	btnNext.setOnClickListener(this);
    }

	@Override
	public void onClick(View arg0) {
		Intent intent=new Intent(this, NextActivity.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);
	}
}
