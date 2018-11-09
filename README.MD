
### 创建项目

    - 注意选择1.5.10版本
    - 
### 修改application.properties
    ```
    spring.datasource.driver-class-name=com.mysql.jdbc.Driver
    spring.datasource.url=jdbc:mysql://127.0.0.1:3306/springboot_test?characterEncoding=utf-8&useSSL=false
    spring.datasource.username=root
    spring.datasource.password=YuCn@1227
    
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true
    spring.jpa.open-in-view=true
    
    server.port=8081
    ```
### 测试一：文件上传
    新建controller
    ```
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
    ```
    