package JCedar;

public class JCedarLib {
    public static boolean isPalindrome(String str){
        String y = "";
        for(int i = 0; i < str.length(); i++){
            String x = str.substring(str.length()-i-1, str.length()-i);
            y = y + x;
        }
        if(str.compareTo(y) == 0){
            System.out.println(y);
            System.out.println("true");
            return true;

        }else{
            System.out.println(y);
            System.out.println("false");
            return false;

        }

    }
    
}
