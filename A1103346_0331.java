import java.util.*;
 public class A1103346_0331{
  static class Animal{
    String name;  
    double height;
    int weight;
    double speed;

    Animal(String name, double height, int weight, double speed){
      this.name= name;
      this.height= height;
      this.weight= weight;
      this.speed= speed;
    }
    double distance(int x){  //overload
        double d= x*this.speed;  
        return d;  
    }
    double distance(int x, double y){  
        double d= x*y*this.speed;  
        return d;  
    }
    void show(){
        System.out.println("姓名:"+this.name+", 身高:"+this.height+"公尺, 體重:"+this.weight+"公斤, 速度:"+this.speed+"公尺/分鐘");
    }
    static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
  }


  static class Human extends Animal{
    String gender;
    Human(String name, double height, int weight, double speed, String gender){  //constructor
      super(name, height, weight, speed);
      this.gender= gender;
    }
    void show(){
      System.out.println("姓名:"+this.name+", 身高:"+this.height+"公尺, 體重:"+this.weight+"公斤, 速度:"+this.speed+"公尺/分鐘"+" 性別:"+this.gender);
    }
  }  


  static class Snow extends Human{
    String frozen;
    Snow(String name, double height, int weight, double speed, String gender, String frozen){  //constructor
      super(name, height, weight, speed, gender);
      this.frozen= frozen;
    }
    double distance(int x){  //overload
      double d= x*this.speed*2;  
      return d;  
    }
    double distance(int x, double y){  
      double d= x*y*this.speed*2;  
      return d;  
    }
    void show(){
      System.out.println("姓名:"+this.name+", 身高:"+this.height+"公尺, 體重:"+this.weight+"公斤, 速度:"+this.speed+"公尺/分鐘"+" 性別:"+this.gender+" 冰凍技能:"+this.frozen); 
    }
  }    



    public static void main(String []args){
      Animal.showinfo();
      Animal[] animal = new Animal[2];
      animal[0]= new Animal("雪寶", 1.1, 52, 100);  
      //animal[0].name= "雪寶";
      //animal[0].height= 1.1;
      //animal[0].weight= 52;
      //animal[0].speed= 100;

      animal[1]= new Animal("驢子", 1.5, 99, 200);  
      //animal[1].name= "驢子";
      //animal[1].height= 1.5;
      //animal[1].weight= 99;
      //animal[1].speed= 200;
      
      Human[] human = new Human[3];
      human[0]= new Human("阿克", 1.9, 80, 150, "男");
      //human[0].name= "阿克";
      //human[0].height= 1.9;
      //human[0].weight= 80;
      //human[0].speed= 150;
      //human[0].gender= 男;

      human[1]= new Human("漢斯", 1.8, 78, 130, "男");
      //human[1].name= "漢斯";
      //human[1].height= 1.8;
      //human[1].weight= 78;
      //human[1].speed= 130;   
      //human[1].gender= 男;

      human[2]= new Human("安那", 1.7, 48, 120, "女");
      //human[2].name= "安那";
      //human[2].height= 1.7;
      //human[2].weight= 48;
      //human[2].speed= 120; 
      //human[2].gender= 女;

      Snow[] snow = new Snow[1];
      snow[0]= new Snow("愛沙", 1.7, 50, 120, "女", "Yes");
      //snow[0].name= "愛沙";
      //snow[0].height= 1.7;
      //snow[0].weight= 50;
      //snow[0].speed= 120;   
      //snow[0].gender= 女;
      //snow[0].frozen= Yes;

      for(int i=0; i<=animal.length-1; i++){
        animal[i].show();
      }
      for(int i=0; i<=human.length-1; i++){
        human[i].show();
      }
      snow[0].show();


      for(int a=0; a<=animal.length-1; a++){
        int x;
        System.out.print("請輸入"+animal[a].name+"的時間");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        input.nextLine();  //把後面空白讀掉
        String temp;
        System.out.print("請輸入"+animal[a].name+"的加速度");
        temp = input.nextLine();
        if(temp == null || temp.isBlank()){  //不輸入東西 || 空白鍵
          System.out.println(animal[a].name+"的跑步距離:"+animal[a].distance(x));
        }else{
          double y = Double.parseDouble(temp);
          System.out.println(animal[a].name+"的跑步距離:"+animal[a].distance(x, y));
        }
      }     

      for(int h=0; h<=human.length-1; h++){
        int x;
        System.out.print("請輸入"+human[h].name+"的時間");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        input.nextLine();  //把後面空白讀掉
        String temp;
        System.out.print("請輸入"+human[h].name+"的加速度");
        temp = input.nextLine();
        if(temp == null || temp.isBlank()){  //不輸入東西 || 空白鍵
          System.out.println(human[h].name+"的跑步距離:"+human[h].distance(x));
        }else{
          double y = Double.parseDouble(temp);
          System.out.println(human[h].name+"的跑步距離:"+human[h].distance(x, y));
        }
      }     

      int x;
      System.out.print("請輸入"+snow[0].name+"的時間");
      Scanner input = new Scanner(System.in);
      x = input.nextInt();
      input.nextLine();  //把後面空白讀掉
      String temp;
      System.out.print("請輸入"+snow[0].name+"的加速度");
      temp = input.nextLine();
      if(temp == null || temp.isBlank()){  //不輸入東西 || 空白鍵
        System.out.println(snow[0].name+"的跑步距離:"+snow[0].distance(x));
      }else{
        double y = Double.parseDouble(temp);
        System.out.println(snow[0].name+"的跑步距離:"+snow[0].distance(x, y));
      }
      
    }
  }
  