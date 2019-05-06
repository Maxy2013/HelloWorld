package com.spring.springboot.module.web;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @author liuzheng
 * @since 11:40 2019/4/25
 */
@RestController
@RequestMapping("/download")
public class DownloadController {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/downloadFile")
    public void downloadFile(String url, HttpServletResponse response){
        File file = new File(url);
        if (!file.exists()) {
            log.error("the file[{}] does not exist!", url);
            return;
        }

        String fileFinalName = url.substring(url.lastIndexOf('/') + 1);
        log.debug("fileFinalName --> [{}]", fileFinalName);

        // 设置头部信息
        response.addHeader("Content-Disposition", "attachment;fileName=" + fileFinalName);
        response.setCharacterEncoding("utf-8");
        response.setContentType("multipart/form-data");

        // 将文件流写入客户端
        BufferedInputStream bis = null;
        OutputStream os = null;
        FileInputStream fis = null;
        try {
            os = response.getOutputStream();
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            IOUtils.copy(bis, os);
            os.flush();

        } catch (IOException e) {
            log.error("failed to export the file !", e);
        } finally {
            if (null != bis) {
                try {
                    bis.close();
                } catch (IOException e) {
                    log.error("close the buffer failed !", e);
                }
            }
            if (null != fis) {
                try {
                    fis.close();
                } catch (IOException e) {
                    log.error("close the fileInputStream failed !", e);
                }
            }
            if (null != os) {
                try {
                    os.close();
                } catch (IOException e) {
                    log.error("close the outputStream failed !", e);
                }
            }
        }
    }
}