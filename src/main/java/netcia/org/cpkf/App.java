package netcia.org.cpkf;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
        HelloWorld hello = new HelloWorld();
        LoveWorld love = new LoveWorld();
        System.out.println( hello.SayHello());
        System.out.println(love.SayLove());
    }
}
