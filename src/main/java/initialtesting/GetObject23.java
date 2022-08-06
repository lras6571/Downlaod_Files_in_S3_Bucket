//package GetObjects;
//
//import com.amazonaws.SdkClientException;
//import com.amazonaws.auth.profile.ProfileCredentialsProvider;
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3ClientBuilder;
//import com.amazonaws.services.s3.model.GetObjectRequest;
//import com.amazonaws.services.s3.model.S3Object;
//
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import static GetObjects.GetObject2.displayTextInputStream;
//import static com.amazonaws.regions.Regions.US_EAST_1;
//
//public class GetObject23 {
//
//    public static void main(String[] args) throws IOException {
//
//        String bucketName = "temp-testing";
//        String key = "Logs/std.logs";
////        String bucketName = "cmdm-outbound-incremental-data";
////        String key = "billto/2022/8/1/08-01-2022-13:19:38.zip";
//
//
//        S3Object fullObject = null, objectPortion = null, headerOverrideObject = null;
//        try {
//            AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
//                    .withRegion(US_EAST_1)
//                    .withCredentials(new ProfileCredentialsProvider())
//                    .build();
//
////            S3Client client = S3Client.builder().build();
////            GetObjectRequest request = GetObjectRequest.builder()
////                    .bucket(bucketName)
////                    .key(key)
////                    .build();
//            GetObjectRequest rangeObjectRequest = new GetObjectRequest(bucketName, key)
//                    .withRange(0, 9);
//            objectPortion = s3Client.getObject(rangeObjectRequest);
//            System.out.println("Printing bytes retrieved.");
//            displayTextInputStream(objectPortion.getObjectContent());
//
////            ResponseInputStream<GetObjectResponse> response = s3Client.getObject(s3Client);
//
//            String fileName = new File(key).getName();
//            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileName));
//
//            byte[] buffer = new byte[4096];
//            int bytesRead = -1;
//
////            while ((bytesRead = response.read(buffer)) != -1) {
////                outputStream.write(buffer, 0, bytesRead);
////            }
////
////
////            response.close();
////            outputStream.close();
//
////
////            // Get an object and print its contents.
////            System.out.println("Downloading an object");
////            fullObject = s3Client.getObject(new GetObjectRequest(bucketName, key));
////            System.out.println("Content-Type: " + fullObject.getObjectMetadata().getContentType());
////            System.out.println("Content: ");
////            displayTextInputStream(fullObject.getObjectContent());
////
////            // Get a range of bytes from an object and print the bytes.
////            GetObjectRequest rangeObjectRequest = new GetObjectRequest(bucketName, key)
////                    .withRange(0, 9);
////            objectPortion = s3Client.getObject(rangeObjectRequest);
////            System.out.println("Printing bytes retrieved.");
////            displayTextInputStream(objectPortion.getObjectContent());
////
////            // Get an entire object, overriding the specified response headers, and print the object's content.
////            ResponseHeaderOverrides headerOverrides = new ResponseHeaderOverrides()
////                    .withCacheControl("No-cache")
////                    .withContentDisposition("attachment; filename=example.txt");
////            GetObjectRequest getObjectRequestHeaderOverride = new GetObjectRequest(bucketName, key)
////                    .withResponseHeaders(headerOverrides);
////            headerOverrideObject = s3Client.getObject(getObjectRequestHeaderOverride);
////            displayTextInputStream(headerOverrideObject.getObjectContent());
////        } catch (AmazonServiceException e) {
////            // The call was transmitted successfully, but Amazon S3 couldn't process
////            // it, so it returned an error response.
////            e.printStackTrace();
//        } catch (SdkClientException e) {
//            // Amazon S3 couldn't be contacted for a response, or the client
//            // couldn't parse the response from Amazon S3.
//            e.printStackTrace();
//        } finally {
//            // To ensure that the network connection doesn't remain open, close any open input streams.
//            if (fullObject != null) {
//                fullObject.close();
//            }
//            if (objectPortion != null) {
//                objectPortion.close();
//            }
//            if (headerOverrideObject != null) {
//                headerOverrideObject.close();
//            }
//        }
//    }
//}
//
////    private static void displayTextInputStream(InputStream input) throws IOException {
////        // Read the text input stream one line at a time and display each line.
////        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
////        String line = null;
////        while ((line = reader.readLine()) != null) {
////            System.out.println(line);
////        }
////        System.out.println();
////    }
////}
