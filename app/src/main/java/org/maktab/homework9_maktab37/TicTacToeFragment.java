package org.maktab.homework9_maktab37;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.material.snackbar.Snackbar;

import org.maktab.homework9_maktab37.model.Setting;

public class TicTacToeFragment extends Fragment {
    public static final String BUNDLE_KEY_PLAYER = "player";
    public static final String BUNDLE_KEY_BTN_1_1 = "btn1_1";
    public static final String BUNDLE_KEY_BTN_1_2 = "btn1_2";
    public static final String BUNDLE_KEY_BTN_1_3 = "btn1_3";
    public static final String BUNDLE_KEY_BTN_2_1 = "btn2_1";
    public static final String BUNDLE_KEY_BTN_2_2 = "btn2_2";
    public static final String BUNDLE_KEY_BTN_2_3 = "btn2_3";
    public static final String BUNDLE_KEY_BTN_3_1 = "btn3_1";
    public static final String BUNDLE_KEY_BTN_3_2 = "btn3_2";
    public static final String BUNDLE_KEY_BTN_3_3 = "btn3_3";
    public static final String BUNDLE_KEY_FLAG_GAME_OVER = "flagGameOver";
    public static final String BUNDLE_KEY_GAME_OVER_COUNTER = "gameOverCounter";
    public static final String BUNDLE_KEY_SETTING = "setting";
    public static final String EXTRA_SETTING = "setting";
    private String btn1_1,btn1_2,btn1_3,btn2_1,btn2_2,btn2_3,btn3_1,btn3_2,btn3_3;
    private Button mButton1_1,mButton1_2,mButton1_3,mButton2_1,mButton2_2,mButton2_3,mButton3_1
            ,mButton3_2,mButton3_3;
    private FrameLayout mFrameLayoutTicTacToe;
    private short gameOverCounter;
    private boolean flagGameOver = false;
    private Setting mSetting = new Setting();

    private short player;
    public TicTacToeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        player = 1;
        gameOverCounter = 0;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (savedInstanceState != null){
            player = savedInstanceState.getShort(BUNDLE_KEY_PLAYER);
            flagGameOver = savedInstanceState.getBoolean(BUNDLE_KEY_FLAG_GAME_OVER);
            gameOverCounter = savedInstanceState.getShort(BUNDLE_KEY_GAME_OVER_COUNTER);
            btn1_1 = savedInstanceState.getString(BUNDLE_KEY_BTN_1_1);
            btn1_2 = savedInstanceState.getString(BUNDLE_KEY_BTN_1_2);
            btn1_3 = savedInstanceState.getString(BUNDLE_KEY_BTN_1_3);
            btn2_1 = savedInstanceState.getString(BUNDLE_KEY_BTN_2_1);
            btn2_2 = savedInstanceState.getString(BUNDLE_KEY_BTN_2_2);
            btn2_3 = savedInstanceState.getString(BUNDLE_KEY_BTN_2_3);
            btn3_1 = savedInstanceState.getString(BUNDLE_KEY_BTN_3_1);
            btn3_2 = savedInstanceState.getString(BUNDLE_KEY_BTN_3_2);
            btn3_3 = savedInstanceState.getString(BUNDLE_KEY_BTN_3_3);
            mSetting = (Setting) savedInstanceState.getSerializable(BUNDLE_KEY_SETTING);
        }
        View view = inflater.inflate(R.layout.fragment_tic_tac_toe, container, false);
        mSetting = (Setting) getArguments().getSerializable(GameActivity.EXTRA_SETTING);
        findViews(view);
        mButton1_1.setText(btn1_1);
        mButton1_2.setText(btn1_2);
        mButton1_3.setText(btn1_3);
        mButton2_1.setText(btn2_1);
        mButton2_2.setText(btn2_2);
        mButton2_3.setText(btn2_3);
        mButton3_1.setText(btn3_1);
        mButton3_2.setText(btn3_2);
        mButton3_3.setText(btn3_3);
        if (flagGameOver)
            disableButton();
        else
            listeners();

        return view;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putShort(BUNDLE_KEY_PLAYER,player);
        outState.putBoolean(BUNDLE_KEY_FLAG_GAME_OVER,flagGameOver);
        outState.putShort(BUNDLE_KEY_GAME_OVER_COUNTER,gameOverCounter);
        outState.putString(BUNDLE_KEY_BTN_1_1,mButton1_1.getText().toString());
        outState.putString(BUNDLE_KEY_BTN_1_2,mButton1_2.getText().toString());
        outState.putString(BUNDLE_KEY_BTN_1_3,mButton1_3.getText().toString());
        outState.putString(BUNDLE_KEY_BTN_2_1,mButton2_1.getText().toString());
        outState.putString(BUNDLE_KEY_BTN_2_2,mButton2_2.getText().toString());
        outState.putString(BUNDLE_KEY_BTN_2_3,mButton2_3.getText().toString());
        outState.putString(BUNDLE_KEY_BTN_3_1,mButton3_1.getText().toString());
        outState.putString(BUNDLE_KEY_BTN_3_2,mButton3_2.getText().toString());
        outState.putString(BUNDLE_KEY_BTN_3_3,mButton3_3.getText().toString());
        outState.putSerializable(BUNDLE_KEY_SETTING,mSetting);
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
                    gameOverCounter++;
                }
                if (checkPlayer(mButton1_1,mButton1_2,mButton1_3,"X") ||
                        checkPlayer(mButton1_1,mButton2_1,mButton3_1,"X") ||
                        checkPlayer(mButton1_1,mButton2_2,mButton3_3,"X")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer1_score(mSetting.getPlayer1_score() + 1);
                    callSnackbar(mSetting.getPlayer1());
                    setResultOfScore();
                }
                else if (checkPlayer(mButton1_1,mButton1_2,mButton1_3,"O") ||
                        checkPlayer(mButton1_1,mButton2_1,mButton3_1,"O") ||
                        checkPlayer(mButton1_1,mButton2_2,mButton3_3,"O")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer2_score(mSetting.getPlayer2_score() + 1);
                    callSnackbar(mSetting.getPlayer2());
                    setResultOfScore();
                }else if (gameOverCounter == 9){
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.gameOver,Snackbar.LENGTH_SHORT).show();
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
                    gameOverCounter++;
                }
                if (checkPlayer(mButton1_1,mButton1_2,mButton1_3,"X") ||
                        checkPlayer(mButton1_2,mButton2_2,mButton3_2,"X")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer1_score(mSetting.getPlayer1_score() + 1);
                    callSnackbar(mSetting.getPlayer1());
                    setResultOfScore();
                }
                else if (checkPlayer(mButton1_1,mButton1_2,mButton1_3,"O") ||
                        checkPlayer(mButton1_2,mButton2_2,mButton3_2,"O")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer2_score(mSetting.getPlayer2_score() + 1);
                    callSnackbar(mSetting.getPlayer2());
                    setResultOfScore();
                }else if (gameOverCounter == 9){
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.gameOver,Snackbar.LENGTH_SHORT).show();
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
                    gameOverCounter++;
                }
                if (checkPlayer(mButton1_1,mButton1_2,mButton1_3,"X") ||
                        checkPlayer(mButton1_3,mButton2_3,mButton3_3,"X") ||
                        checkPlayer(mButton1_3,mButton2_2,mButton3_1,"X")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer1_score(mSetting.getPlayer1_score() + 1);
                    callSnackbar(mSetting.getPlayer1());
                    setResultOfScore();
                }
                else if (checkPlayer(mButton1_1,mButton1_2,mButton1_3,"O") ||
                        checkPlayer(mButton1_3,mButton2_3,mButton3_3,"O") ||
                        checkPlayer(mButton1_3,mButton2_2,mButton3_1,"O")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer2_score(mSetting.getPlayer2_score() + 1);
                    callSnackbar(mSetting.getPlayer2());
                    setResultOfScore();
                }else if (gameOverCounter == 9){
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.gameOver,Snackbar.LENGTH_SHORT).show();
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
                    gameOverCounter++;
                }
                if (checkPlayer(mButton2_1,mButton2_2,mButton2_3,"X") ||
                        checkPlayer(mButton1_1,mButton2_1,mButton3_1,"X")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer1_score(mSetting.getPlayer1_score() + 1);
                    callSnackbar(mSetting.getPlayer1());
                    setResultOfScore();
                }
                else if (checkPlayer(mButton2_1,mButton2_2,mButton2_3,"O") ||
                        checkPlayer(mButton1_1,mButton2_1,mButton3_1,"O")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer2_score(mSetting.getPlayer2_score() + 1);
                    callSnackbar(mSetting.getPlayer2());
                    setResultOfScore();
                }else if (gameOverCounter == 9){
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.gameOver,Snackbar.LENGTH_SHORT).show();
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
                    gameOverCounter++;
                }
                if (checkPlayer(mButton1_2,mButton2_2,mButton3_2,"X") ||
                        checkPlayer(mButton2_1,mButton2_2,mButton2_3,"X")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer1_score(mSetting.getPlayer1_score() + 1);
                    callSnackbar(mSetting.getPlayer1());
                    setResultOfScore();
                }
                else if (checkPlayer(mButton1_2,mButton2_2,mButton3_2,"O") ||
                        checkPlayer(mButton2_1,mButton2_2,mButton3_2,"O")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer2_score(mSetting.getPlayer2_score() + 1);
                    callSnackbar(mSetting.getPlayer2());
                    setResultOfScore();
                }else if (gameOverCounter == 9){
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.gameOver,Snackbar.LENGTH_SHORT).show();
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
                    gameOverCounter++;
                }
                if (checkPlayer(mButton1_3,mButton2_3,mButton3_3,"X") ||
                        checkPlayer(mButton2_1,mButton2_2,mButton2_3,"X")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer1_score(mSetting.getPlayer1_score() + 1);
                    callSnackbar(mSetting.getPlayer1());
                    setResultOfScore();
                }
                else if (checkPlayer(mButton1_3,mButton2_3,mButton3_3,"O") ||
                        checkPlayer(mButton2_1,mButton2_2,mButton2_3,"O")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer2_score(mSetting.getPlayer2_score() + 1);
                    callSnackbar(mSetting.getPlayer2());
                    setResultOfScore();
                }else if (gameOverCounter == 9){
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.gameOver,Snackbar.LENGTH_SHORT).show();
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
                    gameOverCounter++;
                }
                if (checkPlayer(mButton1_1,mButton2_1,mButton3_1,"X") ||
                        checkPlayer(mButton3_1,mButton3_2,mButton3_3,"X") ||
                        checkPlayer(mButton1_3,mButton2_2,mButton3_1,"X")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer1_score(mSetting.getPlayer1_score() + 1);
                    callSnackbar(mSetting.getPlayer1());
                    setResultOfScore();
                }
                else if (checkPlayer(mButton1_1,mButton2_1,mButton3_1,"O") ||
                        checkPlayer(mButton3_1,mButton3_2,mButton3_3,"O") ||
                        checkPlayer(mButton1_3,mButton2_2,mButton3_1,"O")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer2_score(mSetting.getPlayer2_score() + 1);
                    callSnackbar(mSetting.getPlayer2());
                    setResultOfScore();
                }else if (gameOverCounter == 9){
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.gameOver,Snackbar.LENGTH_SHORT).show();
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
                    gameOverCounter++;
                }
                if (checkPlayer(mButton3_1,mButton3_2,mButton3_3,"X") ||
                        checkPlayer(mButton1_2,mButton2_2,mButton3_2,"X")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer1_score(mSetting.getPlayer1_score() + 1);
                    callSnackbar(mSetting.getPlayer1());
                    setResultOfScore();
                }
                else if (checkPlayer(mButton3_1,mButton3_2,mButton3_3,"O") ||
                        checkPlayer(mButton1_2,mButton2_2,mButton3_2,"O")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer2_score(mSetting.getPlayer2_score() + 1);
                    callSnackbar(mSetting.getPlayer2());
                    setResultOfScore();
                }else if (gameOverCounter == 9){
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.gameOver,Snackbar.LENGTH_SHORT).show();
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
                    gameOverCounter++;
                }
                if (checkPlayer(mButton1_3,mButton2_3,mButton3_3,"X") ||
                        checkPlayer(mButton3_1,mButton3_2,mButton3_3,"X") ||
                        checkPlayer(mButton1_1,mButton2_2,mButton3_3,"X")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer1_score(mSetting.getPlayer1_score() + 1);
                    callSnackbar(mSetting.getPlayer1());
                    setResultOfScore();
                }
                else if (checkPlayer(mButton1_3,mButton2_3,mButton3_3,"O") ||
                        checkPlayer(mButton3_1,mButton3_2,mButton3_3,"O") ||
                        checkPlayer(mButton1_1,mButton2_2,mButton3_3,"O")){
                    disableButton();
                    flagGameOver = true;
                    mSetting.setPlayer2_score(mSetting.getPlayer2_score() + 1);
                    callSnackbar(mSetting.getPlayer2());
                    setResultOfScore();
                }else if (gameOverCounter == 9){
                    Snackbar.make(mFrameLayoutTicTacToe,R.string.gameOver,Snackbar.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void callSnackbar(String player) {
        Snackbar.make(mFrameLayoutTicTacToe, player + " is Winner", Snackbar.LENGTH_SHORT).show();
    }

    private void setResultOfScore() {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_SETTING,mSetting);
        getActivity().setResult(Activity.RESULT_OK,intent);
    }

    public interface OnDataPass {
        public void onDataPass(String data);
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