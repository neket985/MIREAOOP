package HomeWork.GetyerSetterIsoba4ka;

public class Main {

    public static void main(String[] args) {
 /*       GetterSetter m = new GetterSetter();
        int i = m.getVal();*/
        //Object o = new Object();
        double skolkoSobakeLet = 0.0;
        double c = 0.0;
        Dog sobaka = new Dog(skolkoSobakeLet);
        c = (sobaka.getAge());
        System.err.println("tgfytfytf");
        sobaka.setAge(1.0);
        System.out.println(sobaka.toString());
        System.out.println(sobaka.realityAgeHuman());
    }
}
