package cn.xuxianda.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.xuxianda.entity.Permission;
import cn.xuxianda.service.PermissionService;

@Service("permissionService")
public class PermissionServiceImpl extends BaseServiceImpl<Permission> implements PermissionService {

	public List<Permission> findPermissionByLoginId(Integer accLoginId,
			String type) {
		return permissionMapper.findPermissionByLoginId(accLoginId, type);
	}

}
