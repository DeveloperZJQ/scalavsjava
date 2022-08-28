package rpc.rpc06;

import rpc.common.IUserService;

import java.io.IOException;

/**
 * @author happy
 * @since 2022/8/28
 */
public class Client {
    public static void main(String[] args) throws Exception {
        IUserService service = (IUserService) Stub.getStub(IUserService.class);
        System.out.println(service.findUserById(123));
    }
}
