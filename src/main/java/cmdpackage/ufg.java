package cmdpackage;

import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.ListObjectsRequest;
import software.amazon.awssdk.services.s3.model.ListObjectsResponse;
import software.amazon.awssdk.services.s3.model.S3Object;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.TimeZone;

public class ufg {

    public static void main(String[] args) throws IOException {
        String bucketName = "cmdm-outbound-incremental-data";

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/M/dd/MM-dd-yyyy");
        Date date = new Date();
        String dateFormat1 = formatter.format(date);
        System.out.println(dateFormat1);

        SimpleDateFormat cstCdtFormat=new SimpleDateFormat("yyyy/M/dd/MM-dd-yyyy");
        cstCdtFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println("HIiiiii" + cstCdtFormat.format(new Date()));
        String dateFormat = cstCdtFormat.format(new Date());

        int a = 335;
        for(int i=a; i>325; i--){
            LocalTime time = LocalTime.now();
            LocalTime newTime1 = time.minusMinutes(i);
            System.out.println("The CST Time is : " + newTime1);
            String latestTime1 = newTime1.toString().substring(0, 6);
            System.out.println("Hours and Minutes are: " + latestTime1);

            S3Client client = S3Client.builder().build();
            ListObjectsRequest request = ListObjectsRequest.builder().bucket(bucketName).prefix("shipto/" + dateFormat + "-" + latestTime1).build();
            System.out.println("shipto/" + dateFormat + "-" + latestTime1);
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