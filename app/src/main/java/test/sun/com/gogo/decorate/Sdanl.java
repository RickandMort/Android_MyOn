package test.sun.com.gogo.decorate;

/**
 * @description: Created by sunxiaofei on 2019/2/27.
 */
public class Sdanl extends Decorataon {
    @Override
    public void show() {
        System.out.println("Sdanl:");
        super.show();
    }

    public void getNum(){
        System.out.println("Sdanl: GetNumMethod:");
    }
}
