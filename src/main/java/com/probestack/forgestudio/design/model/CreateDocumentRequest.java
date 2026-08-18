package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateDocumentRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-18T02:37:18.740676733Z[GMT]")public class CreateDocumentRequest {

  private String fileName;

  private String displayName;

  private String contentType;

  private Integer sizeBytes;

  private String checksum;

  private String ownerId;

  @Valid
  private List<String> tags;

  public CreateDocumentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateDocumentRequest(String fileName, String contentType, Integer sizeBytes, String ownerId) {
    this.fileName = fileName;
    this.contentType = contentType;
    this.sizeBytes = sizeBytes;
    this.ownerId = ownerId;
  }

  public CreateDocumentRequest fileName(String fileName) {
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

  public CreateDocumentRequest displayName(String displayName) {
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

  public CreateDocumentRequest contentType(String contentType) {
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

  public CreateDocumentRequest sizeBytes(Integer sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * Get sizeBytes
   * minimum: 1
   * @return sizeBytes
  */
  @NotNull @Min(1)   @Schema(name = "sizeBytes", example = "481203", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sizeBytes")
  public Integer getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(Integer sizeBytes) {
    this.sizeBytes = sizeBytes;
  }

  public CreateDocumentRequest checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * Get checksum
   * @return checksum
  */
    @Schema(name = "checksum", example = "9f86d081884c7d659a2feaa0c55ad015", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("checksum")
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public CreateDocumentRequest ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
  */
  @NotNull   @Schema(name = "ownerId", example = "team-legal", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ownerId")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public CreateDocumentRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateDocumentRequest addTagsItem(String tagsItem) {
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
    @Schema(name = "tags", example = "[\"contract\",\"supplier\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDocumentRequest createDocumentRequest = (CreateDocumentRequest) o;
    return Objects.equals(this.fileName, createDocumentRequest.fileName) &&
        Objects.equals(this.displayName, createDocumentRequest.displayName) &&
        Objects.equals(this.contentType, createDocumentRequest.contentType) &&
        Objects.equals(this.sizeBytes, createDocumentRequest.sizeBytes) &&
        Objects.equals(this.checksum, createDocumentRequest.checksum) &&
        Objects.equals(this.ownerId, createDocumentRequest.ownerId) &&
        Objects.equals(this.tags, createDocumentRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, displayName, contentType, sizeBytes, checksum, ownerId, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDocumentRequest {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

