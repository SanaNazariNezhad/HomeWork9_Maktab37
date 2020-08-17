package org.maktab.homework9_maktab37;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.material.snackbar.Snackbar;

public class TicTacToeFragment extends Fragment {
    private Button mButton1_1,mButton1_2,mButton1_3,mButton2_1,mButton2_2,mButton2_3,mButton3_1
            ,mButton3_2,mButton3_3;
    private FrameLayout mFrameLayoutTicTacToe;

    private boolean[] mBtnClick;
    private short player;
    public TicTacToeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        player = 1;

        mBtnClick = new boolean[9];
        for (int i = 1; i <= mBtnClick.length ; i++) {
            mBtnClick[i-1] = false;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tic_tac_toe, container, false);
        findViews(view);
        listeners();

        return view;
    }

    private void listeners() {
        mButton1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mButton1_1.getText().toString().equals("X") && !mButton1_1.getText().toString().equals("O")) {
                    if (player % 2 != 0)
                        mButton1_1.setText(R.string.player1);
                    else
                        mButton1_1.setText(R.string.player2);
                    player++;
                }
                if (checkPlayer(mButton1_1,mButton1_2,mButton1_3,"X") ||
                        checkPlayer(mButton1_1,mButton2_1,mButton3_1,"X") ||
                        checkPlayer(mButton1_1,mButton2_2,mButton3_3,"X")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player1_is_winner,Snackbar.LENGTH_SHORT).show();
                }
                else if (checkPlayer(mButton1_1,mButton1_2,mButton1_3,"O") ||
                        checkPlayer(mButton1_1,mButton2_1,mButton3_1,"O") ||
                        checkPlayer(mButton1_1,mButton2_2,mButton3_3,"O")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player2_is_winner,Snackbar.LENGTH_SHORT).show();
                }

            }
        });
        mButton1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mButton1_2.getText().toString().equals("X") && !mButton1_2.getText().toString().equals("O")) {
                    if (player % 2 != 0)
                        mButton1_2.setText(R.string.player1);
                    else
                        mButton1_2.setText(R.string.player2);
                    player++;
                }
                if (checkPlayer(mButton1_1,mButton1_2,mButton1_3,"X") ||
                        checkPlayer(mButton1_2,mButton2_2,mButton3_2,"X")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player1_is_winner,Snackbar.LENGTH_SHORT).show();
                }
                else if (checkPlayer(mButton1_1,mButton1_2,mButton1_3,"O") ||
                        checkPlayer(mButton1_2,mButton2_2,mButton3_2,"O")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player2_is_winner,Snackbar.LENGTH_SHORT).show();
                }
            }
        });
        mButton1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mButton1_3.getText().toString().equals("X") && !mButton1_3.getText().toString().equals("O")) {
                    if (player % 2 != 0)
                        mButton1_3.setText(R.string.player1);
                    else
                        mButton1_3.setText(R.string.player2);
                    player++;
                }
                if (checkPlayer(mButton1_1,mButton1_2,mButton1_3,"X") ||
                        checkPlayer(mButton1_3,mButton2_3,mButton3_3,"X") ||
                        checkPlayer(mButton1_3,mButton2_2,mButton3_1,"X")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player1_is_winner,Snackbar.LENGTH_SHORT).show();
                }
                else if (checkPlayer(mButton1_1,mButton1_2,mButton1_3,"O") ||
                        checkPlayer(mButton1_3,mButton2_3,mButton3_3,"O") ||
                        checkPlayer(mButton1_3,mButton2_2,mButton3_1,"O")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player2_is_winner,Snackbar.LENGTH_SHORT).show();
                }
            }
        });
        mButton2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mButton2_1.getText().toString().equals("X") && !mButton2_1.getText().toString().equals("O")) {
                    if (player % 2 != 0)
                        mButton2_1.setText(R.string.player1);
                    else
                        mButton2_1.setText(R.string.player2);
                    player++;
                }
                if (checkPlayer(mButton2_1,mButton2_2,mButton2_3,"X") ||
                        checkPlayer(mButton1_1,mButton2_1,mButton3_1,"X")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player1_is_winner,Snackbar.LENGTH_SHORT).show();
                }
                else if (checkPlayer(mButton2_1,mButton2_2,mButton2_3,"O") ||
                        checkPlayer(mButton1_1,mButton2_1,mButton3_1,"O")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player2_is_winner,Snackbar.LENGTH_SHORT).show();
                }
            }
        });
        mButton2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mButton2_2.getText().toString().equals("X") && !mButton2_2.getText().toString().equals("O")) {
                    if (player % 2 != 0)
                        mButton2_2.setText(R.string.player1);
                    else
                        mButton2_2.setText(R.string.player2);
                    player++;
                }
                if (checkPlayer(mButton1_2,mButton2_2,mButton3_2,"X") ||
                        checkPlayer(mButton2_1,mButton2_2,mButton2_3,"X")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player1_is_winner,Snackbar.LENGTH_SHORT).show();
                }
                else if (checkPlayer(mButton1_2,mButton2_2,mButton3_2,"O") ||
                        checkPlayer(mButton2_1,mButton2_2,mButton3_2,"O")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player2_is_winner,Snackbar.LENGTH_SHORT).show();
                }
            }
        });
        mButton2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mButton2_3.getText().toString().equals("X") && !mButton2_3.getText().toString().equals("O")) {
                    if (player % 2 != 0)
                        mButton2_3.setText(R.string.player1);
                    else
                        mButton2_3.setText(R.string.player2);
                    player++;
                }
                if (checkPlayer(mButton1_3,mButton2_3,mButton3_3,"X") ||
                        checkPlayer(mButton2_1,mButton2_2,mButton2_3,"X")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player1_is_winner,Snackbar.LENGTH_SHORT).show();
                }
                else if (checkPlayer(mButton1_3,mButton2_3,mButton3_3,"O") ||
                        checkPlayer(mButton2_1,mButton2_2,mButton2_3,"O")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player2_is_winner,Snackbar.LENGTH_SHORT).show();
                }
            }
        });
        mButton3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mButton3_1.getText().toString().equals("X") && !mButton3_1.getText().toString().equals("O")) {
                    if (player % 2 != 0)
                        mButton3_1.setText(R.string.player1);
                    else
                        mButton3_1.setText(R.string.player2);
                    player++;
                }
                if (checkPlayer(mButton1_1,mButton2_1,mButton3_1,"X") ||
                        checkPlayer(mButton3_1,mButton3_2,mButton3_3,"X") ||
                        checkPlayer(mButton1_3,mButton2_2,mButton3_1,"X")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player1_is_winner,Snackbar.LENGTH_SHORT).show();
                }
                else if (checkPlayer(mButton1_1,mButton2_1,mButton3_1,"O") ||
                        checkPlayer(mButton3_1,mButton3_2,mButton3_3,"O") ||
                        checkPlayer(mButton1_3,mButton2_2,mButton3_1,"O")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player2_is_winner,Snackbar.LENGTH_SHORT).show();
                }
            }
        });
        mButton3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mButton3_2.getText().toString().equals("X") && !mButton3_2.getText().toString().equals("O")) {
                    if (player % 2 != 0)
                        mButton3_2.setText(R.string.player1);
                    else
                        mButton3_2.setText(R.string.player2);
                    player++;
                }
                if (checkPlayer(mButton3_1,mButton3_2,mButton3_3,"X") ||
                        checkPlayer(mButton1_2,mButton2_2,mButton3_2,"X")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player1_is_winner,Snackbar.LENGTH_SHORT).show();
                }
                else if (checkPlayer(mButton3_1,mButton3_2,mButton3_3,"O") ||
                        checkPlayer(mButton1_2,mButton2_2,mButton3_2,"O")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player2_is_winner,Snackbar.LENGTH_SHORT).show();
                }
            }
        });
        mButton3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mButton3_3.getText().toString().equals("X") && !mButton3_3.getText().toString().equals("O")) {
                    if (player % 2 != 0)
                        mButton3_3.setText(R.string.player1);
                    else
                        mButton3_3.setText(R.string.player2);
                    player++;
                }
                if (checkPlayer(mButton1_3,mButton2_3,mButton3_3,"X") ||
                        checkPlayer(mButton3_1,mButton3_2,mButton3_3,"X") ||
                        checkPlayer(mButton1_1,mButton2_2,mButton3_3,"X")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player1_is_winner,Snackbar.LENGTH_SHORT).show();
                }
                else if (checkPlayer(mButton1_3,mButton2_3,mButton3_3,"O") ||
                        checkPlayer(mButton3_1,mButton3_2,mButton3_3,"O") ||
                        checkPlayer(mButton1_1,mButton2_2,mButton3_3,"O")){
                    disableButton();
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.player2_is_winner,Snackbar.LENGTH_SHORT).show();
                }
            }
        });

    }

    private boolean checkPlayer(Button btn1,Button btn2,Button btn3 , String str){
        if ((btn1.getText().toString().equals(str) &&
                btn2.getText().toString().equals(str) &&
                btn3.getText().toString().equals(str))){
            return true;
        }
        else
            return false;
    }
    private void disableButton(){
        mButton1_1.setClickable(false);
        mButton1_2.setClickable(false);
        mButton1_3.setClickable(false);
        mButton2_1.setClickable(false);
        mButton2_2.setClickable(false);
        mButton2_3.setClickable(false);
        mButton3_1.setClickable(false);
        mButton3_2.setClickable(false);
        mButton3_3.setClickable(false);
    }


    private void findViews(View view) {
        mButton1_1 = view.findViewById(R.id.btn1_1);
        mButton1_2 = view.findViewById(R.id.btn1_2);
        mButton1_3 = view.findViewById(R.id.btn1_3);
        mButton2_1 = view.findViewById(R.id.btn2_1);
        mButton2_2 = view.findViewById(R.id.btn2_2);
        mButton2_3 = view.findViewById(R.id.btn2_3);
        mButton3_1 = view.findViewById(R.id.btn3_1);
        mButton3_2 = view.findViewById(R.id.btn3_2);
        mButton3_3 = view.findViewById(R.id.btn3_3);
        mFrameLayoutTicTacToe = view.findViewById(R.id.framelayout_ticTacToe);
    }
}