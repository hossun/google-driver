package untitled.domain;

import untitled.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Indexed extends AbstractEvent {

    private Long id;
    private String fileid;
    private List<String> keyword;
}
