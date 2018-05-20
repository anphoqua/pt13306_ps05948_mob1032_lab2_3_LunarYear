package com.example.anphoqua.gregoriantolunar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText_gregorianYear;
    Button btn_conversion;
    TextView textView_lunarYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_gregorianYear =  findViewById(R.id.edt_gregorianYear);
        btn_conversion = findViewById(R.id.btn_conversion);
        textView_lunarYear = findViewById(R.id.textView_lunarYear);

        btn_conversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_lunarYear.setText(convertToLunar(Integer.parseInt(editText_gregorianYear.getText().toString().trim())));
            }
        });
    }

    public String convertToLunar(int gregorianYear){
        String thienCan ="", diaChi ="";
        switch (gregorianYear%10) {
            case 0: thienCan ="Canh"; break;
            case 1: thienCan = "Tân"; break;
            case 2: thienCan = "Nhâm"; break;
            case 3: thienCan = "Quý"; break;
            case 4: thienCan = "Giáp"; break;
            case 5: thienCan = "Ất"; break;
            case 6: thienCan = "Bính"; break;
            case 7: thienCan = "Đinh"; break;
            case 8: thienCan = "Mậu"; break;
            case 9: thienCan = "Kỷ"; break;
        }

        switch (gregorianYear%12) {
            case 0: diaChi = "Thân"; break;
            case 1: diaChi = "Dậu"; break;
            case 2: diaChi = "Tuất"; break;
            case 3: diaChi = "Hợi"; break;
            case 4: diaChi = "Tí"; break;
            case 5: diaChi = "Sửu"; break;
            case 6: diaChi = "Dần"; break;
            case 7: diaChi = "Mẹo"; break;
            case 8: diaChi = "Thình"; break;
            case 9: diaChi = "Tỵ"; break;
            case 10: diaChi = "Ngọ"; break;
            case 11: diaChi = "Mùi"; break;
        }

        return thienCan+" "+diaChi;
    }
}
