package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.CreateDocumentRequestDomainRepository;
import com.probestack.forgestudio.design.model.CreateDocumentRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.CreateDocumentRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.CreateDocumentRequestMongoRepository;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CreateDocumentRequestMongoPersistenceAdapter implements CreateDocumentRequestDomainRepository {
    private final CreateDocumentRequestMongoRepository repository;

    public CreateDocumentRequestMongoPersistenceAdapter(
            CreateDocumentRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public CreateDocumentRequest save(CreateDocumentRequest createDocumentRequest) {
        CreateDocumentRequestDocument document = toDocument(createDocumentRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<CreateDocumentRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<CreateDocumentRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private CreateDocumentRequestDocument toDocument(CreateDocumentRequest createDocumentRequest) {
        CreateDocumentRequestDocument document = new CreateDocumentRequestDocument();
        BeanUtils.copyProperties(createDocumentRequest, document);
        return document;
    }

    private CreateDocumentRequest toDomain(CreateDocumentRequestDocument document) {
        CreateDocumentRequest domain = new CreateDocumentRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
