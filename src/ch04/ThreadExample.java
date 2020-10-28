package ch04;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thead= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        });
        thead.start();
        //위의 코드를 람다식을 이용해서 변환한 코드
        Thread thread1=new Thread(()->System.out.println("Helloworld"))0;
        thread1.start();

    }
}
