package tf.qa.automation;

public class Main {

    public static void main(final String[] args) {
        //1.проверяем метод copyFromBoxToBox
        method1Check1();

        //2.проверяем метод copyFreshFruitFromBoxToBox
        method2Check1();

        //3.проверяем метод printElementFromTwoBoxes
        method3Check1();
        method3Check2();

        //4.проверяем метод printElementFromBoxes
        method4Check1();
        method4Check2();

    }
    static void method1Check1() {
        Box<Integer> one = new Box<>();
        one.put(5);
        Box<Object> two = new Box<>();
        two.put(4);

        BoxUtil.copyFromBoxToBox(one, two);
    }
    static void method2Check1() {
        Box<Apple> boxWithApple = new Box<>();
        boxWithApple.put(new Apple("apple1", false));

        Box<Fruit> boxForFruits = new Box<>();
        boxForFruits.put(new Fruit());

        BoxUtil.copyFreshFruitFromBoxToBox(boxWithApple, boxForFruits);
    }

    static void method3Check1() {
        Box<Apple> box2 = new Box<>();
        box2.put(new Apple("apple2", false));
        Box<Box<Apple>> box1 = new Box<>();
        box1.put(box2);
        BoxUtil.printElementFromTwoBoxes(box1);
    }

    static void method3Check2() {
        Box<Apple> box3 = new Box<>();
        box3.put(new Apple("apple3", false));
        Box<Object> box2 = new Box<>();
        box2.put(box3);
        Box<Box<Object>> box1 = new Box<>();
        box1.put(box2);
        BoxUtil.printElementFromTwoBoxes(box1);
    }

    static void method4Check1() {
        Box<Apple> box3 = new Box<>();
        box3.put(new Apple("apple4", false));
        Box<Object> box2 = new Box<>();
        box2.put(box3);
        Box<Box<Object>> box1 = new Box<>();
        box1.put(box2);
        BoxUtil.printElementFromBoxes(box1);
    }

    static void method4Check2() {
        Box<Apple> box = new Box<>();
        box.put(new Apple("apple5", false));
        BoxUtil.printElementFromBoxes(box);
    }

}





