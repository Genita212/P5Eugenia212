package ejt.edu.tesoem.genita212.itic.p5eugenia212;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Mensaje(View v){
        Toast.makeText(this,"Bienvenido a esta aplicacion",Toast.LENGTH_SHORT).show();
    }
}
