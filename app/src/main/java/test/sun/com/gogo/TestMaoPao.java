package test.sun.com.gogo;

import java.util.Arrays;

/**
 * @description: Created by sunxiaofei on 2019/2/21.
 */
public class TestMaoPao {
    public static void main(String[] args){

        int a[] = {2,3,7,6,5,2,4};
        /**
         *
         */
//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a.length-1;j++){
//                if(a[i]<a[j]){
//                    int temp;
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }


//        /**
//         * 冒泡排序
//         */
//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a.length-1-i;j++){
//                if(a[j]>a[j+1]){
//                    int temp;
//                    temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                }
//            }
//        }

        /**
         * 选择排序
         */
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }

        System.out.print(Arrays.toString(a));
    }
}
