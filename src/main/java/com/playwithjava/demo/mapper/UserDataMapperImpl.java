package com.playwithjava.demo.mapper;

import com.playwithjava.demo.DTO.request.UserDataRequest;
import com.playwithjava.demo.DTO.response.UserDataResponse;
import com.playwithjava.demo.entity.UserDataEntity;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserDataMapperImpl implements UserDataMapper{

    @Autowired
    ModelMapper mapper;

    @Override
    public UserDataEntity mapRequestToEntity(UserDataRequest request) {

        UserDataEntity userDataEntity=UserDataEntity.builder().build();
        mapper.map(request,userDataEntity);
        return userDataEntity;
    }

    @Override
    public UserDataResponse mapEntityToResponse(UserDataEntity entity) {
        UserDataResponse userDataResponse=UserDataResponse.builder().build();
        mapper.map(entity,userDataResponse);
        return userDataResponse;
    }
}
