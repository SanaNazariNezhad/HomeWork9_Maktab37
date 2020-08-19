package org.maktab.homework9_maktab37;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.material.snackbar.Snackbar;

public class _4InARowFragment extends Fragment {
    public static final String BUNDLE_KEY_PLAYER = "player";
    public static final String BUNDLE_KEY_COUNTER_1 = "mCounter1";
    public static final String BUNDLE_KEY_COUNTER_2 = "mCounter2";
    public static final String BUNDLE_KEY_COUNTER_3 = "mCounter3";
    public static final String BUNDLE_KEY_COUNTER_4 = "mCounter4";
    public static final String BUNDLE_KEY_COUNTER_5 = "mCounter5";
    public static final String BUNDLE_KEY_COLOR_OF_BUTTONS_1 = "colorOfButtons1";
    public static final String BUNDLE_KEY_COLOR_OF_BUTTONS_2 = "colorOfButtons2";
    public static final String BUNDLE_KEY_COLOR_OF_BUTTONS_3 = "colorOfButtons3";
    public static final String BUNDLE_KEY_COLOR_OF_BUTTONS_4 = "colorOfButtons4";
    public static final String BUNDLE_KEY_COLOR_OF_BUTTONS_5 = "colorOfButtons5";
    public static final String BUNDLE_KEY_FLAG_OF_END = "flagOfEnd";
    private Button mButton1_1, mButton1_2, mButton1_3, mButton1_4, mButton1_5, mButton2_1, mButton2_2,
            mButton2_3, mButton2_4, mButton2_5, mButton3_1, mButton3_2, mButton3_3, mButton3_4, mButton3_5,
            mButton4_1, mButton4_2, mButton4_3, mButton4_4, mButton4_5, mButton5_1, mButton5_2, mButton5_3,
            mButton5_4, mButton5_5;
    private int player;
    private int mCounter1, mCounter2, mCounter3, mCounter4, mCounter5;
    private FrameLayout mFrameLayout4InARow;
    private int[][] mColorOfBtn;
    private boolean flag;

    public _4InARowFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        player = 1;
        mCounter1 = 0;
        mCounter2 = 0;
        mCounter3 = 0;
        mCounter4 = 0;
        mCounter5 = 0;
        mColorOfBtn = new int[5][5];

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState != null){
            player = savedInstanceState.getInt(BUNDLE_KEY_PLAYER);
            mCounter1 = savedInstanceState.getInt(BUNDLE_KEY_COUNTER_1);
            mCounter2 = savedInstanceState.getInt(BUNDLE_KEY_COUNTER_2);
            mCounter3 = savedInstanceState.getInt(BUNDLE_KEY_COUNTER_3);
            mCounter4 = savedInstanceState.getInt(BUNDLE_KEY_COUNTER_4);
            mCounter5 = savedInstanceState.getInt(BUNDLE_KEY_COUNTER_5);
            mColorOfBtn[0] = savedInstanceState.getIntArray(BUNDLE_KEY_COLOR_OF_BUTTONS_1);
            mColorOfBtn[1] = savedInstanceState.getIntArray(BUNDLE_KEY_COLOR_OF_BUTTONS_2);
            mColorOfBtn[2] = savedInstanceState.getIntArray(BUNDLE_KEY_COLOR_OF_BUTTONS_3);
            mColorOfBtn[3] = savedInstanceState.getIntArray(BUNDLE_KEY_COLOR_OF_BUTTONS_4);
            mColorOfBtn[4] = savedInstanceState.getIntArray(BUNDLE_KEY_COLOR_OF_BUTTONS_5);
            flag = savedInstanceState.getBoolean(BUNDLE_KEY_FLAG_OF_END);
        }
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__4_in_a_row, container, false);
        findViews(view);
        checkColor();
        listeners();
        if (flag)
            disableButton();
        return view;
    }

    private void listeners() {
        mButton1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnOne();
            }
        });
        mButton2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnOne();
            }
        });
        mButton3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnOne();
            }
        });
        mButton4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnOne();
            }
        });
        mButton5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnOne();
            }
        });
        mButton1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnTwo();
            }
        });
        mButton2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnTwo();
            }
        });
        mButton3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnTwo();
            }
        });
        mButton4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnTwo();
            }
        });
        mButton5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnTwo();
            }
        });
        mButton1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnThree();
            }
        });
        mButton2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnThree();
            }
        });
        mButton3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnThree();
            }
        });
        mButton4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnThree();
            }
        });
        mButton5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnThree();
            }
        });
        mButton1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnFour();
            }
        });
        mButton2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnFour();
            }
        });
        mButton3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnFour();
            }
        });
        mButton4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnFour();
            }
        });
        mButton5_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnFour();
            }
        });
        mButton1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnFive();
            }
        });
        mButton2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnFive();
            }
        });
        mButton3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnFive();
            }
        });
        mButton4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnFive();
            }
        });
        mButton5_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingColumnFive();
            }
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(BUNDLE_KEY_PLAYER,player);
        outState.putInt(BUNDLE_KEY_COUNTER_1,mCounter1);
        outState.putInt(BUNDLE_KEY_COUNTER_2,mCounter2);
        outState.putInt(BUNDLE_KEY_COUNTER_3,mCounter3);
        outState.putInt(BUNDLE_KEY_COUNTER_4,mCounter4);
        outState.putInt(BUNDLE_KEY_COUNTER_5,mCounter5);
        outState.putBoolean(BUNDLE_KEY_FLAG_OF_END,flag);
        outState.putIntArray(BUNDLE_KEY_COLOR_OF_BUTTONS_1,mColorOfBtn[0]);
        outState.putIntArray(BUNDLE_KEY_COLOR_OF_BUTTONS_2,mColorOfBtn[1]);
        outState.putIntArray(BUNDLE_KEY_COLOR_OF_BUTTONS_3,mColorOfBtn[2]);
        outState.putIntArray(BUNDLE_KEY_COLOR_OF_BUTTONS_4,mColorOfBtn[3]);
        outState.putIntArray(BUNDLE_KEY_COLOR_OF_BUTTONS_5,mColorOfBtn[4]);
    }

    private void checkColor(){
        if (mColorOfBtn[0][0] == 1){
            mButton1_1.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[0][0] == 2){
            mButton1_1.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[0][1] == 1){
            mButton1_2.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[0][1] == 2){
            mButton1_2.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[0][2] == 1){
            mButton1_3.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[0][2] == 2){
            mButton1_3.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[0][3] == 1){
            mButton1_4.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[0][3] == 2){
            mButton1_4.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[0][4] == 1){
            mButton1_5.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[0][4] == 2){
            mButton1_5.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[1][0] == 1){
            mButton2_1.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[1][0] == 2){
            mButton2_1.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[1][1] == 1){
            mButton2_2.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[1][1] == 2){
            mButton2_2.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[1][2] == 1){
            mButton2_3.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[1][2] == 2){
            mButton2_3.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[1][3] == 1){
            mButton2_4.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[1][3] == 2){
            mButton2_4.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[1][4] == 1){
            mButton2_5.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[1][4] == 2){
            mButton2_5.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[2][0] == 1){
            mButton3_1.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[2][0] == 2){
            mButton3_1.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[2][1] == 1){
            mButton3_2.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[2][1] == 2){
            mButton3_2.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[2][2] == 1){
            mButton3_3.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[2][2] == 2){
            mButton3_3.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[2][3] == 1){
            mButton3_4.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[2][3] == 2){
            mButton3_4.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[2][4] == 1){
            mButton3_5.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[2][4] == 2){
            mButton3_5.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[3][0] == 1){
            mButton4_1.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[3][0] == 2){
            mButton4_1.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[3][1] == 1){
            mButton4_2.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[3][1] == 2){
            mButton4_2.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[3][2] == 1){
            mButton4_3.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[3][2] == 2){
            mButton4_3.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[3][3] == 1){
            mButton4_4.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[3][3] == 2){
            mButton4_4.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[3][4] == 1){
            mButton4_5.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[3][4] == 2){
            mButton4_5.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[4][0] == 1){
            mButton5_1.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[4][0] == 2){
            mButton5_1.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[4][1] == 1){
            mButton5_2.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[4][1] == 2){
            mButton5_2.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[4][2] == 1){
            mButton5_3.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[4][2] == 2){
            mButton5_3.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[4][3] == 1){
            mButton5_4.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[4][3] == 2){
            mButton5_4.setBackgroundResource(R.color.player2_red);
        }
        if (mColorOfBtn[4][4] == 1){
            mButton5_5.setBackgroundResource(R.color.player1_blue);
        }else if (mColorOfBtn[4][4] == 2){
            mButton5_5.setBackgroundResource(R.color.player2_red);
        }
    }

    private void checkingColumnOne() {
        if (mCounter1 != 5) {
            if (mCounter1 == 0) {
                if (player % 2 != 0) {
                    mButton5_1.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[4][0] = 1;
                } else {
                    mButton5_1.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[4][0] = 2;
                }
                checkingButtons(5,1);
                player++;
                mCounter1++;
            } else if (mCounter1 == 1) {
                if (player % 2 != 0) {
                    mButton4_1.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[3][0] = 1;
                } else {
                    mButton4_1.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[3][0] = 2;
                }
                checkingButtons(4,1);
                player++;
                mCounter1++;
            } else if (mCounter1 == 2) {
                if (player % 2 != 0) {
                    mButton3_1.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[2][0] = 1;
                } else {
                    mButton3_1.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[2][0] = 2;
                }
                checkingButtons(3,1);
                player++;
                mCounter1++;
            } else if (mCounter1 == 3) {
                if (player % 2 != 0) {
                    mButton2_1.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[1][0] = 1;
                } else {
                    mButton2_1.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[1][0] = 2;
                }
                checkingButtons(2,1);
                player++;
                mCounter1++;
            } else if (mCounter1 == 4) {
                if (player % 2 != 0) {
                    mButton1_1.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[0][0] = 1;
                } else {
                    mButton1_1.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[0][0] = 2;
                }
                checkingButtons(1,1);
                player++;
                mCounter1++;
            }
        }
        checkingGameOver();
    }

    private void checkingColumnTwo() {
        if (mCounter2 != 5) {
            if (mCounter2 == 0) {
                if (player % 2 != 0) {
                    mButton5_2.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[4][1] = 1;
                } else {
                    mButton5_2.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[4][1] = 2;
                }
                checkingButtons(5,2);
                player++;
                mCounter2++;
            } else if (mCounter2 == 1) {
                if (player % 2 != 0) {
                    mButton4_2.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[3][1] = 1;
                } else {
                    mButton4_2.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[3][1] = 2;
                }
                checkingButtons(4,2);
                player++;
                mCounter2++;
            } else if (mCounter2 == 2) {
                if (player % 2 != 0) {
                    mButton3_2.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[2][1] = 1;
                } else {
                    mButton3_2.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[2][1] = 2;
                }
                checkingButtons(3,2);
                player++;
                mCounter2++;
            } else if (mCounter2 == 3) {
                if (player % 2 != 0) {
                    mButton2_2.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[1][1] = 1;
                } else {
                    mButton2_2.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[1][1] = 2;
                }
                checkingButtons(2,2);
                player++;
                mCounter2++;
            } else if (mCounter2 == 4) {
                if (player % 2 != 0) {
                    mButton1_2.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[0][1] = 1;
                } else {
                    mButton1_2.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[0][1] = 2;
                }
                checkingButtons(1,2);
                player++;
                mCounter2++;
            }
        }
        checkingGameOver();
    }

    private void checkingColumnThree() {
        if (mCounter3 != 5) {
            if (mCounter3 == 0) {
                if (player % 2 != 0) {
                    mButton5_3.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[4][2] = 1;
                } else {
                    mButton5_3.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[4][2] = 2;
                }
                checkingButtons(5,3);
                player++;
                mCounter3++;
            } else if (mCounter3 == 1) {
                if (player % 2 != 0) {
                    mButton4_3.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[3][2] = 1;
                } else {
                    mButton4_3.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[3][2] = 2;
                }
                checkingButtons(4,3);
                player++;
                mCounter3++;
            } else if (mCounter3 == 2) {
                if (player % 2 != 0) {
                    mButton3_3.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[2][2] = 1;
                } else {
                    mButton3_3.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[2][2] = 2;
                }
                checkingButtons(3,3);
                player++;
                mCounter3++;
            } else if (mCounter3 == 3) {
                if (player % 2 != 0) {
                    mButton2_3.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[1][2] = 1;
                } else {
                    mButton2_3.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[1][2] = 2;
                }
                checkingButtons(2,3);
                player++;
                mCounter3++;
            } else if (mCounter3 == 4) {
                if (player % 2 != 0) {
                    mButton1_3.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[0][2] = 1;
                } else {
                    mButton1_3.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[0][2] = 2;
                }
                checkingButtons(1,3);
                player++;
                mCounter3++;
            }
        }
        checkingGameOver();
    }

    private void checkingColumnFour() {
        if (mCounter4 != 5) {
            if (mCounter4 == 0) {
                if (player % 2 != 0) {
                    mButton5_4.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[4][3] = 1;
                } else {
                    mButton5_4.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[4][3] = 2;
                }
                checkingButtons(5,4);
                player++;
                mCounter4++;
            } else if (mCounter4 == 1) {
                if (player % 2 != 0) {
                    mButton4_4.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[3][3] = 1;
                } else {
                    mButton4_4.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[3][3] = 2;
                }
                checkingButtons(4,4);
                player++;
                mCounter4++;
            } else if (mCounter4 == 2) {
                if (player % 2 != 0) {
                    mButton3_4.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[2][3] = 1;
                } else {
                    mButton3_4.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[2][3] = 2;
                }
                checkingButtons(3,4);
                player++;
                mCounter4++;
            } else if (mCounter4 == 3) {
                if (player % 2 != 0) {
                    mButton2_4.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[1][3] = 1;
                } else {
                    mButton2_4.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[1][3] = 2;
                }
                checkingButtons(2,4);
                player++;
                mCounter4++;
            } else if (mCounter4 == 4) {
                if (player % 2 != 0) {
                    mButton1_4.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[0][3] = 1;
                } else {
                    mButton1_4.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[0][3] = 2;
                }
                checkingButtons(1,4);
                player++;
                mCounter4++;
            }
        }
        checkingGameOver();
    }

    private void checkingColumnFive() {
        if (mCounter5 != 5) {
            if (mCounter5 == 0) {
                if (player % 2 != 0) {
                    mButton5_5.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[4][4] = 1;
                } else {
                    mButton5_5.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[4][4] = 2;
                }
                checkingButtons(5,5);
                player++;
                mCounter5++;
            } else if (mCounter5 == 1) {
                if (player % 2 != 0) {
                    mButton4_5.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[3][4] = 1;
                } else {
                    mButton4_5.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[3][4] = 2;
                }
                checkingButtons(4,5);
                player++;
                mCounter5++;
            } else if (mCounter5 == 2) {
                if (player % 2 != 0) {
                    mButton3_5.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[2][4] = 1;
                } else {
                    mButton3_5.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[2][4] = 2;
                }
                checkingButtons(3,5);
                player++;
                mCounter5++;
            } else if (mCounter5 == 3) {
                if (player % 2 != 0) {
                    mButton2_5.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[1][4] = 1;
                } else {
                    mButton2_5.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[1][4] = 2;
                }
                checkingButtons(2,5);
                player++;
                mCounter5++;
            } else if (mCounter5 == 4) {
                if (player % 2 != 0) {
                    mButton1_5.setBackgroundResource(R.color.player1_blue);
                    mColorOfBtn[0][4] = 1;
                } else {
                    mButton1_5.setBackgroundResource(R.color.player2_red);
                    mColorOfBtn[0][4] = 2;
                }
                checkingButtons(1,5);
                player++;
                mCounter5++;
            }
        }
        checkingGameOver();
    }

    private void checkingGameOver() {
        if (mCounter1 == 5 && mCounter2 == 5 && mCounter3 == 5 && mCounter4 == 5 && mCounter5 == 5) {
            Snackbar.make(mFrameLayout4InARow, R.string.gameOver, Snackbar.LENGTH_SHORT).show();
            disableButton();
            flag = true;
        }
    }

    private void disableButton() {
        mButton1_1.setClickable(false);
        mButton1_2.setClickable(false);
        mButton1_3.setClickable(false);
        mButton1_4.setClickable(false);
        mButton1_5.setClickable(false);
        mButton2_1.setClickable(false);
        mButton2_2.setClickable(false);
        mButton2_3.setClickable(false);
        mButton2_4.setClickable(false);
        mButton2_5.setClickable(false);
        mButton3_1.setClickable(false);
        mButton3_2.setClickable(false);
        mButton3_3.setClickable(false);
        mButton3_4.setClickable(false);
        mButton3_5.setClickable(false);
        mButton4_1.setClickable(false);
        mButton4_2.setClickable(false);
        mButton4_3.setClickable(false);
        mButton4_4.setClickable(false);
        mButton4_5.setClickable(false);
        mButton5_1.setClickable(false);
        mButton5_2.setClickable(false);
        mButton5_3.setClickable(false);
        mButton5_4.setClickable(false);
        mButton5_5.setClickable(false);
    }

    private void findViews(View view) {
        mButton1_1 = view.findViewById(R.id.button1_1);
        mButton1_2 = view.findViewById(R.id.button1_2);
        mButton1_3 = view.findViewById(R.id.button1_3);
        mButton1_4 = view.findViewById(R.id.button1_4);
        mButton1_5 = view.findViewById(R.id.button1_5);
        mButton2_1 = view.findViewById(R.id.button2_1);
        mButton2_2 = view.findViewById(R.id.button2_2);
        mButton2_3 = view.findViewById(R.id.button2_3);
        mButton2_4 = view.findViewById(R.id.button2_4);
        mButton2_5 = view.findViewById(R.id.button2_5);
        mButton3_1 = view.findViewById(R.id.button3_1);
        mButton3_2 = view.findViewById(R.id.button3_2);
        mButton3_3 = view.findViewById(R.id.button3_3);
        mButton3_4 = view.findViewById(R.id.button3_4);
        mButton3_5 = view.findViewById(R.id.button3_5);
        mButton4_1 = view.findViewById(R.id.button4_1);
        mButton4_2 = view.findViewById(R.id.button4_2);
        mButton4_3 = view.findViewById(R.id.button4_3);
        mButton4_4 = view.findViewById(R.id.button4_4);
        mButton4_5 = view.findViewById(R.id.button4_5);
        mButton5_1 = view.findViewById(R.id.button5_1);
        mButton5_2 = view.findViewById(R.id.button5_2);
        mButton5_3 = view.findViewById(R.id.button5_3);
        mButton5_4 = view.findViewById(R.id.button5_4);
        mButton5_5 = view.findViewById(R.id.button5_5);

        mFrameLayout4InARow = view.findViewById(R.id.framelayout_4inARow);
    }

    private void checkingWinnerOne(int[] arr) {
        if (((mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[2]][arr[3]]) && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[4]][arr[5]]) &&
                (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[6]][arr[7]])) || ((mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[8]][arr[9]])
                && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[10]][arr[11]]) && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[12]][arr[13]]))
                || ((mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[14]][arr[15]]) && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[16]][arr[17]])
                && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[18]][arr[19]]))) {
            if (mColorOfBtn[arr[0]][arr[1]] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
                flag = true;
            } else if (mColorOfBtn[arr[0]][arr[1]] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
                flag = true;
            }
        }
    }

    private void checkingWinnerTwo(int[] arr) {
        if (((mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[0]][arr[2]]) && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[0]][arr[3]]) &&
                (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[0]][arr[4]])) || ((mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[5]][arr[6]])
                && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[7]][arr[8]]) && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[9]][arr[10]])) ||
                ((mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[11]][arr[1]]) && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[12]][arr[1]])
                        && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[13]][arr[1]])) || ((mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[14]][arr[15]])
                && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[16]][arr[17]]) && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[18]][arr[19]]))) {
            if (mColorOfBtn[arr[0]][arr[1]] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
                flag = true;
            } else if (mColorOfBtn[arr[0]][arr[1]] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
                flag = true;
            }
        }
    }

    private void checkingWinnerThree(int[] arr) {
        if (((mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[0]][0]) && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[0]][arr[2]]) &&
                (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[0]][arr[3]])) || ((mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[0]][arr[2]])
                && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[0]][arr[3]]) && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[0]][4])) ||
                ((mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[0][arr[1]]) && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[4]][arr[1]])
                        && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[5]][arr[1]])) || ((mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[4]][arr[1]])
                && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[5]][arr[1]]) && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[4][arr[1]])) ||
                ((mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[6]][arr[7]]) && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[8]][arr[9]]) &&
                        (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[10]][arr[11]])) || ((mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[12]][arr[13]])
                && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[14]][arr[15]]) && (mColorOfBtn[arr[0]][arr[1]] == mColorOfBtn[arr[16]][arr[17]]))) {
            if (mColorOfBtn[arr[0]][arr[1]] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
                flag = true;
            } else if (mColorOfBtn[arr[0]][arr[1]] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
                flag = true;
            }
        }
    }

    private void checkingWinnerFour() {
        if (((mColorOfBtn[2][2] == mColorOfBtn[2][0]) && (mColorOfBtn[2][2] == mColorOfBtn[2][1]) &&
                (mColorOfBtn[2][2] == mColorOfBtn[2][3])) || ((mColorOfBtn[2][2] == mColorOfBtn[2][1])
                && (mColorOfBtn[2][2] == mColorOfBtn[2][3]) && (mColorOfBtn[2][2] == mColorOfBtn[2][4])) ||
                ((mColorOfBtn[2][2] == mColorOfBtn[0][2]) && (mColorOfBtn[2][2] == mColorOfBtn[1][2])
                        && (mColorOfBtn[2][2] == mColorOfBtn[3][2])) || ((mColorOfBtn[2][2] == mColorOfBtn[1][2]) &&
                (mColorOfBtn[2][2] == mColorOfBtn[3][2]) && (mColorOfBtn[2][2] == mColorOfBtn[4][2])) ||
                ((mColorOfBtn[2][2] == mColorOfBtn[0][4]) && (mColorOfBtn[2][2] == mColorOfBtn[1][3])
                        && (mColorOfBtn[2][2] == mColorOfBtn[3][1])) || ((mColorOfBtn[2][2] == mColorOfBtn[1][3]) &&
                (mColorOfBtn[2][2] == mColorOfBtn[3][1]) && (mColorOfBtn[2][2] == mColorOfBtn[4][0])) ||
                ((mColorOfBtn[2][2] == mColorOfBtn[0][0]) && (mColorOfBtn[2][2] == mColorOfBtn[1][1])
                        && (mColorOfBtn[2][2] == mColorOfBtn[3][3])) || ((mColorOfBtn[2][2] == mColorOfBtn[1][1]) &&
                (mColorOfBtn[2][2] == mColorOfBtn[3][3]) && (mColorOfBtn[2][2] == mColorOfBtn[4][4]))) {
            if (mColorOfBtn[2][2] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
                flag = true;
            } else if (mColorOfBtn[2][2] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
                flag = true;
            }
        }
    }

    private void checkingButtons(int row , int column){
        if (row == 1 && column ==1){
            int [] parameters = {0,0,0,1,0,2,0,3,1,0,2,0,3,0,1,1,2,2,3,3};
            checkingWinnerOne(parameters);
        }else if (row == 1 && column ==2){
            int [] parameters = {0,1,0,2,3,0,2,0,3,0,4,1,2,3,1,2,2,3,3,4};
            checkingWinnerTwo(parameters);
        }else if (row == 1 && column ==3){
            int[] parameters = {0,2,0,0,0,1,0,3,0,1,0,3,0,4,1,2,2,2,3,2};
            checkingWinnerOne(parameters);
        }else if (row == 1 && column ==4){
            int[] parameters = {0,3,0,1,2,0,1,0,2,0,4,1,2,3,1,2,2,1,3,0};
            checkingWinnerTwo(parameters);
        }else if (row == 1 && column ==5){
            int[] parameters = {0,4,0,1,0,2,0,3,1,4,2,4,3,4,1,3,2,2,3,1};
            checkingWinnerOne(parameters);
        }else if (row == 2 && column ==1){
            int[] parameters = {1,0,1,2,3,2,0,3,0,4,0,0,2,3,2,1,3,2,4,3};
            checkingWinnerTwo(parameters);
        }else if (row == 2 && column ==2){
            int[] parameters = {1,1,2,3,2,3,0,0,2,2,3,3,2,2,3,3,4,4};
            checkingWinnerThree(parameters);
        }else if (row == 2 && column ==3){
            int[] parameters = {1,2,1,3,2,3,0,1,2,3,3,4,0,3,2,1,3,0};
            checkingWinnerThree(parameters);
        }else if (row == 2 && column ==4){
            int[] parameters = {1,3,1,2,2,3,0,4,2,2,3,1,2,2,3,1,4,0};
            checkingWinnerThree(parameters);
        }else if (row == 2 && column ==5){
            int[] parameters = {1,4,1,2,3,0,4,2,4,3,4,2,3,4,2,3,3,2,4,1};
            checkingWinnerTwo(parameters);
        }else if (row == 3 && column ==1){
            int[] parameters = {2,0,2,1,2,2,2,3,0,0,1,0,3,0,1,0,3,0,4,0};
            checkingWinnerOne(parameters);
        }else if (row == 3 && column ==2){
            int[] parameters = {2,1,2,3,1,3,1,0,3,2,4,3,0,3,1,2,3,0};
            checkingWinnerThree(parameters);
        }else if (row == 3 && column ==3){
            checkingWinnerFour();
        }else if (row == 3 && column ==4){
            int[] parameters = {2,3,1,2,1,3,1,4,3,2,4,1,0,1,1,2,3,4};
            checkingWinnerThree(parameters);
        }else if (row == 3 && column ==5){
            int[] parameters = {2,4,0,4,1,4,3,4,1,4,3,4,4,4,2,1,2,2,2,3};
            checkingWinnerOne(parameters);
        }else if (row == 4 && column ==1){
            int[] parameters = {3,0,1,2,3,0,0,1,0,2,0,1,2,4,0,3,1,2,2,1};
            checkingWinnerTwo(parameters);
        }else if (row == 4 && column ==2){
            int[] parameters = {3,1,2,3,1,2,0,4,1,3,2,2,1,3,2,2,4,0};
            checkingWinnerThree(parameters);
        }else if (row == 4 && column ==3){
            int[] parameters = {3,2,1,3,1,2,1,0,2,1,4,3,1,4,2,3,4,1};
            checkingWinnerThree(parameters);
        }else if (row == 4 && column ==4){
            int[] parameters = {3,3,1,2,1,2,0,0,1,1,2,2,1,1,2,2,4,4};
            checkingWinnerThree(parameters);
        }else if (row == 4 && column ==5){
            int[] parameters = {3,4,1,2,3,0,4,1,4,2,4,1,2,4,0,1,1,2,2,3};
            checkingWinnerTwo(parameters);
        }else if (row == 5 && column ==1){
            int[] parameters = {4,0,4,1,4,2,4,3,1,0,2,0,3,0,1,3,2,2,3,1};
            checkingWinnerOne(parameters);
        }else if (row == 5 && column ==2){
            int[] parameters = {4,1,0,2,3,4,2,4,3,4,4,1,2,3,1,4,2,3,3,2};
            checkingWinnerTwo(parameters);
        }else if (row == 5 && column ==3){
            int[] parameters = {4,2,4,0,4,1,4,3,4,1,4,3,4,4,1,2,2,2,3,2};
            checkingWinnerOne(parameters);
        }else if (row == 5 && column ==4){
            int[] parameters = {4,3,0,1,2,4,1,4,2,4,4,1,2,3,1,0,2,1,3,2};
            checkingWinnerTwo(parameters);
        }else if (row == 5 && column ==5){
            int[] parameters = {4,4,4,1,4,2,4,3,1,4,2,4,3,4,1,1,2,2,3,3};
            checkingWinnerOne(parameters);
        }
    }
}