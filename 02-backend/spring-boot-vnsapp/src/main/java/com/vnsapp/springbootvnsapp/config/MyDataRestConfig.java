package com.vnsapp.springbootvnsapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.vnsapp.springbootvnsapp.entity.Product;
import com.vnsapp.springbootvnsapp.entity.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
  
  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

    // list the unsupported action we want to set
    HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST,
      HttpMethod.DELETE, HttpMethod.PATCH};

    // disable HTTP methods for Product: PUT, POST, DELETE
    config.getExposureConfiguration()
          .forDomainType(Product.class)
          .withItemExposure((metData, httpMethods) -> httpMethods.disable(theUnsupportedActions)) // for single item
          .withCollectionExposure((metData, httpMethods) -> httpMethods.disable(theUnsupportedActions)); // for collection items

    // disable HTTP methods for ProductCategory: PUT, POST, DELETE
    config.getExposureConfiguration()
          .forDomainType(ProductCategory.class)
          .withItemExposure((metData, httpMethods) -> httpMethods.disable(theUnsupportedActions)) // for single item
          .withCollectionExposure((metData, httpMethods) -> httpMethods.disable(theUnsupportedActions)); // for collection items      
  
  }

}
