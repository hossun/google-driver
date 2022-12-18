package untitled.domain;

import untitled.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Videoprocessed extends AbstractEvent {

    private Long id;
    private String videourl;
    private String filekey;
}
