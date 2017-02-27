package com.eshop4j.web.service;

import com.eshop4j.core.datatable.DataTable;
import com.eshop4j.core.datatable.DataTableReturn;
import com.eshop4j.core.generic.GenericService;
import com.eshop4j.web.model.CimProductCate;
import com.eshop4j.web.request.ProductCateDataRequest;
import com.eshop4j.web.service.CimProductCateService;
 /**
 * 
 * @描述： 实体Bean
 * 
 * @创建人： liqi
 * 
 * @创建时间：2016年07月14日 18:23:34
 * 
 * Copyright (c) 深圳领会科技有限公司-版权所有
 */
public interface CimProductCateService extends GenericService<CimProductCate,Long>{

	/**
	 * 查询CimProductCate列表,为data-tables封装
	 * @param dataTable
	 * @return
	 */
	DataTableReturn selectByDatatables(DataTable dataTable);

	/**
	 * 查询产品分类列表
	 * @param productCateDataRequest
	 * @return
	 */
	DataTableReturn getCimProductCates(ProductCateDataRequest productCateDataRequest);
}