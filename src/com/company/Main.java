package com.company;
import test.demo.Puppy;
import test.demo.hello2;
public class Main {

    public static void main(String[] args){
        Puppy myPuppy=new Puppy("tomcat");
        myPuppy.setAge(3);
        myPuppy.getAge();
        hello2 wellcome=new hello2();
        wellcome.gethello();
        wellcome.primaryout();;

        /* 使用构造器创建两个对象 */
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");

        // 调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}

