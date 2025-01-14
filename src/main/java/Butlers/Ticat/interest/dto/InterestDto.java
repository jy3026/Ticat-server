package Butlers.Ticat.interest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class InterestDto {

    @Getter
    public static class Post {

        @NotBlank
        // 닉네임 등록과 관심사 등록을 같은 메서드에서 진행하므로 포함
        private String displayName;
        private List<String> categories;
    }

    @Getter
    @Builder
    public static class PostResponse {
        private String displayName;
    }

    @Getter
    public static class Patch {
        private List<String> categories;
    }

    @Getter
    @Builder
    public static class Response {
        private List<String> categories;
    }
}
