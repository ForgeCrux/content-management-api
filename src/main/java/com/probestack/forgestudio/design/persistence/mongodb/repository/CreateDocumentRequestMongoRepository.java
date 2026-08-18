package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.CreateDocumentRequestDocument;
import java.lang.String;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for CreateDocumentRequest documents.
 */
public interface CreateDocumentRequestMongoRepository extends MongoRepository<CreateDocumentRequestDocument, String> {
}
