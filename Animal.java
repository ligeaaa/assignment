public abstract class Animal {
    String name;
    int age;
    int gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double price;

    Animal(String name,int age,int gender,double price){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.price = price;
    }

    Animal(String name,int age,int gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public abstract String toString();

}
