package rocketseat.com.passin.dto.attendee;


import java.util.List;
import rocketseat.com.passin.dto.event.attendee.AttendeeDetails;
public record AttendeeListResponseDTO(
        List<AttendeeDetails> attendees
) {
}
