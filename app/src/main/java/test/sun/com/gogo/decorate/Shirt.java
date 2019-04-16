package test.sun.com.gogo.decorate;

/**
 * @description: Created by sunxiaofei on 2019/2/27.
 */
public class Shirt extends Decorataon {

    @Override
    public void show() {
        System.out.println("Shirt:");
        super.show();
    }
}
