public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        String vowels = "aeiouAEIOU";
        String result = "";
        for (int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            if (vowels.indexOf(c) != -1) {
                result += Character.toUpperCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }

    public static String camelCase (String string) {
        String result = "";
        boolean nextUpper = false;
        for (int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            if (c == ' ') {
                nextUpper = true;
            } else {
                if (nextUpper){
                    result += Character.toUpperCase(c);
                    nextUpper = false;
                } else {
                    if (i == 0){
                        result += Character.toLowerCase(c);
                    } else {
                        result += c;
                    }
                }
            }
        }
        return result;
    }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr){
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr){
                result[index++] = i;
            }
        }
        return result;
    }
}
