package org.fxi.test.jvm.BlackMagicOfMethodDispatch.three;

public class Coder2 extends AbstractCoder implements Coder {
    @Override
    public int work(byte[] data) {
        return data.length;
    }

    public static int staticWork(byte[] data) {
        return data.length;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length;
    }
}
