package org.maktab.homework9_maktab37;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.maktab.homework9_maktab37.model.Setting;

public class GameActivity extends AppCompatActivity {
    public static final String BUNDLE_KEY_FLAG_CHANGE = "flagChange";
    public static final String BUNDLE_KEY_FLAG_WHICH_ONE = "flagWhichOne";
    public static final int REQUEST_CODE_SETTING = 0;
    public static final String BUNDLE_KEY_SETTING = "bundle_setting";
    public static final String EXTRA_SETTING = "extra_setting";
    private ImageButton mButtonTicTacToe;
    private ImageButton mButton4_in_a_Row;
    private ImageButton mImageButtonSetting;

    private Setting mSetting = new Setting();

    private TextView mPlayer1_name, mPlayer2_name;
    public TextView mPlayer1_score, mPlayer2_score;


    private int mFlagChange;
    private boolean mFlagWhichOne = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null){
            mFlagChange = savedInstanceState.getInt(BUNDLE_KEY_FLAG_CHANGE);
            mFlagWhichOne = savedInstanceState.getBoolean(BUNDLE_KEY_FLAG_WHICH_ONE);
            mSetting = (Setting) savedInstanceState.getSerializable(BUNDLE_KEY_SETTING);
        }
        setContentView(R.layout.activity_game);

        setTitle(getString(R.string.Game));

        findViews();
        mPlayer1_name.setText(mSetting.getPlayer1() + " :");
        mPlayer2_name.setText(mSetting.getPlayer2() + " :");
        mPlayer1_score.setText(mSetting.getPlayer1_score() + "");
        mPlayer2_score.setText(mSetting.getPlayer2_score() + "");
        listeners();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK || data == null)
            return;
        if (requestCode == REQUEST_CODE_SETTING){
            Bundle bundle = data.getExtras();
            mSetting = (Setting) bundle.getSerializable(SettingActivity.EXTRA_SETTING);
            mPlayer1_name.setText(mSetting.getPlayer1() + " :");
            mPlayer2_name.setText(mSetting.getPlayer2() + " :");
            mPlayer1_score.setText(mSetting.getPlayer1_score() + "");
            mPlayer2_score.setText(mSetting.getPlayer2_score() + "");
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(BUNDLE_KEY_FLAG_CHANGE,mFlagChange);
        outState.putBoolean(BUNDLE_KEY_FLAG_WHICH_ONE, mFlagWhichOne);
        outState.putSerializable(BUNDLE_KEY_SETTING,mSetting);
    }



    private void listeners() {
        mButtonTicTacToe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFlagChange = 1;
                changeFragment();
                mFlagWhichOne = true;
            }
        });
        mButton4_in_a_Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFlagChange = 2;
                changeFragment();
                mFlagWhichOne = true;
            }
        });
        mImageButtonSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameActivity.this,SettingActivity.class);
                startActivityForResult(intent,REQUEST_CODE_SETTING);
            }
        });

    }

    private void changeFragment(){
        Fragment fragment;

        if (mFlagChange == 1 && !mFlagWhichOne){
            Bundle bundle = new Bundle();
            bundle.putSerializable(EXTRA_SETTING,mSetting);
            fragment = new TicTacToeFragment();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .add(R.id.fragment_container,fragment)
                    .commit();
        }else if (mFlagChange == 1){
            Bundle bundle = new Bundle();
            bundle.putSerializable(EXTRA_SETTING,mSetting);
            fragment = new TicTacToeFragment();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container,fragment)
                    .commit();
        }
        if (mFlagChange == 2 && !mFlagWhichOne){
            Bundle bundle = new Bundle();
            bundle.putSerializable(EXTRA_SETTING,mSetting);
            fragment = new _4InARowFragment();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .add(R.id.fragment_container,fragment)
                    .commit();
        }else if (mFlagChange == 2){
            Bundle bundle = new Bundle();
            bundle.putSerializable(EXTRA_SETTING,mSetting);
            fragment = new _4InARowFragment();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container,fragment)
                    .commit();
        }

    }

    private void findViews() {
        mButtonTicTacToe = findViewById(R.id.btn_tic_tac_toe);
        mButton4_in_a_Row = findViewById(R.id.btn_4_in_a_row);
        mImageButtonSetting = findViewById(R.id.imageBtn_setting);
        mPlayer1_name = findViewById(R.id.player1_name);
        mPlayer2_name = findViewById(R.id.player2_name);
        mPlayer1_score = findViewById(R.id.player1_score);
        mPlayer2_score = findViewById(R.id.player2_score);
    }
}