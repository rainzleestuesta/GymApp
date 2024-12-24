package com.example.myapp;

public abstract class Workout{
    private String exercise;
    private int sets;
    private double weight, total, grandTotal;
    private String intensity;

    public Workout() {

    }

    public Workout(String exercise, int sets, double weight, double total, double grandTotal, String intensity) {
        this.exercise = exercise;
        this.sets = sets;
        this.weight = weight;
        this.total = total;
        this.grandTotal = grandTotal;
        this.intensity = intensity;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }
}
