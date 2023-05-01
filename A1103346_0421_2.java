import java.util.*;
public class A1103346_0421_2{
    public static void main(String[] args){
        
        String date;
        System.out.println("請輸入正確格式的日期，格式為:YYYY/MM/DD 或是 MM/DD/YYYY");
        System.out.println("例如:2023/4/21");
        Scanner input = new Scanner(System.in);
        date = input.next();

        if(date.matches("[0-9]{1,4}[/]{1}[0-1]{0,1}[0-9]{1}[/]{1}[0-3]{0,1}[0-9]{1}")){  //格式為:YYYY/MM/DD 
            System.out.println("輸入正確，您輸入的日期為:"+date);
        }else if(date.matches("[0-1]{0,1}[0-9]{1}[/]{1}[0-3]{0,1}[0-9]{1}[/][0-9]{1,4}")){  //格式為:MM/DD/YYYY
            System.out.println("輸入正確，您輸入的日期為:"+date);
        }else{
            System.out.println("輸入錯誤");
        }
    }
}        
