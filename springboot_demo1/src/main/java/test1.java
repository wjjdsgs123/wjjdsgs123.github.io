import com.mrfz.fzclass.Cat;
import org.yaml.snakeyaml.constructor.Construct;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class test1 {
    public static void main(String[] args) throws Exception {
        // 反射
        // 类的全路径
        String path = "com.mrfz.fzclass.Cat";
        // 获取类的class对象
        Class<?> cls = Class.forName(path);
    /*     System.out.println(cls.getName());
        System.out.println(cls.getClass()); */

        //  给对象创建实例
        // Object cat1=cls.getConstructor(Integer.class).newInstance(10);
        Object cat1 =cls.getConstructor(int.class).newInstance(120);
        Object cat2=cls.getConstructor(int.class).newInstance(500);

        Field id = cls.getField("id");
        System.out.println(id.get(cat1));
        System.out.println(id.get(cat2));

        Method method = cls.getMethod("say");
        method.invoke(cat1);


    }
}
