import java.util.*;
class a{
    public void pl()
    {
        System.out.println("hello students");
    }
}
class b extends a{
    public void r()
    {
        System.out.println("Hello teachers");
    }
}
public class single{
    public static void main(String[] args){
        a h=new a();
        h.pl();
        b y=new b();
        y.pl();
        y.r();
    }
}