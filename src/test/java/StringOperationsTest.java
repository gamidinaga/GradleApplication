import org.example.StringOperations;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

public class StringOperationsTest {

    private static StringOperations strOps;
    @BeforeAll
    public static void init(){
        strOps =new StringOperations();
    }

    @Test
    @Order(1)
    public void test1(){
        System.out.println("Test1 ------");
        boolean actulRes=strOps.checkImmutability("Naga","Raju");
     assertEquals(false,actulRes);
    }
    @Test
    @Order(2)
    public void test2(){
        System.out.println("Test2 ------");
        String st=new String("Naga");
        boolean actulRes=strOps.checkImmutability("Naga","Naga");
        assertEquals(true,actulRes);
    }
    @Test
    @Order(3)
    public void test3(){
        System.out.println("Test3 ------");
        String st=new String("Naga");
        boolean actulRes=strOps.checkImmutability("Naga",st);
        assertEquals(true,actulRes);
    }
    @Test
    @Order(4)
    public void test4(){
        System.out.println("Test4 ------");
        String st1=new String("Naga");
        String st2=new String("Naga");
        boolean actulRes=strOps.checkImmutability(st1,st2);
        assertEquals(true,actulRes);
    }



}
