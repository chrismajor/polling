package io.chrismajor.polling.service;


import io.chrismajor.polling.domain.Recording;

/**
 * Created by Christo on 19/09/2017.
 */
public interface RecordingService {
    boolean createRecording(Recording recording);
}
