public class Cat extends Animal{

    double price = 200;

    public Cat(String name, int age, int gender) {
        super(name, age, gender);
    }


    @Override
    public String toString() {
        String ans = name+"的年龄为："+age+",性别为："+gender+"，价格为："+price;
        return ans;
    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
