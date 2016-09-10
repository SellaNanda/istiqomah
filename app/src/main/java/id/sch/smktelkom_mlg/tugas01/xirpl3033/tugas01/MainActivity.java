package id.sch.smktelkom_mlg.tugas01.xirpl3033.tugas01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spKelas;
    CheckBox cbCL, cbFL, cbSU, cbKR, cbKM, cbPS;
    RadioButton rbKK, rbKN, rbBG;
    Button bDaftar;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spKelas = (Spinner) findViewById(R.id.spinnerKelas);
        cbCL = (CheckBox) findViewById(R.id.checkBoxCL);
        cbFL = (CheckBox) findViewById(R.id.checkBoxFL);
        cbSU = (CheckBox) findViewById(R.id.checkBoxSU);
        cbKR = (CheckBox) findViewById(R.id.checkBoxKR);
        cbKM = (CheckBox) findViewById(R.id.checkBoxKM);
        cbPS = (CheckBox) findViewById(R.id.checkBoxPS);
        rbBG = (RadioButton) findViewById(R.id.radioButtonBG);
        rbKK = (RadioButton) findViewById(R.id.radioButtonKK);
        rbKN = (RadioButton) findViewById(R.id.radioButtonKN);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonDF).setOnClickListener(new View.OnClickListener() {
                                                           @Override
                                                           public void onClick(View view) {
                                                               doClick();
                                                           }
                                                       }
        );

    }

    private void doClick() {
        String hasil = "Lomba yang diikuti : \n";
        int startlen = hasil.length();
        if (cbCL.isChecked()) hasil += cbCL.getText() + "\n";
        if (cbFL.isChecked()) hasil += cbFL.getText() + "\n";
        if (cbKM.isChecked()) hasil += cbKM.getText() + "\n";
        if (cbKR.isChecked()) hasil += cbKR.getText() + "\n";
        if (cbPS.isChecked()) hasil += cbPS.getText() + "\n";
        if (cbSU.isChecked()) hasil += cbSU.getText() + "\n";
        if (hasil.length() == startlen)
            hasil += "Kelas anda di denda 50k karena tidak mengikuti lomba";
        tvHasil.setText("Kelas anda " + spKelas.getSelectedItem().toString() + "\n" + hasil);
    }


}
