package com.coemaniac.authservice.mapper;

import com.coemaniac.authservice.dto.SignupRequest;
import com.coemaniac.authservice.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserAccountMapper {
    private final ModelMapper modelMapper;

    public UserAccountMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public SignupRequest toDto(User userAccount) {
        return modelMapper.map(userAccount, SignupRequest.class);
    }

    public User toEntity(SignupRequest userAccountDTO) {
        return modelMapper.map(userAccountDTO, User.class);
    }
}
