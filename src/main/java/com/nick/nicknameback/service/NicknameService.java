package com.nick.nicknameback.service;

import com.nick.nicknameback.dto.NicknameDto;
import com.nick.nicknameback.entity.Nickname;
import com.nick.nicknameback.repository.NicknameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Lazy
public class NicknameService {

    private final NicknameRepository nicknameRepository;

    public List<Nickname> findNickname(){
        List<Nickname> result = nicknameRepository.findAll();

        return result;
    }

}
