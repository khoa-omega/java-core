package entity;

public class MyMath {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, byte b) {
        return a + b;
    }

    public float sum(int a, float b) {
        return a + b;
    }

    public int sum(byte a, int b) {
        return a + b;
    }

    public byte sum(byte a, byte b) {
        return (byte) (a + b);
    }
}
