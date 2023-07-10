package Butlers.Ticat.member.dto;

import Butlers.Ticat.stamp.dto.StampDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

public class MemberDto {

    @Getter
    @Setter
    public static class Post {

        @NotNull
        private String id;

        @Email
        @NotBlank
        private String email;

        @NotBlank
        private String password;

        // 비밀번호 확인 (검증 시 필요)
        @NotBlank
        private String confirmPassword;

    }

    @Getter
    @Setter
    public static class Patch {

        private Long memberId;
        private String displayName;
        private String password;

    }

    @Getter
    @Builder
    public static class Response {

        private Long memberId;
        private String displayName;

    }

    @Getter
    @Builder
    public static class stampResponse {
        private Long memberId;
        private List<StampDto.StampResponse> festivalList;
    }
}
