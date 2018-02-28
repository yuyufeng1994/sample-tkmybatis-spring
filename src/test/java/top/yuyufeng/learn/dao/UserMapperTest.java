package top.yuyufeng.learn.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.yuyufeng.learn.modal.UserInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author yuyufeng
 * @date 2018/2/27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserMapperTest {
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 测试插入
     */
    @Test
    public void testInsert() {
        UserInfo record = new UserInfo();
        record.setUserName("小yu");
        record.setUserEmail("aa@qq.com");
        record.setCreateTime(new Date());
        int result = userInfoMapper.insert(record);
        System.out.println(result);
    }

    /**
     * 测试查找
     */
    @Test
    public void testSelect() {
        UserInfo record = new UserInfo();
        record.setUserName("小俞2");
        List<UserInfo> list = userInfoMapper.select(record);
        for (UserInfo userInfo : list) {
            System.out.println(userInfo);
        }
    }

    /**
     * 分页查询
     */
    @Test
    public void testSelectPage() {

        PageHelper.startPage(1, 10, "create_time desc");
        //查询分页数据
        List<UserInfo> list = userInfoMapper.selectAll();

        //包装分页对象
        PageInfo<UserInfo> page = new PageInfo<>(list,5);
        System.out.println(page);

        for (UserInfo userInfo : list) {
            System.out.println(userInfo);
        }
    }


    @Test
    public void testInsertBatch() {
        List<UserInfo> list = new ArrayList<>();
        list.add(new UserInfo(null,"用户名batch1",new Date(),"aa@qq.com"));
        list.add(new UserInfo(null,"用户名batch2",new Date(),"aa@qq.com"));
        userInfoMapper.insertBatch(list);

    }

    @Test
    public void test() {

    }


}
