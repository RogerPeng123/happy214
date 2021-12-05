package com.happy.lucky.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 管理员角色链接表
 * </p>
 *
 * @author psy <aileshang0226@163.com>
 * @since 2021-09-30
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysUserRole extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;

    private Long roleId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Integer status;


}
