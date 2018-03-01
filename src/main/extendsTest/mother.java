package main.extendsTest;

/**
 * @author creator mafh 2018/3/1 15:09
 * @author updater mafh
 * @version 1.0.0
 * @description
 */
public class mother {
    public static void sayHello(Father father){
        father.say();
    }
    public static void main(String[] args) {
        Child child = new Child();
        sayHello(child);
    }
}
