package string_dsa;

public class Convert_String_toArray {
    public static void main(String[] args) {
        String string = "Tetto";
        char[] chars = string.toCharArray();
        for (int index = 0; index < chars.length ; index ++){
            System.out.print(chars[index]+ " ");
        }
        System.out.println(" ");
        System.out.print(string);

    }
}
//
//output-:T e t t o
//        Tetto