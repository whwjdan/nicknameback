package com.nick.nicknameback.repository;

import com.nick.nicknameback.entity.Nickname;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NicknameRepository extends JpaRepository<Nickname, Long> {


}
