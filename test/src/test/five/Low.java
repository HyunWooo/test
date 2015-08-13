package test.five;

public class Low extends Super {

    @Override
    public void doSomething() {
          System.out.println("low dosomething..");
    }

    @Override
    public void make(){
          System.out.println("low make....");
    }

    public void lowOwnMake() {
          System.out.println("내거야..");
    }
}

