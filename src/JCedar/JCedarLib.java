package JCedar;

public class JCedarLib {

    //Method creates an inverted string from the input string and compares the strings to eachother
    //Method Finds if the string is a palindrome
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
    //Pulls apart the input string into pieces and recreates the string with the new information
    public static String dateStr(String str){
        String x = str.substring(0,2);
        String y = str.substring(3,5);
        String z = str.substring(6, str.length());
        System.out.println(y + "-" + x + "-" + z);
        return y + "-" + x + "-" + z;
    }
    //Method starts at zero and adds up to the initial value similar to a factorial
    public static int sumUpTo(int n){
        int x = 0;
        for(int i = 0; i < n+1; i++){
            x = x + i;
        }
        System.out.println(x);
        return x;
    }
    //Method takes a starting number and multiplies it up to the range value and gives all the results
    public static void multiplacationTable(int base, int range){
        String table = "";
        for(int i = 0; i <= range; i++){
            int y = base * i;
            table = table + y + ",";

        }
        System.out.println(table);
    }
    //If substring exists in mainstring cuts out substring from mainstring and recreates the mainstring
    public static String cutOut(String mainStr, String subStr){
        int x = mainStr.indexOf(subStr);
        String cut = "";
        if(x > 0){
            cut = mainStr.substring(0, x) + mainStr.substring(subStr.length() + x, mainStr.length());
            System.out.println(cut);
            System.out.println("x>0");
            return cut;
        }else if(x < 0){
            System.out.println(mainStr);
            return mainStr;
        }else if(x == 0){
            cut = mainStr.substring(subStr.length(),mainStr.length());
            System.out.println(cut);
            return cut;

        }
        return mainStr;
    }
}
