package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Videoprocessed extends AbstractEvent {

    private Long id;
    private String videourl;
    private String filekey;

    public Videoprocessed(Video aggregate){
        super(aggregate);
    }
    public Videoprocessed(){
        super();
    }
}
