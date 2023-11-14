package com.nick.nicknameback.controller;

import com.nick.nicknameback.entity.Nickname;
import com.nick.nicknameback.repository.NicknameRepository;
import com.nick.nicknameback.service.NicknameService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/nickname")
public class NicknameController {

    private final NicknameService nicknameService;

    @GetMapping()
    public List<Nickname> findTop5000ByNickname(){
        return nicknameService.findNickname();
    }
}
