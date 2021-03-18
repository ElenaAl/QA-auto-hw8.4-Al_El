package tf.qa.automation;

public class Main {

    public static void main(final String[] args) {


        //1.проверяем метод copyFromBoxToBox
        Box<Integer> one = new Box<>();
        one.put(5);
        Box<Object> two = new Box<>();
        two.put(4);

        BoxUtil.copyFromBoxToBox(one, two);

        //2.проверяем метод copyFreshFruitFromBoxToBox
        Box<Apple> boxWithApple = new Box<>();
        boxWithApple.put(new Apple("apple1", false));

        Box<Fruit> boxForFruits = new Box<>();
        boxForFruits.put(new Fruit());

        BoxUtil.copyFreshFruitFromBoxToBox(boxWithApple, boxForFruits);

        //3.проверяем метод printElementFromTwoBoxes
        Box<Apple> boxWithApple6 = new Box<>();
        boxWithApple6.put(new Apple("apple6", false));
        Box<Apple> boxWithApple2 = new Box<>();
        boxWithApple2.input(boxWithApple6);
        BoxUtil.printElementFromTwoBoxes(boxWithApple2);


        //4.проверяем метод printElementFromBoxes
        // это попытка сделать матрешку =(

        Box<Fruit> boxWithApple4 = new Box<>();
        Box<Fruit> boxWithApple5 = new Box<>();
        Box<Fruit> boxWithApple7 = new Box<>();
        boxWithApple7.put(new Apple("apple7", false));
        Box<Fruit> boxWithApple8 = new Box<>();
        boxWithApple8.put(new Apple("apple8", false));
        Box<Fruit> boxWithApple9 = new Box<>();
        boxWithApple9.put(new Apple("apple9", false));



        boxWithApple4.input(boxWithApple5);
        boxWithApple5.input(boxWithApple7);
        boxWithApple7.input(boxWithApple8);
        boxWithApple8.input(boxWithApple9);

        BoxUtil.printElementFromBoxes(boxWithApple4);
    }


}

