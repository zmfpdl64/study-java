package 추상클래스.템플릿;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startcar() {
        System.out.println("시동을 켭니다.");
    }
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    final public void run() {
        startcar();
        drive();
        stop();
        turnOff();
    }
}
