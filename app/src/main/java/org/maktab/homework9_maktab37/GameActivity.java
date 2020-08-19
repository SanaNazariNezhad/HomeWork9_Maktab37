package org.maktab.homework9_maktab37;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {
    public static final String BUNDLE_KEY_FLAG_CHANGE = "flagChange";
    public static final String BUNDLE_KEY_FLAG_WHICH_ONE = "flagWhichOne";
    private Button mButtonTicTacToe;
    private Button mButton4_in_a_Row;


    private int mFlagChange;
    private boolean mFlagWhichOne = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null){
            mFlagChange = savedInstanceState.getInt(BUNDLE_KEY_FLAG_CHANGE);
            mFlagWhichOne = savedInstanceState.getBoolean(BUNDLE_KEY_FLAG_WHICH_ONE);
        }
        setContentView(R.layout.activity_game);

        setTitle(getString(R.string.Game));

        findViews();
        listeners();

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(BUNDLE_KEY_FLAG_CHANGE,mFlagChange);
        outState.putBoolean(BUNDLE_KEY_FLAG_WHICH_ONE, mFlagWhichOne);
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

    }

    private void changeFragment(){
        Fragment fragment;

        if (mFlagChange == 1 && !mFlagWhichOne){
            fragment = new TicTacToeFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .add(R.id.fragment_container,fragment)
                    .commit();
        }else if (mFlagChange == 1){
            fragment = new TicTacToeFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container,fragment)
                    .commit();
        }
        if (mFlagChange == 2 && !mFlagWhichOne){
            fragment = new _4InARowFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .add(R.id.fragment_container,fragment)
                    .commit();
        }else if (mFlagChange == 2){
            fragment = new _4InARowFragment();
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
    }
}