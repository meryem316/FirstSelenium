package myJava;

public class myClass {


    public static void main(String[] args) {


        String a = "imran";
        String str = "";
        for (int i = a.length()-1; i >= 0; i--) {
           str += a.charAt(i);
        }
        System.out.println(str);
    }

}