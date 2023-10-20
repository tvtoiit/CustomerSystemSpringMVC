package com.fjs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fjs.entity.MstCustomerEntity;

public interface MstCustomerRepository extends JpaRepository<MstCustomerEntity, Long> {

}
