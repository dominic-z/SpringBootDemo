import com.example.HelloSpringApplication;
import com.example.components.MethodInjectApple;
import com.example.components.ProtoApple;
import com.example.utils.SpringContextUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author dominiczhu
 * @date 2020/8/18 5:00 下午
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {HelloSpringApplication.class})//指定配置类
public class DataInjectionTestDemo {
    @Test
    public void testMethodInject(){
        MethodInjectApple methodInjectApple = (MethodInjectApple)SpringContextUtil.applicationContext.getBean("methodInjectApple");
        ProtoApple apple = methodInjectApple.getApple();
        System.out.println(apple);
    }

}
