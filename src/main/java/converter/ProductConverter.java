package converter;

import dto.ProductRequest;
import entity.Category;
import entity.Product;

public class ProductConverter {

    public static Product convertRequestToEntity(ProductRequest request) {

        Product product = new Product();
        product.setCategory(new Category(request.getCategory()));
        product.setTitle(request.getTitle());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setQuantity(request.getQuantity());

        return product;
    }
}
