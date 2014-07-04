package dzyubuk.thirdapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class StartActivity extends Activity {

    TextView mainTxt;
    Button ctrBtn;
    Button ctrBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mainTxt = (TextView) findViewById(R.id.mainTxt);
        ctrBtn = (Button) findViewById(R.id.ctrBtn);
        ctrBtn2 = (Button) findViewById(R.id.ctrBtn2);

        View.OnClickListener oclctrBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainTxt.setText("Теперь у Вас всё хорошо!");

            }
        };

        ctrBtn.setOnClickListener(oclctrBtn);

        View.OnClickListener oclctrBtn2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainTxt.setText("Всё снова по старому!(");

            }
        };

        ctrBtn2.setOnClickListener(oclctrBtn2);
    }
}
