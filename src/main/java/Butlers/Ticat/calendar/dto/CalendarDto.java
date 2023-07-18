package Butlers.Ticat.calendar.dto;

import Butlers.Ticat.festival.entity.DetailFestival;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

public class CalendarDto {

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {
        private Long memberId;
        private List<CalendarResponse> festivalList;
    }

    @Getter
    @Setter
    @Builder
    public static class CalendarResponse{

        private Long festivalId;
        private Long calendarId;
        private String category;
        private DetailFestival.Status status;
        private LocalDate scheduledDate;
        private LocalDate calendarDate;
        private String eventStartDate; // 행사시작일
        private String eventEndDate; // 행사 종료일
        private String title;
        private String address;
    }

    @Getter
    @Setter
    @Builder
    public static class Post {
        private Long festivalId;
        private LocalDate scheduleDate;
    }
}