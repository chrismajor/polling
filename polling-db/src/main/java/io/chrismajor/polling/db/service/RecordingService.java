package io.chrismajor.polling.db.service;

import io.chrismajor.polling.db.domain.Recording;

/**
 * Created by Christo on 19/09/2017.
 */
public interface RecordingService {
    boolean createRecording(Recording recording);
}
