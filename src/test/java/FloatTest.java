/**
 * Created by renzengtao on 2017/12/5.
 */

public class FloatTest {
    /**
     * 将byte转换为一个长度为8的byte数组，数组每个值代表bit
     */
    public static byte[] getBooleanArray(byte b) {
        byte[] array = new byte[8];
        for (int i = 7; i >= 0; i--) {
            array[i] = (byte) (b & 1);
            b = (byte) (b >> 1);
        }
        return array;
    }

    /**
     * 把byte转为字符串的bit
     */
    public static String byteToBit(byte b) {
        return ""
                + (byte) ((b >> 7) & 0x1) + (byte) ((b >> 6) & 0x1)
                + (byte) ((b >> 5) & 0x1) + (byte) ((b >> 4) & 0x1)
                + (byte) ((b >> 3) & 0x1) + (byte) ((b >> 2) & 0x1)
                + (byte) ((b >> 1) & 0x1) + (byte) ((b >> 0) & 0x1);
    }

    /**
     * 如果不判断相等就是直接比较就可以，如果要判断相等就做减法，如果结果在一个合理误差范围内就认为是相等的.
     * @param args
     */
    public static void main(String[] args) {
//        byte b = 1;
//        // 输出 [0, 0, 1, 1, 0, 1, 0, 1]
//        System.out.println(Arrays.toString(getBooleanArray(b)));
        // 输出 00110101
//        System.out.println(byteToBit(b));
//        // JDK自带的方法，会忽略前面的 0
//        System.out.println(Integer.toBinaryString(xx));

//        byte b1 = 3<<1; // 0011 0101
//        System.out.println(byteToBit(b1));
//        System.out.println(Long.toBinaryString(-1));
//        System.out.println(Long.toBinaryString(-1>>100000));
//        //System.out.println(Integer.toBinaryString(x<<1));

        float a = 10.222222225f;
        float b = 10.222222229f;
        float c = 0.000000000000009f;
        System.out.println(Math.abs(a - b));
        System.out.println("-------使用“==”符号比较是否相等：" + (a == b));
        System.out.println("-------使用“Math.abs()”方法比较是否相等：" + (Math.abs(a - b) > 0));
        System.out.println("-------使用“Math.abs()”方法比较是否相等(比较宽容的限制)：" + (Math.abs(a - b) < 0.00000001));
        System.out.println("-------比较大小“<”：" + (a < b));
        System.out.println("-------比较大小“>”：" + (a > b));

    }
}
