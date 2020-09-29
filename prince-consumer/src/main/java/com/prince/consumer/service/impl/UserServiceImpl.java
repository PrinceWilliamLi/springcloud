package com.prince.consumer.service.impl;

import com.prince.consumer.model.sys.User;
import com.prince.consumer.mapper.sys.UserMapper;
import com.prince.consumer.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kyle
 * @since 2020-09-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
