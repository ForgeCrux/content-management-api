package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.CreateDocumentRequest;
import com.probestack.forgestudio.design.model.Document;
import com.probestack.forgestudio.design.model.DocumentListResponse;
import com.probestack.forgestudio.design.model.UpdateDocumentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.DocumentsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-18T02:37:18.740676733Z[GMT]")
@Controller
@RequestMapping("${openapi.contentManagement.base-path:/v1}")
public class DocumentsApiController implements DocumentsApi {

    private static final Logger log = LoggerFactory.getLogger(DocumentsApiController.class);

    private final DocumentsService documentsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public DocumentsApiController(DocumentsService documentsService, GeneratedRequestValidator generatedRequestValidator) {
        this.documentsService = documentsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Document> createDocument(@RequestBody() CreateDocumentRequest createDocumentRequest) {
        log.info("Processing createDocument request");
        try {
            generatedRequestValidator.validate("createDocument", createDocumentRequest);
            var response = documentsService.createDocument(createDocumentRequest);
            log.info("createDocument completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createDocument: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Void> deleteDocument(@PathVariable() String documentId) {
        log.info("Processing deleteDocument request");
        try {
            var response = documentsService.deleteDocument(documentId);
            log.info("deleteDocument completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process deleteDocument: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Document> getDocumentById(@PathVariable() String documentId) {
        log.info("Processing getDocumentById request");
        try {
            var response = documentsService.getDocumentById(documentId);
            log.info("getDocumentById completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getDocumentById: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<DocumentListResponse> listDocuments(@RequestParam() String ownerId, @RequestParam() String contentType, @RequestParam() Integer page, @RequestParam() Integer size) {
        log.info("Processing listDocuments request");
        try {
            var response = documentsService.listDocuments(ownerId, contentType, page, size);
            log.info("listDocuments completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listDocuments: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Document> updateDocument(@PathVariable() String documentId, @RequestBody() UpdateDocumentRequest updateDocumentRequest) {
        log.info("Processing updateDocument request");
        try {
            generatedRequestValidator.validate("updateDocument", updateDocumentRequest);
            var response = documentsService.updateDocument(documentId, updateDocumentRequest);
            log.info("updateDocument completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process updateDocument: {}", e.getMessage(), e);
            throw e;
        }
    }
}
