package HomeWork.GetyerSetterIsoba4ka;


public class Dog {

    private double age;

    public Dog(double age) {
        this.age = age;
    }

    public double getAge() {
        return age;
    }
//gnjksfhgkldfjgkl
    public void setAge(double age) {
        this.age = age;
    }
    public double realityAgeHuman(){
        return age*7;
    }

    @Override
    public String toString() {
        return "переопределили метод ту стринг";
    }

    public  String getSystemInfo(){
        return "то же самое что и метод тустринг, только получше";
    }
}
