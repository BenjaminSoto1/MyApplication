package benji.cl.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btaceptar1;
    EditText etnombre;
    @SuppressLint("MissingInFlatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=new Intent(this,MainActivity2.class);
        btaceptar1=(Button) findViewById(R.id.btAceptar);
        etnombre =(EditText) findViewById(R.id.etnombre);
        intent.putExtra("nombre",etnombre.getText().toString());
        btaceptar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}