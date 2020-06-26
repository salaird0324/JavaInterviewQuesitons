package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//        String str1;
//        Scanner scan = new Scanner(System.in);
//        str1 = scan.nextLine();
//        String ans = reverse(str1);
//        StringBuffer answer = reverseWithReverse(str1);
//        System.out.println(ans);
//        System.out.println(answer);

        //shuffle the name
//        String name;
//        Scanner scan2 = new Scanner(System.in);
//        name = scan2.nextLine();
//        String shuffledName = shuffleName(name);
//        System.out.println(shuffledName);

        //Array of multiples
//        int num, length;
//        Scanner scan = new Scanner(System.in);
//        num = scan.nextInt();
//        length = scan.nextInt();
//        int[] array = arrayOfMultiples(num, length);
//        for(int i = 0; i<length; i++){
//            System.out.println(array[i]);
//        }

        //Rock Paper Scissors
//        String player1, player2;
//        boolean won = false;
//        Scanner scan = new Scanner(System.in);
//        player1 = scan.nextLine();
//        player2 = scan.nextLine();
//        String ans = rps(player1, player2);
//        System.out.println(ans);

        //Perimeter of a rectangle
//        int num1, num2;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter in the side lengths of the rectangle");
//        num1 = scan.nextInt();
//        num2 = scan.nextInt();
//        int ans = findPerimeter(num1, num2);
//        System.out.println(ans);



        //Seven boom
//        int length;
//        Scanner scan = new Scanner(System.in);
//        length = scan.nextInt();
//        int[] array = new int[length];
//        for(int i = 0; i<length; i++){
//            System.out.println("Enter in the " + i + " position");
//            int num = scan.nextInt();
//            array[i] = num;
//        }
//        String boom = sevenBoom(array);
//        System.out.println(boom);

        ///TODO Magic Segil Generator
        String input = "";
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        String gliff = sigilize(input);
        System.out.println(gliff);

    }

    //TODO remove not just the duplicates but originals that had duplicates as well
    //TODO Remove all vowels
    public static String sigilize(String s) {
       StringBuilder sb = new StringBuilder();
       s.chars().distinct().forEach(c -> sb.append((char) c));
       String ans = sb.toString();
       ans.replaceAll("[aeiou]", "");
       return ans;
    }

    public static String sevenBoom(int[] array){
        String ans = "There is no 7 in the array";
        for(int i=0; i<array.length; i++){
            if(array[i] == 7){
                ans = "Seven Boom!";
            }
        }
        return ans;
    }

    public static int findPerimeter(int num1, int num2){
        int otSide1, otSide2, perimeter;
        otSide1 = num1 * 2;
        otSide2 = num2 * 2;
        perimeter = otSide1 + otSide2;
        return perimeter;
    }

    public static String rps(String player1, String player2){
        String ans = "";
        //error handeling goes here
//        if(!player1.contains("rock")||!player1.contains("paper") || !player1.contains("scissors")||
//                !player2.contains("rock")||!player2.contains("paper") || !player2.contains("scissors")){
//            return "incorrect input";
//        }
        if(player1.contains("rock") && player2.contains("paper")){
            ans = ("Player 2 wins");
        }
        else if(player2.contains("rock") && player1.contains("paper")){
            ans = ("Player 1 wins");
        }
        else if(player1.contains("scissors") && player2.contains("paper")){
            ans = ("Player 1 wins");
        }
        else if(player2.equals("scissors") && player1.equals("paper")){
            ans = ("Player 2 wins");
        }
        else if(player1.equals("rock") && player2.equals("scissors")){
            ans = ("Player 1 wins");
        }
        else if(player2.equals("rock") && player1.equals("scissors")){
            ans = ("Player 2 wins");
        }
        return ans;
    }


    public static int[] arrayOfMultiples(int num, int length){
        int[] answer = new int[length];
        int temp = 1;
        for(int i=0; i<length; i++){
            int newTemp;
            newTemp = num * temp;
            answer[i] = newTemp;
            temp = temp+1;
        }
        return answer;
    }

    public static String shuffleName(String name){
        String[] ans = name.split(" ");
        String shuffledName = ans[1] + " " + ans[0];
        return shuffledName;
    }

    public static String reverse(String str1){
        String ans = "";
        char[] temp = str1.toCharArray();

        for(int i = temp.length-1; i>=0; i--){
            ans = (ans + temp[i]);
        }

        return ans;
    }

    public static StringBuffer reverseWithReverse(String str1){
        StringBuffer ans = new StringBuffer(str1);
        ans = ans.reverse();

        return ans;
    }
}
