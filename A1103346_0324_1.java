import java.util.*;

class Animal{
    String name;  
    double height;
    int weight;
    double speed;
    
    double distance(int x){  //overload
        double d= x*this.speed;  
        return d;  
    }
    double distance(int x, double y){  
        double d= x*y*this.speed;  
        return d;  
    }
    void show(){
        System.out.println("Name:"+this.name+", Height:"+this.height+"公尺, Weight:"+this.weight+"公斤, Speed:"+this.speed+"公尺/分鐘");
    }
  }

  public class A1103346_0324_1{
    public static void main(String []args){

      Animal[] member = new Animal[4];
      member[0]= new Animal();
      member[0].name= "雪寶";
      member[0].height= 1.1;
      member[0].weight= 52;
      member[0].speed= 100;

      member[1]= new Animal();
      member[1].name= "驢子";
      member[1].height= 1.5;
      member[1].weight= 99;
      member[1].speed= 200;
      
      member[2]= new Animal();
      member[2].name= "安那";
      member[2].height= 1.7;
      member[2].weight= 48;
      member[2].speed= 120;
      
      member[3]= new Animal();
      member[3].name= "愛沙";
      member[3].height= 1.7;
      member[3].weight= 50;
      member[3].speed= 120;   

      for(int i=0; i<=member.length-1; i++){
        member[i].show();
      }
      


      for(int m=0; m<=member.length-1; m++){
        int x;
        System.out.print("請輸入"+member[m].name+"的時間");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        input.nextLine();  //把後面空白讀掉
        String temp;
        System.out.print("請輸入"+member[m].name+"的加速度");
        temp = input.nextLine();
        if(temp == null || temp.isBlank()){  //不輸入東西 || 空白鍵
          //temp = "1";
          System.out.println(member[m].name+"的跑步距離:"+member[m].distance(x));
        }else{
          double y = Double.parseDouble(temp);
          System.out.println(member[m].name+"的跑步距離:"+member[m].distance(x, y));
        }
      }     
    }
  }
  
