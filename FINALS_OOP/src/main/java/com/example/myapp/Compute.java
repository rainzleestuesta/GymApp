package com.example.myapp;

public class Compute extends Workout {

    public Compute(){

    }

    public Compute(String exercise, int sets, Double weight, Double total, Double grandTotal, String intensity) {
        super(exercise, sets, weight, total, grandTotal, intensity);
    }

    public Double getTotal(double weight, int set) {
        return weight * set;
    }
    public String getIntensity(Double total){
        if(total < 50 && total > 0){
            return "Light";
        }
        else if(total > 50 && total < 100){
            return "Moderate";
        }
        else if(total >= 100){
            return "Intense";
        }
        else {
            return "NUH UH";
        } 
    }
}
