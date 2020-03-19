package com.artiow.moex.portfolio.repository;

import com.artiow.moex.portfolio.entity.AbstractDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractRepository<E extends AbstractDocument> extends MongoRepository<E, String> {

}
