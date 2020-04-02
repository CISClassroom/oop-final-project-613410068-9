/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.final_project;

/**
 *
 * @author 66982
 */
public class BMI {
    public double tf_weigthBMI;
    public double tf_hightBMI;
    
    public double Bmi (double tf_weigthBMI, double tf_hightBMI){
        return tf_weigthBMI / (tf_hightBMI*tf_hightBMI);
        
    }
    public String womencheckclass (double bmi){
    if (bmi < 18){
           return "ผอมบาง";
        }
    else if (bmi >= 18 && bmi < 24){
            return"พอเหมาะ";
        }
    else if (bmi >= 24 && bmi < 29){
            return"น้ำหนักเกิน";
        }
    else{
            return"เป็นโรคอ้วน";
        }
    }
    public String mancheckclass (double bmi){
    if (bmi < 19){
           return "ผอมบาง";
        }
    else if (bmi >= 19 && bmi < 25){
            return"พอเหมาะ";
        }
    else if (bmi >= 25 && bmi < 30){
            return"น้ำหนักเกิน";
        }
    else{
            return"เป็นโรคอ้วน";
        }
    }
} 

