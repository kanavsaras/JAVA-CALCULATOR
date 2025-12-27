package com.example.calculator_app;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
public class CalculatorController {
    private Calculator calculator = new Calculator();
    @PostMapping("/calculate")
    public double doMath(@RequestBody CalculatorRequest request){
        double result = 0;
        String  op = request.getOperation();

        switch(op){
            case "add":
                result = calculator.add(request.getNum1(), request.getNum2());
                break;
        
            case "subtract":
            result = calculator.subtract(request.getNum1(), request.getNum2());
            break;
            case "multiply":
                result = calculator.multiply(request.getNum1(), request.getNum2());
                break;
            case "divide":
                result = calculator.divide(request.getNum1(), request.getNum2());
                break;
            case "mod":
                result = calculator.mod(request.getNum1(), request.getNum2());
                break;
    }
    return result;
}
}