import java.util.*;
public class A1103346_0421_1{
    public static void main(String[] args){
        
        String email;
        System.out.println("請輸入正確格式的電子郵件信箱，只有小寫英文字母");
        System.out.println("例如:a1103346@mail.nuk.edu.tw");
        Scanner input = new Scanner(System.in);
        email = input.next();

    
        if(email.matches("[a-z]{1,20}[0-9]{0,20}[@]{1}[a-z0-9.]{0,30}[.]{1}[a-z]{0,20}")){
            System.out.println("輸入正確");
        }else{
            System.out.println("輸入錯誤");
        }
    }
}        
