package tw.edu.ntut.csie.app04_105590040;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    private ListView liststudent;
    private TextView txtNotcome;
    private TextView txtStu;
    private Button btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        liststudent=(ListView)findViewById(R.id.listStu);
        txtNotcome=(TextView)findViewById(R.id.txtNotcome);
        txtStu=(TextView)findViewById(R.id.txtStu);
        btnClear=(Button)findViewById(R.id.btnClear);

        ListView listview=getListView();
    }

}
