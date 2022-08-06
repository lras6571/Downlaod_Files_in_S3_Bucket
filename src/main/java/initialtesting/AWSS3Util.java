//package GetObjects;
//
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3ClientBuilder;
//import com.amazonaws.services.s3.model.ListObjectsV2Result;
//import com.amazonaws.services.s3.model.S3ObjectSummary;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AWSS3Util {
//    private static AmazonS3 client = AmazonS3ClientBuilder.defaultClient();
//
//    AWSS3Util() {
//    }
//
//    public static List<String> getFileListInsideS3Bucket(String bucketName, String fileNameOrPrefix) {
//        String fileObject;
//        List<String> fileList = new ArrayList<>();
//        ListObjectsV2Result result = client.listObjectsV2(bucketName, fileNameOrPrefix);
//        List<S3ObjectSummary> s3ObjectList = result.getObjectSummaries();
////        LoggerUtil.logINFO("File list inside " + bucketName + " bucket...");
//        for (S3ObjectSummary object : s3ObjectList) {
//            fileObject = object.getKey();
////            LoggerUtil.logINFO("File Object : " + fileObject);
//            fileList.add(fileObject);
//        }
//        return fileList;
//    }
//
//    public static void deleteObjectsInFolder(String bucketName, String... prefix) {
//        String key;
//        try {
//            for (String prefixName : prefix) {
////                LoggerUtil.logINFO("Deleting files inside " + bucketName + " bucket...");
//                for (S3ObjectSummary file : client.listObjects(bucketName, prefixName).getObjectSummaries()) {
//                    key = file.getKey();
//                    client.deleteObject(bucketName, key);
////                    LoggerUtil.logINFO("Object Deleted : " + key);
//                    Thread.sleep(10);
//                }
//
////                LoggerUtil.logINFO("Deleting files inside minor-errors folder...");
//                for (S3ObjectSummary file : client.listObjects(bucketName, "minor-errors/" + prefixName).getObjectSummaries()) {
//                    key = file.getKey();
//                    client.deleteObject(bucketName, key);
////                    LoggerUtil.logINFO("Object deleted inside minor-errors folder : " + key);
//                    Thread.sleep(10);
//                }
//            }
//        } catch (Exception ex) {
////            LoggerUtil.logERROR(ex.getMessage(), ex);
//        }
//    }
//}
