package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.CreateDocumentRequest;
import java.lang.String;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for CreateDocumentRequest domain operations.
 */
public interface CreateDocumentRequestDomainRepository {
    CreateDocumentRequest save(CreateDocumentRequest createDocumentRequest);

    Optional<CreateDocumentRequest> findById(String id);

    List<CreateDocumentRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
