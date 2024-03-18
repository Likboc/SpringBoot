package org.springframework.test.bean;

import com.example.core.io.FileSystemResource;
import org.junit.Test;

import java.io.InputStream;

public class ResourceLoaderTest {
    /**
     * 文件系统资源加载
     */
    @Test
    public void ResourceLoad() {
        String path = "src/main/java/com/example/aop/Advice.java";
        FileSystemResource resource = new FileSystemResource(path);
        try {
            InputStream input = resource.getInputStream();
            System.out.println(input.read());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
