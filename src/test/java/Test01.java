import org.junit.Test;

public class Test01 {

    @Test
    public void test01(){
        String  s="good";
        char[] c={'a','b','c'};
        values(s,c);
        System.out.println(s+" and "+c);
    }

    public void values(String s,char[] c){
        s = "test ok";
        c[0]='g';
    }

}
