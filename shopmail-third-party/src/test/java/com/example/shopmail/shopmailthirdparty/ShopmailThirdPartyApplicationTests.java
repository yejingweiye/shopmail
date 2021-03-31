package com.example.shopmail.shopmailthirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class ShopmailThirdPartyApplicationTests {

	@Autowired
	OSSClient ossClient;

	@Test
	public void testUpload() throws FileNotFoundException {
		// 上传文件流。
		InputStream inputStream = new FileInputStream("E:\\xiaomi.png");
		ossClient.putObject("shopmail-hello", "hahaha.png", inputStream);
		// 关闭OSSClient。
		ossClient.shutdown();
		System.out.println("上传完成....");
	}

	@Test
	void contextLoads() {
	}



}
