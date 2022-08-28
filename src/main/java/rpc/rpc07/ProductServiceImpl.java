package rpc.rpc07;

import rpc.common.IProductService;
import rpc.common.IUserService;
import rpc.common.Product;
import rpc.entity.User;

/**
 * @author happy
 * @since 2022/8/28
 */
public class ProductServiceImpl implements IProductService {
    @Override
    public Product findProductById(Integer id) {
        return new Product(id,"white");
    }
}