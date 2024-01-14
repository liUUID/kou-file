package com.free.fs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.free.fs.model.UserRole;

import java.util.List;

/**
 * @Author: liyuanbin996@gmail.com
 * @Date: 2023/6/30 10:19
 */
public interface UserRoleService extends IService<UserRole> {

    List<String> getRoleByUserId(Long userId);
}
