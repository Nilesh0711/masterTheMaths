package com.example.masterbasicmaths;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    LinearLayout llnum, llop;
    LinearLayout tar1, tar2, tar3, tar4, tar5, tar6, tar7;
    TextView tvquestion;
    TextView txt1, txt2, txt3, txt4;
    TextView num1, num2, num3, num4, num5, num6, num7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llnum = findViewById(R.id.idLLnum);
        llop = findViewById(R.id.idLLop);
        tvquestion = findViewById(R.id.idTVquestion);
        txt1 = findViewById(R.id.idTVtxt1);
        txt2 = findViewById(R.id.idTVtxt2);
        txt3 = findViewById(R.id.idTVtxt3);
        txt4 = findViewById(R.id.idTVtxt4);
        num1 = findViewById(R.id.idTVnum1);
        num2 = findViewById(R.id.idTVnum2);
        num3 = findViewById(R.id.idTVnum3);
        num4 = findViewById(R.id.idTVnum4);
        num5 = findViewById(R.id.idTVnum5);
        num6 = findViewById(R.id.idTVnum6);
        num7 = findViewById(R.id.idTVnum7);
        tar1 = findViewById(R.id.idLLtarget1);
        tar2 = findViewById(R.id.idLLtarget2);
        tar3 = findViewById(R.id.idLLtarget3);
        tar4 = findViewById(R.id.idLLtarget4);
        tar5 = findViewById(R.id.idLLtarget5);
        tar6 = findViewById(R.id.idLLtarget6);
        tar7 = findViewById(R.id.idLLtarget7);

//        num1.setOnDragListener(dragListener);
//        num2.setOnDragListener(dragListener);
//        num3.setOnDragListener(dragListener);
//        num4.setOnDragListener(dragListener);
//        num5.setOnDragListener(dragListener);
//        num6.setOnDragListener(dragListener);
//        num7.setOnDragListener(dragListener);

//        tar1.setOnDragListener(dragListener);
//        tar2.setOnDragListener(dragListener);
//        tar3.setOnDragListener(dragListener);
//        tar4.setOnDragListener(dragListener);
//        tar5.setOnDragListener(dragListener);
//        tar6.setOnDragListener(dragListener);
//        tar7.setOnDragListener(dragListener);

        num1.setOnDragListener(dragListener);
        num2.setOnDragListener(dragListener);
        num3.setOnDragListener(dragListener);
        num4.setOnDragListener(dragListener);
        num5.setOnDragListener(dragListener);
        num6.setOnDragListener(dragListener);
        num7.setOnDragListener(dragListener);

        txt1.setOnLongClickListener(longClickListener);
        txt2.setOnLongClickListener(longClickListener);
        txt3.setOnLongClickListener(longClickListener);
        txt4.setOnLongClickListener(longClickListener);

        num1.setOnLongClickListener(longClickListener);
        num2.setOnLongClickListener(longClickListener);
        num3.setOnLongClickListener(longClickListener);
        num4.setOnLongClickListener(longClickListener);
        num5.setOnLongClickListener(longClickListener);
        num6.setOnLongClickListener(longClickListener);
        num7.setOnLongClickListener(longClickListener);


    }


    View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("iam", "nilesh");
            View.DragShadowBuilder dragShadowBuilder = new View.DragShadowBuilder(v);
            v.startDrag(data, dragShadowBuilder, v, 0);
            return true;
        }
    };

    View.OnDragListener dragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragevent = event.getAction();
            final View view = (View) event.getLocalState();
            switch (dragevent) {
                case DragEvent.ACTION_DRAG_ENTERED:

                    break;

                case DragEvent.ACTION_DRAG_EXITED:
                    break;

                case DragEvent.ACTION_DROP:
                    if ((v.getId() == R.id.idTVnum2 || v.getId() == R.id.idTVnum4 || v.getId() == R.id.idTVnum6
                    ) && view.getId() == R.id.idTVtxt1) {
                        swap(view, v);
                        checkAnswer(num1, num2, num3, num4, num5, num6, num7);
                    } else if ((v.getId() == R.id.idTVnum2 || v.getId() == R.id.idTVnum4 || v.getId() == R.id.idTVnum6
                    ) && view.getId() == R.id.idTVtxt2) {
                        swap(view, v);
                        checkAnswer(num1, num2, num3, num4, num5, num6, num7);
                    } else if ((v.getId() == R.id.idTVnum2 || v.getId() == R.id.idTVnum4 || v.getId() == R.id.idTVnum6
                    ) && view.getId() == R.id.idTVtxt3) {
                        swap(view, v);
                        checkAnswer(num1, num2, num3, num4, num5, num6, num7);
                    } else if ((v.getId() == R.id.idTVnum2 || v.getId() == R.id.idTVnum4 || v.getId() == R.id.idTVnum6
                    ) && view.getId() == R.id.idTVtxt4) {
                        swap(view, v);
                        checkAnswer(num1, num2, num3, num4, num5, num6, num7);
                    } else if ((view.getId() == R.id.idTVnum3 || view.getId() == R.id.idTVnum5 ||
                            view.getId() == R.id.idTVnum7) && v.getId() == R.id.idTVnum1) {
                        swap(view, v);
                        checkAnswer(num1, num2, num3, num4, num5, num6, num7);
                    } else if ((view.getId() == R.id.idTVnum1 || view.getId() == R.id.idTVnum5 ||
                            view.getId() == R.id.idTVnum7) && v.getId() == R.id.idTVnum3) {
                        swap(view, v);
                        checkAnswer(num1, num2, num3, num4, num5, num6, num7);
                    } else if ((view.getId() == R.id.idTVnum3 || view.getId() == R.id.idTVnum1 ||
                            view.getId() == R.id.idTVnum7) && v.getId() == R.id.idTVnum5) {
                        swap(view, v);
                        checkAnswer(num1, num2, num3, num4, num5, num6, num7);
                    } else if ((view.getId() == R.id.idTVnum3 || view.getId() == R.id.idTVnum5 ||
                            view.getId() == R.id.idTVnum1) && v.getId() == R.id.idTVnum7) {
                        swap(view, v);
                        checkAnswer(num1, num2, num3, num4, num5, num6, num7);
                    }
                    break;
            }

            return true;
        }
    };

    private void swap(View view, View v) {
        TextView newview1 = (TextView) v;
        TextView newview2 = (TextView) view;
        String temp = newview1.getText().toString();
        newview1.setText(newview2.getText().toString());
        newview2.setText(temp);

    }

    private void checkAnswer(TextView num1, TextView num2, TextView num3, TextView num4,
                             TextView num5, TextView num6, TextView num7) {

        String number1 = num1.getText().toString();
        String number2 = num2.getText().toString();
        String number3 = num3.getText().toString();
        String number4 = num4.getText().toString();
        String number5 = num5.getText().toString();
        String number6 = num6.getText().toString();
        String number7 = num7.getText().toString();

        String[] str = {number1, changeOp(number2), number3, changeOp(number4), number5, changeOp(number6), number7};

        if (!number1.isEmpty() && !number2.isEmpty() && !number3.isEmpty()
                && !number4.isEmpty() && !number5.isEmpty() && !number6.isEmpty() && !number7.isEmpty()) {
            StringBuffer sb = new StringBuffer();
            for (String s : str) {
                sb.append(s);
            }
            String val = sb.toString();
//            Log.d("temp1", "checkAnswer: " + val);
            String ans = evaluate(val);
            if (Objects.equals(ans, "10.0")) {
                tvquestion.setText("10");
            } else {
                tvquestion.setText("?");
            }
        } else {
            Toast.makeText(this, "Fill all details", Toast.LENGTH_SHORT).show();
        }

    }

    public static String evaluate(String expression) {
        char[] tokens = expression.toCharArray();
        List<String> list = new ArrayList<>();

        String s = "";

        String operator = "";
        String firstNum = "";
        String secondNum = "";

        boolean operationOnQueue = false;

        for (int i = 0; i < tokens.length; i++) {
            if (Character.isDigit(tokens[i])) {
                s += Character.toString(tokens[i]);
            } else {
                list.add(s);
                list.add(Character.toString(tokens[i]));

                if (operationOnQueue) {
                    operationOnQueue = false;
                    secondNum = s;

                    list.set(list.lastIndexOf(firstNum), eval(firstNum, operator, secondNum));
                    list.remove(list.lastIndexOf(operator));
                    list.remove(list.lastIndexOf(secondNum));
                }

                if (tokens[i] == '*' || tokens[i] == '/') {
                    operationOnQueue = true;

                    operator = Character.toString(tokens[i]);
                    firstNum = list.get(list.lastIndexOf(operator) - 1);
                }

                s = "";
            }

            if (i == tokens.length - 1 && s.length() > 0) {
                list.add(s);

                if (list.get(list.size() - 2).equals("*") || list.get(list.size() - 2).equals("/")) {
                    firstNum = list.get(list.size() - 3);
                    operator = list.get(list.size() - 2);
                    secondNum = list.get(list.size() - 1);

                    list.set(list.size() - 3, eval(firstNum, operator, secondNum));
                    list.remove(list.size() - 2);
                    list.remove(list.size() - 1);
                }
            }
        }


        while (list.size() > 1) {
            firstNum = list.get(0);
            operator = list.get(1);
            secondNum = list.get(2);

            list.set(0, eval(firstNum, operator, secondNum));
            list.remove(2);
            list.remove(1);
        }

        return list.get(0);
    }

    public static String eval(String a, String operator, String b) {
        double r = 0;

        switch (operator) {
            case "/":
                r += Double.parseDouble(a) / Double.parseDouble(b);
                break;
            case "*":
                r += Double.parseDouble(a) * Double.parseDouble(b);
                break;
            case "-":
                r += Double.parseDouble(a) - Double.parseDouble(b);
                break;
            case "+":
                r += Double.parseDouble(a) + Double.parseDouble(b);
                break;
        }

        return Double.toString(r);
    }

    private String changeOp(String str) {
        switch (str) {
            case "X":
                return "*";
            case "÷":
                return "/";
            case "+":
                return "+";
            case "-":
                return "-";
        }
        return "";
    }

}