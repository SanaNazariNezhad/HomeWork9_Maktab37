package org.maktab.homework9_maktab37;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.material.snackbar.Snackbar;

public class _4InARowFragment extends Fragment {
    private Button mButton1_1, mButton1_2, mButton1_3, mButton1_4, mButton1_5, mButton2_1, mButton2_2,
            mButton2_3, mButton2_4, mButton2_5, mButton3_1, mButton3_2, mButton3_3, mButton3_4, mButton3_5,
            mButton4_1, mButton4_2, mButton4_3, mButton4_4, mButton4_5, mButton5_1, mButton5_2, mButton5_3,
            mButton5_4, mButton5_5;
    private short player;
    private short mCounter1, mCounter2, mCounter3, mCounter4, mCounter5;
    private FrameLayout mFrameLayout4InARow;
    private short[][] mColorOfBtn;

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
        mColorOfBtn = new short[5][5];

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__4_in_a_row, container, false);
        findViews(view);
        listeners();
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
                checkingBtn1_1();
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
                checkingBtn1_2();
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

    private void checkingBtn1_1() {
        if (((mColorOfBtn[0][0] == mColorOfBtn[0][1]) && (mColorOfBtn[0][0] == mColorOfBtn[0][2]) &&
                (mColorOfBtn[0][0] == mColorOfBtn[0][3])) || ((mColorOfBtn[0][0] == mColorOfBtn[1][0])
                && (mColorOfBtn[0][0] == mColorOfBtn[2][0]) && (mColorOfBtn[0][0] == mColorOfBtn[3][0]))
                || ((mColorOfBtn[0][0] == mColorOfBtn[1][1]) && (mColorOfBtn[0][0] == mColorOfBtn[2][2])
                && (mColorOfBtn[0][0] == mColorOfBtn[3][3]))) {
            if (mColorOfBtn[0][0] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }
            else if (mColorOfBtn[0][0] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }


        }
    }

    private void checkingBtn1_2() {
        if (((mColorOfBtn[0][1] == mColorOfBtn[0][0]) && (mColorOfBtn[0][1] == mColorOfBtn[0][2]) &&
                (mColorOfBtn[0][1] == mColorOfBtn[0][3])) ||((mColorOfBtn[0][1] == mColorOfBtn[0][2])
                && (mColorOfBtn[0][1] == mColorOfBtn[0][3]) && (mColorOfBtn[0][1] == mColorOfBtn[0][4])) ||
                ((mColorOfBtn[0][1] == mColorOfBtn[1][1]) && (mColorOfBtn[0][1] == mColorOfBtn[2][1])
                        && (mColorOfBtn[0][1] == mColorOfBtn[3][1])) || ((mColorOfBtn[0][1] == mColorOfBtn[1][2])
                && (mColorOfBtn[0][1] == mColorOfBtn[2][3]) && (mColorOfBtn[0][1] == mColorOfBtn[3][4]))) {
            if (mColorOfBtn[0][1] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }
            else if (mColorOfBtn[0][1] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }


        }
    }

    private void checkingBtn1_3() {
        if (((mColorOfBtn[0][2] == mColorOfBtn[0][0]) && (mColorOfBtn[0][2] == mColorOfBtn[0][1]) &&
                (mColorOfBtn[0][2] == mColorOfBtn[0][3])) ||((mColorOfBtn[0][2] == mColorOfBtn[0][1])
                && (mColorOfBtn[0][2] == mColorOfBtn[0][3]) && (mColorOfBtn[0][2] == mColorOfBtn[0][4])) ||
                ((mColorOfBtn[0][2] == mColorOfBtn[1][2]) && (mColorOfBtn[0][2] == mColorOfBtn[2][2])
                        && (mColorOfBtn[0][2] == mColorOfBtn[3][2])) ) {
            if (mColorOfBtn[0][2] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }
            else if (mColorOfBtn[0][2] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }


        }
    }

    private void checkingBtn1_4() {
        if (((mColorOfBtn[0][3] == mColorOfBtn[0][0]) && (mColorOfBtn[0][3] == mColorOfBtn[0][1]) &&
                (mColorOfBtn[0][3] == mColorOfBtn[0][2])) ||((mColorOfBtn[0][3] == mColorOfBtn[0][1])
                && (mColorOfBtn[0][3] == mColorOfBtn[0][2]) && (mColorOfBtn[0][3] == mColorOfBtn[0][4])) ||
                ((mColorOfBtn[0][3] == mColorOfBtn[1][3]) && (mColorOfBtn[0][3] == mColorOfBtn[2][3])
                        && (mColorOfBtn[0][3] == mColorOfBtn[3][3])) || ((mColorOfBtn[0][3] == mColorOfBtn[1][2])
                && (mColorOfBtn[0][3] == mColorOfBtn[2][1]) && (mColorOfBtn[0][3] == mColorOfBtn[3][0]))) {
            if (mColorOfBtn[0][3] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }
            else if (mColorOfBtn[0][3] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }


        }
    }

    private void checkingBtn1_5() {
        if (((mColorOfBtn[0][4] == mColorOfBtn[0][1]) && (mColorOfBtn[0][4] == mColorOfBtn[0][2]) &&
                (mColorOfBtn[0][4] == mColorOfBtn[0][3])) ||((mColorOfBtn[0][4] == mColorOfBtn[1][4])
                && (mColorOfBtn[0][4] == mColorOfBtn[2][4]) && (mColorOfBtn[0][4] == mColorOfBtn[3][4])) ||
                ((mColorOfBtn[0][4] == mColorOfBtn[1][3]) && (mColorOfBtn[0][4] == mColorOfBtn[2][2])
                        && (mColorOfBtn[0][4] == mColorOfBtn[3][1]))) {
            if (mColorOfBtn[0][4] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }
            else if (mColorOfBtn[0][4] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }


        }
    }

    private void checkingBtn2_1() {
        if (((mColorOfBtn[1][0] == mColorOfBtn[1][1]) && (mColorOfBtn[1][0] == mColorOfBtn[1][2]) &&
                (mColorOfBtn[1][0] == mColorOfBtn[1][3])) || ((mColorOfBtn[1][0] == mColorOfBtn[2][0])
                && (mColorOfBtn[1][0] == mColorOfBtn[3][0]) && (mColorOfBtn[1][0] == mColorOfBtn[4][0]))
                || ((mColorOfBtn[1][0] == mColorOfBtn[0][0]) && (mColorOfBtn[1][0] == mColorOfBtn[2][0])
                && (mColorOfBtn[1][0] == mColorOfBtn[3][0])) || ((mColorOfBtn[1][0] == mColorOfBtn[2][1])
                && (mColorOfBtn[1][0] == mColorOfBtn[3][2]) && (mColorOfBtn[1][0] == mColorOfBtn[4][3]))) {
            if (mColorOfBtn[1][0] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }
            else if (mColorOfBtn[1][0] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }


        }
    }

    private void checkingBtn2_2() {
        if (((mColorOfBtn[1][1] == mColorOfBtn[1][0]) && (mColorOfBtn[1][1] == mColorOfBtn[1][2]) &&
                (mColorOfBtn[1][1] == mColorOfBtn[1][3])) ||((mColorOfBtn[1][1] == mColorOfBtn[1][2])
                && (mColorOfBtn[1][1] == mColorOfBtn[1][3]) && (mColorOfBtn[1][1] == mColorOfBtn[1][4])) ||
                ((mColorOfBtn[1][1] == mColorOfBtn[0][1]) && (mColorOfBtn[1][1] == mColorOfBtn[2][1])
                        && (mColorOfBtn[1][1] == mColorOfBtn[3][1])) || ((mColorOfBtn[1][1] == mColorOfBtn[2][1])
                && (mColorOfBtn[1][1] == mColorOfBtn[3][1]) && (mColorOfBtn[1][1] == mColorOfBtn[4][1])) ||
                ((mColorOfBtn[1][1] == mColorOfBtn[0][0]) && (mColorOfBtn[1][1] == mColorOfBtn[2][2]) &&
                        (mColorOfBtn[1][1] == mColorOfBtn[3][3])) || ((mColorOfBtn[1][1] == mColorOfBtn[2][2])
                && (mColorOfBtn[1][1] == mColorOfBtn[3][3]) && (mColorOfBtn[1][1] == mColorOfBtn[4][4]))) {
            if (mColorOfBtn[1][1] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }
            else if (mColorOfBtn[1][1] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }


        }
    }

    private void checkingBtn2_3() {
        if (((mColorOfBtn[0][2] == mColorOfBtn[0][0]) && (mColorOfBtn[0][2] == mColorOfBtn[0][1]) &&
                (mColorOfBtn[0][2] == mColorOfBtn[0][3])) ||((mColorOfBtn[0][2] == mColorOfBtn[0][1])
                && (mColorOfBtn[0][2] == mColorOfBtn[0][3]) && (mColorOfBtn[0][2] == mColorOfBtn[0][4])) ||
                ((mColorOfBtn[0][2] == mColorOfBtn[1][2]) && (mColorOfBtn[0][2] == mColorOfBtn[2][2])
                        && (mColorOfBtn[0][2] == mColorOfBtn[3][2])) ) {
            if (mColorOfBtn[0][2] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }
            else if (mColorOfBtn[0][2] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }


        }
    }

    private void checkingBtn2_4() {
        if (((mColorOfBtn[0][3] == mColorOfBtn[0][0]) && (mColorOfBtn[0][3] == mColorOfBtn[0][1]) &&
                (mColorOfBtn[0][3] == mColorOfBtn[0][2])) ||((mColorOfBtn[0][3] == mColorOfBtn[0][1])
                && (mColorOfBtn[0][3] == mColorOfBtn[0][2]) && (mColorOfBtn[0][3] == mColorOfBtn[0][4])) ||
                ((mColorOfBtn[0][3] == mColorOfBtn[1][3]) && (mColorOfBtn[0][3] == mColorOfBtn[2][3])
                        && (mColorOfBtn[0][3] == mColorOfBtn[3][3])) || ((mColorOfBtn[0][3] == mColorOfBtn[1][2])
                && (mColorOfBtn[0][3] == mColorOfBtn[2][1]) && (mColorOfBtn[0][3] == mColorOfBtn[3][0]))) {
            if (mColorOfBtn[0][3] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }
            else if (mColorOfBtn[0][3] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }


        }
    }

    private void checkingBtn2_5() {
        if (((mColorOfBtn[0][4] == mColorOfBtn[0][1]) && (mColorOfBtn[0][4] == mColorOfBtn[0][2]) &&
                (mColorOfBtn[0][4] == mColorOfBtn[0][3])) ||((mColorOfBtn[0][4] == mColorOfBtn[1][4])
                && (mColorOfBtn[0][4] == mColorOfBtn[2][4]) && (mColorOfBtn[0][4] == mColorOfBtn[3][4])) ||
                ((mColorOfBtn[0][4] == mColorOfBtn[1][3]) && (mColorOfBtn[0][4] == mColorOfBtn[2][2])
                        && (mColorOfBtn[0][4] == mColorOfBtn[3][1]))) {
            if (mColorOfBtn[0][4] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }
            else if (mColorOfBtn[0][4] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }


        }
    }

    private void checkingBtn3_1() {
        if (((mColorOfBtn[2][0] == mColorOfBtn[2][1]) && (mColorOfBtn[2][0] == mColorOfBtn[2][2]) &&
                (mColorOfBtn[2][0] == mColorOfBtn[2][3])) || ((mColorOfBtn[2][0] == mColorOfBtn[0][0])
                && (mColorOfBtn[2][0] == mColorOfBtn[1][0]) && (mColorOfBtn[2][0] == mColorOfBtn[3][0]))
                || ((mColorOfBtn[2][0] == mColorOfBtn[1][0]) && (mColorOfBtn[2][0] == mColorOfBtn[3][0])
                && (mColorOfBtn[2][0] == mColorOfBtn[4][0]))) {
            if (mColorOfBtn[2][0] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }
            else if (mColorOfBtn[2][0] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }


        }
    }

    private void checkingBtn3_2() {
        if (((mColorOfBtn[2][1] == mColorOfBtn[2][0]) && (mColorOfBtn[2][1] == mColorOfBtn[2][2]) &&
                (mColorOfBtn[2][1] == mColorOfBtn[2][3])) ||((mColorOfBtn[2][1] == mColorOfBtn[2][2])
                && (mColorOfBtn[2][1] == mColorOfBtn[2][3]) && (mColorOfBtn[2][1] == mColorOfBtn[2][4])) ||
                ((mColorOfBtn[2][1] == mColorOfBtn[0][1]) && (mColorOfBtn[2][1] == mColorOfBtn[1][1])
                        && (mColorOfBtn[2][1] == mColorOfBtn[3][1])) || ((mColorOfBtn[2][1] == mColorOfBtn[1][1])
                && (mColorOfBtn[2][1] == mColorOfBtn[3][1]) && (mColorOfBtn[2][1] == mColorOfBtn[4][1])) ||
                ((mColorOfBtn[2][1] == mColorOfBtn[1][0]) && (mColorOfBtn[2][1] == mColorOfBtn[3][2]) &&
                        (mColorOfBtn[2][1] == mColorOfBtn[4][3])) || ((mColorOfBtn[2][1] == mColorOfBtn[0][3])
                && (mColorOfBtn[2][1] == mColorOfBtn[1][2]) && (mColorOfBtn[2][1] == mColorOfBtn[3][0]))) {
            if (mColorOfBtn[2][1] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }
            else if (mColorOfBtn[2][1] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }


        }
    }

    private void checkingBtn3_3() {
        if (((mColorOfBtn[2][2] == mColorOfBtn[2][0]) && (mColorOfBtn[2][2] == mColorOfBtn[2][1]) &&
                (mColorOfBtn[2][2] == mColorOfBtn[2][3])) ||((mColorOfBtn[2][2] == mColorOfBtn[2][1])
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
            }
            else if (mColorOfBtn[2][2] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }


        }
    }

    private void checkingBtn3_4() {
        if (((mColorOfBtn[2][3] == mColorOfBtn[2][0]) && (mColorOfBtn[2][3] == mColorOfBtn[2][1]) &&
                (mColorOfBtn[2][3] == mColorOfBtn[2][2])) ||((mColorOfBtn[2][3] == mColorOfBtn[2][1])
                && (mColorOfBtn[2][3] == mColorOfBtn[2][2]) && (mColorOfBtn[2][3] == mColorOfBtn[2][4])) ||
                ((mColorOfBtn[2][3] == mColorOfBtn[0][3]) && (mColorOfBtn[2][3] == mColorOfBtn[1][3])
                        && (mColorOfBtn[2][3] == mColorOfBtn[3][3])) || ((mColorOfBtn[2][3] == mColorOfBtn[1][3])
                && (mColorOfBtn[2][3] == mColorOfBtn[3][3]) && (mColorOfBtn[2][3] == mColorOfBtn[4][3])) ||
                ((mColorOfBtn[2][3] == mColorOfBtn[1][4]) && (mColorOfBtn[2][3] == mColorOfBtn[3][2]) &&
                        (mColorOfBtn[2][3] == mColorOfBtn[4][1])) || ((mColorOfBtn[2][3] == mColorOfBtn[0][1])
                && (mColorOfBtn[2][3] == mColorOfBtn[1][2]) && (mColorOfBtn[2][3] == mColorOfBtn[3][4]))) {
            if (mColorOfBtn[2][3] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }
            else if (mColorOfBtn[2][3] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }


        }
    }

    private void checkingBtn3_5() {
        if (((mColorOfBtn[2][4] == mColorOfBtn[0][4]) && (mColorOfBtn[2][4] == mColorOfBtn[1][4]) &&
                (mColorOfBtn[2][4] == mColorOfBtn[3][4])) ||((mColorOfBtn[2][4] == mColorOfBtn[1][4])
                && (mColorOfBtn[2][4] == mColorOfBtn[3][4]) && (mColorOfBtn[2][4] == mColorOfBtn[4][4])) ||
                ((mColorOfBtn[2][4] == mColorOfBtn[2][1]) && (mColorOfBtn[2][4] == mColorOfBtn[2][2])
                        && (mColorOfBtn[2][4] == mColorOfBtn[2][3]))) {
            if (mColorOfBtn[2][4] == 1) {
                Snackbar.make(mFrameLayout4InARow, R.string.player1_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }
            else if (mColorOfBtn[2][4] == 2) {
                Snackbar.make(mFrameLayout4InARow, R.string.player2_is_winner, Snackbar.LENGTH_SHORT).show();
                disableButton();
            }


        }
    }
}