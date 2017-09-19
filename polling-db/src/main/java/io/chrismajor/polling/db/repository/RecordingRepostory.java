package io.chrismajor.polling.db.repository;

import io.chrismajor.polling.db.domain.Recording;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Christo on 19/09/2017.
 */
public interface RecordingRepostory extends CrudRepository<Recording, Long> {
}
