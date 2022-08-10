package cmdpackage;

import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.ListObjectsRequest;
import software.amazon.awssdk.services.s3.model.ListObjectsResponse;
import software.amazon.awssdk.services.s3.model.S3Object;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.TimeZone;

public class ufg {

    public static void main(String[] args) {
        String bucketName = "cmdm-outbound-incremental-data";

        SimpleDateFormat cstCdtFormat = new SimpleDateFormat("yyyy/M/dd/MM-dd-yyyy");
        cstCdtFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String dateFormat = cstCdtFormat.format(new Date());

        int a = 331;
        for (int i = a; i > 326; i--) {
            LocalTime time = LocalTime.now();
            LocalTime newTime1 = time.minusMinutes(i);
            String latestTime1 = newTime1.toString().substring(0, 6);

            S3Client client = S3Client.builder().build();
            ListObjectsRequest request = ListObjectsRequest.builder().bucket(bucketName).prefix("shipto/" + dateFormat + "-" + latestTime1).build();
            ListObjectsResponse response = client.listObjects(request);
            List<S3Object> objects = response.contents();
            ListIterator<S3Object> listIterator = objects.listIterator();

            while (listIterator.hasNext()) {
                S3Object object = listIterator.next();
                System.out.println(object.key());
            }
        }
    }
}