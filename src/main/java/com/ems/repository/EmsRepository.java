package com.ems.repository;

import org.springframework.data.repository.CrudRepository;

import com.ems.model.EmsModel;

public interface EmsRepository extends CrudRepository<EmsModel,Long> {

}
