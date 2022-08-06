//package GetObjects;
//
//import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
//import com.amazonaws.services.s3.model.S3Object;
//import com.amazonaws.services.s3.model.S3ObjectInputStream;
//import software.amazon.awssdk.core.ResponseInputStream;
//import software.amazon.awssdk.services.s3.S3Client;
//import software.amazon.awssdk.services.s3.model.GetObjectRequest;
//import software.amazon.awssdk.services.s3.model.GetObjectResponse;
//
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class readZipFile {
//
//    public static void main(String[] args) throws IOException {
//
//        String bucket = "cdp-cd-dev";
//        String key = "test/sfdc-data-ingest-8.0.0.jar";
//
////        String bucket = "cmdm-outbound-incremental-data";
////        String key = "shipto/2022/8/1/08-01-2022-13:29:54.zip";
////        String key = "shipto/2022/8/1/08-01-2022-13%3A29%3A54.zip";
////        String key = "shipto%2F2022%2F8%2F1%2F08-01-2022-13%3A29%3A54.zip";
//
//
//        S3Client client = S3Client.builder().build();
//
//        GetObjectRequest request = GetObjectRequest.builder()
//                .bucket(bucket)
//                .key(key)
//                .build();
//
//        ResponseInputStream<GetObjectResponse> response = client.getObject(request);
//
//        String fileName = new File(key).getName();
//        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileName));
//
//
//        byte[] buffer = new byte[4096];
//        int bytesRead = -1;
//
//        while ((bytesRead = response.read(buffer)) != -1) {
//            outputStream.write(buffer, 0, bytesRead);
//        }
//
//
//        response.close();
//        outputStream.close();
//
//    }
//}