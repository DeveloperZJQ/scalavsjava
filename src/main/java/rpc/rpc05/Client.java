package rpc.rpc05;

import rpc.common.IUserService;

import java.io.IOException;

/**
 * @author happy
 * @since 2022/8/28
 */
public class Client {
    public static void main(String[] args) throws IOException {
        IUserService service = Stub.getStub();
        System.out.println(service.findUserById(123));
    }
}
