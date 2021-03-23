/*
класс Box для методов положить/достать объект T из/в коробку
 */

package tf.qa.automation;

public class Box<T> {
    private T someFruit;

    public final T get() {

        return someFruit;

    }

    public final void put(final T fruit) {

        this.someFruit = fruit;

    }
   /* @Override
    public final String toString() {
        return someFruit.toString();
    }*/
}
