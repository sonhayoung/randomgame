package kr.hs.emirim.thsgkdud123.monchicken;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by appcreator13 on 2016. 3. 28..
 */
public class ResultActivity extends ActionBarActivity {

    TextView  mResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mResult=(TextView)findViewById(R.id.result);
        mResult.setText("결과");
        
    }
}
