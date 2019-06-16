package com.greedystar.generator.buildModel;

import com.greedystar.generator.buildModel.ProductInfoDao;
import com.greedystar.generator.buildModel.ProductInfo;
import com.greedystar.generator.buildModel.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author lhm
 * Date  2019-06-07
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoDao productInfoDao;
    
    @Override
    public ProductInfo get(String id){
        return productInfoDao.get(id);
    }
    
    @Override
    public List<ProductInfo> findList(ProductInfo productInfo) {
        return productInfoDao.findList(productInfo);
    }
    
    @Override
    public List<ProductInfo> findAllList() {
        return productInfoDao.findAllList();
    }
    
    @Override
    public int insert(ProductInfo productInfo) {
        return productInfoDao.insert(productInfo);
    }
    
    @Override
    public int insertBatch(List<ProductInfo> productInfos){
        return productInfoDao.insertBatch(productInfos);
    }
    
    @Override
    public int update(ProductInfo productInfo) {
        return productInfoDao.update(productInfo);
    }
    
    @Override
    public int delete(ProductInfo productInfo) {
        return productInfoDao.delete(productInfo);
    }

}
