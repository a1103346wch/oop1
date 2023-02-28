import java.util.*;
public class A1103346_0224_2{
  public static void main(String []args){

  float celsius;
  System.out.println("請輸入任意數值作為攝氏溫度");
  Scanner sc = new Scanner(System.in);
  celsius = sc.nextFloat();

  float fahrenheit;
  fahrenheit = (celsius *9)/ 5 + 32 ;
  System.out.println("您輸入的攝氏溫度 "+ celsius +" °C等於華氏溫度 "+ fahrenheit +" °F");
  }
}




















