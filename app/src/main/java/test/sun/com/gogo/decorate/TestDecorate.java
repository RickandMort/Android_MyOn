package test.sun.com.gogo.decorate;

/**
 * 装饰模式练习
 * @description: Created by sunxiaofei on 2019/2/27.
 */
public class TestDecorate {

    public static void main(String[] args){
        Student student = new Student("小明");

        Sdanl sdanl = new Sdanl();
        Shirt shirt = new Shirt();

        sdanl.decoratAdd(student);
        shirt.decoratAdd(sdanl);
        shirt.show();


    }
}
