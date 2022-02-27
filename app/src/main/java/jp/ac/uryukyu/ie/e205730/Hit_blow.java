import java.io.*;

import java.io.BufferedReader;

import java.util.Arrays;
import java.util.Scanner;


public class Hit_blow{
    final static int answer_size = 3;
    public static int a;
    public static int b;
    public static int c;


    
    public static int[] makeRightAnswer() {
        int[] answer = new int[answer_size];
        for(int i = 0; i < answer.length; i++) {
        answer[i] = (int)(Math.random()*10);
        for(int j = i-1; j >=0; j--) {
        if(answer[j] == answer[i]) {
        answer[i] = (int)(Math.random()*10);
        }
        }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
        }

    public static void readUserAnswer() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("1つ目の数字を入力してください: ");
            a = scanner.nextInt();
            System.out.print("2つ目の数字を入力してください: ");
            b = scanner.nextInt();
            System.out.print("3つ目の数字を入力してください: ");
            c = scanner.nextInt();


            //scanner.close();


            }









        public boolean checkAnswer(){
            boolean bool1 = true;
            boolean bool2 = false;
            if (a == answer[0]){
                 //何かしら
            }
        }

  



            public static void main(String[] args){
                makeRightAnswer();
                System.out.println("数字当てゲーム開始");
                boolean bool1 = true;
                while(bool1){
                    readUserAnswer();
                }

            
            }

        }