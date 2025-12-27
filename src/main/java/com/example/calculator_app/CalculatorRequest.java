package com.example.calculator_app;
public class CalculatorRequest{
    private int num1;
    private int num2;
    private String operation;
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public int getNum1(){
        return num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public int getNum2(){
        return num2;
    }
    public void setOperation(String operation){
        this.operation = operation;
    }
    public String getOperation(){
        return operation;
    }
}