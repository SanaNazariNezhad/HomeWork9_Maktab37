package org.maktab.homework9_maktab37;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class GameActivity extends AppCompatActivity {
    public static final String BUNDLE_KEY_FLAG_TIC_TAC_TOE = "flag_tic_tac_toe";
    public static final String BUNDLE_KEY_FLAG_4_IN_A_ROW = "flag_4_in_a_row";
    private Button mButtonTicTacToe;
    private Button mButton4_in_a_Row;
    private Fragment mFragment;
    private FragmentManager mFragmentManager;
    private TicTacToeFragment ticTacToeFragment;
    private _4InARowFragment inARowFragment;


    private boolean flag_ticTacToe = false, flag_4_inARow = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null){
            flag_ticTacToe = savedInstanceState.getBoolean(BUNDLE_KEY_FLAG_TIC_TAC_TOE);
            flag_4_inARow = savedInstanceState.getBoolean(BUNDLE_KEY_FLAG_4_IN_A_ROW);
        }
        setContentView(R.layout.activity_game);

        setTitle(getString(R.string.Game));

        findViews();
        listeners();

        mFragmentManager = getSupportFragmentManager();
        mFragment = mFragmentManager.findFragmentById(R.id.fragment_container);
        ticTacToeFragment = new TicTacToeFragment();
        inARowFragment = new _4InARowFragment();

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putBoolean(BUNDLE_KEY_FLAG_TIC_TAC_TOE,flag_ticTacToe);
        outState.putBoolean(BUNDLE_KEY_FLAG_4_IN_A_ROW,flag_4_inARow);
    }

    private void listeners() {
        mButtonTicTacToe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!flag_ticTacToe && !flag_4_inARow) {
                    mFragmentManager
                            .beginTransaction()
                            .add(R.id.fragment_container, ticTacToeFragment)
                            .commit();
                }else if (!flag_ticTacToe){
                    mFragmentManager
                            .beginTransaction()
                            .remove(inARowFragment)
                            .add(R.id.fragment_container, ticTacToeFragment)
                            .commit();
                }else if (!flag_4_inARow){
                    mFragmentManager
                            .beginTransaction()
                            .remove(ticTacToeFragment)
                            .add(R.id.fragment_container, ticTacToeFragment)
                            .commit();
                }
                /*mButton4_in_a_Row.setClickable(true);
                mButtonTicTacToe.setClickable(false);*/
                flag_ticTacToe = true;
                flag_4_inARow = false;
            }
        });
        mButton4_in_a_Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!flag_ticTacToe && !flag_4_inARow) {
                    mFragmentManager
                            .beginTransaction()
                            .add(R.id.fragment_container, inARowFragment)
                            .commit();
                }else if (!flag_ticTacToe){
                    mFragmentManager
                            .beginTransaction()
                            .remove(inARowFragment)
                            .add(R.id.fragment_container, inARowFragment)
                            .commit();
                }else if (!flag_4_inARow){
                    mFragmentManager
                            .beginTransaction()
                            .remove(ticTacToeFragment)
                            .add(R.id.fragment_container, inARowFragment)
                            .commit();
                }
                /*mButton4_in_a_Row.setClickable(false);
                mButtonTicTacToe.setClickable(true);*/
                flag_4_inARow = true;
                flag_ticTacToe = false;

            }
        });
    }

    private void findViews() {
        mButtonTicTacToe = findViewById(R.id.btn_tic_tac_toe);
        mButton4_in_a_Row = findViewById(R.id.btn_4_in_a_row);
    }
}