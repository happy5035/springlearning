package cn.hu.service;

/**
 * Created by LeeYuan on 2016/8/20.
 */
public class Man extends People {
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man{" +
                "age='" + age + '\'' +
                "name='" + this.getName() + '\'' +
                '}';
    }
}
