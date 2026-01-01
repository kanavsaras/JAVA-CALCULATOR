package com.example.calculator_app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "CalculationLog")
public class Calculation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double num1;
    private Double num2;
    private String operation;
    private Double result;
    public Calculation() {};
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Double getNum1() {
        return num1;
    }
    public void setNum1(Double num1) {
        this.num1 = num1;
    }
    public Double getNum2() {
        return num2;
    }
    public void setNum2(Double num2) {
        this.num2 = num2;
    }
    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
    public Double getResult() {
        return result;
    }
    public void setResult(Double result) {
        this.result = result;
    }
}


