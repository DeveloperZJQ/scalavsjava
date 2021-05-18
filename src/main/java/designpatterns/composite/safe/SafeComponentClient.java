package designpatterns.composite.safe;

/**
 * @author happy
 * @since 2021-05-05
 */
public class SafeComponentClient {
    public static void main(String[] args) {
        SafeComposite safeComposite1 = new SafeComposite();
        SafeLeaf safeLeaf1 = new SafeLeaf("1");
        SafeLeaf safeLeaf2 = new SafeLeaf("2");
        SafeLeaf safeLeaf3 = new SafeLeaf("3");
        safeComposite1.add(safeLeaf2);
        safeComposite1.add(safeLeaf1);
        safeComposite1.add(safeLeaf3);
        safeComposite1.operator();
    }
}
