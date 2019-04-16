package test.sun.com.gogo.decorate;

/**
 * @description: Created by sunxiaofei on 2019/2/27.
 */
public class Student implements Componet {
    public Student(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("Student:"+name);
    }
}
