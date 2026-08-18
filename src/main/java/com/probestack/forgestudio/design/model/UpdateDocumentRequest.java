package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdateDocumentRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-18T02:37:18.740676733Z[GMT]")public class UpdateDocumentRequest {

  private String displayName;

  @Valid
  private List<String> tags;

  private Boolean legalHold;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate retentionUntil;

  public UpdateDocumentRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
    @Schema(name = "displayName", example = "Supplier Contract 2026 (signed)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UpdateDocumentRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateDocumentRequest addTagsItem(String tagsItem) {
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
    @Schema(name = "tags", example = "[\"contract\",\"supplier\",\"signed\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public UpdateDocumentRequest legalHold(Boolean legalHold) {
    this.legalHold = legalHold;
    return this;
  }

  /**
   * Get legalHold
   * @return legalHold
  */
    @Schema(name = "legalHold", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("legalHold")
  public Boolean getLegalHold() {
    return legalHold;
  }

  public void setLegalHold(Boolean legalHold) {
    this.legalHold = legalHold;
  }

  public UpdateDocumentRequest retentionUntil(LocalDate retentionUntil) {
    this.retentionUntil = retentionUntil;
    return this;
  }

  /**
   * Get retentionUntil
   * @return retentionUntil
  */
  @Valid   @Schema(name = "retentionUntil", example = "Tue Aug 12 00:00:00 GMT 2036", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retentionUntil")
  public LocalDate getRetentionUntil() {
    return retentionUntil;
  }

  public void setRetentionUntil(LocalDate retentionUntil) {
    this.retentionUntil = retentionUntil;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDocumentRequest updateDocumentRequest = (UpdateDocumentRequest) o;
    return Objects.equals(this.displayName, updateDocumentRequest.displayName) &&
        Objects.equals(this.tags, updateDocumentRequest.tags) &&
        Objects.equals(this.legalHold, updateDocumentRequest.legalHold) &&
        Objects.equals(this.retentionUntil, updateDocumentRequest.retentionUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, tags, legalHold, retentionUntil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDocumentRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    legalHold: ").append(toIndentedString(legalHold)).append("\n");
    sb.append("    retentionUntil: ").append(toIndentedString(retentionUntil)).append("\n");
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

