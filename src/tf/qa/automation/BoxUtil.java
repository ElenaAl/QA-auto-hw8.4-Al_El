package tf.qa.automation;

public class BoxUtil {
    /*
    скопировать содержимое из одной коробки в другую.
    Box(dest) в которую будем копировать может быть типизирована любым родителем объекта
    содержащимся в Box(src)
     */
    public static <T> void copyFromBoxToBox(final Box<? extends T> src, final Box<? super T> dest) {
        dest.put(src.get());
        System.out.println(dest.get());
    }

    /*
    скопировать содержимое из Box(src) которая может быть типизирована только классом Fruit и его наследниками,
    при условии что содержащийся фрукт свежий  (fresh==true).
    Box(dest) в которую будем копировать  может быть типизирована любым родителем объекта содержащимся в Box(src)
     */
    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        Fruit fruit = src.get();
        if (src.get() != null && fruit.isFresh()) {
            dest.put(src.get());
            System.out.println(dest.get());
        } else {
            if (src.get() != null) {
                System.out.println("Похоже свежих фруктов нет");
            } else {
                System.out.println("Похоже фруктов вообще нет");
            }
        }
    }

    /*вывести в консоль (toString()) объект второй коробки.
    должна быть коробка, которая содержит в себе коробку с чем-то.
    а содержимое этой внутренней коробки нужно напечатать
    */
    public static <T> void printElementFromTwoBoxes(final Box<T> secondBox) {
        System.out.println(secondBox.get());
    }

    /*
    вывести в консоль (toString()) объект последней коробки
    *
    * box Box, которая содержит в себе любое количество вложенных Box, в последней из которых может быть любой объект.
     */

    public static <T> void printElementFromBoxes(final Box<T> box) {

            Box<T> boxE = new Box<>();
            boxE.put(box.get()); // смотрим, есть ли еще коробочка внутри

                if (boxE.get() == null) {  // если null, ищем дальше
                    try {
                        printElementFromBoxes(boxE);

                    } catch (NullPointerException e) {
                        System.out.println(box.get());
                    }
                } else {
                    System.out.println(box.get());
                }
            }
        }













