package io.chrismajor.polling.db.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by Christo on 19/09/2017.
 */
@Entity
public class Recording {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Timestamp pollingTimestamp;

    private Float downloadSpeed;

    private Float uploadSpeed;

    private Float downloadSpeedLimit;

    private Float uploadSpeedLimit;

    private String providerName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getPollingTimestamp() {
        return pollingTimestamp;
    }

    public void setPollingTimestamp(Timestamp pollingTimestamp) {
        this.pollingTimestamp = pollingTimestamp;
    }

    public Float getDownloadSpeed() {
        return downloadSpeed;
    }

    public void setDownloadSpeed(Float downloadSpeed) {
        this.downloadSpeed = downloadSpeed;
    }

    public Float getUploadSpeed() {
        return uploadSpeed;
    }

    public void setUploadSpeed(Float uploadSpeed) {
        this.uploadSpeed = uploadSpeed;
    }

    public Float getDownloadSpeedLimit() {
        return downloadSpeedLimit;
    }

    public void setDownloadSpeedLimit(Float downloadSpeedLimit) {
        this.downloadSpeedLimit = downloadSpeedLimit;
    }

    public Float getUploadSpeedLimit() {
        return uploadSpeedLimit;
    }

    public void setUploadSpeedLimit(Float uploadSpeedLimit) {
        this.uploadSpeedLimit = uploadSpeedLimit;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    @Override
    public String toString() {
        return "Recording{" +
                "id=" + id +
                ", pollingTimestamp=" + pollingTimestamp +
                ", downloadSpeed=" + downloadSpeed +
                ", uploadSpeed=" + uploadSpeed +
                ", downloadSpeedLimit=" + downloadSpeedLimit +
                ", uploadSpeedLimit=" + uploadSpeedLimit +
                ", providerName='" + providerName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recording recording = (Recording) o;
        return Objects.equals(id, recording.id) &&
                Objects.equals(pollingTimestamp, recording.pollingTimestamp) &&
                Objects.equals(downloadSpeed, recording.downloadSpeed) &&
                Objects.equals(uploadSpeed, recording.uploadSpeed) &&
                Objects.equals(downloadSpeedLimit, recording.downloadSpeedLimit) &&
                Objects.equals(uploadSpeedLimit, recording.uploadSpeedLimit) &&
                Objects.equals(providerName, recording.providerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pollingTimestamp, downloadSpeed, uploadSpeed, downloadSpeedLimit, uploadSpeedLimit, providerName);
    }
}
