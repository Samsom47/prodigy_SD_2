/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessinggame;

import java.util.Random;

/**
 *
 * @author user
 */
public class GeussCode {

    private int count = 0;
    private int random;

    public GeussCode() {
        Random kusto = new Random();
        this.random = kusto.nextInt(1,20);
    }

    public String randomComparison(int guess) {
        count++;

        if (random == guess) {
            count=0;
            Random kusto = new Random();
        this.random = kusto.nextInt(1,20);
    
            return "Succes,you got the number.\n New game begins";
        } else {
            if (guess > random) {
                 return "too high,try again";
            } else {
                return "too low,try again";
            }
        }
    }

    public int getCount(int count) {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getRandom() {
        return random;
    }

    
    

    public String toString() {
        return "attempts:" + count;
    }

}
