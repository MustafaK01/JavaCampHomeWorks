package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.jLoggerManager;

public class ProductManager implements ProductService {
	private LoggerService loggerService;
	private ProductDao productDao;
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		this.productDao=productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		// �� Kodlar� yaz�l�r
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor");
			return;
		}
		this.productDao.add(product);
		this.loggerService.logToSystem(product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
