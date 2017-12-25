package dataStructure.leetcode;

/**
 * Created by renzengtao on 2017/12/21.
 */
public class l_8_String_to_Integer {

    public static int myAtoi(String str) {
        boolean flag = false;
        if(str.charAt(0)=='-'){
            str =  str.substring(1);
            flag = true;
        }

        int resutl = 0;
        for (int i = 0; i < str.length(); i++) {
            int x = str.charAt(i)-'0';
            resutl = resutl*10+x;
        }

        if(flag = true){
            resutl = -resutl;
        }
        return resutl;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-1234"));
    }
}
