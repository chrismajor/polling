package io.chrismajor.polling.service;

import io.chrismajor.polling.domain.Recording;
import io.chrismajor.polling.repository.RecordingRepostory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextHierarchy(@ContextConfiguration(classes = Application.class))
public class RecordingServiceTests {

    @Autowired
    private RecordingService recordingService;

    @MockBean
    private RecordingRepostory recordingRepostory;

    @Test
    public void testService() {
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
