public class DaoProductsFactory {
    private static Products productsDao;

    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new MySqlProductsDao();
        }
        return productsDao;
    }
}
