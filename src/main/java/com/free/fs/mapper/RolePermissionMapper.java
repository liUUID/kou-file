package com.free.fs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.free.fs.model.RolePermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * juese1权限关联表mapper接口
 *
 * @author yuanbin li
 * @date 2021/3/12
 */
@Mapper
public interface RolePermissionMapper extends BaseMapper<RolePermission> {

    /**
     * 根据角色code码集合查询所有权限标识
     *
     * @param roleCodes 角色code码集合
     * @return
     */
    List<String> selectPermissionByRoles(@Param("roleCodes") List<String> roleCodes);
}
