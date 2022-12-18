package untitled.domain;

import untitled.domain.Fileuploaded;
import untitled.DriveApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="File_table")
@Data

public class File  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String filename;
    
    
    
    
    
    private Long size;
    
    
    
    
    
    private String type;
    
    
    
    
    
    private String userid;

    @PostPersist
    public void onPostPersist(){


        Fileuploaded fileuploaded = new Fileuploaded(this);
        fileuploaded.publishAfterCommit();

    }

    public static FileRepository repository(){
        FileRepository fileRepository = DriveApplication.applicationContext.getBean(FileRepository.class);
        return fileRepository;
    }






}
