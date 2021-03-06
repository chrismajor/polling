package io.chrismajor.polling.service;

import io.chrismajor.polling.domain.Recording;
import io.chrismajor.polling.repository.RecordingRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Christo on 19/09/2017.
 */
@Service
public class RecordingServiceImpl implements RecordingService {

    @Autowired
    private RecordingRepostory recordingRepo;

    @Override
    public boolean createRecording(Recording recording) {
        // TODO: validation here
        // TODO: error handling, sensible return values etc
        recordingRepo.save(recording);
        return false;
    }
}
