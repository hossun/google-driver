package untitled.domain;

import untitled.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Fileuploaded extends AbstractEvent {

    private Long id;
    private String filename;
    private Long size;
}
