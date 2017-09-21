package io.chrismajor.polling.db.service;

import io.chrismajor.polling.db.domain.Recording;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecordingServiceTests {
    private RecordingService recordingService;

    public void init() {

    }

    private void testService() {
        recordingService.createRecording(this.getRecording());
    }

    private Recording getRecording() {
        Recording recording = new Recording();
        recording.setId(100L);
        recording.setPollingTimestamp(new Timestamp(new Date().getTime()));
        recording.setDownloadSpeed(10F);
        recording.setDownloadSpeedLimit(20F);
        recording.setUploadSpeed(1F);
        recording.setUploadSpeedLimit(2F);
        recording.setProviderName("Test provider");
        recording.setProviderTwitterHandle("testprovider");
        return recording;
    }
}
