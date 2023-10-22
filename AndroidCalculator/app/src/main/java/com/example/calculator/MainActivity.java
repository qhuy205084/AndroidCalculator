package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

import java.util.Stack;

public class MainActivity extends Activity implements View.OnClickListener {
    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_negative;
    Button btn_decimal;
    Button btn_add;
    Button btn_subtract;
    Button btn_multiply;
    Button btn_divide;
    Button btn_calculate;
    Button btn_clear_entry;
    Button btn_clear;
    Button btn_bs;
    TextView tv_input;
    TextView tv_result;
    String input = "";
    String result = "";
    boolean containDecimal = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_negative = findViewById(R.id.btn_negative);
        btn_decimal = findViewById(R.id.btn_decimal);
        btn_add = findViewById(R.id.btn_add);
        btn_subtract = findViewById(R.id.btn_subtract);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_divide = findViewById(R.id.btn_divide);
        btn_calculate = findViewById(R.id.btn_calculate);
        btn_clear_entry = findViewById(R.id.btn_clear_entry);
        btn_clear = findViewById(R.id.btn_clear);
        btn_bs = findViewById(R.id.btn_bs);
        tv_input = findViewById(R.id.tv_input);
        tv_result = findViewById(R.id.tv_result);
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_negative.setOnClickListener(this);
        btn_decimal.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_subtract.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_calculate.setOnClickListener(this);
        btn_clear_entry.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_bs.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == btn_0.getId()) {
//            if (lastElementIs(input, new char[] {'+', '-', '*', '/'})){
//                result = "";
//            }
            if (lastElementIs(input,new char[]{'='})){
                input = "";
                result = "";
            }
            if (result.equals("0")){
                result = "0";
            }else{
                result+="0";
            }
        }
        if (v.getId() == btn_1.getId()) {
            if (lastElementIs(input,new char[]{'='})){
                input = "";
                result = "";
            }
            if (result.equals("0")){
                result = "1";
            }else{
                result+="1";
            }
        }
        if (v.getId() == btn_2.getId()) {
            if (lastElementIs(input,new char[]{'='})){
                input = "";
                result = "";
            }
            if (result.equals("0")){
                result = "2";
            }else{
                result+="2";
            }
        }
        if (v.getId() == btn_3.getId()) {
            if (lastElementIs(input,new char[]{'='})){
                input = "";
                result = "";
            }
            if (result.equals("0")){
                result = "3";
            }else{
                result+="3";
            }
        }
        if (v.getId() == btn_4.getId()) {
            if (lastElementIs(input,new char[]{'='})){
                input = "";
                result = "";
            }
            if (result.equals("0")){
                result = "4";
            }else{
                result+="4";
            }
        }
        if (v.getId() == btn_5.getId()) {
            if (lastElementIs(input,new char[]{'='})){
                input = "";
                result = "";
            }
            if (result.equals("0")){
                result = "5";
            }else{
                result+="5";
            }
        }
        if (v.getId() == btn_6.getId()) {
            if (lastElementIs(input,new char[]{'='})){
                input = "";
                result = "";
            }
            if (result.equals("0")){
                result = "6";
            }else{
                result+="6";
            }
        }
        if (v.getId() == btn_7.getId()) {
            if (lastElementIs(input,new char[]{'='})){
                input = "";
                result = "";
            }
            if (result.equals("0")){
                result = "7";
            }else{
                result+="7";
            }
        }
        if (v.getId() == btn_8.getId()) {
            if (lastElementIs(input,new char[]{'='})){
                input = "";
                result = "";
            }
            if (result.equals("0")){
                result = "8";
            }else{
                result+="8";
            }
        }
        if (v.getId() == btn_9.getId()) {
            if (lastElementIs(input,new char[]{'='})){
                input = "";
                result = "";
            }
            if (result.equals("0")){
                result = "9";
            }else{
                result+="9";
            }
        }
        if (v.getId() == btn_decimal.getId()) {
            // If result string haven't contain decimal yet
            if (!containDecimal) {
                // If the string in result is a calculated result
                if (lastElementIs(input, new char[]{'='})) {
                    input = "";
                    result = "0.";
                } else {
                    // If the last element is not a operator
                    if (input.equals("0")){
                        result += "0.";
                        containDecimal= true;
                    }
                    // If the last element is a number without decimal
                    else {
                        result += ".";
                        containDecimal=true;
                    }
                }
            }
        }
        if (v.getId() == btn_negative.getId()) {
            if (lastElementIs(input, new char[]{'='})) {
                result = "-" + result;
                input = result;
            } else {
                result = "-" + result;
            }
        }
        if (v.getId() == btn_add.getId()) {
            if (lastElementIs(input, new char[]{'='})) {
                input = "";
            }
            if (lastElementIs(input, new char[] {'+', '-', '*', '/'})){
                input = removeLast(input)+"+";
            }
            else {
                input += result + "+";
                result= "";
                containDecimal=false;
            }
        }
        if (v.getId() == btn_subtract.getId()) {
            if (lastElementIs(input, new char[]{'='})) {
                input = "";
            }
            if (lastElementIs(input, new char[] {'+', '-', '*', '/'})){
                input = removeLast(input)+"+";
            }
            else {
                input +=result + "-";
                result= "";
                containDecimal=false;
            }
        }
        if (v.getId() == btn_multiply.getId()) {
            if (lastElementIs(input, new char[]{'='})) {
                input = "";
            }
            if (lastElementIs(input, new char[] {'+', '-', '*', '/'})){
                input = removeLast(input)+"+";
            }
            else {
                input +=result + "*";
                result= "";
                containDecimal=false;
            }
        }
        if (v.getId() == btn_divide.getId()) {
            if (lastElementIs(input, new char[]{'='})) {
                input = "";
            }
            if (lastElementIs(input, new char[] {'+', '-', '*', '/'})){
                input = removeLast(input)+"+";
            }
            else {
                input +=result + "/";
                result= "";
                containDecimal=false;
            }
        }
        if (v.getId() == btn_calculate.getId()) {
            if (!lastElementIs(input, new char[]{'='})) {
                input+=result + "=";
                result=calculate(input);
                containDecimal=false;
            }
        }
        if (v.getId() == btn_clear_entry.getId()) {
            result = "";
            containDecimal=false;
        }
        if (v.getId() == btn_clear.getId()) {
            input = "";
            result = "";
            containDecimal=false;
        }
        if (v.getId() == btn_bs.getId()) {
            if (lastElementIs(result, new char[]{'.'})){
                containDecimal=false;
            }
            result = removeLast(result);
        }
        tv_input.setText(input);
        tv_result.setText(result);
    }

    String calculate(String calculation) {
        Stack<Float> numStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        String temp = "";
        Float result = (float) 0;
        for (int i = 0; i < calculation.length(); i++) {
            if (Character.isDigit(calculation.charAt(i)) || calculation.charAt(i) == '.') {
                temp = temp.concat(String.valueOf(calculation.charAt(i)));
            } else {
                numStack.push(Float.parseFloat(temp));
                temp = "";
                if (calculation.charAt(i) == '=') {
                    while (operatorStack.size() != 0) {
                        Float subResult = subCalc(numStack.pop(), numStack.pop(), operatorStack.pop());
                        numStack.push(subResult);
                    }
                    result = numStack.pop();
                }
                if (operatorStack.size() == 0) {
                    operatorStack.push(calculation.charAt(i));
                    continue;
                }
                if (calculation.charAt(i) == '+' || calculation.charAt(i) == '-') {
                    while (operatorStack.size() != 0) {
                        Float subResult = subCalc(numStack.pop(), numStack.pop(), operatorStack.pop());
                        numStack.push(subResult);
                    }
                    operatorStack.push(calculation.charAt(i));
                }
                if (calculation.charAt(i) == '*' || calculation.charAt(i) == '/') {
                    while (operatorStack.peek() == '*' || operatorStack.peek() == '/') {
                        Float subResult = subCalc(numStack.pop(), numStack.pop(), operatorStack.pop());
                        numStack.push(subResult);
                    }
                    operatorStack.push(calculation.charAt(i));
                }
            }
        }
        return result.toString();
    }


    Float subCalc(Float a, Float b, Character operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                return b / a;
            default:
                return (float) 0;
        }
    }

    String removeLast(String str) {
        if (str != null && str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    boolean lastElementIs(String searchString, char[] arr){
        if (searchString.length()==0) {
            return false;
        }
        for (int i=0; i < arr.length; i++){
            if (searchString.charAt(searchString.length()-1) == arr[i]){
                return true;
            }
        }
        return false;
    }
}
