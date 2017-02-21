package cn.xuxianda.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.xuxianda.entity.DataElement;
import cn.xuxianda.service.DataElementService;

@Service("dataElementService")
public class DataElementServiceImpl extends BaseServiceImpl<DataElement> implements DataElementService {

	public List<DataElement> findAll() {
		return dataElementMapper.selectAll();
	}
	
}
