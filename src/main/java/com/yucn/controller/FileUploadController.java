package com.yucn.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2018/11/9.
 */
@RestController
@RequestMapping("/upload")
@Slf4j
public class FileUploadController {
    @PostMapping
    public Object multiSave(MultipartFile file) throws IOException {
        String path = "D:/tool/b.pdf";
        File desFile = new File(path);
        FileUtils.copyInputStreamToFile(file.getInputStream(),desFile);
        return null;
    }
}
