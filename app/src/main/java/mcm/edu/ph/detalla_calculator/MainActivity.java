package mcm.edu.ph.detalla_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnPlus, btnMinus, btnMultiply, btnDivide, btnModulo;
    Double variaone, variatwo;
    TextView Result;
    EditText rcv1, rcv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlus = findViewById(R.id.bPlus);
        btnMinus = findViewById(R.id.bMinus);
        btnMultiply = findViewById(R.id.bMultiply);
        btnDivide = findViewById(R.id.bDivide);
        btnModulo = findViewById(R.id.bModu);
        Result = findViewById(R.id.result);
        rcv1 = findViewById(R.id.First);
        rcv2 = findViewById(R.id.Second);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        variaone = Double.parseDouble(rcv1.getText().toString());
        variatwo = Double.parseDouble(rcv2.getText().toString());

        switch (view.getId()){
            case R.id.bPlus:
                Result.setText(String.valueOf(add(variaone,variatwo)));
                break;
            case R.id.bMinus:
                Result.setText(String.valueOf(minus(variaone,variatwo)));
                break;
            case R.id.bMultiply:
                Result.setText(String.valueOf(times(variaone,variatwo)));
                break;
            case R.id.bDivide:
                Result.setText(String.valueOf(divide(variaone,variatwo)));
                break;
            case R.id.bModu:
                Result.setText(String.valueOf(modulo(variaone,variatwo)));
                break;
        }
    }

    private Double modulo(Double variable_one, Double variable_two) {
        double answer;
        answer = variable_one % variable_two;
        return answer;
    }

    private Double divide(Double variable_one, Double variable_two) {
        double answer;
        answer = variable_one / variable_two;
        return answer;
    }

    private Double times(Double variable_one, Double variable_two) {
        double answer;
        answer = variable_one * variable_two;
        return answer;
    }

    private Double minus(Double variable_one, Double variable_two) {
        double answer;
        answer = variable_one - variable_two;
        return answer;
    }

    private Double add(Double variable_one, Double variable_two) {
        double answer;
        answer = variable_one + variable_two;
        return answer;
    }
}