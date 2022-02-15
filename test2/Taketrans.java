package test2;

public class Taketrans {
    public static void main(String [] args) {
        Student woojin = new Student("woojin", 10000);
        Student bin = new Student("bin", 5000);
        Bus 마을 = new Bus(10);
        Subway 내선순환 = new Subway(12);

        woojin.takeSubway(내선순환);
        bin.takeBus(마을);

        woojin.studentinfo();
        bin.studentinfo();
        마을.businfo();
        내선순환.subwayinfo();
        
    }
    
}
