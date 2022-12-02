import com.sun.javaws.IconUtil;

import java.time.LocalDate;
import java.util.ArrayList;

public class MyAnimalShop implements AnimalShop{
    double money = 0;
    ArrayList<Animal> animals = new ArrayList<Animal>();
    ArrayList<Customer> customers = new ArrayList<Customer>();
    boolean open;
    //记录前一天的余额，默认为10
    double lastMoney = 10;

//买入动物
    @Override
    public void addAnimal( Animal animal) {
        try {
            judgeMoney(money - animal.price);
            animals.add(animal);
            this.money -= animal.price;
            System.out.println("已添加动物："+animal.toString());
        } catch (InsufficientBalanceException e){
            System.out.println("InsufficientBalanceException:"+e);
        }
    }

//招待客户
    @Override
    public void haveCustomer(Customer customer) {
        System.out.println("默认出售后入列的动物");
        customers.add(customer);

        try{
            customer.times++;
            customer.lastTime = LocalDate.now();
            judgeAnimal(animals);
            this.money += animals.get(animals.size()-1).getPrice();
            System.out.println("你卖出了"+animals.get(animals.size()-1).toString());
            animals.remove(animals.size()-1);
        }catch (AnimalNotFoundException e){
            System.out.println("AnimalNotFoundException:没动物啦");
        }
    }

//歇业
    @Override
    public void open() {
        for(int i=0;i<customers.size();i++){
            if(customers.get(i).lastTime.isEqual(LocalDate.now())){
                System.out.println(customers.get(i).toString());
            }
        }
        System.out.println("今天收入为："+(money - lastMoney));
    }


    static void judgeMoney(double a) throws InsufficientBalanceException{
        if(a < 0){
            throw new InsufficientBalanceException(a);
        }
    }

    static void judgeAnimal(ArrayList<Animal> animals) throws AnimalNotFoundException {
        if (animals.isEmpty()) {
            throw new AnimalNotFoundException();
        }
    }



    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
