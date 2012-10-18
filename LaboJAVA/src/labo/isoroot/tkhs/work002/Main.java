package labo.isoroot.tkhs.work002;

import java.util.List;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

//        Circle circle = new Circle(2);
//
//        if (args.length == 0) {
//            System.out.println("半径： 2");
//        } else {
//            System.out.println("半径：" + args[0]);
//        }
//        System.out.println("面積：" + circle.getArea());
//
//
//        Rectangle rectangle = new Rectangle(2, 4);
//
//        System.out.println("面積：" + rectangle.getArea());
//
//
//        Triangle triangle = new Triangle(2, 4);
//        System.out.println("底辺：" + triangle.getBase() + "　高さ：" + triangle.getHeight());
//        System.out.println("面積：" + triangle.getArea());


        FormBox fbox = new FormBox(4);
        List<Form> formList = fbox.getFormList();

        for (Form form : formList) {
            System.out.println("---");
            System.out.println(form.getDescription());
        }
    }

}
