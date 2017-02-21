package cn.xuxianda.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.xuxianda.entity.StoreHouse;
import cn.xuxianda.service.StoreHouseService;

@Service("storeHouseService")
public class StoreHouseServiceImpl extends BaseServiceImpl<StoreHouse> implements StoreHouseService {

	public List<StoreHouse> selectAll() {
		// TODO Auto-generated method stub
		return storeHouseMapper.selectAll();
	}
}
