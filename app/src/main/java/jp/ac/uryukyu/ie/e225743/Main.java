package jp.ac.uryukyu.ie.e225743;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        SelectNumber selectNumber = new SelectNumber();
        String correctNumber = selectNumber.generateRandomNumber();

        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempt = 0;

        System.out.println("三桁の数字を当ててください。");

        do{
            System.out.print("数字を入力してください:");
            attempt++;
            guess = scanner.nextInt();
            String guessInt = Integer.toString(guess);

            if (guess > 999){
                System.out.println("三桁の数字を入力してください");
                continue;
            }

            if (guessInt.equals(correctNumber)){
                System.out.println("素晴らしい！正解です！");
                break;
            }else;{
                String hint = selectNumber.generateHint(guess);
                System.out.println(hint.charAt(0) + "ヒット," + hint.charAt(1) + "ボール");
            }
        }while(true); 

        System.out.println("正解まで" + attempt + "回かかりました。");
        scanner.close();        
    }
}
