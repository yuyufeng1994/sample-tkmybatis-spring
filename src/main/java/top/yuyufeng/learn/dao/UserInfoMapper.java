package top.yuyufeng.learn.dao;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import top.yuyufeng.learn.modal.UserInfo;

import java.util.List;

/**
 * @author yuyufeng
 */
public interface UserInfoMapper extends Mapper<UserInfo> {

    /**
     * 批量插入用户
     * @param userInfos
     */
    void insertBatch(@Param("userInfos") List<UserInfo> userInfos);

}