package untitled.domain;

import untitled.domain.Videoprocessed;
import untitled.VideoProcessingApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Video_table")
@Data

public class Video  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String videourl;
    
    
    
    
    
    private String filekey;

    @PostPersist
    public void onPostPersist(){


        Videoprocessed videoprocessed = new Videoprocessed(this);
        videoprocessed.publishAfterCommit();

    }

    public static VideoRepository repository(){
        VideoRepository videoRepository = VideoProcessingApplication.applicationContext.getBean(VideoRepository.class);
        return videoRepository;
    }




    public static void videoProcessing(Fileuploaded fileuploaded){

        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileuploaded.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);


         });
        */

        
    }


}
