package bll;

import java.util.List;
import java.util.NoSuchElementException;


import dao.ProductDAO;
import model.Product;
import presentation.UpdateAux;

public class ProductBLL {
    private ProductDAO productDAO;

    public ProductBLL() {

        productDAO = new ProductDAO();
    }

    public Product findProductById(int id) {
        Product cl = productDAO.findById(id);
        if (cl == null) {
            throw new NoSuchElementException("The product with id =" + id + " was not found!");
        }
        return cl;
    }
    public void deleteById(int id) {
        productDAO.deleteById(id);

    }

    public List<Product> findAll() {
        List<Product> cl = productDAO.findAll();
        if (cl == null) {
            throw new NoSuchElementException("The table was not found!");
        }
        return cl;
    }

    public void insert(Product x) throws IllegalAccessException {

        Product cl = productDAO.insert(x);
    }

    public void update(Product x, UpdateAux updateAux) throws IllegalAccessException, NoSuchFieldException {

        productDAO.update(x,updateAux);
    }
}
