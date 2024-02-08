package jp.ac.uryukyu.ie.e225743;

import java.util.Random;

public class SelectNumber {
    private String correctNumber;

    public SelectNumber(){}
    
    public String generateRandomNumber(){
        Random random = new Random();
        int[] numList = {0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < 3; i++){
            int index = random.nextInt(10 - i);
            int temp = numList[index];
            numList[index] = numList[9 - i];
            numList[9 - i] = temp;
        }

        correctNumber = Integer.toString(numList[7]) + Integer.toString(numList[8]) + Integer.toString(numList[9]);
        return correctNumber;
    }

    public String generateHint(int guess){
        int hit = 0;
        int ball = 0;
        String correctStr = correctNumber;
        String guessStr = String.format("%03d", guess); // 3桁の数字に変換する

        for (int i = 0; i<3; i++){
            char guessDigit = i < guessStr.length() ? guessStr.charAt(i) : ' ';

            if (correctStr.charAt(i) == guessDigit){
                hit++;
            }else if (correctStr.contains(String.valueOf(guessStr.charAt(i)))){
                ball++;
            }
        }
        
        return hit + "" + ball;
    }
}
