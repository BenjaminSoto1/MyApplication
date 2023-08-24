package benji.cl.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    Button btaceptar2;
    String stNombre="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btaceptar2=(Button) findViewById(R.id.btaceptar);
        Context context = getApplicationContext();
        Bundle intentR=this.getIntent().getExtras();
        if (intentR !=null){
            stNombre=intentR.getString("nombre");
            Toast.makeText(context,"su nombres es:"+stNombre,Toast.LENGTH_SHORT).show();

        }


        Intent intent= new Intent(this,MainActivity.class);
        btaceptar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(intent);
            }
        });





    }
}