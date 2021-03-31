package com.example.shopmail.shopmailproduct;

import com.example.shopmail.shopmailproduct.service.BrandService;
import com.example.shopmail.shopmailproduct.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@Slf4j
@SpringBootTest
class ShopmailProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Autowired
	CategoryService categoryService;

	@Test
	public void testFindPath(){
		Long[] catelogPath = categoryService.findCatelogPath(225L);
		log.info("完整路径： {}", Arrays.asList(catelogPath));
	}



//	@Test
//	public void testUpload() throws FileNotFoundException{
//		// Endpoint以杭州为例，其它Region请按实际情况填写。
//		String endpoint = "oss-cn-shenzhen.aliyuncs.com";
//        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
//		String accessKeyId = "LTAI4GCyHVAKr6VY3pxoQidM";
//		String accessKeySecret = "8FTBFvS3z4Av3iRjekIt4UKphgPQR6";
//
//        // 创建OSSClient实例。
//		OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        // 上传文件流。
//		InputStream inputStream = new FileInputStream("E:\\oppo.png");
//		ossClient.putObject("shopmail-hello", "oppo.png", inputStream);
//
//        // 关闭OSSClient。
//		ossClient.shutdown();
//
//		System.out.println("上传完成....");
//	}

}
