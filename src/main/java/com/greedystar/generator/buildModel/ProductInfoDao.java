package com.greedystar.generator.buildModel;

import com.greedystar.generator.buildModel.ProductInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lhm
 * Date  2019-06-07
 */
@Mapper
public interface ProductInfoDao {

    public ProductInfo get(String id);

    public List<ProductInfo> findList(ProductInfo productInfo);

    public List<ProductInfo> findAllList();

    public int insert(ProductInfo productInfo);

    public int insertBatch(List<ProductInfo> productInfos);

    public int update(ProductInfo productInfo);

    public int delete(ProductInfo productInfo);

}