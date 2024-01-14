package com.free.fs.common.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * 本地上传配置资源类
 *
 * @author yuanbin li
 * @date 2021/3/10
 */
@Getter
@Setter
public class LocalProperties {

    private String uploadDir;
    private String uploadMapping;

    private String domain;
}
