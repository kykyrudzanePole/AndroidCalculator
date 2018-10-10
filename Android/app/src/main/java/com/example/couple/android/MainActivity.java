package com.example.couple.android;


import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonDivision;
    Button buttonMultiply;
    Button buttonSQR;
    Button buttonDel;
    Button buttonFind;
    Button buttonRightBracket;
    Button buttonLeftBracket;
    Button buttonPoint;

    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText.setSelection(editText.getText().length());

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonSQR = (Button) findViewById(R.id.buttonSQR);
        buttonDel = (Button) findViewById(R.id.buttonDel);
        buttonFind = (Button) findViewById(R.id.buttonFind);
        buttonRightBracket = (Button) findViewById(R.id.buttonRightBracket);
        buttonLeftBracket = (Button) findViewById(R.id.buttonLeftBracket);
        buttonPoint = (Button) findViewById(R.id.buttonPoint);

        button0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
                sizeText(editText);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
                sizeText(editText);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
                sizeText(editText);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
                sizeText(editText);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
                sizeText(editText);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
                sizeText(editText);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
                sizeText(editText);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
                sizeText(editText);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
                sizeText(editText);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
                sizeText(editText);
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "+");
                sizeText(editText);
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "-");
                sizeText(editText);
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
                sizeText(editText);
            }
        });

        buttonSQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "^");
                sizeText(editText);
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "*");
                sizeText(editText);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "/");
                sizeText(editText);
            }
        });

        buttonRightBracket.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ")");
                sizeText(editText);
            }
        });

        buttonLeftBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "(");
                sizeText(editText);
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    editText.setText(editText.getText().delete(editText.getText().length() - 1, editText.getText().length()));
                }catch (IndexOutOfBoundsException e){ }
            }
        });
        buttonFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String findFormula = parceEditText(String.valueOf(editText.getText()));

                if(findFormula.substring(findFormula.length() - 2).equals(".0")){
                    Log.d("1", findFormula);
                    findFormula = findFormula.substring(0, findFormula.length() - 2);
                }
                editText.setText(findFormula);
            }
        });
    }

    private static void sizeText(EditText editText){

        if(editText.getText().length() >= 12) {
            editText.setTextSize(30);
        }else{
            editText.setTextSize(50);
        }
    }

    private static double add(double x, double y){
        return x + y;
    }

    private static double minus(double x, double y){
        return x - y;
    }

    private static double multiply(double x, double y){
        return x * y;
    }

    private static double division(double x, double y){
        return x / y;
    }

    private static double degree(double x, double y){
        return Math.pow(x, y);
    }

    public String parceEditText(String editText){

        StringBuffer formula = new StringBuffer("(" + editText + ")");

        System.out.println(String.valueOf(formula));
        Boolean check = true;
        while(check) {

            Pattern pattern = Pattern.compile("\\([^()]+\\)");
            Matcher matcher = pattern.matcher(formula);

            if (matcher.find()) {
                String brackets = matcher.group();

                brackets = recurseDegree(brackets);

                brackets = recurseFirst(brackets);

                brackets = recurseSecond(brackets);

                formula.replace(matcher.start(), matcher.end(), brackets.substring(1, brackets.length() - 1));

            }else{
                check = false;
            }
        }

        return String.valueOf(formula);
    }

    private static String recurseDegree(String brackets){
        Pattern patternDegree = Pattern.compile("(((-\\d+\\.\\d+)|(-\\d))|((\\d+\\.\\d+)|(\\d+)))\\^(((-\\d+\\.\\d+)|(-\\d+))|((\\d+\\.\\d+)|(\\d+)))");
        Matcher matcherDegree = patternDegree.matcher(brackets);

        while(matcherDegree.find()){
            String[] degreeArray = matcherDegree.group().split("\\^");

            Double degree = degree(Double.parseDouble(degreeArray[0]), Double.parseDouble(degreeArray[1]));

            brackets = brackets.replace(matcherDegree.group(), String.valueOf(degree));
            break;
        }
        for(int i = 0; i < brackets.length(); i++){
            if(brackets.charAt(i) == '^'){
                brackets = recurseDegree(brackets);
            }
        }
        return brackets;
    }

    private static String recurseFirst(String brackets){
        Pattern patternFirst = Pattern.compile("(((-\\d+\\.\\d+)|(-\\d+))|((\\d+\\.\\d+)|(\\d+)))[*/](((-\\d+\\.\\d+)|(-\\d+))|((\\d+\\.\\d+)|(\\d+)))");
        Matcher matcherFirst = patternFirst.matcher(brackets);

        while (matcherFirst.find()){
            Double temp;
            Boolean isMultiply = false;

            Pattern patternMultiply = Pattern.compile("\\*");
            Matcher matcherMultiply = patternMultiply.matcher(matcherFirst.group());

            while (matcherMultiply.find()) {
                isMultiply = true;
            }
            if (isMultiply) {
                String[] multiplyArray = matcherFirst.group().split("\\*");
                temp = multiply(Double.parseDouble(multiplyArray[0]), Double.parseDouble(multiplyArray[1]));
            } else {
                String[] divisionArray = matcherFirst.group().split("/");
                temp = division(Double.parseDouble(divisionArray[0]), Double.parseDouble(divisionArray[1]));
            }
            brackets = brackets.replace(matcherFirst.group(), String.valueOf(temp));
            break;
        }
        for(int i = 0; i < brackets.length(); i++){
            if((brackets.charAt(i) == '*') || (brackets.charAt(i) == '/') ){
                brackets = recurseFirst(brackets);
            }
        }

        return brackets;
    }

    private static String recurseSecond(String brackets){

        brackets = brackets.replaceAll("--", "+");

        Pattern patternSecond = Pattern.compile("(((-\\d+\\.\\d+)|(-\\d+))|((\\d+\\.\\d+)|(\\d+)))[-+](((-\\d+\\.\\d+)|(-\\d+))|((\\d+\\.\\d+)|(\\d+)))");
        Matcher matcherSecond = patternSecond.matcher(brackets);

        while (matcherSecond.find()){
            Double temp;
            Boolean isAdd = false;

            Pattern patternAdd = Pattern.compile("\\+");
            Matcher matcherAdd = patternAdd.matcher(matcherSecond.group());

            while (matcherAdd.find()) {
                isAdd = true;
            }
            if (isAdd) {
                String[] addArray = matcherSecond.group().split("\\+");
                temp = add(Double.parseDouble(addArray[0]), Double.parseDouble(addArray[1]));
            } else {
                String[] minusArray = matcherSecond.group().split("-");
                temp = minus(Double.parseDouble(minusArray[0]), Double.parseDouble(minusArray[1]));
            }
            brackets = brackets.replace(matcherSecond.group(), String.valueOf(temp));
            break;
        }
        for(int i = 0; i < brackets.length(); i++){
            if((brackets.charAt(i) == '+') || (brackets.charAt(i) == '-') ){

                Pattern patternNegative = Pattern.compile("-((\\d+)|(\\d+\\.\\d+))");
                Matcher matcherNegative = patternNegative.matcher(brackets);

                if(!matcherNegative.find()){
                    brackets = recurseSecond(brackets);
                }
            }
        }
        return  brackets;
    }
}

