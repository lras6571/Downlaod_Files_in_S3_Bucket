//package cmdpackage;
//
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3ClientBuilder;
//import com.amazonaws.services.s3.model.*;
//import org.apache.commons.io.FileUtils;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class AutomationCMDM {
//
//    public static final String BUCKET_NAME = "cmdm-outbound-incremental-data";
//    public static final String FOLDER_KEY = "billto/2022/8/10/08-10-2022-04:44:29.zip";
//    private static AmazonS3 client = AmazonS3ClientBuilder.defaultClient();
//
//
//    public static void main(String[] args) throws IOException {
//        getS3File(BUCKET_NAME, FOLDER_KEY);
//
//    }
//
//
//    public static List<S3Object> getS3Files(String bucketName, List<String> fileNames) {
//        List<S3Object> s3Objects = new ArrayList<>();
//        fileNames.forEach(fileName -> s3Objects.add(
//                client.getObject(new GetObjectRequest(bucketName, fileName))));
//        return s3Objects;
//    }
//
//
//    public static void getS3File(String bucketName, String fileName) throws IOException {
//
//        S3Object s3object = client.getObject(bucketName, fileName);
//        S3ObjectInputStream inputStream = s3object.getObjectContent();
//        FileUtils.copyInputStreamToFile(inputStream, new File("C:\\Sysco\\test.zip"));
//
//    }
//}
