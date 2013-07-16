package mick.example.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity 
						  implements View.OnClickListener {

	Button button;
	int touchCount;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        button = new Button(this);
        button.setText("Touch Me!");
        button.setOnClickListener(this);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onClick(View v) {
        touchCount++;
        button.setText("Touched me " + touchCount + " time(s)");
    }
    
}
