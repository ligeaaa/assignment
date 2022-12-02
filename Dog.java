public class Dog extends Animal{

    boolean VaccineInjected;

    public Dog(String name, int age, int gender, double price) {
        super(name, age, gender, price);
    }

    public void setVaccineInjected(boolean vaccineInjected) {
        VaccineInjected = vaccineInjected;
    }

    @Override
    public String toString() {
        String ans = name+"的年龄为："+age+",性别为："+gender+"，价格为："+price;
        return ans;
    }

    public boolean isVaccineInjected(){
        return VaccineInjected;
    }


}
