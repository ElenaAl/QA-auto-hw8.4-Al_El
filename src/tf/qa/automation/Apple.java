package tf.qa.automation;

public class Apple extends Fruit {
    private final String name;

    public Apple(final String name, final boolean fresh) {
        this.name = name;
        setFresh(fresh);
    }

    @Override
    public final String toString() {

        return name;
    }
}
