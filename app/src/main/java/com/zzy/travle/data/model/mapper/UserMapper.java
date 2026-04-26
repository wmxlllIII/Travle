package com.zzy.travle.data.model.mapper;

import com.zzy.travle.data.model.respdto.LoginRespDto;
import com.zzy.travle.data.model.vo.UserVO;

public class UserMapper {
    public UserVO mapLoginRespToVO(LoginRespDto dto) {
        if (dto == null) {
            return null;
        }

        return new UserVO(
                dto.getUserId(),
                dto.getUsername(),
                dto.getEmail(),
                dto.getAvatar(),
                dto.getToken()
        );
    }
}
