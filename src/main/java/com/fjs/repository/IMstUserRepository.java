package com.fjs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fjs.entity.MstUserEntity;

public interface IMstUserRepository extends JpaRepository<MstUserEntity, Long> {

}
