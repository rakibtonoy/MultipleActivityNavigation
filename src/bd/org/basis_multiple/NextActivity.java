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
public class NextActivity extends Activity implements OnClickListener {
    private Button btnBack; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_next);
		btnBack=(Button) findViewById(R.id.btnNext);
		
		btnBack.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		Intent intent=new Intent(this, MainActivity.class);
		startActivity(intent);
	}
		
}
