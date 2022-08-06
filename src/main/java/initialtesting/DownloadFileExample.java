//package GetObjects;
//
//import software.amazon.awssdk.services.s3.S3Client;
//import software.amazon.awssdk.services.s3.model.ListObjectsRequest;
//import software.amazon.awssdk.services.s3.model.ListObjectsResponse;
//import software.amazon.awssdk.services.s3.model.S3Object;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.ListIterator;
//
//public class DownloadFileExample {
//
//    public static void main(String[] args) throws IOException {
//
//
//        String bucketName = "cmdm-outbound-incremental-data";
//        String key = "billto/2022/8/1/08-01-2022-13:19:38.zip";
//
//
//        S3Client client = S3Client.builder().build();
//        ListObjectsRequest request = ListObjectsRequest.builder().bucket(bucketName).build();
//        ListObjectsResponse response = client.listObjects(request);
//        List<S3Object> objects = response.contents();
//        ListIterator<S3Object> listIterator = objects.listIterator();
//
//        while (listIterator.hasNext()) {
//
//            S3Object object = listIterator.next();
//            System.out.println(object.key() + " - " + object.owner() + " - " + object.size());
//        }
//
//
//    }
//
//}
