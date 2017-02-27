package com.eshop4j.web.service;

import java.util.List;

import com.eshop4j.core.datatable.DataTable;
import com.eshop4j.core.datatable.DataTableReturn;
import com.eshop4j.core.generic.GenericService;
import com.eshop4j.web.model.CimOrgRisk;
import com.eshop4j.web.service.CimOrgRiskService;
 /**
 * 
 * @描述： CimOrgRiskService服务接口
 * 
 * @创建人： Mignet
 * 
 * @创建时间：2016年11月22日 11:03:54
 * 
 * Copyright (c) 深圳领会科技有限公司-版权所有
 */
public interface CimOrgRiskService extends GenericService<CimOrgRisk,Long>{

	/**
	 * 查询CimOrgRisk列表,为data-tables封装
	 * @param dataTable
	 * @return
	 */
	DataTableReturn selectByDatatables(DataTable dataTable);
	
	/**
	 * 查询机构风控信息
	 * @author yalin 
	 * @date 2016年11月22日 上午11:12:07  
	 * @param orgNumber
	 * @return
	 */
	public List<CimOrgRisk> queryOrgRiskInfoByOrgNumber(String orgNumber);
}