package com.free.fs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.free.fs.model.Permission;
import org.apache.ibatis.annotations.Mapper;

/**
 * 权限表mapper接口
 *
 * @author yuanbin li
 * @date 2021/3/12
 */
@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {
}
