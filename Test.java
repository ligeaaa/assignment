import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        MyAnimalShop myAnimalShop = new MyAnimalShop();
        Animal dog = new Dog("dog",17,1,10.0);
        Animal cat = new Cat("cat",9,0);
        Customer customer1 = new Customer();
        Customer customer2 = new Customer("theSecondCustomer",0, LocalDate.of(2222,2,22));
        //初始化宠物店，自带一只猫，余额为10
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(cat);
        myAnimalShop.setAnimals(animals);
        myAnimalShop.setMoney(10);

//检查InsufficientBalanceException异常
        myAnimalShop.addAnimal(dog);
//测试买入动物
        myAnimalShop.addAnimal(dog);

        myAnimalShop.haveCustomer(customer1);
        myAnimalShop.haveCustomer(customer2);
        myAnimalShop.haveCustomer(customer2);

        myAnimalShop.open();
        //收入为200，买狗花费10，卖狗和猫，赚210
    }
}
