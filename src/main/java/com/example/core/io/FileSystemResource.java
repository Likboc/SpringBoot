package com.example.core.io;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 系统文件加载器
 */
public class FileSystemResource implements Resource {

    private final String path;
    public FileSystemResource(String path) {
        this.path = path;
    }

    /**
     * 使用nio包完成
     * @return
     * @throws IOException
     */
    @Override
    public InputStream getInputStream() throws IOException {
        Path path = new File(this.path).toPath();
        return Files.newInputStream(path);
    }
}
