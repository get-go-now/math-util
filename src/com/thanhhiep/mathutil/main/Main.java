/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhhiep.mathutil.main;

import com.thanhhiep.mathutil.core.MathUtil;

/**
 *
 * @author Acer
 */
public class Main {

    public static void main(String[] args) {

        //test = tay
        System.out.println("0! = 1? " + MathUtil.getFactorial(0));
        System.out.println("1! = 1? " + MathUtil.getFactorial(1));
        System.out.println("5! = 120? " + MathUtil.getFactorial(5));
        System.out.println("6! = 720? " + MathUtil.getFactorial(6)); // approved
        System.out.println("7! = 5040? " + MathUtil.getFactorial(6)); // approved

    }
    //aprroved
    public static void testFactorialSuccessfullCases() {
        System.out.println("0! = 1? " + MathUtil.getFactorial(0));
        System.out.println("2! = 4? " + MathUtil.getFactorial(1)); // approved
    }
   

        
    }
  


// tự nhìn, tự so sánh, tự kết luận cho từng trường hợp và cho all
