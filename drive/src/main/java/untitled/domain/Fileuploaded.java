package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Fileuploaded extends AbstractEvent {

    private Long id;
    private String filename;
    private Long size;

    public Fileuploaded(File aggregate){
        super(aggregate);
    }
    public Fileuploaded(){
        super();
    }
}
