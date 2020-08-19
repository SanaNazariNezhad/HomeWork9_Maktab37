package org.maktab.homework9_maktab37;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import org.maktab.homework9_maktab37.model.Setting;

public class SettingActivity extends AppCompatActivity {

    public static final String EXTRA_SETTING = "setting";
    private EditText mPlayer1,mPlayer2;
    private ImageButton mImageBtnSave,mImageBtnBack;
    private Setting mSetting = new Setting();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        
        findViews();
        listeners();
    }

    private void listeners() {
        mImageBtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        mImageBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSetting.setPlayer1(mPlayer1.getText().toString());
                mSetting.setPlayer2(mPlayer2.getText().toString());
                saveResult();
                finish();
            }
        });

    }

    private void saveResult() {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_SETTING,mSetting);
        setResult(RESULT_OK,intent);
    }

    private void findViews() {
        mPlayer1 = findViewById(R.id.TextPersonName_player1);
        mPlayer2 = findViewById(R.id.TextPersonName_player2);
        mImageBtnSave = findViewById(R.id.imageBtn_save);
        mImageBtnBack = findViewById(R.id.imageBtn_back);
    }
}