package edu.bsu.cs222;

public class SillyMethods {
    public Boolean didGuess42(int number){
        boolean verdict = false;
        if (number == 42){
            verdict = true;
        }else{
            verdict=false;
        }
        return verdict;
    }

    public String countTo(int lastNumber){
        String countingString = "0";
        for (int i=1; i <= lastNumber; i++){
            countingString = countingString + " " + i;
        }
        return countingString;
    }
}
