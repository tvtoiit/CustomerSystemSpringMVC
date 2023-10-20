package com.fjs.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fjs.converter.MstCustomerConverter;
import com.fjs.dto.MstCustomerDto;
import com.fjs.entity.MstCustomerEntity;
import com.fjs.repository.MstCustomerRepository;
import com.fjs.service.IMstCustomerService;


@Service
public class MstCutomerSevice implements IMstCustomerService {

	@Autowired
	private MstCustomerRepository mstCutomerRepository;
	
	@Autowired
	private MstCustomerConverter mstCustomerConverter;
	@Override
	public MstCustomerDto findById(long id) {
		MstCustomerEntity entity = mstCutomerRepository.findOne(id);
		return mstCustomerConverter.toDto(entity);
	}

	@Override
	@Transactional
	public MstCustomerDto save(MstCustomerDto dto) {
		
		return null;
	}

	@Override
	@Transactional
	public void delete(long[] ids) {
		for (long id: ids) {
			mstCutomerRepository.delete(id);
		}
	}
}
