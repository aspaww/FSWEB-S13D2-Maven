package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(11212));
        System.out.println( isPerfectNumber(6));
        System.out.println( isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPalindrome(int num){
        //ilk önce sayımı yazarım.
        //yazdığım sayıyı sondan başlayarak yeniden yazarım
        //yazdığım sayıları alt alta koyarak eşleşmi diye bakarım.

        int orjNumber = num;
        int reversNumber = 0;
        while(num !=0){
            int digit = num %10;
            reversNumber = reversNumber * 10 + digit;
            num/=10;
        }
        return orjNumber == reversNumber;
    }

    public static boolean isPerfectNumber(int num){

        if(num<=0){
            return false;
        }

        int result =0;

        for(int i=1; i<=num/2;i++){
            if(num%i ==0){
                result += i;
            }
        }
        return result ==num;
    }

    public static String numberToWords(int number){
        if(number<0){
            return "Invalid Value";
        }

        //Rakamlar ve arraylar index numarası eşleşiyor array oluştur.

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        String result = "";
        while(number>0){
            int digit = number%10;
            result =  words[digit] + " " + result;
            number/=10;
        }
        return result.trim();
    }





}
