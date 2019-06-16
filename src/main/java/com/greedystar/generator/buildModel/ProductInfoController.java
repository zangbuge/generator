package com.greedystar.generator.buildModel;

import com.greedystar.generator.buildModel.ProductInfo;
import com.greedystar.generator.buildModel.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Author lhm
 * Date  2019-06-07
 */
@RestController
@RequestMapping(value = "/productInfo")
public class ProductInfoController {
    @Autowired
    private ProductInfoService productInfoService;

    @RequestMapping(value = {"/list", ""}, method = RequestMethod.GET)
    public Object list() {
        List<ProductInfo> productInfos = productInfoService.findAllList();
        return productInfos;
    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public Object get(@RequestParam String id) {
        ProductInfo productInfo = productInfoService.get(id);
        return productInfo;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestBody ProductInfo productInfo) {
        if (productInfoService.insert(productInfo) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    public String insertBatch(@RequestBody List<ProductInfo> productInfos) {
        if (productInfoService.insertBatch(productInfos) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@RequestBody ProductInfo productInfo) {
        if (productInfoService.update(productInfo) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestBody ProductInfo productInfo) {
        if (productInfoService.delete(productInfo) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

}
