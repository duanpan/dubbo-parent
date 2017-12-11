import cn.dp.Entity.User;
import cn.dp.api.UserApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@ContextConfiguration(locations = { "classpath:spring-dubbo-consumer-test.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDubboClient {

    @Resource
    private UserApi userApi;

    @Test
    public void testDubbo(){
       User user= userApi.findUserById(666);
        System.out.println("调用dubbo-service成功--------------"+user.toString());
    }

}
