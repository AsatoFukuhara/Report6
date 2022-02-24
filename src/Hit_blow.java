
import java.util.Collections;
import java.util.ArrayList;


public class Hit_blow{
    private int a;
    private int b;
    private int c;
    private int d;
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //0~9の整数値を持つリストを用意
        for(int i = 0 ; i < 10 ; i++) {
            list.add(i);
        }
        //リストを表示（確認用）
        //System.out.println(list);

        //shuffleメソッドで上で作ったリストをシャッフル
        Collections.shuffle(list);
        for(int i = 1; i < 5 ; i++){
            //System.out.println(list.get(i));//このリストの最初から４番目までを表示したい=>完了
            if (i == 1){
                int a=list.get(i);
                System.out.println("aは"+a);
                }
                else if (i == 2){
                    int b = list.get(i);
                    System.out.println("bは"+b);
                }
                else if (i == 3){
                    int c = list.get(i);
                    System.out.println("cは"+c);
                }
                else if (i == 4){
                    int d = list.get(i);
                    System.out.println("dは"+d); 
                }
 
        //ランダムにした結果を表示
        //System.out.println(list)
    }
    System.out.println(getA());


    }
} 