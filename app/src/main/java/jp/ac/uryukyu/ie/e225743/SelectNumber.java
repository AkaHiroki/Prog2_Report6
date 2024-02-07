package jp.ac.uryukyu.ie.e225743;

import java.util.Random;

public class SelectNumber {
    private int correctNumber;
    
    public int generateRandomNumber(){
        Random random = new Random();
        int[] numList = {0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < 3; i++){
            int index = random.nextInt(10 - i);
            int temp = numList[index];
            numList[index] = numList[9 - i];
            numList[9 - i] = temp;
        }

        correctNumber = numList[0]*100 + numList[1]*10 + numList[2];
        return correctNumber;
    }
}
