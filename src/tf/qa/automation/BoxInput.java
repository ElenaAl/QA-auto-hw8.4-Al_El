package tf.qa.automation;

public class BoxInput<T> {
    private Box<T> someBox;

    public final Box<T> getB() {

        return someBox;

    }

    public final void input(final Box<T> fruit) {

        this.someBox = fruit;
    }

}
