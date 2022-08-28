package rpc.rpc02;

import java.io.IOException;

/**
 * @author happy
 * @since 2022/8/28
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Stub stub = new Stub();
        System.out.println(stub.findUserById(123));
    }
}
