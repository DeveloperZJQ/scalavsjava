package designpatterns.principle;

/**
 * @author happy
 * @since 202
 */
public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        DD dd = new DD();
        dd.depend1(new AA());
        dd.depend1(new BB());
    }
}

interface A {
    void operation1();
}

interface B {
    void operation2();

    void operation3();
}

interface C {
    void operation4();

    void operation5();
}

class BB implements A, B, C {
    @Override
    public void operation1() {
        System.out.println("BB->A:operation1");
    }

    @Override
    public void operation2() {
        System.out.println("BB->B:operation2");
    }

    @Override
    public void operation3() {
        System.out.println("BB->B:operation3");
    }

    @Override
    public void operation4() {
        System.out.println("BB->C:operation4");
    }

    @Override
    public void operation5() {
        System.out.println("BB->C:operation5");
    }
}

class AA implements A, B, C {
    @Override
    public void operation1() {
        System.out.println("AA->A:operation1");
    }

    @Override
    public void operation2() {
        System.out.println("AA->B:operation2");
    }

    @Override
    public void operation3() {
        System.out.println("AA->B:operation3");
    }

    @Override
    public void operation4() {
        System.out.println("AA->C:operation4");
    }

    @Override
    public void operation5() {
        System.out.println("AA->C:operation5");
    }
}

class DD {
    void depend1(A a){
        a.operation1();
    }
    void depend2(B b){
        b.operation2();
    }
    void depend3(B b){
        b.operation3();
    }
}