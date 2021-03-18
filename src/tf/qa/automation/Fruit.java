package tf.qa.automation;

public class Fruit {

    private boolean fresh = true;

    public Fruit() {
    }

    public final boolean isFresh() {
        return fresh;
    }

    public final boolean setFresh(final boolean fresh1) {
        this.fresh = fresh1;
        return fresh1;
    }


}
