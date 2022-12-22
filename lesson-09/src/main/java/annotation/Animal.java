package annotation;

public abstract class Animal {
    public abstract void makeSound();

    // Java docs
    /**
     * @deprecated Bạn nên sử dụng {@link #eatV2()}
     */
    @Deprecated
    public void eat() {

    }

    public void eatV2() {

    }
}
