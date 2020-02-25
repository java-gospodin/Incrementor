package soft.village.incrementor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Incrementor incrementor = new Incrementor();

        final TextView tvNum = findViewById(R.id.tvNum);
        tvNum.setText(String.valueOf(incrementor.getNumber()));
        Button btnIncrement = findViewById(R.id.btnIncrement);
        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementor.incrementNumber();
                tvNum.setText(String.valueOf(incrementor.getNumber()));
            }
        });

        final EditText etMaxValue = findViewById(R.id.etMaxValue);
        Button btnMaxValue = findViewById(R.id.btnMaxValue);
        btnMaxValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementor.setMaximumValue(Integer.parseInt(String.valueOf(etMaxValue.getText())));
            }
        });


    }
}
