package rpc.rpc07;

import rpc.common.IProductService;

/**
 * @author happy
 * @since 2022/8/28
 */
public class Client {
    public static void main(String[] args) throws Exception {
        IProductService service = (IProductService) Stub.getStub(IProductService.class);
        System.out.println(service.findProductById(321));
    }
}
