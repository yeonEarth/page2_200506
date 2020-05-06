package com.example.page2_200503_mj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com_page2_1.Page2_1_Fragment;
import com_page2_1.Page2_1_MainActivity;

public class MainActivity  extends AppCompatActivity implements View.OnClickListener {

    /*
    /*
     * subject_1 = 자연
     * subject_2 = 역사
     * subject_3 = 휴양
     * subject_4 = 체험
     * subject_5 = 산업
     * subject_6 = 건축/조형
     * subject_7 = 문화
     * subject_8 = 레포츠
     */

    TextView page2_title;

    int[] button_id = {R.id.subject_1, R.id.subject_2, R.id.subject_3, R.id.subject_4, R.id.subject_5, R.id.subject_6, R.id.subject_7, R.id.subject_8};
    String[] subject_name = {"자연", "역사", "휴양", "체험", "산업", "건축/조형", "문화", "레포츠"};
    Button[] subject = new Button[button_id.length];





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        for(int i = 0; i<button_id.length; i++){
            subject[i] = (Button) findViewById(button_id[i]);
            subject[i].setOnClickListener(this);
        }

    }


    @Override
    public void onClick(View v) {
        for(int i =0; i < subject.length; i++) {

            if(subject[i].getId() == v.getId()) {
                Intent intent = new Intent(this, Page2_MainActivity.class);
                intent.putExtra("subject_name", subject_name[i]);

                startActivity(intent);

            }
        }
    }
}
