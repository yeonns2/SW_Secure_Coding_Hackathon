package com.securessingssing.dto;

import com.securessingssing.domain.entity.MemberEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDto {
    private Long id;
    private String email;
    private String password;
    private Double weight;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .id(id)
                .email(email)
                .password(password)
                .weight(weight)
                .build();
    }

    @Builder
    public MemberDto(Long id, String email, String password,Double weight) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.weight = weight;
    }
}
