package base;

import java.lang.ref.SoftReference;

/**
 * Created by renzengtao on 2017/11/22.
 */
public class primitiveAndReference {

    public static void main(String[] args) {
        Object obj = new Object();

        SoftReference<String> softRef = new SoftReference("xxx");
        System.out.println(softRef.get());

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
