package appsiam.tua.saran.mysiam;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import static appsiam.tua.saran.mysiam.R.id.btnLogin;

public class MainActivity extends AppCompatActivity {


    //Explicit คือ การประกาศตัวแปร
    private EditText userEditText, passwordEditText;
    private TextView textView; //shift+ctrl+enterเป็นตัวช่วยในการ Autocorrect
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initail View
        initialView();

        //TextView Controller
        textViewController();

    }   // Method Main

    private void textViewController() {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent to NewRegisterActivity เป็นการสืบทอด
                Intent intent = new Intent(MainActivity.this, NewRegisterAct.class);
                startActivity(intent);//ให้มีการเปิดหน้า 2 และมันจะทับกับหน้าแรก



            }
        });
    }

    private void initialView() {

        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        textView = (TextView) findViewById(R.id.txtNewRegister);
        button = (Button) findViewById(R.id.btnLogin);

    }

}   //Main Class นี่คือ คลาสหลัก
