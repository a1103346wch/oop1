import java.util.*;
import java.security.SecureRandom;
import java.util.Scanner;


class TimerThread extends Thread{
    Eat e;  //Eat型態
    String name;
    public TimerThread(Eat e, String name){
        this.e = e;
        this.name = name;
    }

    public void run(){
        try{            
            for(int i=0 ;i < 900; i++){
                sleep(3000);  //暫停時間3秒
                System.out.printf(this.name + " ");
                e.eat();
            }
        }catch(InterruptedException e){

        }
    }    
}

class Eat{
    //private static int j = 9000;  //水餃總數
    int pork = 5000;
    int beef = 3000;
    int vegetable = 1000;
    int type = 0;
    int r = 0;

    public synchronized void eat(){
    
        SecureRandom random = new SecureRandom();

        type = random.nextInt(3) +1;  //亂數選取水餃種類:1是豬肉，2是牛肉，3是蔬菜
        r = random.nextInt(40) +10;  //亂數產生10到50之間的水餃數

        if(type==1 && pork >= r){
            pork= pork - r;
            System.out.println("吃了"+r+"顆豬肉水餃, ");
        }else if (type==2 && beef >= r){
            beef= beef - r;
            System.out.println("吃了"+r+"顆牛肉水餃, ");
        }else if (type == 3 && vegetable >= r){
            vegetable= vegetable - r;
            System.out.println("吃了"+r+"顆蔬菜水餃, ");
        }

        //j = j - r;

        System.out.println("還剩下"+pork+"顆豬肉水餃, "+beef+"顆牛肉水餃, "+vegetable+"顆蔬菜水餃");
        //switch(type){
            //case 1:        
            //System.out.println("還剩"+pork+"顆豬肉水餃");
            //break;
            //case 2:           
            //System.out.println("還剩"+beef+"顆牛肉水餃");
            //break;
            //case 3: 
            //System.out.println("還剩"+vegetable+"顆蔬菜水餃");
            //break;
        //}  

        if(beef < 10 && pork < 10 && vegetable < 10){
            System.out.println("水餃已售完");
            System.exit(0);  //中止程式
        }
    }
    public void startEat(int x){
        for(int n = 0; n < x; n++){
            //System.out.printf("123\n");
            TimerThread[] eater = new TimerThread[x];
            eater[n] = new TimerThread(this, "eater" + n);
            eater[n].start();
        }
    }
}

public class A1103346_0512{
    public static void main(String[] args) throws Exception{
        System.out.print("請輸入同時光顧的顧客數目");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        Eat e = new Eat();
        e.startEat(x);
    }
}        