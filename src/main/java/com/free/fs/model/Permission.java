package com.free.fs.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 权限表实体
 *
 * @author yuanbin li
 * @date 2021/3/12
 */
@Data
@TableName("sys_permission")
@EqualsAndHashCode(callSuper = true)
public class Permission extends Model<Permission> {

    /**
     * 自增id
     */
    @TableId
    private Long id;

    /**
     * 权限标识
     */
    private String PermissionCode;

    /**
     * 权限名称
     */
    private String PermissionName;
}
