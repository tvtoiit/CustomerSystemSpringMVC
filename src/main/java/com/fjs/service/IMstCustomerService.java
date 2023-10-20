package com.fjs.service;

import com.fjs.dto.MstCustomerDto;

public interface IMstCustomerService {
	MstCustomerDto findById(long id);
	MstCustomerDto save(MstCustomerDto dto);
	void delete(long[] ids);
}
