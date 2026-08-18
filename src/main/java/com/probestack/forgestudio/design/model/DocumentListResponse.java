package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.probestack.forgestudio.design.model.Document;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DocumentListResponse
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-18T02:37:18.740676733Z[GMT]")public class DocumentListResponse {

  private Integer page;

  private Integer size;

  private Integer totalElements;

  private Integer totalPages;

  @Valid
  private List<@Valid Document> content;

  public DocumentListResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  */
    @Schema(name = "page", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public DocumentListResponse size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
    @Schema(name = "size", example = "20", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public DocumentListResponse totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
    @Schema(name = "totalElements", example = "940", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalElements")
  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public DocumentListResponse totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  */
    @Schema(name = "totalPages", example = "47", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public DocumentListResponse content(List<@Valid Document> content) {
    this.content = content;
    return this;
  }

  public DocumentListResponse addContentItem(Document contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @Valid   @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public List<@Valid Document> getContent() {
    return content;
  }

  public void setContent(List<@Valid Document> content) {
    this.content = content;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentListResponse documentListResponse = (DocumentListResponse) o;
    return Objects.equals(this.page, documentListResponse.page) &&
        Objects.equals(this.size, documentListResponse.size) &&
        Objects.equals(this.totalElements, documentListResponse.totalElements) &&
        Objects.equals(this.totalPages, documentListResponse.totalPages) &&
        Objects.equals(this.content, documentListResponse.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, size, totalElements, totalPages, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentListResponse {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

