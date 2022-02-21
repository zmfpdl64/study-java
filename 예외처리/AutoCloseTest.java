package 예외처리;

public class AutoCloseTest {
    public static void main(String [] args) {
            //리소스 종료
        // try(AutoCloseObj obj = new AutoCloseObj()){
            
        // } catch(Exception e){
        //     System.out.println("예외 부분입니다");
        // }
            
            //강제 오류 발생 리소스 종료
        // try(AutoCloseObj obj = new AutoCloseObj()) {
        //     throw new Exception();
        // } catch(Exception e) {
        //     System.out.println(e);
        // }

            //향상된 try-with-resource
        AutoCloseObj a = new AutoCloseObj();
        try(a) {
            throw new Exception();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
