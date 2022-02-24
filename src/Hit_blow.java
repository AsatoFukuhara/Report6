
import java.util.Collections;
import java.util.ArrayList;


public class Hit_blow{
    final static int answer_size = 3;
    public int a, b, c;


    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }

    public int getC(){
        return this.c;
    }
    
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
        return answer;
        }


            public static void main(String[] args){
                System.out.println();
            }

        }