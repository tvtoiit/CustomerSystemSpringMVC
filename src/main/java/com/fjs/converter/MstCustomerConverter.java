package com.fjs.converter;

import org.springframework.stereotype.Component;

import com.fjs.dto.MstCustomerDto;
import com.fjs.entity.MstCustomerEntity;

@Component
public class MstCustomerConverter {
	public MstCustomerDto toDto(MstCustomerEntity entity) {
		MstCustomerDto result = new MstCustomerDto();
		result.setCustomerId(entity.getCustomerId());
		result.setAddress(entity.getAddress());
		result.setBirthDay(entity.getBirthDay());
		result.setCustomerName(entity.getCustomerName());
		result.setDeleteYmd(entity.getDeleteYmd());
		result.setEmail(entity.getEmail());
		result.setInsertPsnCd(entity.getInsertPsnCd());
		result.setInsertYmd(entity.getInsertYmd());
		result.setSex(entity.getSex());
		result.setUpdatePsnCd(entity.getUpdatePsnCd());
		result.setUpdateYmd(entity.getUpdateYmd());
		return result;
	}
	
	public MstCustomerEntity toEntity(MstCustomerDto dto) {
		MstCustomerEntity result = new MstCustomerEntity();
		result.setCustomerId(dto.getCustomerId());
		result.setAddress(dto.getAddress());
		result.setBirthDay(dto.getBirthDay());
		result.setCustomerName(dto.getCustomerName());
		result.setDeleteYmd(dto.getDeleteYmd());
		result.setEmail(dto.getEmail());
		result.setInsertPsnCd(dto.getInsertPsnCd());
		result.setInsertYmd(dto.getInsertYmd());
		result.setSex(dto.getSex());
		result.setUpdatePsnCd(dto.getUpdatePsnCd());
		result.setUpdateYmd(dto.getUpdateYmd());
		return result;
	}
}
