import java.time.LocalDate;

public class Customer {
    String name = "TheFirstCustomer";
    int times = 0;
    LocalDate lastTime = LocalDate.of(1111,1,11);

    public Customer(String name, int times, LocalDate lastTime) {
        this.name = name;
        this.times = times;
        this.lastTime = lastTime;
    }
    public Customer(){};


    @Override
    public String toString() {
        return "Customer{" +
                "名字：" + name +
                ", 来了第" + times + "次" +
                ", 最后一次为=" + lastTime +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public LocalDate getLastTime() {
        return lastTime;
    }

    public void setLastTime(LocalDate lastTime) {
        this.lastTime = lastTime;
    }
}
