package designpatterns.singleton;

/**
 * @author DeveloperZJQ
 * @since 2022-8-26
 */
public enum EnumSingletonReview {
    INSTANCE;

    public void invokeMethod() {
        INSTANCE.printOK("HELLO WORD");
    }

    private void printOK(String word) {
        System.out.println("print ok--->" + word);
    }
}
