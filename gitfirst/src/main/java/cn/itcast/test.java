package cn.itcast;

public class test {
    public static void main(String[] args) {
        System.out.println("123");
        System.out.println("123");
        System.out.println("123");
    }

    public void test(){
        int i=0;
        i+=10;
    }

    public void test2(){
        System.out.println("234");
        System.out.println("在真main下修改test");
        System.out.println("main修改一些数据");
    }
}
