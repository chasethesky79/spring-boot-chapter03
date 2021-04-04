package se.magnus.util.http;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HttpErrorInfo {

    private ZonedDateTime timestamp;
    private String path;
    private HttpStatus httpStatus;
    private String message;
}
