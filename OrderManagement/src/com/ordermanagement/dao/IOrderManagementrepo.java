package com.ordermanagement.dao;

import com.ordermanagement.model.*;
import java.util.List;

public interface IOrderManagementrepo {
	
	   void createProduct(User user, Product product);
	    void createUser(User user) throws Exception;
		List<Product> getAllProducts();
	  
	}


