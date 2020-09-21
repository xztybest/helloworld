package test.demo;

public class Puppy {
    int puppyAge;
    public Puppy(String name){
        System.out.println("小狗的名字是："+name);
    }
    public void setAge(int age){
        puppyAge=age;
    }
    public int getAge(){
        System.out.println("小狗的年龄魏:"+puppyAge);
        return puppyAge;
    }
}
