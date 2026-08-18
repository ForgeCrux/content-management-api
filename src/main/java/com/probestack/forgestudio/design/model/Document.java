package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Document
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-18T02:37:18.740676733Z[GMT]")public class Document {

  private String id;

  private String fileName;

  private String displayName;

  private String contentType;

  private Integer sizeBytes;

  private String checksum;

  private String ownerId;

  private Integer version;

  @Valid
  private List<String> tags;

  private Boolean legalHold;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate retentionUntil;

  private String downloadUrl;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime uploadedAt;

  public Document() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Document(String id, String fileName, String contentType, Integer sizeBytes) {
    this.id = id;
    this.fileName = fileName;
    this.contentType = contentType;
    this.sizeBytes = sizeBytes;
  }

  public Document id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique document ID (UUID)
   * @return id
  */
  @NotNull   @Schema(name = "id", example = "d0c1u2m3", description = "Unique document ID (UUID)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Document fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
  */
  @NotNull   @Schema(name = "fileName", example = "supplier-contract-2026.pdf", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Document displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
    @Schema(name = "displayName", example = "Supplier Contract 2026", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Document contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
  */
  @NotNull   @Schema(name = "contentType", example = "application/pdf", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public Document sizeBytes(Integer sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * Get sizeBytes
   * @return sizeBytes
  */
  @NotNull   @Schema(name = "sizeBytes", example = "481203", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sizeBytes")
  public Integer getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(Integer sizeBytes) {
    this.sizeBytes = sizeBytes;
  }

  public Document checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * SHA-256 hash of the stored bytes
   * @return checksum
  */
    @Schema(name = "checksum", example = "9f86d081884c7d659a2feaa0c55ad015", description = "SHA-256 hash of the stored bytes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("checksum")
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public Document ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
  */
    @Schema(name = "ownerId", example = "team-legal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerId")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public Document version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
    @Schema(name = "version", example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Document tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Document addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
    @Schema(name = "tags", example = "[\"contract\",\"supplier\",\"2026\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Document legalHold(Boolean legalHold) {
    this.legalHold = legalHold;
    return this;
  }

  /**
   * Get legalHold
   * @return legalHold
  */
    @Schema(name = "legalHold", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("legalHold")
  public Boolean getLegalHold() {
    return legalHold;
  }

  public void setLegalHold(Boolean legalHold) {
    this.legalHold = legalHold;
  }

  public Document retentionUntil(LocalDate retentionUntil) {
    this.retentionUntil = retentionUntil;
    return this;
  }

  /**
   * Get retentionUntil
   * @return retentionUntil
  */
  @Valid   @Schema(name = "retentionUntil", example = "Tue Aug 12 00:00:00 GMT 2031", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retentionUntil")
  public LocalDate getRetentionUntil() {
    return retentionUntil;
  }

  public void setRetentionUntil(LocalDate retentionUntil) {
    this.retentionUntil = retentionUntil;
  }

  public Document downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * Short-lived signed URL, valid for 15 minutes
   * @return downloadUrl
  */
    @Schema(name = "downloadUrl", example = "https://storage.example.com/signed/d0c1u2m3?exp=1786574059", description = "Short-lived signed URL, valid for 15 minutes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public Document uploadedAt(OffsetDateTime uploadedAt) {
    this.uploadedAt = uploadedAt;
    return this;
  }

  /**
   * Get uploadedAt
   * @return uploadedAt
  */
  @Valid   @Schema(name = "uploadedAt", example = "2026-08-12T10:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uploadedAt")
  public OffsetDateTime getUploadedAt() {
    return uploadedAt;
  }

  public void setUploadedAt(OffsetDateTime uploadedAt) {
    this.uploadedAt = uploadedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.id, document.id) &&
        Objects.equals(this.fileName, document.fileName) &&
        Objects.equals(this.displayName, document.displayName) &&
        Objects.equals(this.contentType, document.contentType) &&
        Objects.equals(this.sizeBytes, document.sizeBytes) &&
        Objects.equals(this.checksum, document.checksum) &&
        Objects.equals(this.ownerId, document.ownerId) &&
        Objects.equals(this.version, document.version) &&
        Objects.equals(this.tags, document.tags) &&
        Objects.equals(this.legalHold, document.legalHold) &&
        Objects.equals(this.retentionUntil, document.retentionUntil) &&
        Objects.equals(this.downloadUrl, document.downloadUrl) &&
        Objects.equals(this.uploadedAt, document.uploadedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fileName, displayName, contentType, sizeBytes, checksum, ownerId, version, tags, legalHold, retentionUntil, downloadUrl, uploadedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    legalHold: ").append(toIndentedString(legalHold)).append("\n");
    sb.append("    retentionUntil: ").append(toIndentedString(retentionUntil)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    uploadedAt: ").append(toIndentedString(uploadedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

