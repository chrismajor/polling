package io.chrismajor.polling.db.service;

import io.chrismajor.polling.db.domain.Recording;
import io.chrismajor.polling.db.repository.RecordingRepostory;
import org.springframework.stereotype.Service;

/**
 * Created by Christo on 19/09/2017.
 */
@Service
public class RecordingServiceImpl implements RecordingService {

    private RecordingRepostory recordingRepo;

    @Override
    public boolean createRecording(Recording recording) {
        recordingRepo.save(recording);
        return false;
    }
}
