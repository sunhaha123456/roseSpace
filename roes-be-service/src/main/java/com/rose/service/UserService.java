package com.rose.service;

import com.rose.common.data.base.PageList;
import com.rose.data.entity.TbSysUser;
import com.rose.data.to.request.UserAddRequest;
import com.rose.data.to.request.UserSearchRequest;
import com.rose.data.to.vo.UserRedisVo;

/**
 * 功能：user service
 * @author sunpeng
 * @date 2018
 */
public interface UserService {
    PageList<TbSysUser> search(UserSearchRequest param) throws Exception;
    void add(UserAddRequest param) throws Exception;
    void opert(Long id, Integer state);
    void updateRole(Long id, Long roleId);
    TbSysUser getDetail(Long id);
    void userRedisInfoSave(String redisKey, UserRedisVo userRedis);
}