package main.testModel;

/**
 * @author creator mafh 2017/10/19 17:55
 * @author updater mafh
 * @version 1.0.0
 */
public class Test {

    public void say(){
        System.out.println("this is method-say");
    }

    public void may() {
        Father father = new Father();
        father.helpSay(this);
    }
}
