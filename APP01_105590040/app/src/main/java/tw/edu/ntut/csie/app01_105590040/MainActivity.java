package tw.edu.ntut.csie.app01_105590040;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mtxtGrade;
    private EditText meditInput;
    private Button mbtnGradeTrans;
    private TextView mtxtLevel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtxtGrade = (TextView)findViewById(R.id.txtGrade);
        meditInput=(EditText)findViewById(R.id.editInput);
        mbtnGradeTrans=(Button)findViewById(R.id.btnGradeTrans);
        mtxtLevel=(TextView)findViewById(R.id.txtLevel);
        mbtnGradeTrans.setOnClickListener(btnGradeTransOnClick);
    }
    private View.OnClickListener btnGradeTransOnClick =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Grade gg =new Grade();
            String strScore=meditInput.getText().toString();
            String strResult="";
            int intScore = Integer.parseInt(strScore);
            strResult=gg.letterGrade(intScore);

            if (strResult=="X") mtxtLevel.setText("等第：輸入分數應介於[0~100]");
            else if (strResult=="A") mtxtLevel.setText("等第：A");
            else if (strResult=="B") mtxtLevel.setText("等第：B");
            else if (strResult=="C") mtxtLevel.setText("等第：C");
            else if (strResult=="D") mtxtLevel.setText("等第：D");
            else if (strResult=="F") mtxtLevel.setText("等第：F");
            meditInput.setText("");
        }
    };
}
