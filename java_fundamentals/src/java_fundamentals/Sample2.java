package java_fundamentals;
public class Sample2 {
    public static void main(String[] args) {
        String str1 = "Mark";
        String str2 = "kate";
        
        String result;
        if (str1.toLowerCase().charAt(str1.length() - 1) == str2.toLowerCase().charAt(0)) {
            result = (str1 + str2.substring(1)).toLowerCase();
        } else {
            result = (str1 + str2).toLowerCase();
        }
        
        System.out.println(result);
    }
}
