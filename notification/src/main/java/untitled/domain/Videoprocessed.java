package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Videoprocessed extends AbstractEvent {

    private Long id;
    private String videourl;
    private String filekey;
}


