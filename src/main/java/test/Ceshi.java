package test;


public class Ceshi {
    public static void main(String[] args) {
        BB bb = new BB();
        bb.py();
    }
}

class CC{
    CC cc;
    public CC(){
        System.out.println(1111);
    }

    public void test(){
        System.out.println("test-->");
    }
}
class BB{
    CC c = new CC();
    public void py(){
        CC cc = c.cc;
    }
}