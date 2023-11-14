package com.nick.nicknameback.dto;

import com.nick.nicknameback.entity.Nickname;
import lombok.*;
import org.springframework.data.domain.Page;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NicknameDto {

    private Long nicknameId;

    private String nickname;

    private Long price;


}
