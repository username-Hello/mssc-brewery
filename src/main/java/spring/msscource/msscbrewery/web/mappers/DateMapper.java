package spring.msscource.msscbrewery.web.mappers;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Component
public class DateMapper {

    OffsetDateTime asOffsetDateTime(Timestamp timestamp) {
        if (timestamp != null) {
            return OffsetDateTime.of(timestamp.getYear(), timestamp.getMonth(), timestamp.getDay(), timestamp.getHours(),
                    timestamp.getMinutes(), timestamp.getSeconds(), timestamp.getNanos(),
                    ZoneOffset.ofHours(timestamp.getTimezoneOffset()));
        } else {
            return null;
        }
    }

    Timestamp asTimestamp(OffsetDateTime offsetDateTime) {
        if (offsetDateTime != null) {
            return Timestamp.valueOf(offsetDateTime.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime());
        } else {
            return null;
        }
    }

}
