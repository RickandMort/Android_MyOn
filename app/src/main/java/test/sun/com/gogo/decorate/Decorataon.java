package test.sun.com.gogo.decorate;

/**
 * @description: Created by sunxiaofei on 2019/2/27.
 */
public class Decorataon implements Componet {
    private Componet mcomponet;

    public void decoratAdd(Componet mcomponet) {
        this.mcomponet = mcomponet;
    }

    @Override
    public void show() {
        if(mcomponet!=null){
            mcomponet.show();
        }
    }
}
