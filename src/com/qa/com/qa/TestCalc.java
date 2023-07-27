package com.qa.com.qa;
import com.qa.com.qa.com.qa.*;

public class TestCalc {
    public static void main(String[] args) {
        BadCalc badcalc = new BadCalc();
        System.out.println(badcalc.calc(1,3));
        try {
            System.out.println(badcalc.div(1, 0));
        }
        catch (ArithmeticException e) {
            System.out.println("NO DIVIDE 0");
        }
        System.out.println(badcalc.div(6, 3));
    }
}
