package com.example.thltddt1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.thltddt1.SecondActivity;

public class MainActivity extends AppCompatActivity {
    private EditText nameInput, idInput, classInput, sdtInput, kehoachInput;
    private RadioGroup radioGroup;
    private CheckBox checkHTN, checkDT, checkVT;
    private Button btnSendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        nameInput = findViewById(R.id.nameInput);
        idInput = findViewById(R.id.idInput);
        classInput = findViewById(R.id.classInput);
        sdtInput = findViewById(R.id.sdtInput);
        kehoachInput = findViewById(R.id.keoachInput);
        radioGroup = findViewById(R.id.radioGroup);
        checkHTN = findViewById(R.id.checkHTN);
        checkDT = findViewById(R.id.checkDT);
        checkVT = findViewById(R.id.checkVT);
        btnSendData = findViewById(R.id.btnsendData);

        // Set button click listener
        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendDataToSecondActivity();
            }
        });
    }

    private void sendDataToSecondActivity() {
        String name = nameInput.getText().toString();
        String id = idInput.getText().toString();
        String className = classInput.getText().toString();
        String phone = sdtInput.getText().toString();
        String plan = kehoachInput.getText().toString();

        // Get selected RadioButton
        int selectedRadioId = radioGroup.getCheckedRadioButtonId();
        String year = "";
        if (selectedRadioId != -1) {
            RadioButton selectedRadioButton = findViewById(selectedRadioId);
            year = selectedRadioButton.getText().toString();
        }

        // Get selected CheckBoxes
        StringBuilder majors = new StringBuilder();
        if (checkHTN.isChecked()) majors.append("Máy tính - HTN, ");
        if (checkDT.isChecked()) majors.append("Điện tử, ");
        if (checkVT.isChecked()) majors.append("Viễn thông, ");

        // Remove trailing comma and space
        if (majors.length() > 0) {
            majors.setLength(majors.length() - 2);
        }

        // Create intent and pass data
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ID", id);
        intent.putExtra("CLASS", className);
        intent.putExtra("PHONE", phone);
        intent.putExtra("PLAN", plan);
        intent.putExtra("YEAR", year);
        intent.putExtra("MAJORS", majors.toString());
        startActivity(intent);
    }
}
